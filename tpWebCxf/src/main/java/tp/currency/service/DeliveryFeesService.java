package tp.currency.service;

public interface DeliveryFeesService {
	
	/**
	 * 
	 * @param weight in kg (0.1 pour 100g)
	 * @param deliveryMode "basic" or "express" or "..."
	 * @return
	 */
	double computeDeliveryFees(double weight, String deliveryMode);
	//...

}
