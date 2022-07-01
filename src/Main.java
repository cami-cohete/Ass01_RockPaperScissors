import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        boolean correctInputA = false;
        boolean correctInputB = false;
        boolean userAnswer = false;
        String playerA = "";
        String playerB = "";
        String playAgain = "";

        do {
            userAnswer = false; // acts like a reset

            System.out.println("Lets play Rock, Paper, Scissors, Shoot!");

            do {
                System.out.print("Player A please input a move [R,P,S]: ");
                playerA = in.nextLine();

                if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("S") || playerA.equalsIgnoreCase("P"))
                {
                    correctInputA = true;
                }
                else
                {
                    System.out.println("Invalid input: " + playerA);
                }
            } while (!correctInputA);

            do {
                System.out.print("Player B please input a move [R,P,S]: ");
                playerB = in.nextLine();

                if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("S") || playerB.equalsIgnoreCase("P") )
                {
                    correctInputB = true;
                }
                else
                {
                    System.out.println("Invalid input: " + playerB);
                }
            } while (!correctInputB);

            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a TIE!!!");
                }
                else if (playerB.equalsIgnoreCase("p"))
                {
                    System.out.println("Player B wins! Paper covers rock!!!");
                }
                else
                {
                    System.out.println("Player A wins! Rock breaks scissors!!!");
                }
            }
            else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Player A wins! Paper covers scissors!!!");
                }
                else if (playerB.equalsIgnoreCase("p"))
                {
                    System.out.println("It's a TIE!");
                }
                else
                {
                    System.out.println("Player B wins! Scissors cut paper!!!");
                }
            }
            else
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Player B wins! Rocks breaks scissors!!!");
                }
                else if (playerB.equalsIgnoreCase("p"))
                {
                    System.out.println("Player A wins! Scissors cut paper!!!");
                }
                else
                {
                    System.out.println("It's a TIE!");
                }
            }

            do {
                System.out.print("Would you like to play again [Y/N]? ");
                playAgain = in.nextLine();

                if (playAgain.equalsIgnoreCase("Y"))
                {
                    userAnswer = true;
                    done = false;
                }
                else if (playAgain.equalsIgnoreCase("N"))
                {
                    userAnswer = true;
                    done = true;
                }
                else
                {
                    System.out.println("Invalid Input: " + playAgain);
                }
            } while (!userAnswer);

        } while (!done);
        System.out.println("Thanks for Playing (:");
    }
}
