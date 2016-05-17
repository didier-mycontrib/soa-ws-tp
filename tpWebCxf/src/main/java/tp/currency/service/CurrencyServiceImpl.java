package tp.currency.service;

import javax.inject.Inject;
import javax.inject.Named;
import javax.jws.WebService;

import org.springframework.transaction.annotation.Transactional;

import tp.currency.dao.CurrencyDao;
import tp.currency.data.Currency;
import tp.currency.entity._Currency;

@Transactional
@Named //ou @Component ou @Service
@WebService(endpointInterface="tp.currency.service.CurrencyService")
public class CurrencyServiceImpl implements CurrencyService {
	
	@Inject //ou @Autowired
	private CurrencyDao currencyDao;
	
	private _Currency dtoToEntity(Currency c){
		return new _Currency(c.getCode(),c.getName(),c.getExchange_rate());
	}
	
	private Currency entityToDto(_Currency c){
		return new Currency(c.getCode(),c.getName(),c.getExchange_rate());
	}

	@Override
	public Currency findCurrencyByCode(String code) {
		return entityToDto(currencyDao.findByCode(code));
	}

	@Override
	public Currency findCurrencyByName(String name) {
		return entityToDto(currencyDao.findByName(name));
	}

	@Override
	public void updateCurrency(Currency c) {
		currencyDao.updateCurrency(dtoToEntity(c));
	}

	@Override
	public void createCurrency(Currency c) {
		currencyDao.createCurrency(dtoToEntity(c));
	}

	@Override
	public void removeCurrency(Currency c) {
		currencyDao.removeCurrency(dtoToEntity(c));
	}

	@Override
	public double convert(double amount, String sourceCurrencyCode, String targetCurrencyCode) {
		_Currency sourceCurr = currencyDao.findByCode(sourceCurrencyCode);
		_Currency targetCurr = currencyDao.findByCode(targetCurrencyCode);
		return amount * targetCurr.getExchange_rate() / sourceCurr.getExchange_rate();
	}

}
