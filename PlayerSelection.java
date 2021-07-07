import java.util.Scanner;
public class PlayerSelection {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        String menuChoice = "S";

        while(!menuChoice.equals("X") && !menuChoice.equals("x")) {
            System.out.println("Add player: A");
            System.out.println("View all players: V");
            System.out.println("Display two best batsmans: B");
            System.out.println("Display two best bowlers: C");
            System.out.println("Display the best keeper: D");
            System.out.println("Exit program: X");
            System.out.println();

            System.out.print("Enter menu choice: ");
            menuChoice = input.next();

            switch (menuChoice) {
                case "A": case "a":
                    //addmethod call
                    break;
                case "V": case "v":
                    //viewAllPlayers method call
                    break;
                case "B": case "b":
                    //bestBatsmans method call
                    break;
                case "C": case "c":
                    //bestBowlers method call
                    break;
                case "D": case "d":
                    //bestKeepers method call
                    break;
                case "X": case "x":
                    System.out.println("Exited program");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}

