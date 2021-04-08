# Blackjack Game
plays the game of blackjack

# Instructions
The goal of blackjack is to beat the dealers hand without going over 21

Value of cards: 
- Numbered cards are worth their value
- Face cards are worth 10
- Aces are worth 1 or 11

There are two different kinds of players involved:
- The player
- The dealer

- The player places bet for round
- The dealer receives two cards, one of them is hidden until the end
- The player receives two cards
- The player can either 'hit' or 'stand'
- Hit means to ask for another card
- Stand means to hold your card total and end your turn
- If the player goes over 21, the dealer wins regardless of their hand
- If the player is dealt an ace and 10, this is a blackjack, the player wins
- A blackjack usually means the player wins 1.5x their bet amount
- The dealer will hit until their card total is 17 or higher
- Doubling is like a hit, the bet is doubled and the player only gets one more card
- Spliting can be done with two of the same card, take one of the cards and starts a new hand
- Spliting doubles the bet because now there are two hands with the same bet
- Double/split can only be done on first turn, or first turn of new hand
- Cannot play on two aces after they are split
- Can double a hand resulting from a split

# Required functionality
- game loop logic currently only runs once, needs to to be improved until players run out of money
- player betting currently not utilized in the game loop logic
- card total value for both the dealer and the players currently does not work in the game logic loop
- This is currently no logic for doubling and spliting
