package baseUtils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

public class BaseApiClass {
	public DatabaseLib dLib;
	@BeforeSuite
	public void configBS() throws Throwable {
		dLib=new DatabaseLib();
		dLib.getConnection();
		baseURI="http://localhost:8084";
	}
	@AfterSuite
	public void configAS() throws Throwable {
		dLib.clodeDBConnection();
	}

}
