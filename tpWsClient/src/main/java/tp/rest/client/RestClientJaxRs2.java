package tp.rest.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

public class RestClientJaxRs2 {

	public static void main(String[] args) {
		//basicTest();
		testJsonCurrencyRestWs();
	}
	
	public static void testJsonCurrencyRestWs(){
		Client jaxrs2client = ClientBuilder.newClient()
				             .register(JacksonFeature.class);
		WebTarget currencyTarget = jaxrs2client.target("http://localhost:8080/tpWebCxf/services/rest/CurrencyService/temp");
		
		
		// test "retreive currency":
		Invocation.Builder productsInvocationBuilder = currencyTarget.request(MediaType.APPLICATION_JSON_TYPE);
		Response responseCurrency = productsInvocationBuilder.get();
		if(responseCurrency.getStatus()==200){
			//OK:
			System.out.println("currency as (json) string =\n\t " + responseCurrency.readEntity(String.class));
		}
				
	}
	
	/*
	public static void basicTest(){	
		Client jaxrs2client = ClientBuilder.newClient();
		WebTarget allDevisesJsonTarget = jaxrs2client.target("http://localhost:8080/wsCalculateur/services/rest/devises").path("allJson");
		String resultString = allDevisesJsonTarget.request().get(String.class);
		System.out.println("liste des devises:\n\t " +resultString);
		
		
		String calculateurRestUrl = "http://localhost:8080/wsCalculateur/services/rest/calculateur"; 
		double a=5.0 , b=6.0;
		System.out.println("appel de " + calculateurRestUrl +"/addition?a=5&b=6");
		WebTarget additionTarget = jaxrs2client.target(calculateurRestUrl)
				                               .path("addition")
				                               .queryParam("a", a)
				                               .queryParam("b", b);
		double resAdd = Double.parseDouble(additionTarget.request(MediaType.TEXT_PLAIN_TYPE).get().readEntity(String.class));
		System.out.println("\t 5+6=" + resAdd);
		
		
		String euroToFrancRestUrl="http://localhost:8080/wsCalculateur/services/rest/devises/euroToFranc" ;
		double sommeEuro= 15.0;
		System.out.println("appel de " + euroToFrancRestUrl +"/15");
		WebTarget euroToFrancTarget = jaxrs2client.target(euroToFrancRestUrl)
				                                  .path(String.valueOf(sommeEuro));
		double sommeFranc = Double.parseDouble(euroToFrancTarget.request(MediaType.TEXT_PLAIN_TYPE).get().readEntity(String.class));
		System.out.println("\t 15 euros =" + sommeFranc + "francs");
	}*/

}

/*
 * MediaType.APPLICATION_JSON is "application/json" as String , MediaType.APPLICATION_JSON_TYPE is same value as MediaType
 */
