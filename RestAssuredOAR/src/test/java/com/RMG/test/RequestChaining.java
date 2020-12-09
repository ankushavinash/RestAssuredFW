package com.RMG.test;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RequestChaining {
	@Test
	public void requestChainingTest() {
		
		Response res = given()
			.get("http://localhost:8084/projects");
		//res.then().log().all();
		ArrayList<String> project_ID=res.jsonPath().get("projectId");
		System.out.println(project_ID);
		
		given()
			.contentType(ContentType.JSON)
			.pathParam("projectID", project_ID)
			.delete("http://localhost:8084/projects/{projectID}")
		.then()
			.assertThat().statusCode(204)
			.and().log().all();
	
	}

}
