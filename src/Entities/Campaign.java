package Entities;

public class Campaign {

	public int Id;
	public String CampaignName;
	public int DiscountPercent;
	
	public Campaign(int id, String campaignName, int discountPercent) {
		super();
		Id = id;
		CampaignName = campaignName;
		DiscountPercent = discountPercent;
	}
}
