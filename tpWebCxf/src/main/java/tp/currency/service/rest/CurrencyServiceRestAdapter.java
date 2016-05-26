package tp.currency.service.rest;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import tp.currency.data.Currency;
import tp.currency.service.CurrencyService;

@Produces("application/json")
@Consumes("application/json")
@Path("/CurrencyService")
//@CrossOriginResourceSharing(allowAllOrigins = true)// ou bien autorisations plus fines
@Named
public class CurrencyServiceRestAdapter {
	
	@Inject
	private CurrencyService currencyService;
	
	@GET
	@Path("/temp")
	public Currency test(){
		return currencyService.findCurrencyByCode("EUR");
	}
	
	@GET
	@Path("/devises")
	public List<Currency> devises(){
		return currencyService.findAll();
	}
	
	@PUT
	@Path("/devises")
	public Currency updateCurrency(Currency c){
		currencyService.updateCurrency(c);
		System.out.println("updated currency (via REST): " + c.toString());
		return c;
	}

}
