package com.hoa.customerbillingservice.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoa.customerbillingservice.model.BillingInfo;

@RestController
@RequestMapping("/billing")
public class CustomerBillingResource {
	
	@RequestMapping("/info")
	public BillingInfo getBillingInformation(String customerId) {
		BillingInfo info = new BillingInfo();
		info.setAmountDue(590.88);
		info.setCustomerName("Janice");
		return info;
	}

}
