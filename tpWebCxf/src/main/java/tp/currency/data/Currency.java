package tp.currency.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

//sort of "DTO" (Data Transfert Object)
@XmlRootElement(name="currency")
public class Currency implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String code;
	private String name;
	private Double exchange_rate;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getExchange_rate() {
		return exchange_rate;
	}
	public void setExchange_rate(Double exchange_rate) {
		this.exchange_rate = exchange_rate;
	}
	
	
	public Currency() {
		super();
	}
	public Currency(String code, String name, Double exchange_rate) {
		super();
		this.code = code;
		this.name = name;
		this.exchange_rate = exchange_rate;
	}
	@Override
	public String toString() {
		return "Currency [code=" + code + ", name=" + name + ", exchange_rate=" + exchange_rate + "]";
	}
	
	
}
