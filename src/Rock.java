package src;
import java.util.Random;
import java.util.Scanner;

public class Rock {


        public static void main(String[] args) {

            //Generates choice for the computer
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            //creates input for the user
            Scanner scanner = new Scanner(System.in);
            String playerMove;

            while(true){
                System.out.println("Enter your move (r, p, or s)");

                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not valid move.");
            }

            System.out.println("Computer played: " + computerMove);

            //logic for rps
            if (playerMove.equals(computerMove)) {
                System.out.println("It's a Tie");
            }
            else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("Player loses!");

                } else if (computerMove.equals("s")) {
                    System.out.println("Player Wins!");
                }
            }
            else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println("Player Wins!");

                } else if (computerMove.equals("s")) {
                    System.out.println("Player Loses!");
                }
            }
            else {
                if (computerMove.equals("p")) {
                    System.out.println("Player Wins!");

                } else if (computerMove.equals("r")) {
                    System.out.println("Player Loses!");
                }
            }

        }

    }
