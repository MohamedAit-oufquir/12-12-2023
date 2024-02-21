package json_server;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetEmployeeTest {
    @Test
    public void getTest1()

    {
        Response response = given().when().get("http://localhost:3000/posts");
        response.prettyPrint();
        String street = response.then().extract().path("address.street");

        System.out.println(street);
    }
}
