import java.util.Scanner;
public class RockPaperGame {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String player1, player2;
    System.out.println("Player 1, enter your choice (rock, paper, or scissors):");
    player1 = sc.nextLine();
    System.out.println("Player 2, enter your choice (rock, paper, or scissors):");
    player2 = sc.nextLine();
    if (player1.equals(player2)) {
        System.out.println("It's a tie!");
    } else if ((player1.equals("rock") && player2.equals("scissors")) ||
               (player1.equals("scissors") && player2.equals("paper")) ||
               (player1.equals("paper") && player2.equals("rock"))) {
        System.out.println("Player 1 wins!");
    } else if ((player2.equals("rock") && player1.equals("scissors")) ||
               (player2.equals("scissors") && player1.equals("paper")) ||
               (player2.equals("paper") && player1.equals("rock"))) {
        System.out.println("Player 2 wins!");
    } else {
        System.out.println("Invalid input! Please enter rock, paper, or scissors.");
    }
}
}
