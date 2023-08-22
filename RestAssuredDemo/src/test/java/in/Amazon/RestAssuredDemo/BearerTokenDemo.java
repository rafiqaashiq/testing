package in.Amazon.RestAssuredDemo;

import java.util.HashMap;
import java.util.UUID;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenDemo {

	HashMap<String, String> map = new HashMap<String, String>();
	UUID uuid = UUID.randomUUID();
	
	@BeforeMethod
	public void createPayLoad() {
		map.put("name", "Ironman");
		map.put("email", uuid+"@gmail.com");
		map.put("gender", "male");
		map.put("status", "active");
		RestAssured.baseURI = "https://gorest.co.in/";
		RestAssured.basePath = "public/v2/users";
	}
	
	@Test
	public void createResource() {
		RestAssured
		.given()
			.contentType("application/json")
			.body(map)
			.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
		.when()
			.post()
		.then()
			.statusCode(201)
			.log().all();
	}
}
