package com.RMG.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetSingleProject {
	@Test
	public void getSingleProjectTest() {
		given()
			.contentType(ContentType.JSON)
			.baseUri("http://localhost")
			.port(8084)
		.when()
			.get("/projects/TY_PROJ_403")
		.then()
			.assertThat().statusCode(200)
		.and()
			.assertThat().statusLine("HTTP/1.1 200 ")
		.log().all();
	}

}
