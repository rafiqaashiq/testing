package in.Amazon.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class APIKeyDemo {

	@Test
	public void getWeatherInfo() {
		RestAssured
			.given()
				.param("q", "chennai")
				.param("appid", "4838282e9d146f53ad4364cb718b1282")
			.when()
				.get("https://api.openweathermap.org/data/2.5/weather")
			.then()
				.statusCode(200)
				.log().all();
	}
}
