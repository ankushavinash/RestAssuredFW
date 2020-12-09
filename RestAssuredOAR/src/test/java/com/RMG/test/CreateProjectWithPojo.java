package com.RMG.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import baseUtils.Project;
import io.restassured.http.ContentType;

public class CreateProjectWithPojo {
	
	@Test
	public void createProjectTest() {
		Project proj = new Project("Nithesh", "8/12/2020", "Appium", "Completed", "TY_01", 15);
		
		given()
			.baseUri("http://localhost:8084")
			.contentType(ContentType.JSON)
			.body(proj)
		.when()
			.post("/addProject")
		.then()
			.assertThat().statusCode(201)
		.and()
			.log().all();
	}

}
