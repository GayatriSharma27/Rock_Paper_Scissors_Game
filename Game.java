import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        int i, userInput, num;
        int compScore = 0, userScore = 0;
        int upperbound = 3;
        System.out.println("*** Welcome to the ROCK, PAPER AND SCISSORS Game***");
        System.out.println("Rules:=>\n\t1.Click on 1 for Rock, 2 for Paper and 3 for Scissors. \n\t2. You have 5 tries. \n\t3. Click one digit at one time.");
        System.out.println("All the best!!");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        for (i = 0; i <= 4; i++) {

            System.out.printf("\nTrial #%d\n", i + 1);
            System.out.println("** Rock Paper Scissor **: ");
            userInput = sc.nextInt();
            num = rand.nextInt(upperbound) + 1;
            switch (userInput) {
                case 1:
                    if (userInput == num) {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Rock             Rock  \n\t It is a Tie");
                        System.out.printf("\t\tScores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    } else if (num > userInput && num == 2) {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Paper            Rock  ");
                        compScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    } else {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("  Scissors          Rock  ");
                        userScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }
                case 2:
                    if (userInput == num) {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Paper            Paper  \n It is a Tie");
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;

                    } else if (num < userInput && num == 1) {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Rock            Paper ");
                        userScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    } else {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Scissors         Paper ");
                        compScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }
                case 3:
                    if (userInput == num) {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Scissors        Scissors \n It is a Tie");
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    } else if (num < userInput && num == 1) {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Rock           Scissors");
                        compScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    } else {
                        System.out.println("  Computer    |    User  ");
                        System.out.println("   Paper           Scissors");
                        userScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }
                default:
                    System.out.println("Invalid input!!");
                    break;
            }


        }
        System.out.println("\n *** MATCH OVER *** ");
        System.out.println("\n**Total Scores**");
        System.out.println("  Computer Scores   |    User Scores ");
        System.out.printf("         %d          |        %d     ", compScore, userScore);
        if (compScore < userScore) {
            System.out.println("\n\t\tCongratualtions!!You Won!!!");
        }
        else if (compScore == userScore){
            System.out.println("\n\t\tIt's a Tie!!!");
        }
        else {
            System.out.println("\n\t\tYou Lost!!! \n\t\t Better luck next time!!");
        }

    }
}
