package com.cards.deal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	
	//Map<Integer, Cards> cardMap = new HashMap <>();
	List<Cards> cardsList = new ArrayList<>();
	static String[] cardName = {"Aces", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	public static void main(String[] args) {
		
		Dealer dealer = new Dealer();
		createCards(dealer.cardsList, cardName, "Hearts");
		createCards(dealer.cardsList, cardName, "Spade");
		createCards(dealer.cardsList, cardName, "Diamond");
		createCards(dealer.cardsList, cardName, "Clubs");
		shuffleCards(dealer.cardsList);
		
		for(int i=0; i<52; i++) {
			Cards card = dealer.dealCards();
			System.out.println("Iteration "+i+" : "+"The Card retrieved is "+card.getSuiteName()+" "+card.getName());
		}
				
	}
	
	public static void shuffleCards(List<Cards> cardsList){
		Collections.shuffle(cardsList);
	}
	
	public Cards dealCards() {
		if(!this.cardsList.isEmpty()) {
			Cards card =  cardsList.get(0);
			cardsList.remove(card);
			return card;
		}else {
			return null;
		}
	}
	
	public static void createCards(List<Cards> cardsList, String[] cardArray, String suitName) {
		
		for(int i=0; i < cardArray.length; i++) {
			//cardMap.put(new Integer(counter), new Cards(suitName,cardArray[i],i));
			cardsList.add(new Cards(suitName,cardArray[i],i));
		}
		
	}
}
