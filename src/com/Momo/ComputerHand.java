package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 3/24/2016.
 */
public class ComputerHand extends Hand {
    ArrayList<Card> computerHand;

    ComputerHand() {


    }

    public ArrayList<Card> handOfComputer() {
        for (int i = 0; i < 7; i++) {
            Deck myDeck = new Deck();
            Card handComp = myDeck.dealCard();
            computerHand.add(handComp);

        }
        return computerHand;

    }
}
