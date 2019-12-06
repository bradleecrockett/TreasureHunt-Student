import java.util.*;

public class TreasureHunt {
    
    public static void main (String[] args){

        Grid grid = new Grid();
          
       System.out.println(grid);

        //Create a the Princess (player)
       Princess fiona = new Princess("Fiona", grid);
       
       boolean done = false;
       System.out.print("********* Treasure Hunt ************\n");
       System.out.print("*  Welcome!  Type 'help' to begin. *\n");
       System.out.println("************************************\n");
       Scanner scan = new Scanner(System.in);       
       while (!done) {
           
           done = promptUser(scan,fiona);

        }     
        
    }
    
    public static boolean promptUser(Scanner scan, Princess p) {
        System.out.print("Enter command: ");
        String input = scan.next();

        if (input.equalsIgnoreCase("help")) {
            System.out.println("'help' 'move' 'battle' 'view' 'pickup' 'status' 'quit'");
        } else if (input.equalsIgnoreCase("move")) {
            p.move(scan.next().substring(0, 1));
        } else if (input.equalsIgnoreCase("battle")) {
            p.battle();
        } else if (input.equalsIgnoreCase("view")) {
            p.view();
        } else if (input.equalsIgnoreCase("pickup")) {
            p.pickup(scan.next());
        } else if (input.equalsIgnoreCase("status")) {
            p.status();
        } else if (input.equalsIgnoreCase("quit")) {
            return true;
        } else {
            System.out.println("Invalid choice.");
        }
        return false;

    }

}
