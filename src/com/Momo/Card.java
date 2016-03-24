package com.Momo;

/**
 * Created by Momo Johnson on 3/24/2016.
 */
public class Card {
    protected int suit;
    protected int rank;
    protected String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds"};
    protected String[] ranks = {"Ace", "2", "3", "4", "5", "6","7", "8", "9","10", "Jack", "Queen", "King" };

    public Card(int suit, int rank){
        this.rank = rank;
        this.suit = suit;


    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public String toString(){
        return this.ranks[rank] +" of "+ this.suits[suit];
    }
}
