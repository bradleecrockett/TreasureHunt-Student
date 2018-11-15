import java.util.*;
public class Grid {
    
    private Place[][] kingdom;
    
    public Grid(int r, int c) {
        kingdom = new Place[r][c];
    }
    
    public void createKingdom(ArrayList<String> p) {
        int i = 0;
        for (int r = 0; r < kingdom.length; r++)
           for (int c = 0; c < kingdom[r].length; c++){
               if (r == 0 && c == 0)
                  kingdom[0][0] = new Place("Start");
               else if (r == kingdom.length - 1 && c == kingdom[r].length - 1)
                  kingdom[kingdom.length - 1][kingdom[r].length - 1] = new Place("EXIT");
               else {
                  kingdom[r][c] = new Place(p.get(i));
                  i++;
                }
            }
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
