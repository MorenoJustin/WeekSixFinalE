package weekSix;

import java.util.ArrayList;


import java.util.List;
import java.util.Collections;

public class Deck {

    private List<Card> cards;
    

    
    public Deck() {
        this.cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
      for (int value = 2; value <= 14; value++) {
        for (String suit : Card.getAllSuits()) {
          Card card = new Card(value, suit);
          cards.add(card);
        }
      }
    }


        
    

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
            
        }
        return cards.remove(0);
    }
    

}
