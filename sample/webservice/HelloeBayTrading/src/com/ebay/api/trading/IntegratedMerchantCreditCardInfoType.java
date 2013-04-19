// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Indicates the sites on which a seller is eligible to offer IMCC as a payment method.
 * 
 */
public class IntegratedMerchantCreditCardInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SupportedSite")
	@Order(value=0)
	public List<SiteCodeType> supportedSite;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}