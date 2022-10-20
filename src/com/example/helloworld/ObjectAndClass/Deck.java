package com.example.helloworld.ObjectAndClass;

public class Deck {
    private final Card[] cards;
    private int cardUsed;

    public Deck(){
        this.cards = new Card[52];
        initializeDeck();
    }
    private void initializeDeck(){
        int count = 0;
        // hearts
        for (int i = 1; i <= 13; i++){
            cards[count++] = new Card(i, Suit.HEARTS);
        }
        //clubs
        for (int i = 1; i <= 13; i++){
            cards[count++] = new Card(i , Suit.CLUBS);
        }
        //diamonds
        for (int i = 1; i <= 13; i++){
            cards[count++] = new Card(i, Suit.DIAMOND);
        }
        //Spades
        for (int i = 1; i <= 13; i++){
            cards[count++] = new Card(i, Suit.SPADES);
        }
    }
    public void shuffle(){
        for (int i  = 1; i <=cards.length-1; i++){
            int rand = (int) (Math.random()* (i + 1));
            Card temp = cards[i];
            cards[i] = cards[rand];
            cards[rand] = temp;
        }
        cardUsed = 0;
    }
    public Card dealCard(){
        cardUsed++;
        return cards[cardUsed -1];
    }
}
