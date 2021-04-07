import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class JwtFetcher {

    @Test
  public void  getjwt(){
     /*   String body = "{\"username\":\"sarita.khutale@visiblealpha.com\",\"password\":\"Alpha@1234\"}";
        RestAssured.baseURI ="https://webapp-uat.visiblealpha.com";
        RestAssured.basePath ="/auth";
        Header header = new Header("Content-Type","application/json");

        // post call
        Response response = RestAssured.given().body(body).header(header).post();
        System.out.println(response.asString());
        String jwtvalue = response.jsonPath().getString("jwt");
        System.out.println("jwt value is: "+jwtvalue);

        //hashmap for header key value pair
        Map<String,String> headerMapList = new HashMap<String,String>();
        headerMapList.put("Content-Type","application/json");
        headerMapList.put("Authorization","Bearer "+jwtvalue);
        //get call
        Response response1   =RestAssured.given().headers(headerMapList).get("https://webapp-uat.visiblealpha.com/api/pg?period=FY-2017&period=FY-2018&pg=Model&cut=SAR&ticker=KOFUBL_MX&source=BAML&growthType=Analytics&revision=Current");
        System.out.println("getResponse :"+response1.asString());*/

          RestAssured.baseURI ="https://uat-insights.visiblealpha.com";
          RestAssured.basePath = "/auth";
          String strUName, strPassword;
          strUName = "selladmin.autotest@visiblealpha.com";
          strPassword = "alpha@123";
          String body = "{\"username\":\"" + strUName + "\",\"password\":\"" + strPassword + "\"}";
          Header header = new Header("Content-Type", "application/json");
          Response response = RestAssured.given().body(body).header(header).post();
          System.out.println(response.asString());

          String jwtvalue_baseurl_1 = response.jsonPath().getString("jwt");
          Map<String, String> headerMapList1 = new HashMap<String, String>();
      //    headerMapList1.put("Content-Type", "application/json");
          headerMapList1.put("Authorization", "Bearer " + jwtvalue_baseurl_1);

          RestAssured.basePath = "api/dashboarddata/AAL";
        Response response1 = RestAssured.given().queryParam("year",1).headers(headerMapList1).get();
        response1.asString();
       //   Response response1 = RestAssured.given().headers(headerMapList1).get();


    }

}
