package api;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static utils.get.makeGet;

public class crudTest {
    @Test
    public void getBooks(){
        Response response = makeGet("https://bookstore.toolsqa.com/BookStore/v1/Books");
        System.out.println(response.getStatusLine());
    }
}
