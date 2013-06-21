// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for reason code details for a given site.
 * 
 */
public class VeROSiteDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Site")
	@Order(value=0)
	public SiteCodeType site;	
	
	@Element(name = "ReasonCodeDetail")
	@Order(value=1)
	public List<ReasonCodeDetailType> reasonCodeDetail;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}