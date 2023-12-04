package weekSix;

public class App {

  public static void main(String[] args) {
      Deck deck = new Deck();
      Player player1 = new Player("Player 1");
      Player player2 = new Player("Player 2");

      // Shuffle the deck
      deck.shuffle();

   // Draw and flip cards, compare values, and update scores for three turns
      for (int i = 0; i < 5; i++) {
          player1.draw(deck);
          player2.draw(deck);

          Card card1 = player1.flip();
          Card card2 = player2.flip();

          // Describe the drawn cards
          System.out.println("Turn " + (i + 1) + ":");
          System.out.println(player1.getPlayerName() + " drew:");
          card1.describeCard();
          System.out.println(player2.getPlayerName() + " drew:");
          card2.describeCard();

          // Compare card values and update scores
          if (card1 != null && card2 != null) {
              if (card1.getValue() > card2.getValue()) {
                  player1.incrementScore();
                  System.out.println(player1.getPlayerName() + " wins this turn!\n");
              } else if (card1.getValue() < card2.getValue()) {
                  player2.incrementScore();
                  System.out.println(player2.getPlayerName() + " wins this turn!\n");
              } else {
                  System.out.println("It's a draw this turn!\n");
              }
          } else {
           
              System.out.println("The deck is empty. Cannot continue the game.");
              break;  // exit
          }
      }



      // Print final scores and the winner or "Draw"
      System.out.println("Final Scores:");
      System.out.println(player1.getPlayerName() + ": " + player1.getScore());
      System.out.println(player2.getPlayerName() + ": " + player2.getScore());

      if (player1.getScore() > player2.getScore()) {
          System.out.println(player1.getPlayerName() + " wins!");
      } else if (player1.getScore() < player2.getScore()) {
          System.out.println(player2.getPlayerName() + " wins!");
      } else {
          System.out.println("It's a draw!");
      }
  }
}
