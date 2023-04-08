package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import support.api.UserApi;
public class Config {
    private UserApi userApi;

    public  Config(){
        userApi = new UserApi();
    }

    @Before (order = 4)
    public  void setup(){
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

        RestAssured.baseURI = "https://petstore.swagger.io/v2/";
        //RestAssured.basePath == ;

        RestAssured.requestSpecification = new RequestSpecBuilder().
                addHeader("Authorization", getToken()).
                setContentType(ContentType.JSON).
                build();

        /*
        RestAssured.responseSpecification = new ResponseSpecBuilder().
                expectContentType(ContentType.JSON).
                build();

         */
    }
    private String getToken(){
        return  "grant access";
    }
    @After("@deleteAllUsers")
    public  void deleteAllUsers(){
        userApi.deleteAllUsers();
    }

}
