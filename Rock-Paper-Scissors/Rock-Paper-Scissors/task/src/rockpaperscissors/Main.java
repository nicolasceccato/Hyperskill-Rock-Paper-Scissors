package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userOption = "";
        do {

            userOption = scanner.next();
            while ((!userOption.equals("rock")) && (!userOption.equals("paper")) && (!userOption.equals("scissors")) && (!userOption.equals("!exit"))) {
                System.out.println("Invalid input");
                userOption = scanner.nextLine();
            }

            if (userOption.equals("!exit")) {
                break;
            }

            String computerOptionString = computerOption();


            if (userOption.equals(computerOptionString)) {
                System.out.println("There is a draw " + "(<" + computerOptionString + ">)");
            } else if ((userOption.equals("rock") && computerOptionString.equals("scissors")) || (userOption.equals("scissors") && computerOptionString.equals("paper")) || (userOption.equals("paper") && computerOptionString.equals("rock"))) {
                System.out.println("Well done. The computer chose " + computerOptionString + " and failed");
            } else {
                System.out.println("Sorry, but the computer chose " + computerOptionString);
            }

            userOption = scanner.nextLine();
        } while (!userOption.equals("!exit"));

        System.out.println("Bye!");

    }

    public static String computerOption() {
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

        return computerOptionString;


    }
}
