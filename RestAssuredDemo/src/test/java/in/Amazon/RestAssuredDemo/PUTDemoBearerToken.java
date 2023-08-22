package in.Amazon.RestAssuredDemo;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class PUTDemoBearerToken {

HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Iron-Man");
		map.put("email", "ironman4454@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users/4494991";
	}
	
	@Test
	public void updateResource() {
		Response response = RestAssured
			.given()
				.contentType("application/json")
				.body(map)
				.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
			.when()
				.put()
			.then()
				.extract().response();
		
		JsonPath jsonPath = response.jsonPath();
		Assert.assertTrue(jsonPath.get("name").toString().equals("Iron-Man"));
	}
}
