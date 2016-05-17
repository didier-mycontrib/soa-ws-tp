package tp.currency.dao;

import tp.currency.entity._Currency;

public interface CurrencyDao {
	
	_Currency findByCode(String code);
	_Currency findByName(String name);
	void updateCurrency(_Currency c);
	void createCurrency(_Currency c);
	void removeCurrency(_Currency c);
	//...

}
