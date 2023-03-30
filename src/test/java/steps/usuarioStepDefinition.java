package steps;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import support.domain.User;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class usuarioStepDefinition {
    private User user;

    private static final String CREATE_USER_ENDPOINT = "user";
    private static final String USER_ENDPOINT = "user/{name}";

    @Quando("crio um usuário")
    public void crioUmUsuário() {
        user = User.builder().build();
        given().
                body(user).
                when().post(CREATE_USER_ENDPOINT).
                then().
                statusCode(200);
    }

    @Então("o usuário é salvo no sistema")
    public void oUsuárioÉSalvoNoSistema() {
        given().
                pathParams("name", user.getUsername()).
        when().get(USER_ENDPOINT).
                then().
                statusCode(200).
                body("username", is(user.getUsername()));
    }
}