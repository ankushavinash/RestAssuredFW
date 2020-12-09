package com.RMG.test;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject {
	
	@Test
	public void createProjectTest() {
		
		JSONObject job=new JSONObject();
		job.put("createdBy", "Larry Page");
		job.put("createdOn", "12/08/2020");
		job.put("projectId","TY_01");
		job.put("projectName", "Google");
		job.put("status", "completed");
		job.put("teamSize",5);
		
		RequestSpecification con = RestAssured.given()
		.contentType(ContentType.JSON)
		.body(job.toJSONString());
		
		Response res = con.when().post("http://localhost:8084/addProject");
		
		res.then()
		.assertThat().statusCode(201)
		.and()
		.assertThat().time(Matchers.lessThanOrEqualTo(10L), TimeUnit.SECONDS)
		.log().all();
		
		
	}

}
