package support.api;

import support.domain.User;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

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

    public  void deleteAllUsers(){
        List<String> userList = Arrays.asList("rafalima");

        for (String user: userList){
            given().pathParams("name", user).
                    when().
                    delete(USER_ENDPOINT).
                    then().
                    statusCode(200);

        }
    }

}
