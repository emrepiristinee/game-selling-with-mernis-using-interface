package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface ISalesService {
	void Sales(Customer customer, Game game);
	void SalesWithCampaign(Customer customer, Campaign campaign, Game game);
}
