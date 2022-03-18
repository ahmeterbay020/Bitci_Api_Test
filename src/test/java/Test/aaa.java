package Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;

public class aaa {
    Response response;
    @Test
    public void bb(){
        final AuthenticationPojo requestBody = new AuthenticationPojo ( "5464265779","TR", "Test123*", "", "");
        Map<String,String> headers;




     given().contentType (ContentType.JSON)
                      .body (requestBody).header("Content-Length","<calculated when request is sent>").header("Host","<calculated when request is sent>").header("apiToken","nkM+r4QxK0END2A9p/DpzV4dZ6uTbBcKjSBNYLv1LwVAUQkrW77FzGc3TqsO/v4Et0mVhNhD0rk2nkTumHwSrinxv3NxnXUKAy83JZ8D2zJeAv/gd6W2pyqaJYlrLuZoMOOwxuAW2GOi0Bj7jdg1MGOnpU2z2+iRiRiwttJgVJHv94BHtYMVbpWFtwcXqsQg")
                      .when ()
                      .log ()
                      .all ()
                      .post ("http://cedtradingapi-staging.bitci.com/api/Accountv2/login")
                      .then ()
                      .assertThat ()
                      .statusCode (200)
                      .log ()
                      .all ()
                      .body ("Name", notNullValue ())
                      .and ()
                      .body ("Token", notNullValue ());


    }


}

