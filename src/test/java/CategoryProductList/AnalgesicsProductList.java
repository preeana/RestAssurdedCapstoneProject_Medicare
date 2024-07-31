package CategoryProductList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class AnalgesicsProductList {
	 @Test
	 public void test() {
	     RequestSpecification req=RestAssured.given();
	     req.baseUri("http://localhost:8080");
	     req.basePath("/medicare/show/category/2/products");
	     
	     Response res=req.get();
	     System.out.println("Status Code is "+res.getStatusCode());
		     
	 }
	     @Test
	     public void responsebody() {
	    	 RequestSpecification req=RestAssured.given();
		     req.baseUri("http://localhost:8080");
		     req.basePath("/medicare/show/category/2/products");
	    	 Response res=req.get();
	    	 ResponseBody resbody=res.getBody();
	    	 String rs=resbody.asString();
	    	 System.out.println(rs);
	    	 
	    	 JsonPath jsondata=resbody.jsonPath();
	    	 System.out.println("The response contains Analgesics:  " + (rs.contains("Analgesics")));
	    	  	 
	    	 
	     }
 
	 

}
