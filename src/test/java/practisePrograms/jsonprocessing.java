package practisePrograms;

import java.util.ArrayList;
import java.util.List;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.lang3.builder.ToStringExclude;


public class jsonprocessing {

    // fetch the json from the url "https://reqres.in/api/users"
    // convert the json to pojo
    // extract the email ids in an Java arrayList
    // print the emailId.


    public static void main(String[] args) {

        //Step 1 : fetch the Json Data from a server
        fetchJsonData();
        //Step 2 : convert the json to pojo

    }

    public static void fetchJsonData()
    {

        String url = "https://reqres.in/api/users";
        RestAssured.baseURI = url;
        RequestSpecification request = RestAssured.given();
        Response response = request.get(url);
        //System.out.println("Response for the get call :"+response.prettyPrint());


    }

    public void fetchEmails(){

        List<String> emailList = new ArrayList<>();



    }

    public class details{


    }
}
