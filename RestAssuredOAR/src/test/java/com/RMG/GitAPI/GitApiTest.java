package com.RMG.GitAPI;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class GitApiTest {
	@Test
	public void authenticationTest() {
		//https://api.github.com
		///user/repos
		AuthenticationScheme scheme=basic("NitheshHS", "nithesh@1998");
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setAuth(scheme);
		builder.setBaseUri("https://api.github.com/");
		builder.setContentType(ContentType.JSON);
		RequestSpecification spec = builder.build();
		
		given()
			.spec(spec)
			.get("/repos/NitheshHS/BDDCucumber")
		.then()
		.assertThat().statusCode(200)
		.and()
		.body("name", Matchers.equalTo("BDDCucumber"))
			.log().all();
	}

}
