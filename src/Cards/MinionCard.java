package Cards;
import java.util.ArrayList;

import Costs.Cost;
import Player.Player;


public class MinionCard implements Card {
	
	String name;
	ArrayList<Cost> costs;
	Player owner;
	
	int currentAttack;	
	int defaultAttack;
	
	int defaultHealth;
	int currentHealth;
	int maxHealth;
	
	//TODO Add abilities -> battleCry do damage
	
	public MinionCard(String name, int health, int attack, ArrayList<Cost> costs,
			Player owner){
		
		this.name = name;
	
		this.defaultHealth = health;
		this.maxHealth = health;
		this.currentHealth = health;
		
		this.defaultAttack = attack;
		this.currentAttack = attack;
		
		this.costs = costs;		
		this.owner = owner;
	}
	
	@Override
	public ArrayList<Cost> getCosts() {
		return costs;
	}

	@Override
	public CardType getCardType() {
		return CardType.MINION;
	}

	@Override
	public void addCost(Cost c) {
		costs.add(c);
	}
	
	public void reduceCost(Cost c){
		
	}
	
	public void heal(int i){
		currentHealth += i;
		if (currentHealth >= maxHealth){
			currentHealth = maxHealth;
		}
	}
	
	
	public void attack(){
		//TODO
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void summon(){
		//TODO
	}

	@Override
	public Player getOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	public void changeOwner(Player player) {
		this.owner = player;
	}
	

}
