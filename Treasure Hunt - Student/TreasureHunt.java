import java.util.*;
import java.io.*;
public class TreasureHunt {
    
    public static void main (String[] args) throws IOException {
        //Note that the pathname "TreasureHunt.txt" below will need to be replaced with
        //the complete path to the TreasureHunt.txt file
        // This file creates the
        Scanner file = new Scanner(new File("TreasureHunt.txt"));
       int gridRow = file.nextInt();
       int gridCol = file.nextInt();
       Grid grid = new Grid(gridRow, gridCol);
       file.nextLine();//moves you to the 3rd line
       
       ArrayList<String> places = new ArrayList<>();
       for (int i = 0; i < gridRow*gridCol - 2; i ++)
           places.add(file.nextLine());
       
       
       grid.createKingdom(places);
       

        
      int numTreasures = file.nextInt();
       for (int i = 0; i < numTreasures; i++)
          grid.addItemToPlace(new Treasure(file.next(), file.nextInt()));
          
       int numWeapons = file.nextInt();
       for (int i = 0; i < numWeapons; i++)
          grid.addItemToPlace(new Weapon(file.next(), file.nextInt()));
          
       int numFoes = file.nextInt();
       for (int i = 0; i < numFoes; i++)
          grid.addFoeToPlace(new Foe(file.next(), file.nextInt()));
          
       //System.out.println(grid);
       
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
        System.out.print ("Enter command: ");
        String input = scan.next();
        switch (input) {
            case "help":  System.out.println("'help' 'move' 'battle' 'view' 'pickup' 'status' 'quit'");
                     break;
            case "move":  p.move(scan.next().substring(0,1));
                     break;
            case "battle":  p.battle();
                     break;
            case "view":  p.view();
                     break;
            case "pickup": p.pickup(scan.next());
                     break;
            case "status": p.status();
                     break;
            case "quit": return true;
                    
            default: System.out.println ("Invalid choice.");                         
                     break;
        }
        return false;
    }
}

// // Text File to be read.
// // Must be saved in the same folder.
// // 2
// // 3
// // Courtyard
// // Ballroom
// // Garden
// // Dining Room
// // 2
// // Gold 20
// // Diamonds 40
// // 3
// // Knife 10
// // Dagger 20
// // Sword 50
// // 2
// // Ogre 10
// // Troll 50