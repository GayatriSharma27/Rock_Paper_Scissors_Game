public class Game {
    public static void main(String[] args) {
        int i, compScore, userScore, userInput, num;
        System.out.println("*** Welcome to the ROCK, PAPER AND SCISSORS Game***");
                System.out.println("Rules:=>\n\t1.Click on 1 for Rock, 2 for Paper and 3 for Scissors. \n\t2. You have 5 tries. \n\t3. Click one digit at one time.");
        System.out.println("All the best!!");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int upperbound = 4;
        userScore = 0;
        compScore = 0;
        for(i = 0; i<=4; i++){
            System.out.print("** Rock Paper Scissor ** : ");
            userInput = sc.nextInt();
            num = rand.nextInt(upperbound);
            switch(userInput){
                case 1:
                    if(userInput == num){
                        System.out.println ("  Computer    |    User  ");
                        System.out.println("    Rock          Rock \n It is a Tie");
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;

                    }
                    else if(num > userInput && num == 2){
                        System.out.println(" Rock = Paper ");
                        compScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }
                    else{
                        System.out.println(" Rock = Scissor ");
                        userScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }
                case 2:
                    if(userInput == num){
                        System.out.println("Paper = Paper \n It is a Tie");
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;

                    }
                    else if(num < userInput && num == 1){
                        System.out.println(" Rock = Paper ");
                        compScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }
                    else{
                        System.out.println(" Rock = Scissor ");
                        userScore++;
                        System.out.printf("Scores: \n User Score: %d   | Computer Score: %d", userScore, compScore);
                        break;
                    }


            }


        }
}
