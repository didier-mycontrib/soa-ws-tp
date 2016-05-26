package tp.currency.service;

public class DeliveryFeesServiceImpl implements DeliveryFeesService {

	@Override
	public double computeDeliveryFees(double weight, String deliveryMode) {
		double deliveryFees = 0;
		deliveryFees = weight * 1.5; //simple version without database
		if(deliveryMode != null && deliveryMode.equals("express")){
			deliveryFees += 4.0; //simple version without database
		}
		return deliveryFees;
	}

}
