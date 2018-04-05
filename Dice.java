import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Dice {
    public Dice(){
        rolled = new ArrayList<Die>();
    }
     
    public static int compare(Die a, Die b) {
        return b.getValue().compareTo(a.getValue());
    }
            
     public void sortDice(){
          if(rolled.size() == 2){
               if((rolled.get(0)).compareTo(rolled.get(1)) < 0){
                  Die c = rolled.remove(0);
                  rolled.add(c);
               }
          }
          if(rolled.size() == 3){
                if(rolled.get(0).compareTo(rolled.get(1)) < 0){ 
                  Die c = rolled.remove(1);
                  rolled.add(0,c);
                }
                if(rolled.get(0).compareTo(rolled.get(2)) < 0){ 
                  Die c = rolled.remove(2);
                  rolled.add(0,c);
                }
                else if(rolled.get(1).compareTo(rolled.get(2)) < 0){ 
                  Die c = rolled.remove(2);
                  rolled.add(1,c);
                }
          }
          for (Die d: rolled){
             System.out.print(d.getValue() + " ");
          }
          System.out.println();
    }

    public ArrayList<Die> diceRoll(int numOfDice){
        rolled.clear();
        for(int a = 1; a <= numOfDice; a++){
                Die d = new Die();
                d = d.dieRoll();
                rolled.add(d);                    
        }
        sortDice();
        return rolled;
        }
        
    public int first(){
        return rolled.get(0).getValue();
    }
    
    public int second(){
        return rolled.get(1).getValue();
    }
        
    private ArrayList<Die> rolled;
}