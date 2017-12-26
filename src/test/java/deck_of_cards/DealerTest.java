package deck_of_cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.cards.deal.Cards;
import com.cards.deal.Dealer;

public class DealerTest {
	
	private List<Cards> deckOfCardList;
	private Dealer deal;
	static String[] cardArray = {"Aces", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
	
	@Before
	public void initialize() {
		deal = new Dealer();
		deckOfCardList = new ArrayList<>();
		Dealer.createCards(deckOfCardList, cardArray, "Aces");
	}

	@Test
	public void testShuffleCards() {
		Dealer.shuffleCards(deckOfCardList);
		assertEquals(deckOfCardList.size(),13);
	}
	
	@Test
	public void testDealCards() {
		Cards card = deal.dealCards(deckOfCardList);
		assertEquals(deckOfCardList.size(),12);
	}
	
	@Test
	public void testDealCardsEmptyDeck() {
		for(int i=0; i< 13; i++) {
			Cards card = deal.dealCards(deckOfCardList);
		}
		assertEquals(deckOfCardList.size(), 0);
	}
	
	@Test
	public void testDealCardsNull() {
		Cards card = null;
		for(int i=0; i< 14; i++) {
			card = deal.dealCards(deckOfCardList);
		}
		assertNull(card);
	}
}
