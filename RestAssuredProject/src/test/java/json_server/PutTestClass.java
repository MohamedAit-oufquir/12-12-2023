package json_server;

import io.restassured.response.Response;
import json_classes.Comment;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutTestClass {
    @Test
    public void putTest1(){
        Comment comment = new Comment();
        comment .setId("1");
        comment.setText("hello");
        comment.setPostId("1");

        Response response = given().header("content-type","application/join")
                .body(comment).put("http://localhost:3000/comments/1");
        response.prettyPrint();;

    }
}
