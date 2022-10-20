package com.example.helloworld.ObjectAndClass;

import java.util.Scanner;

public class Game {
    private final Scanner input = new Scanner(System.in);
    private int correctGuesses = 0;
    public void play(){
        int gamesPlayed = 0;
        boolean playAgain;
        System.out.println("#### High Low Prediction Card Game ####");
        do {
            KeepPlayingUntilIncorrectGuess();
            gamesPlayed++;
            playAgain = askUserToPlayAgain();
        }while (playAgain);
        double avarageScore = ((double) correctGuesses) / gamesPlayed;
        System.out.println();
        System.out.println("you played" + gamesPlayed + "Game.");
        System.out.println("Your average score was %1.3f. \n" + avarageScore);
    }
    private void KeepPlayingUntilIncorrectGuess(){
        Deck deck = new Deck();
        deck.shuffle();

        Card currentCard = deck.dealCard();
        Card nextCard;
        System.out.println("The First card is : " + currentCard);
        boolean keepPlaying = true;
        while (keepPlaying){
            char guess = askforUserInput();
            nextCard = deck.dealCard();
            System.out.println("The next card is " + nextCard);

            if (nextCard.getValue() == currentCard.getValue()){
                System.out.println("The value is the same as " + "the previous card.");
                System.out.println("You lose on ties. Sorry!");
                keepPlaying = false;
            } else if (nextCard.getValue() > currentCard.getValue()) {
                if (guess == 'H'){
                    System.out.println("Your guess was correct.");
                    correctGuesses++;
                }else {
                    System.out.println("Your guess was incorrect.");
                    keepPlaying = false;
                }
            }else {
                if (guess == 'L'){
                    System.out.println("Your guess was correct.");
                    correctGuesses++;
                }else {
                    System.out.println("Your guess was incorrect.");
                    keepPlaying = false;
                }
            }
            currentCard = nextCard;
            System.out.println();
            System.out.println("the Card is: " +currentCard);
        }
        System.out.println();
        System.out.println("\uD83C\uDFAE The game over!" + "\uD83C\uDFAE");
        System.out.println("You made " + correctGuesses + " correct guess.");
        System.out.println();
    }
    private boolean askUserToPlayAgain(){
        System.out.println("Want to paly again? if, " + "Please type Yes, otherwise type anything exit");
    return input.nextLine().toUpperCase().contains("YES");
    }
    private char askforUserInput(){
        System.out.println("Will the next card be higher (H) " + " or Lower (L): ");
        char guess;
        do {
            guess = input.nextLine().toUpperCase().charAt(0);
            if (guess != 'H' && guess != 'L'){
                System.out.println("Please type H or L:");
            }
        } while (guess != 'H' && guess != 'L');
        return guess;
    }
}
