package com.RMG.test;

import static io.restassured.RestAssured.given;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProjectUsingJsonFile {
	@Test
	public void createProjectTest() {
		File jsonFile=new File("./Project.json");
		given()
		.baseUri("http://localhost:8084")
		.contentType(ContentType.JSON)
		.body(jsonFile)
		.when()
		.post("/addProject")
		.then()
		.assertThat().statusCode(201)
		.and()
		.log().all();
	}

}
