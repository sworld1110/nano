// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Information about an Half.com catalog product.
 * 
 */
public class HalfCatalogProductType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "Title")
	public String title;	
	
	@Element(name = "DetailsURL")
	public String detailsURL;	
	
	@Element(name = "StockPhotoURL")
	public String stockPhotoURL;	
	
	@Element(name = "ShippingCostSummary")
	public ShippingCostSummaryType shippingCostSummary;	
	
	@Element(name = "DisplayStockPhotos")
	public Boolean displayStockPhotos;	
	
	@Element(name = "ItemCount")
	public Integer itemCount;	
	
	@Element(name = "ProductID")
	public List<ProductIDType> productID;	
	
	@Element(name = "DomainName")
	public String domainName;	
	
	@Element(name = "ItemSpecifics")
	public NameValueListArrayType itemSpecifics;	
	
	@Element(name = "ItemArray")
	public SimpleItemArrayType itemArray;	
	
	@Element(name = "ReviewCount")
	public Integer reviewCount;	
	
	@Element(name = "MinPrice")
	public AmountType minPrice;	
	
	@AnyElement
	public List<Object> any;	
	
    
}