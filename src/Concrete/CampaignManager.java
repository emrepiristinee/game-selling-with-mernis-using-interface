package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void Add(Campaign campaign) {
		System.out.println(
				"%" + campaign.DiscountPercent + " indirimli " + campaign.CampaignName + " kampanyası eklendi.");

	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(
				"%" + campaign.DiscountPercent + " indirimli " + campaign.CampaignName + " kampanyası silindi.");

	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(
				"%" + campaign.DiscountPercent + " indirimli " + campaign.CampaignName + " kampanyası güncellendi.");

	}

}
