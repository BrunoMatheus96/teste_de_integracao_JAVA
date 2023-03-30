package steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import support.api.UserApi;
import support.domain.User;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioStepDefinition {
    private User expectedUser;
    private UserApi userApi;

    public UsuarioStepDefinition(){
        userApi = new UserApi();
    }

    @Quando("crio um usuário")
    public void crioUmUsuário() {
        expectedUser = User.builder().build();
        userApi.creatUser(expectedUser);
    }
    @Então("o usuário é salvo no sistema")
    public void oUsuárioÉSalvoNoSistema() {
       String actualUsername =  userApi.getUsername(expectedUser);
        //Essa parte do código diz "O usuário atual é o mesmo que eu espero?"
       assertThat(actualUsername, is(expectedUser.getUsername()));
    }
}