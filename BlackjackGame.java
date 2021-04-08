package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackjackGame {
	
	private static int numOfPlayers = 0;
	static ArrayList<Player> playerList = new ArrayList<>();
	
	/**
	 * The main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		instructions();
		playGame();
		
		/*
		// test
		Deck deck1 = new Deck();
		deck1.printDeck();
		
		Player player1 = new Player();
		
		player1.addToHand(player1.getPlayerHand(), deck1.drawACard());
		deck1.removeTopCard();
		
		System.out.println("");
		deck1.printDeck();
		System.out.println("");
		
		player1.printHand(player1.getPlayerHand());
		*/
	}
	
	/**
	 * This method provides the instructions for the game
	 */
	public static void instructions() {
		
		System.out.println("Welcome to Blackjack");
		System.out.println("");
		System.out.println("Instructions");
		System.out.println("Value of cards:");
		System.out.println("- Numbered cards are worth their value");
		System.out.println("- Face cards are worth 10");
		System.out.println("- Aces are worth 1 or 11");
		System.out.println("");
		System.out.println("There are two player involved:");
		System.out.println("- The player");
		System.out.println("- The dealer");
		System.out.println("");
		System.out.println("The player place bet for round");
		System.out.println("The dealer receives two cards, one of them is hidden until the end");
		System.out.println("The player receives two cards");
		System.out.println("The player can either 'hit' or 'stand'");
		System.out.println("Hit means to ask for another card");
		System.out.println("Stand means to hold your card total and end your turn");
		System.out.println("If the player goes over 21, the dealer wins regardless of their hand");
		System.out.println("If the player is dealt an ace and 10, this is a blackjack, the player wins");
		System.out.println("A blackjack usually means the player wins 1.5x their bet amount");
		System.out.println("The dealer will hit until their card total is 17 or higher");
		System.out.println("");
	}
	
	/**
	 * this method contains the logic for the main game loop
	 */
	public static void playGame() {
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		String playerChoice;
		int standCounter = 0;
		boolean hit = false;
		
		Deck deck1 = new Deck();
		Dealer dealer1 = new Dealer();
		
		System.out.println("Enter the number of players (max 7):");
		numOfPlayers = input.nextInt();
		input.nextLine(); //clears the \n character
		
		// populate the player array list
		populatePlayers();
		
		// shuffle the deck
		deck1.ShuffleDeck();
		
		// loop starts here i think?
		// loop until every player stands
		
		// players place bets for round
		for (int i = 0; i < numOfPlayers; i++) {
			
			playerList.get(i).setBetAmount();
		}
		
		// deal 2 cards to dealer
		dealer1.addToHand(dealer1.getDealerHand(), deck1.drawACard());
		deck1.removeTopCard();
		dealer1.addToHand(dealer1.getDealerHand(), deck1.drawACard());
		deck1.removeTopCard();
		
		System.out.println("");
		System.out.println("Dealer's Hand:");
		System.out.println("Hidden Card");
		dealer1.printHand(dealer1.getDealerHand(), 1);
		System.out.println("");
		
		// deal 2 cards to all the players
		for (int i = 0; i < numOfPlayers; i++) {
			
			count = i+1;
			
			System.out.println("Player " + count + " Hand:");
			playerList.get(i).addToHand(playerList.get(i).getPlayerHand(), deck1.drawACard());
			deck1.removeTopCard();
			playerList.get(i).addToHand(playerList.get(i).getPlayerHand(), deck1.drawACard());
			deck1.removeTopCard();
			playerList.get(i).printHand(playerList.get(i).getPlayerHand(), 0);
			System.out.println("");
		}
		
		// loops until all players stand
		while (standCounter != numOfPlayers) {
			
			count = 0;
			standCounter = 0;
		
			// players now hit for more cards or stand
			for (int i = 0; i < numOfPlayers; i++) {
				
				count = i+1;
				
				System.out.println("Player " + count + " Choose to 'hit' or 'stand':");
				playerChoice = input.nextLine();
				playerChoice.toLowerCase();
				System.out.println("");
				
				if (playerChoice.matches("hit")) {
					
					// reprint dealers hand
					System.out.println("Dealer's Hand:");
					System.out.println("Hidden Card");
					dealer1.printHand(dealer1.getDealerHand(), 1);
					System.out.println("");
					
					// reprint players hand with new card
					System.out.println("Player " + count + " Hand:");
					playerList.get(i).addToHand(playerList.get(i).getPlayerHand(), deck1.drawACard());
					deck1.removeTopCard();
					playerList.get(i).printHand(playerList.get(i).getPlayerHand(), 0);
					System.out.println("");
				}
				else if (playerChoice.matches("stand")) {
					standCounter++;
				}
			}
		}
		
		// check results
		// print final hands of both dealer and players
		System.out.println("Final Results");
		System.out.println("");
		System.out.println("Dealer's Hand:");
		dealer1.printHand(dealer1.getDealerHand(), 0);
		System.out.println("");
		
		count = 0;
		
		for (int i = 0; i < numOfPlayers; i++) {
			
			count = i+1;
			
			System.out.println("Player " + count + " Hand:");
			playerList.get(i).printHand(playerList.get(i).getPlayerHand(), 0);
			System.out.println("");
		}
		
		//check the dealers card total
		System.out.print("dealer card total: ");
		dealer1.addToCardTotalValue(dealer1.getDealerHand(), dealer1.getCardTotalValue());
		System.out.println(dealer1.getCardTotalValue());
		System.out.println("");
		
		count = 0;
		
		// check all the players card totals
		for (int i = 0; i < numOfPlayers; i++) {
			
			count = i+1;
			
			System.out.print("Player " + count + " hand total: ");
			playerList.get(i).addToCardTotalValue(playerList.get(i).getPlayerHand(), playerList.get(i).getCardTotalValue());
			System.out.println(playerList.get(i).getCardTotalValue());
		}
		
	}
	
	/**
	 * This method populates the player list all the players in the game
	 */
	public static void populatePlayers() {
		
		for (int i = 0; i < numOfPlayers; i++) {
			playerList.add(new Player());
		}
	}
}
