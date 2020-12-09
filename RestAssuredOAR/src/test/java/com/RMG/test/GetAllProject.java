package com.RMG.test;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProject {
	
	@Test
	public void getAllProjectTest() {
		given()
		.contentType(ContentType.JSON)
		.get("http://localhost:8084/projects")
		.then()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.and()
		.header("Content-Type", "application/json")
		.log().all();
	}

}
