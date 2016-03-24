package com.Momo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Momo Johnson on 3/24/2016.
 */
public class Deck {
    protected ArrayList<Card> cards;
    public Deck(){
        cards = new ArrayList<>();

        for(int a =0; a<4; a++){
            for(int i =0; i<13; i++){
                cards.add(new Card(a, i));
            }
        }
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        return cards.remove(0);
    }

    public int cardsRemaining(){
        return cards.size();
    }


}
