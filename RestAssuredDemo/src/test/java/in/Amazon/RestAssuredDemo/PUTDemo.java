package in.Amazon.RestAssuredDemo;

import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUTDemo {

	HashMap<String, String> map = new HashMap<String, String>();
	
	@BeforeMethod
	public void ceatePayload() {
		map.put("name", "zepher");
		map.put("job", "programmer");
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api/user/94";
	}
	
	@Test
	public void updateResourse() {
		RestAssured
		.given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
			.statusCode(200)
			.log().all();
	}
}
