package json_server;

import io.restassured.response.Response;
import json_classes.Comment;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
@Test
public class PostTestClass {
    String postBody = "{\n" +
            "      \"id\": \"2\",\n" +
            "      \"text\": \"another comment about post 1\",\n" +
            "      \"postId\": \"1\"\n" +
            "    }";
    Response response = given().header("Contet-type", "application/json")
            .body(postBody).post("http://localhost:3000/comments");
//        response.prettyPrint();


    @Test
    public void postTest2(){
        Comment comment =new Comment();
        comment.setId("4");
        comment.setText("this is text 4");
        comment.setPostId("4");

        Response response = given().header("Contet-type", "application/json")
                .body(postBody).post("http://localhost:3000/comments");
        response.prettyPrint();
    }


}







