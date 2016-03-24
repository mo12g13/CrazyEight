package com.Momo;
import java.util.*;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name begain");
        String name = input.nextLine();


        Deck myDeck = new Deck();
        Hand humanPlayer = new Hand();

        ComputerHand computerHand = new ComputerHand();
        for(int i =1; i<11; i++){
            humanPlayer.addCard(myDeck.dealCard());
            computerHand.addCard(myDeck.dealCard());
        }

        System.out.println("This is your hand");
        humanPlayer.displayHand();
        System.out.println("\n");
        System.out.println("This is the computer hand");
        System.out.println("\n");
        computerHand.displayHand();
        System.out.println(myDeck.cardsRemaining());





            while (true){
                Card display = myDeck.dealCard();
                System.out.println("Card on board:  "+ display);
                humanPlayer.displayHand();

                System.out.println("What card do you want to play: ");

                int playerPlay = input.nextInt();
                Card me = humanPlayer.removeCard(playerPlay);
                display.isAMatch(me);



        }





    }

}
