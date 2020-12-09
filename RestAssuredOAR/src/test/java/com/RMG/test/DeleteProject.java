package com.RMG.test;

import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class DeleteProject {
	@Test
	public void deleteProjectTest() {
		
		given()
			.baseUri("http://localhost:8084")
			.contentType(ContentType.JSON)
		.when()
			.delete("/projects/TY_PROJ_403")
		.then()
			.assertThat().statusCode(204)
		.and()
			.assertThat().time(lessThan(5L), TimeUnit.SECONDS)
		.log().all();
	}

}
