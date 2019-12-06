import java.util.*;
public class Grid {
    
    private Place[][] kingdom;
    
    public Grid() {
        int gridRow = 3; // 4 rows
        int gridCol = 4; // 5 columns
        kingdom = new Place[gridRow][gridCol];

        kingdom[0][0] = new Place("Entry", "You are in a dark entry way.");
        kingdom[0][1] = new Place("Hall", "You enter a hallway. The walls have amatuer art and the floor is covered in an ugly carpet.");
        kingdom[0][2] = new Place("Kitchen", "The kitchen has dirty dishes in the sink and the damp musky smell of stagnent water.");
        kingdom[0][3] = new Place("Bathroom", "You enter a bathroom that is surprisingly clean.");

        kingdom[1][0] = new Place("Guest Bedroom", "This room has a well made bed and a dresser that has no clothes in it. There are dark drapes covering the window blocking any light from outside.");
        kingdom[1][1] = new Place("Hall", "You enter another hallway. The floors are covered in parquet hardwood that was beginning to buckle in places.");
        kingdom[1][2] = new Place("Master", "The master bedroom has a large King size bed with floral bedding and a small television on a dresser near the closet");
        kingdom[1][3] = new Place("Master Closet", "The master closet has only women's clothing that is at least a decade out of style.");
        // Continue to initialize the rest of the rooms...


        // Add some items in rooms that need Items...
        kingdom[0][2].addItem(new Treasure("Purse", 10));
        kingdom[1][0].addItem(new Treasure("Coin", 5));

        kingdom[1][2].addItem(new Treasure("Key", 50));


        //Add Foes that you would need to battle or interact with...
        kingdom[1][2].addFoe(new Foe("Guart", 7));


    }

    
    //add an Item to a random place on the grid
    public void addItemToPlace(Item i) {
        //needs implementation
    }
    
    //add an Item to a random place on the grid
    public void addFoeToPlace(Foe f) {
        //needs implementation
    }
    
    public void listPlace(int r, int c) {
        System.out.println("row " + r);
        System.out.println("col " + c);
        System.out.println (kingdom[r][c]);
    }
    
    public boolean isValid(int r, int c) {
        System.out.println ("** in grid is valid " + r + " " + c);
        return (r >= 0 && r < kingdom.length && c >=0 && c < kingdom[0].length);
    }
    
    public boolean placeContains(int r, int c, String i) {
        return kingdom[r][c].contains(i);
        
    }
    
    public Item getItem(int r, int c, String i){
       return kingdom[r][c].removeItem(i); 
    }
    
    public String toString() {
        String temp = "";
        for (Place[] row : kingdom)
           for (Place p : row)
              temp += p + "\n";
        return temp;
    }
           
}
