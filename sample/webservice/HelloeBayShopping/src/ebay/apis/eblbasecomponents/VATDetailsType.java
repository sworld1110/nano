// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Container for eBay's Business User features. A business seller can choose
 * to offer an item exclusively to bidders and buyers that also represent businesses.
 * Only applicable when the item is listed in a B2B-enabled category.
 * Currently, the eBay Germany (DE), Austria (AT), and Switzerland (CH) sites support
 * B2B business features.
 * 
 */
public class VATDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BusinessSeller")
	public Boolean businessSeller;	
	
	@Element(name = "RestrictedToBusiness")
	public Boolean restrictedToBusiness;	
	
	@Element(name = "VATPercent")
	public Float vatPercent;	
	
	@Element(name = "VATSite")
	public String vatSite;	
	
	@Element(name = "VATID")
	public String vatid;	
	
	@AnyElement
	public List<Object> any;	
	
    
}