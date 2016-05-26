package tp.currency.dao;

import java.util.List;

import tp.currency.entity._Currency;

public interface CurrencyDao {
	
	_Currency findByCode(String code);
	_Currency findByName(String name);
	List<_Currency> findAll();
	void updateCurrency(_Currency c);
	void createCurrency(_Currency c);
	void removeCurrency(_Currency c);
	//...

}
