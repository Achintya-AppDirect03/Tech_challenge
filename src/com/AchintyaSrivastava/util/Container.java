package com.AchintyaSrivastava.util;
import java.util.Random;

import com.AchintyaSrivastava.bean.Parent_main;
import com.AchintyaSrivastava.domain.UserDetails;

public class Container {
	public UserDetails container(Parent_main pm){
		UserDetails userdtls =new UserDetails();
		
		userdtls.setApplicationUuid(pm.getApplicationUuid());
		
		if(pm.getPayload().getCompany()!=null){
			userdtls.setCompanyCountry(pm.getPayload().getCompany().getCountry());
			userdtls.setCompanyExternalId(pm.getPayload().getCompany().getExternalId());
			userdtls.setCompanyName(pm.getPayload().getCompany().getName());
			userdtls.setCompanyPhnNumber(pm.getPayload().getCompany().getPhoneNumber());
			userdtls.setCompanyWebsite(pm.getPayload().getCompany().getWebsite());
			
		}
		
		if(pm.getPayload().getOrder()!=null){
			userdtls.setPricingDuraciton(pm.getPayload().getOrder().getPricingDuration());
			userdtls.setEditionCode(pm.getPayload().getOrder().getEditionCode());
		}
		
		userdtls.setUuid(pm.getCreator().getUuid());
		
		if(pm.getPayload().getAccount()!=null){
			userdtls.setAccountIdentifier(pm.getPayload().getAccount().getAccountIdentifier());
		}
		else{
			Random rand = new Random();

			int  n = rand.nextInt(50) + 1;

			userdtls.setAccountIdentifier(""+n);
		}
		

		userdtls.setEmail(pm.getCreator().getEmail());
		userdtls.setAddress(pm.getCreator().getAddress());
		userdtls.setFlag(pm.getFlag());
		userdtls.setLanguage(pm.getCreator().getLanguage());
		userdtls.setFirstName(pm.getCreator().getFirstName());
		userdtls.setLastName(pm.getCreator().getLastName());

		return userdtls;
	}
}
