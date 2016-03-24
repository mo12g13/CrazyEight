package com.Momo;

public class Main {

    public static void main(String[] args) {
	Deck myDeck = new Deck();
        System.out.println(myDeck.toString());

	//Create a Hand for computer
	//Create a Hand for human player
	
	// Deal player's hand 7 cards
	// same for computer
	
	Hand playerHand = new Hand();
	
	//put in loop to deal 7 cards.
	playerHand.addCard( myDeck.dealCard()) ;   //or whatever your methods are called. 
	
	//And do the same for computer

    }
}
