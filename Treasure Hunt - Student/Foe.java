public class Foe extends Entity {
    
    private int strength;
    
    public Foe (String n, int s) {
        super(n);
        strength = s;
    }
    
    public int computeBattleNumber() {
        return (int)(Math.random()*10) + strength;
    }
}
