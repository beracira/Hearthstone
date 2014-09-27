package Costs;


public class CostHealth extends Cost {

	int amount;
	CostType type;
	
	public CostHealth(int a){
		amount = a;
		type = CostType.HEALTH;
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
