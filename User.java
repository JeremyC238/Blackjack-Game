package blackjack;

import java.util.List;

public class User {
	
	public void addToHand(List<Card> hand, Card card) {
		hand.add(card);
	}
	
	public void addToCardTotalValue(List<Card> hand, int cardTotalValue) {
		
		for (int i = 0; i < hand.size(); i++) {
			if (hand.get(i).getFaceNameValue().matches("1"))
				cardTotalValue += 1;
			else if (hand.get(i).getFaceNameValue().matches("2"))
				cardTotalValue += 2;
			else if (hand.get(i).getFaceNameValue().matches("3"))
				cardTotalValue += 3;
			else if (hand.get(i).getFaceNameValue().matches("4"))
				cardTotalValue += 4;
			else if (hand.get(i).getFaceNameValue().matches("5"))
				cardTotalValue += 5;
			else if (hand.get(i).getFaceNameValue().matches("6"))
				cardTotalValue += 6;
			else if (hand.get(i).getFaceNameValue().matches("7"))
				cardTotalValue += 7;
			else if (hand.get(i).getFaceNameValue().matches("8"))
				cardTotalValue += 8;
			else if (hand.get(i).getFaceNameValue().matches("9"))
				cardTotalValue += 9;
			else if (hand.get(i).getFaceNameValue().matches("10") ||
					hand.get(i).getFaceNameValue().matches("jack") ||
							hand.get(i).getFaceNameValue().matches("queen") ||
									hand.get(i).getFaceNameValue().matches("king"))
					cardTotalValue += 10;	
		}
	}
	
	public void clearHand(List<Card> hand) {
		hand.clear();
	}
	
	public void printHand(List<Card> hand, int index) {
		
		for (; index < hand.size(); index++) 
			System.out.println(hand.get(index).getCardInfo());
	}
	
}
