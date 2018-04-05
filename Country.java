import java.util.ArrayList;
import javax.swing.*;
public class Country{
    public Country(String name, String continent, String[] nextTo){
         for (String country: nextTo){
              neighbors.add(country);
         }
         countryName = name;
         continentOn = continent;
    }

    public Country(){
        countryName = "error";
        continentOn = "error";
    }
            
    public String toString(){
         String neighborList = "";
         for (String c: neighbors)
            neighborList += (c + "   "); 
            
         return ("\n" + countryName + ":\n" +
                 "\t" + numArmies + " - " + continentOn + "\n" +
                 "\t" + neighborList + "\n");
    }
  
    public boolean isNeighbor(Country target){
        if(neighbors.contains(target.getName())){
          return true;  
        }
        return false; 
    }
    
    public boolean canAttack(){
        if(numArmies >= 1){
            return true;
        }
        return false;
    }
 
    public void addArmy(){
        numArmies++;
    }
    
    public void addArmy(int n){
        numArmies =numArmies + n; 
    }        
    
    public int getArmies(){
         return numArmies;
    }

    public String getContinent(){
        return continentOn;
    }
        
    public String getName(){
        return countryName;
    }
    
    public JButton getButton(){
        return countryButton;
    }
    
    public void setButton(JButton buttonToBeSet){
        countryButton = buttonToBeSet;
    }
        
    // INSTANCE VARIABLES
    private String countryName;
    private JButton countryButton;
    private String continentOn;
    private ArrayList<String> neighbors = new ArrayList<String>();
    private int numArmies;
}