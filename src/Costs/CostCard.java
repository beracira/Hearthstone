package Costs;
public class CostCard extends Cost {

	int amount;
	CostType type;
	
	public CostCard(int a){
		amount = a;
		type = CostType.CARDS;
	}
	
	
	@Override
	public int getCostAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public CostType getCostType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	
}