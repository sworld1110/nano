// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Splitting include reviews and guides from GetProducts.
 * 
 */
@RootElement(name = "FindReviewsAndGuidesRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FindReviewsAndGuidesRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ProductID")
	public ProductIDType productID;	
	
	@Element(name = "UserID")
	public String userID;	
	
	@Element(name = "CategoryID")
	public String categoryID;	
	
	@Element(name = "MaxResultsPerPage")
	public Integer maxResultsPerPage;	
	
	@Element(name = "PageNumber")
	public Integer pageNumber;	
	
	@Element(name = "ReviewSort")
	public ReviewSortCodeType reviewSort;	
	
	@Element(name = "SortOrder")
	public SortOrderCodeType sortOrder;	
	
    
}