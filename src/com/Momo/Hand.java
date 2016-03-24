package com.Momo;

import java.util.ArrayList;

/**
 * Created by Momo Johnson on 3/24/2016.
 */
public class Hand {
    ArrayList<Card>handOfPlayer;
    String playerName;
    public Hand(){
        handOfPlayer = new ArrayList<>();

    }

    public ArrayList<Card> getHandOfPlayer() {
        return handOfPlayer;
    }

    public void setHandOfPlayer(ArrayList<Card> handOfPlayer) {
        this.handOfPlayer = handOfPlayer;
    }


    public ArrayList<Card>addCard(Card newCard){
        handOfPlayer.add(newCard);
        return handOfPlayer;

    }

    public void displayHand(){
        for(int i =1; i<handOfPlayer.size(); i++){
            System.out.println(i + ": "+ handOfPlayer.get(i));
        }
    }
    public void displaySize(){
        System.out.println(handOfPlayer.size());
    }

    public String getPlayerName() {
        return "Welcome! "+ this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Card removeCard(int removeCard){
        Card cardOfCard = handOfPlayer.remove(removeCard);
        return cardOfCard;
    }


}
