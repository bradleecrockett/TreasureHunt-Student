
public abstract class NamedThing
{
   private String name;
   
   public NamedThing(String n) {
       name = n;
   }
   
   public String getName() {
       return name;
    }
   
   public String toString() {
       return name;
    }
}
