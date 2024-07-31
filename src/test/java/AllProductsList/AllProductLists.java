package AllProductsList;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class AllProductLists {

	@Test
	 public void product_list() {

	RequestSpecification req=RestAssured.given();
	 req.baseUri("http://localhost:8080");
  	 req.basePath("/medicare/show/all/products");
  	 Response res=req.get();
	 System.out.println("Status Code is "+res.getStatusCode());
		
  	ResponseBody resbody=res.getBody();
 	 String rs=resbody.asString();
 
	 System.out.println("Product List is displayed below:");
 	 System.out.println(resbody.prettyPrint());


}

}
