// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package ebay.apis.eblbasecomponents;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Shipping costs and options related to a domestic shipping service.
 * 
 */
public class ShippingServiceOptionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingInsuranceCost")
	public AmountType shippingInsuranceCost;	
	
	@Element(name = "ShippingServiceName")
	public String shippingServiceName;	
	
	@Element(name = "ShippingServiceCost")
	public AmountType shippingServiceCost;	
	
	@Element(name = "ShippingServiceAdditionalCost")
	public AmountType shippingServiceAdditionalCost;	
	
	@Element(name = "ShippingServicePriority")
	public Integer shippingServicePriority;	
	
	@Element(name = "ExpeditedService")
	public Boolean expeditedService;	
	
	@Element(name = "ShippingTimeMin")
	public Integer shippingTimeMin;	
	
	@Element(name = "ShippingTimeMax")
	public Integer shippingTimeMax;	
	
	@Element(name = "ShippingSurcharge")
	public AmountType shippingSurcharge;	
	
	@Element(name = "ShipsTo")
	public List<String> shipsTo;	
	
	@Element(name = "EstimatedDeliveryMinTime")
	public Date estimatedDeliveryMinTime;	
	
	@Element(name = "EstimatedDeliveryMaxTime")
	public Date estimatedDeliveryMaxTime;	
	
	@Element(name = "FastAndFree")
	public Boolean fastAndFree;	
	
	@AnyElement
	public List<Object> any;	
	
    
}