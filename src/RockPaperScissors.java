import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {
    Scanner playerInput = new Scanner(System.in);
    private int score = 0;

    public RockPaperScissors(){
        String compChoice = getComputerHand(getRandomNumber());
        String playChoice = getPlayerHand();
        String result;


        if (compChoice == playChoice) {
            result = "tie";
        } else if ((compChoice == "rock" && playChoice == "scissors") || (compChoice == "scissors" && playChoice == "paper") || (compChoice == "paper" && playChoice == "rock")){
            result = "Computer wins!";
        } else {
            result = "Player wins!";
            score++;
        }
        System.out.println("Result............." + result);
        System.out.println("Your score is " + score);

        playAgain();
    }

    public void playAgain(){
        System.out.println("Do you want to play again? Y/N");
        String choice = playerInput.next();
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Back to the menu");
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Thanks for playing!");
        }
    }

    public int getRandomNumber() {
        Random randNum = new Random();
        int value = randNum.nextInt(3) + 1;
        System.out.println(value);
        return value;
    }

    public String getComputerHand(int value) {
        String computerHand = "";
        if (value == 1) {
            computerHand = "rock";
        } else if (value == 2) {
            computerHand = "paper";
        } else if (value == 3) {
            computerHand = "scissors";
        }
        System.out.println(computerHand);
        return computerHand;
    }

    public String getPlayerHand() {

        int inputValue = playerInput.nextInt();
        String playerHand = "";
        if (inputValue == 1) {
            playerHand = "rock";
        } else if (inputValue == 2) {
            playerHand = "paper";
        } else if (inputValue == 3) {
            playerHand = "scissors";
        }
        System.out.println("You have played " + playerHand);
        return(playerHand);
    }

    public String runGame(String compHand, String playHand) {
        return "hi";
    }

    public static void main (String [] args) {
        RockPaperScissors game = new RockPaperScissors();
    }
}
