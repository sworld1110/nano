// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains the cost of shipping insurance and other insurance-related information.
 * 
 */
public class InsuranceDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "InsuranceFee")
	@Order(value=0)
	public AmountType insuranceFee;	
	
	@Element(name = "InsuranceOption")
	@Order(value=1)
	public InsuranceOptionCodeType insuranceOption;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}