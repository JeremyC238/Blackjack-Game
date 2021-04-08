package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	// 52 cards in the deck
	private ArrayList<Card> deckOfCards = new ArrayList<>();
	private List<String> faceNames = Card.getValidFaceName();
	private List<String> suits = Card.getValidSuit();
	
	public Deck() {
		
		for(String suit:suits) {
			for(String faceName:faceNames) {
				deckOfCards.add(new Card(faceName, suit));
			}
		}
	}
	
	public void printDeck() {
		
		int count = 0;
		
		for (int i = 0; i < deckOfCards.size(); i++) {
			System.out.println(deckOfCards.get(i).getCardInfo());
			count++;
		}
		System.out.println("All " + count + " cards are present in the deck!");
	}
	
	public void ShuffleDeck() {
		Collections.shuffle(deckOfCards);
	}
	
	public Card drawACard() {
		return deckOfCards.get(0);
	}
	
	public void removeTopCard() {
		deckOfCards.remove(0);
	}
	
	public void clearDeck() {
		deckOfCards.clear();
	}
	
	public void resetDeck() {
		
		for(String suit:suits) {
			for(String faceName:faceNames) {
				deckOfCards.add(new Card(faceName, suit));
			}
		}
	}
	
}
