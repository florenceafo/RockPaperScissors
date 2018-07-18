import java.util.Random;
import java.util.Scanner;

class RockPaperScissors {

public static int getRandomNumber() {
  Random randNum = new Random();
  int value = randNum.nextInt(3) + 1;
  System.out.println(value);
  return value;
}

public static String getComputerHand(int value) {
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

public static String getPlayerHand() {
  Scanner playerInput = new Scanner(System.in);
  int inputValue = playerInput.nextInt();
  System.out.println(inputValue);
  String playerHand = "";
  if (inputValue == 1) {
    playerHand = "rock";
  } else if (inputValue == 2) {
    playerHand = "paper";
  } else if (inputValue == 3) {
    playerHand = "scissors";
  }
  System.out.println(playerHand);
  return(playerHand);
}

public static String runGame(String compHand, String playHand) {
  
}

  public static void main (String [] args) {
    getComputerHand(getRandomNumber());
    getPlayerHand();
  }
}
