package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 3/24/2016.
 */
public class Hand {
    ArrayList<Card>handOfPlayer;
    
    public Hand(){
        handOfPlayer = new ArrayList<Card>();
    }

    public addCard(Card newCard) {
        handOfPlayer.add(newCard);
    }
    
    /*
    public ArrayList<Card> PlayerHand(){
     
     
        for(int i =0; i<7; i++){
            Deck myDeck = new Deck();
            Card hand = myDeck.dealCard();
            handOfPlayer.add(hand);
        }
        return handOfPlayer;
    }  */
}
