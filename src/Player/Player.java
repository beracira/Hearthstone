package Player;
import Cards.*;

import java.util.ArrayList;

public abstract class Player {
	
	public PlayerClass myClass;
	public String name;
	public boolean playable;
	
	
	public static final int MANA_CAP = 10;
	public int maxMana;
	public int currentMana;
	
	public ArrayList<Card> myDeck;
	public ArrayList<Card> myHand;
	
	public Player(String name, PlayerClass myClass, ArrayList<Card> myDeck ){
		this.name = name;
		this.myClass = myClass;
		this.myDeck = myDeck;
		
		this.maxMana = 1;
		this.currentMana = 0;
		
		this.playable = false;
		
		//TODO Add shuffle hand
	}
	
	public int getCurrentMana(){
		return currentMana;
	}
	
	public int getMaxMana(){
		return maxMana;
	}
	
	public ArrayList<Card> getHand(){
		return myHand;
	}
	
	public void useMana(int amount){
		if(amount > currentMana){
			//TODO throw new notEnoughManaException()
		}
		else{
			currentMana -= amount;
		}		
	}
	
	public void playerCard(int cardIndex){
		//TODO
	}
	
	public void drawCard(){
		//TODO
	}
	
	public void turnStart(){
		if (maxMana < MANA_CAP){
			maxMana += 1;
		}
		currentMana = maxMana;
		//TODO
	}
	
	public void turnEnd(){
		//TODO
	}
	
	
	// TODO
	// public abstract ClassAbility useAbility(){}
	
	
}
