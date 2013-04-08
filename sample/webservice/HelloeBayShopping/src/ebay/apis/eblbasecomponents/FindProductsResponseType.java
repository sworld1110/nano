// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returns stock product information in eBay catalogs, such as
 * information about a particular DVD or camera. Optionally,
 * also returns items that match the product.
 * 
 */
@RootElement(name = "FindProductsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindProductsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ApproximatePages")
	public Integer approximatePages;	
	
	@Element(name = "MoreResults")
	public Boolean moreResults;	
	
	@Element(name = "DomainHistogram")
	public DomainHistogramType domainHistogram;	
	
	@Element(name = "ItemArray")
	public SimpleItemArrayType itemArray;	
	
	@Element(name = "PageNumber")
	public Integer pageNumber;	
	
	@Element(name = "Product")
	public List<CatalogProductType> product;	
	
	@Element(name = "TotalProducts")
	public Integer totalProducts;	
	
	@Element(name = "DuplicateItems")
	public Boolean duplicateItems;	
	
    
}