package tp.currency.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_CURRENCY")
public class _Currency {
	@Id
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
	public _Currency(String code, String name, Double exchange_rate) {
		super();
		this.code = code;
		this.name = name;
		this.exchange_rate = exchange_rate;
	}
	public _Currency() {
		super();
	}
	@Override
	public String toString() {
		return "_Currency [code=" + code + ", name=" + name + ", exchange_rate=" + exchange_rate + "]";
	}
	
	
}
