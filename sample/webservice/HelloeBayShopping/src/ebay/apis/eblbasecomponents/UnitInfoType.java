// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * This type provides information about the weight, volume or other quantity measurement of a listed item so buyers can compare per-unit prices. The European Union requires listings for certain types of products to include the price per unit. eBay uses this information and the item's listed price to calculate and display the unit price on eBay EU sites. 
 * 
 */
public class UnitInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "UnitType")
	public String unitType;	
	
	@Element(name = "UnitQuantity")
	public Double unitQuantity;	
	
	@AnyElement
	public List<Object> any;	
	
    
}