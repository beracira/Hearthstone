package Costs;

public class CostMana extends Cost {

	int amount;
	CostType type;
	
	public CostMana(int a){
		amount = a;
		type = CostType.MANA;
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
