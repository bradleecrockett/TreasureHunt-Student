import java.util.*;
public class Princess extends Entity
{
    private int lives;
    private ArrayList<Item> items;
    int row, col;
    Grid grid;
    Scanner scan = new Scanner (System.in);

    public Princess(String n, Grid g){
        super(n);
        row = 0;
        col = 0;
        lives = 3;
        grid = g;
        items = new ArrayList<Item>();
    }
    
    public void status() {
        String temp = "";
        temp += "Princess " + getName() + " Lives: " + lives;
        for (Item i : items) 
           temp += "\n\t" + i + " ";
        System.out.println (temp);
    }
        

    public void move(String d) {
           boolean valid = false;  
           d = d.toUpperCase();
           switch (d) {
              case "N": valid = grid.isValid(row -1, col);   
                        if (valid) row = row-1;
                    break;
              case "S": valid = grid.isValid(row+1, col);
                        if (valid) row = row+1;
                    break;
              case "E": valid = grid.isValid(row,col+1);
                        if (valid) col = col+1;
                    break;
              case "W": valid = grid.isValid(row,col-1);
                        if (valid) col = col -1;
                    break;
              default: valid = false;
                    break;
           }

           if (!valid)
                 System.out.println("Invalid place or direction.\n");
    }

    public void battle() {
        System.out.println ("In princess battle");
        //needs more work to actually do anything
    }
    
    public void view() {
        grid.listPlace(row,col);
    }
    
    public void pickup(String i) {
        if (grid.placeContains(row,col,i))
           items.add(grid.getItem(row,col,i));
        else
           System.out.println("Item is not in this place");
        }
        
    //the more tersure that the Princess 
    //has can impact how she battles...
    public int computeBattleNumber() {
        int value = 0;
        for (Item i : items) {
            if (i instanceof Treasure)
               value += i.getValue();
        }
        return value;
    }
        
}
