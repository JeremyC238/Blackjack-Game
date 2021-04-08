package blackjack;

import java.util.Arrays;
import java.util.List;

public class Card {
	
	private String faceName;
	private String suit;
	
	public Card(String faceName, String suit) {
		setFaceName(faceName);
		setSuit(suit);
	}
	
	/**
	 * This method sets the face name value of the card if it is contained within a valid list of face names
	* @param faceName -> 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen, king, ace
	*/
	public void setFaceName(String faceName) {
		
		// check if the face name is within the List of valid face names
		List<String> validFaceName = getValidFaceName();
		faceName = faceName.toLowerCase();
		
		if(validFaceName.contains(faceName))
			this.faceName = faceName;
	}
	
	/**
	 * This method sets the suit value of the card if it is contained within a valid list of suits
	 * @param suit -> hearts, diamonds, spades, clubs
	 */
	public void setSuit(String suit) {
		
		// check if the suit is within the list of valid suit names
		List<String> validSuit = getValidSuit();
		suit = suit.toLowerCase();
		
		if (validSuit.contains(suit))
			this.suit = suit;
	}
	
	public String getFaceNameValue() {
		return this.faceName;
	}
	
	public String getSuitName() {
		return this.suit;
	}
	
	public String getCardInfo() {
		return this.faceName + " of " + this.suit;
	}
	
	// returns a list containing valid face names
	public static List<String> getValidFaceName(){
		return Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
	}
	
	// returns a list containing valid suits
	public static List<String> getValidSuit(){
		return Arrays.asList("hearts", "diamonds", "spades", "clubs");
	}
}
