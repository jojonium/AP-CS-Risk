import java.util.Random;
public class Die implements Comparable<Die>{
    public Die(){
       value = 0;
    }
    
    public String toString(){
            return ("" + value);
    }
        
    public int compareTo(Die that){
            return(this.value - that.value);
    }
    
    public Integer getValue(){
        return value;
    }
    
    public Die dieRoll(){
        Random randGen = new Random();
        value = randGen.nextInt(6) + 1;
        return this;
    }
    
    private Integer value;
}