// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Use aspect filters to refine the number of results returned in a response.
 * Populate the aspectFilter container with aspect values obtained from the
 * response of a query that returns an aspectHistogram.
 * 
 */
public class AspectFilter implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	public String aspectName;	
	
	@Element
	public List<String> aspectValueName;	
	
	@Element
	public String delimiter;	
	
	@AnyElement
	public List<Object> any;	
	
    
}