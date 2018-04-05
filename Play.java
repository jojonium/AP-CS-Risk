/**
 * The main program, main begins the game and ties together all the other elements.
 * 
 * @ Joseph Petitti & Rafi Nizam & Mr. Bollinger
 * @ 5/17/2016 to 6/8/2016
 */
import java.util.Scanner;
public class Play{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //  Start of game
        //  Initiate two players
        System.out.print("Enter Player One's Name: ");
        String p1Name = sc.next();
        Player p1 = new Player(p1Name, "RED");
        System.out.print("Enter Player Two's Name: ");
        String p2Name = sc.next();
        Player p2 = new Player(p2Name, "BLUE");
        p1.setOpponent(p2);
        p2.setOpponent(p1);
        
        CountryDeck cd = new CountryDeck();
        GUI_project gooey = new GUI_project(cd);                      //Initiates the GUI (called gooey)
        
        //  Distribute countries randomly
        while(cd.getSize() > 0){
            Country temp1 = cd.deal();
            p1.addTerritory(temp1);
            
            Country temp2 = cd.deal();
            p2.addTerritory(temp2);
        }
        gooey.updateAll(p1, p2);                                    //Updates gooey
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        
        //  Place starting armies on countries.
        p1.startGameDist();
        p2.startGameDist();
        gooey.updateAll(p1, p2); 
        int p1StartArmies = STARTING_ARMIES_PER_PLAYER;
        int p2StartArmies = STARTING_ARMIES_PER_PLAYER;
        while(p1StartArmies > 0 || p2StartArmies > 0){
            System.out.print("Player One: ");
            Country x = p1.askForCountry();
                x.addArmy();
                p1StartArmies--;
                System.out.println("One army added to " + x.getName() + " for Player One. You have " + p1StartArmies + " remaining.");
                gooey.updateAll(p1, p2); 
                
            System.out.print("Player Two: ");
            Country y = p2.askForCountry();
                y.addArmy();
                p2StartArmies--;
                System.out.println("One army added to " + y.getName() + " for Player Two. You have " + p2StartArmies + " remaining.");
                gooey.updateAll(p1, p2); 
        }
        System.out.println("Finished distributing starting armies");
        gooey.updateAll(p1, p2); 
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //  Game start:
        Player activePlayer;
        activePlayer = p2;
        do{
            if (activePlayer == p1)
                activePlayer = p2;
            else if (activePlayer == p2)
                activePlayer = p1;
            System.out.println(activePlayer.getName() + ": Begin turn.");                   //Start of turn for activePlayer
            
            //  REINFORCE PART OF TURN
            int armyBonus = activePlayer.totalArmiesToAdd();
            System.out.println("You have " + armyBonus + " armies to distribute.");
            while(armyBonus > 0){                                                           //Distribute armies for beginning of turn
                Country x = activePlayer.askForCountry();
                    x.addArmy();
                    armyBonus--;
                    System.out.println("One army added to " + x.getName() + ". You have " + armyBonus + " remaining.");
                    gooey.updateCountry(x, activePlayer); 
            }
            
            //  ATTACK PART OF THE TURN
            System.out.println("Would you like to attack? (y/n)");
            String con = sc.next();
            while ((con.equalsIgnoreCase("y")) || con.equalsIgnoreCase("yes")){
                System.out.println("Which country would you like to attack from?");
                Country ca1 = activePlayer.askForCountry();
                System.out.println("Which country would you like to attack to?");
                Country ca2 = activePlayer.getOpponent().askForCountry();
                System.out.print("Out of " + (ca1.getArmies() - 1) + " available armies, how many would you like to attack with? ");
                int z = sc.nextInt();
                activePlayer.attack(ca1, ca2, z);
                gooey.updateAll(p1, p2); 
                System.out.println("Attack again?");

                con = sc.next();
            }
            
            //  MANEUVER PART OF THE TURN
        }while(!activePlayer.checkWin());
        
        //  End of game
        if(p1.checkWin())
            System.out.println("Player 1 has won the game");
        if(p2.checkWin())
            System.out.println("Player 2 has won he game");
    }
    
    //  Instance variables
    private static final int STARTING_ARMIES_PER_PLAYER = 3; //SUPPOSED TO BE 19 I THINK
}