import java.util.Scanner;
import java.util.ArrayList;

public class Player{
    Scanner sc = new Scanner(System.in);
    public Player(String name, String c){
        playerName = name;
        color = c;
        territories = new ArrayList<Country>();
        opponent = null;
    }
    
    public void setOpponent(Player person){
        this.opponent = person;
    }
    
    public Player getOpponent(){
        return opponent;
    }
    
    public String getName(){
        return playerName;
    }
    
    public String toString(){
         String territoriesString = "";
         String unitCardString = "";
            
         for (Country c: territories)   
            territoriesString += c;
            
         return("Name: " + playerName + "\nColor: " + color + "\n" + territoriesString);         
    }
    
    public int totalArmiesToAdd(){
        int returnValue = 0;
        returnValue += this.giveContinentBonus();
        returnValue += this.giveTerritoryBonus();
        return returnValue;
    }
    
    public void moveArmies(int num, Country from, Country to){
        if (!territories.contains(to) || !territories.contains(from))
            return;
        if (!from.isNeighbor(to))
            return;
        if (from.getArmies() - num < 1)
            return;
        
        from.addArmy(-1 * num);
        to.addArmy(num);
    }
    
    public int giveTerritoryBonus(){
        if ((territories.size() / 3) > 3)
            return (territories.size() / 3);
        else return 3;
    }
    
    public int giveContinentBonus(){
        int bonus = 0;
        int asia = 0, southAmerica = 0, northAmerica = 0, europe = 0, africa = 0, australia = 0;
        for (Country c: territories){
            if (c.getContinent().equals("Asia"))
                asia++;
            else if (c.getContinent().equals("North America"))
                northAmerica++;
            else if (c.getContinent().equals("Europe"))
                europe++;
            else if (c.getContinent().equals("South America"))
                southAmerica++;
            else if (c.getContinent().equals("Africa"))
                africa++;
            else
                australia++;
        }
        
        if (asia == 12)
            bonus += 7;
        if (northAmerica == 9)
            bonus += 5;
        if (europe == 7)
            bonus += 5;
        if (africa == 6)
            bonus += 3;
        if (australia == 4)
            bonus += 2;
        if (southAmerica == 4)
            bonus += 2;
                
        return bonus;
    }
    
    public void attack(Country from, Country to, int armies)
    {
        if (!territories.contains(from) || territories.contains(to)){ //Checks if both players have countries
            System.out.println("Invalid Countries");
            return;                                                  //Player MUST have "from" and not have "to"
        }
        if (!from.isNeighbor(to)){   //Checks if to is neighbor to from
            System.out.println("Not neighbors");
            return;
        }
        if (from.getArmies() <= 1){  //Makes sure "from" has more than 1 army
            System.out.println("Must have more than one army on attacking country");
            return;
        }
        if(armies >= from.getArmies() || armies <= 0){  //Makes sure you leave one behind
            System.out.println("Must leave one behind");
            return;
        }
            
        int attackDice, defendDice; //Detirmines how many dice each player rolls
        if (armies < 4)             //If attacking with 1, 2, or 3, that's how many attack dice there are.
            attackDice = armies;
        else                        //If attacking with 4 or more, you get 3 attack dice.
            attackDice = 3;
        if (to.getArmies() == 1)    //if defender has 1 army, defend w/ one die
            defendDice = 1;
        else 
            defendDice = 2;    //otherwise 2
        
        from.addArmy(-1 * armies);

        Dice attackRoll = new Dice();
        Dice defendRoll = new Dice();
        attackRoll.diceRoll(attackDice);
        defendRoll.diceRoll(defendDice);
        
        if (attackDice >= 2 && defendDice == 2){//IF ATTACKING W 2 or 3 AND DEFENDING W 2
            if (attackRoll.first() > (defendRoll.first()) && attackRoll.second() > defendRoll.second()){
                System.out.println("Attacker won twice");
                to.addArmy(-2); //if from wins twice, to loses 2 armies
            }
            if (attackRoll.first() <= (defendRoll.first()) && attackRoll.second() <= defendRoll.second()){
                System.out.println("Defender won twice");
                armies-= 2;//if to wins twice, army pool loses 2 armies
            }
            else{
                System.out.println("Attacker and Defender each won once");
                to.addArmy(-1);//otherwise they both lose 1
                armies-= 1;
            }
        }
        else{    //OTHERWISE ATTACKING W 1
            if (attackRoll.first() > defendRoll.first()){
                System.out.println("Attacker won once");
                to.addArmy(-1);//if from beats to, to loses 1 army
            }
            else{
                System.out.println("Defender won once");
                armies-= 1;//if to beats from, from loses 1 army
            }
        }
        
        if (to.getArmies() == 0){    //IF to HAS NO MORE ARMIES
            System.out.println("Attacker takes " + to.getName());
            this.addTerritory(to);  //to territory gets added to attacker's list of territories
            this.opponent.loseTerritory(to);    //to loses the territory
            
            to.addArmy(armies);     //transfer armies left in the pool to to
        }
        else{
            System.out.println("Attacker did not take " + to.getName());
            from.addArmy(armies);   //Return armies left in the pool to from
        }
    }
    
    public void addTerritory(Country gain){
        territories.add(gain);
    }
    
    public void loseTerritory(Country lose){
        territories.remove(lose);
    }
    
    public boolean owns(Country c){
        return (territories.contains(c));  
    }
    
    public String getColor(){
        return color;
    }
    
    public Country askForCountry(){
        boolean done = false;
        Country temp = new Country();
        while (!done){
            System.out.print("Enter the name of a valid country: ");
            String n = sc.nextLine();
            for(Country c : territories){
                if(n.equalsIgnoreCase(c.getName())){
                    done = true;
                    temp = c;
                }
            }
        }
        return temp;
    }
    
    public void startGameDist(){
        for (Country c : territories){
            c.addArmy();
        }
    }
    
    public boolean checkWin(){
        if(territories.size() == 42)
            return true;
        return false;
    }
    
    public ArrayList<Country> getTerritories(){
        return territories;
    }
    
    //Instance Variables
    private String playerName;
    private ArrayList<Country> territories;
    private Player opponent;
    private String color;
}
