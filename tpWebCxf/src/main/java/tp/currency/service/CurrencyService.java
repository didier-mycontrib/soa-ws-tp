package tp.currency.service;

import java.util.List;

import javax.jws.WebService;

import tp.currency.data.Currency;

@WebService
public interface CurrencyService {
	Currency findCurrencyByCode(String code);
	Currency findCurrencyByName(String name);
	List<Currency> findAll();
	void updateCurrency(Currency c);
	void createCurrency(Currency c);
	void removeCurrency(Currency c);
	//...
	double convert(double amount,String sourceCurrencyCode , String targetCurrencyCode );
}
