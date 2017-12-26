package com.cards.deal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This Class is used to create a master list containing
 * deck of Cards. Operations that are allowed in the class 
 * is Shuffle, Deal (Till no other cards present)
 * @author soumitadas
 *
 */
public class Dealer {
	
	//Map<Integer, Cards> cardMap = new HashMap <>();
	List<Cards> cardsList = new ArrayList<>();
	static String[] cardName = {"Aces", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		createCards(dealer.cardsList, cardName, "Hearts");
		createCards(dealer.cardsList, cardName, "Spade");
		createCards(dealer.cardsList, cardName, "Diamonds");
		createCards(dealer.cardsList, cardName, "Clubs");
		shuffleCards(dealer.cardsList);
		
		for(int i=0; i<52; i++) {
			Cards card = dealer.dealCards(dealer.cardsList);
			System.out.println("Iteration "+(i+1)+" : "+"The Card retrieved is "+card.getSuiteName()+" "+card.getName());
		}
				
	}
	
	/**
	 * Method used to shuffle the Master list of deck of cards
	 * @param cardsList
	 */
	public static void shuffleCards(List<Cards> cardsList){
		Collections.shuffle(cardsList);
	}
	
	/**
	 * This method returns a Cards object. Typically the first element
	 * of the ArrayList and then removes it from the master list. If no 
	 * element present, method returns null
	 * @return
	 */
	public Cards dealCards(List<Cards> cardsList) {
		if(!cardsList.isEmpty()) {
			Cards card =  cardsList.get(0);
			cardsList.remove(card);
			return card;
		}else {
			return null;
		}
	}
	
	/**
	 * Method used to create Cards object for a given suit
	 * @param cardsList
	 * @param cardArray
	 * @param suitName
	 */
	public static void createCards(List<Cards> cardsList, String[] cardArray, String suitName) {
		
		for(int i=0; i < cardArray.length; i++) {
			cardsList.add(new Cards(suitName,cardArray[i],i));
		}
		
	}
}
