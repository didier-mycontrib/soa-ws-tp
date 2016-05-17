package tp.currency.web.mbean;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import tp.currency.service.CurrencyService;

@Named
@Scope(value="request")
public class ConvMBean {
	
	@Inject
	private CurrencyService currencyService;
	
	private Double amount;
	private String sourceCurrencyCode;
	private String targetCurrencyCode;
	private Double result;
	
	public String doConvert(){
		String navig=null;
		result = currencyService.convert(amount, sourceCurrencyCode, targetCurrencyCode);
		return navig;
	}
	
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}
	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}
	public String getTargetCurrencyCode() {
		return targetCurrencyCode;
	}
	public void setTargetCurrencyCode(String targetCurrencyCode) {
		this.targetCurrencyCode = targetCurrencyCode;
	}
	public Double getResult() {
		return result;
	}
	public void setResult(Double result) {
		this.result = result;
	}
	
	

}
