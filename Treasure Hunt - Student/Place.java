import java.util.*;
public class Place extends NamedThing
{
    // instance variables - replace the example below with your own
    private ArrayList<Item> items;
    private ArrayList<Entity> foes;
    
    public Place(String n){
       super(n);
       items = new ArrayList<Item>();
       foes = new ArrayList<Entity>();
    }

    public void listItems() {
        String temp = "";
        for (int i = 0; i < items.size(); i++) {
            temp += (i+1) + ": " + items.get(i);
        }
        System.out.println (temp);
    }
    
    public void listFoes() {
        String temp = "";
        for (int i = 0; i < foes.size(); i++) {
            temp += (i+1) + ": " + foes.get(i);
        }
        System.out.println (temp);
    }
    
    public void addItem(Item i ) {
        items.add(i);
  
    }
    
    public void addFoe(Foe f) {
        foes.add(f);
    }
    
    public Item chooseItem(int i) {
        return items.remove(i);
    }
    
    public void removeFoe(int i) {
        foes.remove(i);
    }
    
    public boolean contains (String item) {
        for (Item i: items)
           if (i.getName().equalsIgnoreCase(item))
              return true;
        return false;
    }
    
    public Item removeItem(String i) {
        for (int x = 0; x < items.size(); x++)
           if (items.get(x).getName().equalsIgnoreCase(i))
              return items.remove(x);
        return null;
    }
              
        
    
    
    public String toString() {    
        String temp = "In the " + super.toString() + "\nItems: \n";
        for (Item i : items)
           temp += "\t" + i.toString() + "\n";
        temp += "Foes: \n";
        for (Entity f : foes)
           temp += "\t" + f.toString() + "\n";
        return temp;
    }
            
            
}
