// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves publicly available data for a single listing.
 * Use this call to retrieve most of the information that is visible
 * on a listing's View Item page on the eBay Web site,
 * such as title, description, prices, basic seller and bidder information,
 * and other details about the listing.Also returns basic
 * shipping costs. For more shipping details, use GetShippingCosts.
 * 
 */
@RootElement(name = "GetSingleItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSingleItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	public String itemID;	
	
	@Element(name = "VariationSKU")
	public String variationSKU;	
	
	@Element(name = "VariationSpecifics")
	public NameValueListArrayType variationSpecifics;	
	
	@Element(name = "IncludeSelector")
	public String includeSelector;	
	
    
}