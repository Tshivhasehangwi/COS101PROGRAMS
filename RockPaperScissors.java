import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        // This simulates a rock, paper, scissors game
        //Rock beats scissors
        // Scissors beats paper
        // Paper beats rock
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey player one, enter rock, paper or scissors: ");
        String playerOne = scanner.nextLine().toLowerCase();
        System.out.print("Hey player two, its your turn now, rules stay the same, enter rock, paper or scissors: ");
        String playerTwo = scanner.nextLine().toLowerCase();

        if (playerOne.equals("scissors") && playerTwo.equals("scissors")) {
            System.out.println("You both played scissors, therefore there is no winner");

        } else if (playerOne.equals("rock") && playerTwo.equals("rock")) {
            System.out.println("You both played rock, therefore there is no winner");

        } else if (playerOne.equals("paper") && playerTwo.equals("paper")) {
            System.out.println("You both played rock, therefore there is no winner");

        } else if (playerOne.equals("paper") && playerTwo.equals("rock")) {
            System.out.println("Paper beats rock, player one wins.");

        } else if (playerOne.equals("paper") && playerTwo.equals("scissors")) {
            System.out.println("Scissors beats paper, player two wins .");

        } else if (playerOne.equals("rock") && playerTwo.equals("scissors")) {
            System.out.println("Rock beats scissors, player one wins .");

        } else if (playerOne.equals("rock") && playerTwo.equals("paper")) {
            System.out.println("Paper beats rock, player two wins .");

        } else if (playerOne.equals("scissors") && playerTwo.equals("paper")) {
            System.out.println("Scissors beats paper, player one wins .");

        } else if (playerOne.equals("scissors") && playerTwo.equals("rock")) {
            System.out.println("Rock beats scissors, player two wins .");

        } else{
            System.out.println("Dude......stick to the rules,it,s not that hard");
        }

    }
}
