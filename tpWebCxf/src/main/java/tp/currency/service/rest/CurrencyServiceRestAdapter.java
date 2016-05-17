package tp.currency.service.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

import tp.currency.data.Currency;
import tp.currency.service.CurrencyService;

@Produces("application/json")
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

}
