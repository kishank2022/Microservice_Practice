package com.inventory.management.dto;

import java.math.BigDecimal;

public class PriceResponse {

	 private boolean valid;
	 private BigDecimal suggestedPrice;
	public PriceResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriceResponse(boolean valid, BigDecimal suggestedPrice) {
		super();
		this.valid = valid;
		this.suggestedPrice = suggestedPrice;
	}
	@Override
	public String toString() {
		return "PriceResponse [valid=" + valid + ", suggestedPrice=" + suggestedPrice + "]";
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public BigDecimal getSuggestedPrice() {
		return suggestedPrice;
	}
	public void setSuggestedPrice(BigDecimal suggestedPrice) {
		this.suggestedPrice = suggestedPrice;
	}
	 
	 
	 
	 
	    
}
