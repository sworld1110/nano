// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.marketplace.search.v1.services;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for histogram fields.
 * 
 */
public class ConditionHistogram implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element
	public Condition condition;	
	
	@Element
	public int count;	
	
	@Element
	public String delimiter;	
	
	@AnyElement
	public List<Object> any;	
	
    
}