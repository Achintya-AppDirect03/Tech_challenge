package com.AchintyaSrivastava.model;

public class DragonBallProduct {
	private boolean success=true;
	private String accountIdentifier;
	

	
	public DragonBallProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DragonBallProduct(boolean success, String accountIdentifier) {
		super();
		this.success = success;
		this.accountIdentifier = accountIdentifier;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getAccountIdentifier() {
		return accountIdentifier;
	}
	public void setAccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}
	
}
