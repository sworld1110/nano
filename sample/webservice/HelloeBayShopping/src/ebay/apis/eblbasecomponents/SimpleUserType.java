// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Type to contain the data for one eBay user. Depending on the context, the user
 * might be the seller or the buyer in a transaction, or the bidder or winning bidder
 * in a listing. An object of this type is returned by a number of calls, including
 * the GetUser call.
 * 
 */
public class SimpleUserType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "UserID")
	public String userID;	
	
	@Element(name = "FeedbackPrivate")
	public Boolean feedbackPrivate;	
	
	@Element(name = "FeedbackRatingStar")
	public FeedbackRatingStarCodeType feedbackRatingStar;	
	
	@Element(name = "FeedbackScore")
	public Integer feedbackScore;	
	
	@Element(name = "UserAnonymized")
	public Boolean userAnonymized;	
	
	@Element(name = "NewUser")
	public Boolean newUser;	
	
	@Element(name = "RegistrationDate")
	public Date registrationDate;	
	
	@Element(name = "RegistrationSite")
	public SiteCodeType registrationSite;	
	
	@Element(name = "Status")
	public UserStatusCodeType status;	
	
	@Element(name = "SellerBusinessType")
	public SellerBusinessCodeType sellerBusinessType;	
	
	@Element(name = "StoreURL")
	public String storeURL;	
	
	@Element(name = "StoreName")
	public String storeName;	
	
	@Element(name = "SellerItemsURL")
	public String sellerItemsURL;	
	
	@Element(name = "AboutMeURL")
	public String aboutMeURL;	
	
	@Element(name = "MyWorldURL")
	public String myWorldURL;	
	
	@Element(name = "MyWorldSmallImage")
	public String myWorldSmallImage;	
	
	@Element(name = "MyWorldLargeImage")
	public String myWorldLargeImage;	
	
	@Element(name = "ReviewsAndGuidesURL")
	public String reviewsAndGuidesURL;	
	
	@Element(name = "FeedbackDetailsURL")
	public String feedbackDetailsURL;	
	
	@Element(name = "PositiveFeedbackPercent")
	public Float positiveFeedbackPercent;	
	
	@Element(name = "SellerLevel")
	public SellerLevelCodeType sellerLevel;	
	
	@Element(name = "TopRatedSeller")
	public Boolean topRatedSeller;	
	
	@AnyElement
	public List<Object> any;	
	
    
}