package in.Amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GETDemoBearerToken {

	@Test
	public void verifyResource() {
		RestAssured
		.given()
			.contentType("application/json")
			.header("Authorization", "Bearer 532f6ed34159498cbab6cadb023c424201dd8cf60560b89e65930656f5a3770d")
		.when()
			.get("https://gorest.co.in/public/v2/users/4494991")
		.then()
			.statusCode(200)
			.log().all();
	}
}
