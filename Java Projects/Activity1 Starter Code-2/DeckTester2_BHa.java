//Benjamin Ha
//Period 2
/**
 * This is a class that tests the Card class.
 */
 /*
 1. The Deck class creates an object that holds card objects.
 2. The deck would contain 6 cards.
 3. See implementaton in code
 4.Yes the order does matter.
 */
import java.util.*;
public class DeckTester2_BHa {
    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card card1 = new Card("King","Clubs",11);
        Card card2 = new Card("King","Clubs",11);
        Card card3 = new Card("Jack","Clubs",10);
        String[] rank = {"2","3","4","5","6","7","8","9","Jack","Queen","King","Ace"};
        String[] suit = {"Spades","Club","Diamond","Hearts"};
        int[] value = {2,3,4,5,6,7,8,9,10,10,10,11};
        String[] rank1 = {"Ace","1"};
        String[] suit1 = {"Spades","Club","Diamond","Hearts"};
        int[] value1 = {11,1};

        String[] rank2 = {};
        String[] suit2 = {};
        int[] value2 = {};
        // Assg 1
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println("Comparing Card 1 and Card 2 is "+card1.matches(card2));
        System.out.println("Comparing Card 1 and Card 3 is "+card1.matches(card3));
        // Assg 2
        Deck deck = new Deck(rank,suit ,value);
        Deck deck1 = new Deck(rank1,suit1,value1);
        Deck deck2 = new Deck(rank2,suit2,value2);
        System.out.println("Decks with card's dealt");
        System.out.println("Deck 1 ");
        deck.printDeck();


    }
}
/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
class Card {

    /**
     * String value that holds the suit of the card
     */
    private String suit;

    /**
     * String value that holds the rank of the card
     */
    private String rank;

    /**
     * int value that holds the point value.
     */
    private int pointValue;


    /**
     * Creates a new <code>Card</code> instance.
     *
     * @param cardRank  a <code>String</code> value
     *                  containing the rank of the card
     * @param cardSuit  a <code>String</code> value
     *                  containing the suit of the card
     * @param cardPointValue an <code>int</code> value
     *                  containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue)
    {
        this.suit = cardSuit;
        this.rank = cardRank;
        this.pointValue = cardPointValue;


    }


    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
        return this.suit;
    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
        return this.rank;
    }

    /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
        return this.pointValue;
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard) {

        return(otherCard.pointValue() == (this.pointValue)
                && otherCard.rank().equals(this.rank)&&
                otherCard.suit().equals(this.suit));

    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
		
        return this.rank + " " + this.suit + " "+ String.valueOf(this.pointValue);
    }
}

class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards = new ArrayList<Card>();

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
		
        for(int y = 0; y < suits.length;y++){

            for(int i = 0;i<ranks.length;i++){

                this.cards.add(new Card(ranks[i],suits[y],values[i]));
                this.size++;

            }

        }
       shuffle();



    }


    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
		
        return cards.size()==0;

    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
		
        return this.size;
    }
    /**
     *Prints out full deck
     */
    public void printDeck(){
        for(Card card:this.cards){
            System.out.print(card+ " | ");
        }
    }


    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        ArrayList<Card> shuffled = new ArrayList<Card>(cards.size());
        for(int i = 0; i < cards.size(); i++){
            shuffled.add(null);
        }

        Random r = new Random();

        for(Card c : cards){
            int ind = r.nextInt(cards.size() -1);
            while(shuffled.get(ind) != null){
                // regerate random numbers
                ind = r.nextInt(cards.size());
            }
            shuffled.set(ind, c);
        }

        this.cards = shuffled;
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
		  if(isEmpty())return null;
        Card actCard = cards.get(size-1);
        size--;
        cards.remove(actCard);
        return actCard;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.

                rtn = rtn + "\n";

            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}