package support.api;

import support.domain.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class UserApi {
    private static final String CREATE_USER_ENDPOINT = "user";
    private static final String USER_ENDPOINT = "user/{name}";

    public void creatUser(User user) {
        given().
                body(user).
                when().
                post(CREATE_USER_ENDPOINT).
                then().
                statusCode(200);
    }

    public String getUsername(User user) {
        return given().
                pathParams("name", user.getUsername()).
                when().get(USER_ENDPOINT).
                thenReturn().
                path("username");
    }

}
