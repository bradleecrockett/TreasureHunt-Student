
public abstract class Item extends NamedThing
{
    private int value;
    
    public Item (String n, int v) {
        super(n);
        value = v;
    }
    
    public int getValue(){
        return value;
    }
    
    public String toString() {
        return super.toString() + " " + value;
    }
        
}
