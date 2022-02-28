package br.com.leonardobatistacarias.template.sales.after.service.template;

import br.com.leonardobatistacarias.template.sales.after.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

	public FreeDelivery(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return regularItemsPrice > 500;
	}

	@Override
	protected void calibrateVariables() {
		deliveryFactor = 0d;
	}

}
