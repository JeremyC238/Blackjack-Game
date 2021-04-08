package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends User {

	private int cardTotalValue;
	private List<Card> dealerCards = new ArrayList<Card>();
	
	public Dealer() {
		this.cardTotalValue = 0;
	}
	
	public List<Card> getDealerHand() {
		return dealerCards;
	}
	
	public int getCardTotalValue() {
		return cardTotalValue;
	}
	
	/*
	public void addToDealerCards(Card card) {
		dealerCards.add(card);
	}
	
	public void clearDealerHand() {
		dealerCards.clear();
	}
	
	public void printDealerHand() {
		
		for (int i = 0; i < dealerCards.size(); i++) 
			System.out.println(dealerCards.get(i).getCardInfo());
	}
	*/
}
