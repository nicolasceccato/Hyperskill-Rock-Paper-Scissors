package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userOption = scanner.nextLine();

        Random random = new Random();

        int computerOption = random.nextInt(3);
        String computerOptionString;
        switch (computerOption) {
            case 0:
                computerOptionString = "rock";
                break;
            case 1:
                computerOptionString = "paper";
                break;
            case 2:
                computerOptionString = "scissors";
                break;
            default:
                computerOptionString = "";
                break;
        }


        if (userOption.equals(computerOptionString)) {
            System.out.println("There is a draw " + "(<" + computerOptionString + ">)");
        } else if ((userOption.equals("rock") && computerOptionString.equals("scissors")) || (userOption.equals("scissors") && computerOptionString.equals("paper")) || (userOption.equals("paper") && computerOptionString.equals("rock"))) {
            System.out.println("Well done. The computer chose " + computerOptionString + " and failed");
        } else {
            System.out.println("Sorry, but the computer chose " + computerOptionString);
        }
    }
}
