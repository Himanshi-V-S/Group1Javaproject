import java.util.ArrayList;
import java.util.Scanner;
public class PlayerSelection {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        Player player1 = new Player("Kusal Perera", 31, "batsman", 508);
        Player player2 = new Player("Danushka Gunathilaka", 30, "batsman", 449);
        Player player3 = new Player("Wanindu De Silva", 24, "bowler", 693);
        Player player4 = new Player("Lakshan Sandakan", 30, "bowler", 610);
        Player player5 = new Player("Dushmantha Chameera", 29, "bowler", 482);
        Player player6 = new Player("Lasith Malinga", 38, "bowler", 478);
        Player player7 = new Player("Isuru Udana", 33, "bowler", 404);
        
        ArrayList<String> players = new ArrayList<String>();
        
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
        players.add(player6);
        players.add(player7);

        String menuChoice = "S";

        while(!menuChoice.equals("X") && !menuChoice.equals("x")) {
            System.out.println("Add player: A");
            System.out.println("View all players: V");
            System.out.println("Get player average: AVG");
            System.out.println("Get player details: PD");
            System.out.println("Get player type: PT");
            System.out.println("Get player best performance: BP");
            System.out.println("Display two best batsmans: B");
            System.out.println("Display two best bowlers: C");
            System.out.println("Display the best keeper: D");
            System.out.println("Exit program: X");
            System.out.println();

            System.out.print("Enter menu choice: ");
            menuChoice = input.next();

            switch (menuChoice) {
                case "A": case "a":
                    addPlayer();
                    break;
                case "V": case "v":
                    viewPlayers();
                    break;
                case "B": case "b":
                    displayTwoBestBatsmans();
                    break;
                case "C": case "c":
                    displaytwoBestBowlers();
                    break;
                case "D": case "d":
                    displayTwoBestKeepers();
                    break;
                case "AVG":
                    getAverage();
                    break;
                case "PD":
                    getPlayerDetails();
                    break;
                case "BP":
                    getBestPerformance();
                    break;
                case "PT":
                    getPlayerType();
                case "X": case "x":
                    System.out.println("Exited program");
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}

