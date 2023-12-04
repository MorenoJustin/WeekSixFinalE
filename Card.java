package weekSix;


public class Card {

    public static final int KING = 13;
    public static final int QUEEN = 12;
    public static final int JACK = 11;
    public static final int ACE = 14;

    private int value;
    private String suit;


    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void describeCard() {
        String cardName;
        if (value == KING) {
            cardName = "King";
        } else if (value == QUEEN) {
            cardName = "Queen";
        } else if (value == JACK) {
            cardName = "Jack";
        } else if (value == ACE) {
            cardName = "Ace";
        } else {
            cardName = String.valueOf(value);
        }

        System.out.println("Card name: " + cardName + " of " + this.suit + ", Card value: " + this.value);
    }

    public static String[] getAllSuits() {
        return new String[]{"Hearts", "Spades", "Diamonds", "Clubs"};
    }

    public Card(int value, String suit) {
      this.value = value;
      this.suit = suit;
  }

public abstract class Suit {
    private String name;

    public Suit(String name) {
        this.name = name;
    }

    public String getName() { // for suit
        return name;
    }
}

public class Hearts extends Suit {
    public Hearts() {
        super("Hearts");
    }
}

public class Spades extends Suit {
    public Spades() {
        super("Spades");
    }
}

public class Diamonds extends Suit {
    public Diamonds() {
        super("Diamonds");
    }
}

public class Clubs extends Suit {
    public Clubs() {
        super("Clubs");
    }
}
}

