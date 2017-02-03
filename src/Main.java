import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int die1;
        int die2;
        int n;
        String userInput;
        int rollNum = 1;

        System.out.println("Welcome to the Grand Circus Casino!");
        blankLine();

        do {

            System.out.println("How many sides should each die have?");
            n = scan.nextInt();
            blankLine();

            die1 = roll(n);
            die2 = roll(n);

            System.out.println("Roll: " + rollNum++);
            System.out.println(die1);
            System.out.println(die2);
            blankLine();

            if (die1 == 1 && die2 == 1) {
                System.out.println("SNAKE EYES!");
                blankLine();

            } else if (die1 == 6 && die2 == 6) {
                System.out.println("BOX CARS!");
                blankLine();

            }

            System.out.println("Would you like to continue? yes/no");
            scan.nextLine();
            userInput = scan.nextLine();
            blankLine();

        } while (userInput.equalsIgnoreCase("yes"));

        System.out.println("Bye!");

    }

    private static void blankLine() {
        System.out.println();
    }

    private static int roll(int n) {
        return (int)(Math.random()* n) + 1;

    }
}
