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
        System.out.println();

        do {

            System.out.println("How many sides should each die have?");
            n = scan.nextInt();

            die1 = roll(n);
            die2 = roll(n);

            //for (i = 1; i < rollNum + 1; i++) {
                //System.out.println("Roll " + rollNum + ":");
           //}

            System.out.println("Roll: " + rollNum++);
            System.out.println(die1);
            System.out.println(die2);
            System.out.println();

        System.out.println("Would you like to continue? yes/no");
        scan.nextLine();
        userInput = scan.nextLine();

        } while (userInput.equalsIgnoreCase("yes"));
        System.out.println();

        System.out.println("Bye!");

    }

    private static int roll(int n) {
        return (int)(Math.random()* n) + 1;

    }
}
