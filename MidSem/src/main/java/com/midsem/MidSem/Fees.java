package com.midsem.MidSem;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fees {
	
	@Value("Ashish Benjamin")
	private String Amount;
	private String Paymode;
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getPaymode() {
		return Paymode;
	}
	public void setPaymode(String paymode) {
		Paymode = paymode;
	}
	
	



}