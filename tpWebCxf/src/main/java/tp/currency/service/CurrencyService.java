package tp.currency.service;

import javax.jws.WebService;

import tp.currency.data.Currency;

@WebService
public interface CurrencyService {
	Currency findCurrencyByCode(String code);
	Currency findCurrencyByName(String name);
	void updateCurrency(Currency c);
	void createCurrency(Currency c);
	void removeCurrency(Currency c);
	//...
	double convert(double amount,String sourceCurrencyCode , String targetCurrencyCode );
}
