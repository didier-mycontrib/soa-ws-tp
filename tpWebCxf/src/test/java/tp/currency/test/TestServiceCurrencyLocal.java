package tp.currency.test;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tp.currency.data.Currency;
import tp.currency.service.CurrencyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/serviceSpringConf.xml"})
public class TestServiceCurrencyLocal {
	
	private static Logger logger = LoggerFactory.getLogger(TestServiceCurrencyLocal.class);
	
	@Inject
	private CurrencyService currencyService;
	
	@Test
	public void testFindCurrency(){
		Currency euro = currencyService.findCurrencyByCode("EUR");
		Assert.assertTrue(euro.getName().equals("euro"));
		logger.info("currencyService.findCurrencyByCode()  EUR - " + euro.toString());
	}
	
	@Test
	public void testConvert(){
		double res= currencyService.convert(100.0, "EUR", "USD");
		Assert.assertTrue(res > 100);
		logger.info("100 euros =  " + res +  " dollars");
		
	}

}
