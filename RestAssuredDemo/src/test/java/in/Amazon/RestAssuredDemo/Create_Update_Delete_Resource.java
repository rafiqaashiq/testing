package in.Amazon.RestAssuredDemo;

import static org.hamcrest.Matchers.is;

import java.util.HashMap;
import java.util.UUID;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Create_Update_Delete_Resource extends TestBase{

	HashMap<String, String> map = new HashMap<String, String>();
	
	UUID uuid = UUID.randomUUID();
	int id;
	Response response;
	JsonPath jsonPath;
	
	@Test (priority = 0)
	public void createPayload() {
		map.put("name", "Ironman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "Active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users";
		logger.info("Payload created");
	}
	
	@Test (priority = 1)
	public void createResource() {
		response = RestAssured
					.given()
						.contentType("application/json")
						.body(map)
						.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
					.when()
						.post()
					.then()
//						.log().all()
						.extract().response();
		
		logger.info("Resource Created Successfully");
		jsonPath = response.jsonPath();
		id = jsonPath.get("id");
		System.out.println(id);
	}
	
	@Test (priority = 2)
	public void verifyResource() {
		System.out.println("Id = " + id);
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
			.when()
				.get("https://gorest.co.in/public/v2/users/"+id)
			.then()
				.statusCode(200);
//				.log().all();
		
		logger.info("Resource Verified");
		Assert.assertTrue(jsonPath.get("name").equals("Ironman"));
	}
	
	@Test (priority = 3)
	public void updateResource() {
		map.put("name", "Iron Man");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "Active");
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users/" + id;
		
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
				.body(map)
			.when()
				.put()
			.then()
				.statusCode(200)
//				.log().all()
				.assertThat()
				.body("name", is("Iron Man"));
		
		logger.info("Resource Updated");
	}
	
	@Test (priority = 4)
	public void deleteResource() {
		RestAssured.baseURI = "https://gorest.co.in";
		RestAssured.basePath = "public/v2/users/" + id;
		RestAssured
			.given()
				.contentType("application/json")
				.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
			.when()
				.delete()
			.then()
				.statusCode(204);
		
		logger.info("Resource Deleted");
	}
}
