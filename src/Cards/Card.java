package Cards;
import java.util.ArrayList;

import Costs.Cost;
import Player.Player;


public interface Card {
	
	public Player getOwner();
	
	public String getName();

	public ArrayList<Cost> getCosts();
	public CardType getCardType();
	
	public void addCost(Cost c);
	public void reduceCost(Cost c);
	
	public void summon();
	
}
