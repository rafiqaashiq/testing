package in.Amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DELETEDemo {

	@Test
	public void deleteResourse() {
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/users/94";
		
		RestAssured
			.when()
				.delete()
			.then()
				.statusCode(204);
	}
}
