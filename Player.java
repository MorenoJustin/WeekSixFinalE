package weekSix;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private List<Card> hand;
  private int score;
  private String playerName;

  public Player(String playerName) {
      this.playerName = playerName;
      this.score = 0;
      this.hand = new ArrayList<>();
  }

  public String getPlayerName() {
    return playerName;
  }

  public List<Card> getHand() {
    return hand;
  }

  public void setHand(List<Card> hand) {
    this.hand = hand;
  }

  public int getScore() {
    return score;
  }

  public void incrementScore() {
    this.score++;
  }

  public void describe() {
    System.out.println("Player: " + playerName + ", Score: " + score);
    System.out.println("Cards in hand:");
    for (Card card : hand) {
      card.describeCard();
    }
  }

  public Card flip() {
    if (hand.isEmpty()) {
      return null; // Or handle an empty hand as needed
    }
    return hand.remove(0);
  }

  public void draw(Deck deck) {
    Card drawnCard = deck.draw();
    if (drawnCard != null) {
      hand.add(drawnCard);
    } else {
      System.out.println("The deck is empty.");
    }
  }
}

 