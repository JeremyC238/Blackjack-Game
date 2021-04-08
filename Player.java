package blackjack;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Player extends User {

	private int money;
	private int betAmount;
	private int playerNumber = 0;
	private int cardTotalValue;
	private List<Card> playerCards = new ArrayList<Card>();
	Scanner input = new Scanner(System.in);
	
	public Player() {
		setPlayerMoney();
		this.betAmount = 0;
		this.cardTotalValue = 0;
	}
	
	public void setBetAmount() {
		System.out.println("Please enter bet amount:");
		this.betAmount = input.nextInt();
	}
	
	public void setPlayerMoney() {
		playerNumber++;
		System.out.println("Please enter starting money for player " + playerNumber + ":");
		this.money = input.nextInt();
	}
	
	public List<Card> getPlayerHand(){
		return playerCards;
	}
	
	public int getCardTotalValue() {
		return cardTotalValue;
	}
	
	/*
	public void addToPlayerCards(Card card) {
		playerCards.add(card);
	}

	public void clearPlayerHand() {
		playerCards.clear();
	}
	
	public void printPlayerHand() {
		
		for (int i = 0; i < playerCards.size(); i++) 
			System.out.println(playerCards.get(i).getCardInfo());
	}
	*/
	
}
