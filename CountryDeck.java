import java.util.ArrayList;
import java.util.Random;

public class CountryDeck{
     public CountryDeck(){
         String[] neighborList = new String[MAX_NEIGHBORS];
         
         //NORTH AMERICA
         neighborList = new String[] {"Northwest Territory", "Greenland","Kamchatka","Alberta"};
         Country alaska = new Country("Alaska", "North America", neighborList);
         deck.add(alaska);
         
         neighborList = new String[] {"Ontario", "Eastern Canada", "Alberta"}; 
         Country northwestTerritory = new Country("Northwest Territory", "North America", neighborList);         
         deck.add(northwestTerritory);
         
         neighborList = new String[] {"Eastern Canada", "Northwest Territory", "Iceland", "Ontario"};   
         Country greenland = new Country("Greenland", "North America", neighborList);   
         deck.add(greenland);
                    
         neighborList = new String[] {"Northwest Territory","Western US","Ontario"};
         Country alberta = new Country("Alberta", "North America", neighborList);   
         deck.add(alberta);
                 
         neighborList = new String[] {"Eastern Canada", "Greenland", "Eastern US","Northwest Territory"}; 
         Country ontario = new Country("Ontario", "North America", neighborList);   
         deck.add(ontario);
                   
         neighborList = new String[] {"Greenland", "Ontario", "Eastern US"};
         Country easternCanada = new Country("Eastern Canada", "North America", neighborList);   
         deck.add(easternCanada);
                   
         neighborList = new String[] {"Alberta", "Central America", "Ontario" };  
         Country westernUS = new Country("Western US", "North America", neighborList);   
         deck.add(westernUS);
                  
         neighborList = new String[] {"Western US", "Eastern Canada","Ontario","Central America"};
         Country easternUS = new Country("Eastern US", "North America", neighborList);   
         deck.add(easternUS);
                    
         neighborList = new String[] {"Western US", "Eastern Canada","Ontario","Central America"};
         Country centralAmerica = new Country("Central America", "North America", neighborList);   
         deck.add(centralAmerica);
         
         //SOUTH AMERICA
         neighborList = new String[] {"Central America", "Peru", "Brazil"};
         Country venezuela = new Country("Venezuela" , "South America", neighborList);
         deck.add(venezuela);
         
         neighborList = new String[] {"Argentina", "Brazil", "Venezuela"};
         Country peru = new Country ("Peru" , "South America", neighborList);
         deck.add(peru);
         
         neighborList = new String[] {"Argentina", "Peru", "Venezuela"};
         Country brazil = new Country("Brazil" , "South America", neighborList);
         deck.add(brazil);
         
         neighborList = new String[] {"Brazil", "Peru", "Venezuela"};
         Country argentina = new Country("Argentina" , "South America", neighborList);
         deck.add(argentina);
        
         //EUROPE
         neighborList = new String[] {"Greenland", "Great Britain", "Scandinavia"};
         Country iceland = new Country ("Iceland" , "Europe", neighborList);
         deck.add(iceland);
         
         neighborList = new String[] {"Scandinavia", "Northern Europe", "Iceland", "Western Europe"};
         Country greatBritain = new Country ("Great Britain" , "Europe" , neighborList);
         deck.add(greatBritain);
         
         neighborList = new String[] {"Great Britain", "Western Europe", "Southern Europe", "Russia ", "Scandinavia",};
         Country northernEurope = new Country ("Northern Europe", "Europe" , neighborList);
         deck.add(northernEurope);
        
         neighborList = new String[] {"Northern Europe","Western Europe", "Middle East", "Egypt", "North Africa" , "Russia"};
         Country southernEurope = new Country ("Southern Europe" , "Europe" , neighborList);
         deck.add(southernEurope);
        
         neighborList = new String[] {"Northern Europe", "North Africa", "Great Britain"};
         Country westernEurope = new Country ("Western Europe" , "Europe" , neighborList);
         deck.add(westernEurope);
        
         neighborList = new String[] {"Ural" , "Afghanistan", "Middle East","Southern Europe", " Northern Europe", "Scandinavia"};
         Country russia = new Country ("Russia" , "Europe" , neighborList);
         deck.add(russia);
       
         neighborList = new String[] { "Northern Europe", "Iceland", "Great Britain", "Russia"};
         Country scandinavia = new Country ("Scandinvaia" , "Europe" , neighborList);
         deck.add(scandinavia);
        
         //AFRICA
         neighborList = new String[] {"Western Europe" , "Southern Europe", "Egypt","East Africa", "Central Africa"};
         Country northAfrica = new Country ("North Africa" , "Africa" , neighborList);
         deck.add(northAfrica);
        
         neighborList = new String[] {"Middle East" , "Southern Europe", "North Africa","East Africa"};
         Country egypt = new Country ("Egypt" , "Africa" , neighborList);
         deck.add(egypt);
        
         neighborList = new String[] {"Central Africa", "Middle East", "North Africa", "South Africa"};
         Country eastAfrica = new Country ("East Africa" , "Africa" , neighborList);
         deck.add(eastAfrica);
        
         neighborList = new String[] {"Central Africa" , "Madagascar","East Africa"};
         Country southAfrica = new Country ("South Africa" , "Africa" , neighborList);
         deck.add(southAfrica);
        
         neighborList = new String[] {"South Africa" , "North Africa","East Africa"};
         Country centralAfrica = new Country ("Central Africa" , "Africa" , neighborList);
         deck.add(centralAfrica);
        
         neighborList = new String[] {"South Africa" ,"East Africa"};
         Country madagascar = new Country ("Madagascar" , "Africa" , neighborList);
         deck.add(madagascar);
        
         //ASIA
         neighborList = new String[] {"Afghanistan", "India", "East Africa", "Egypt", "Russia", "Southern Europe",};
         Country middleEast = new Country ("Middle East" , "Asia" , neighborList);
         deck.add(middleEast);
        
         neighborList = new String[] {"Afghanistan", "Middle East", "China", "Southeast Asia"};
         Country india = new Country ("India" , "Asia" , neighborList);
         deck.add(india);
        
         neighborList = new String[] {"Indonesia", "India", "China"};
         Country southeastAsia = new Country ("Southeast Asia" , "Asia" , neighborList);
         deck.add(southeastAsia);
        
         neighborList = new String[] {"Russia","Middle East","China","India"};
         Country afghanistan = new Country ("Afghanistan" , "Asia" , neighborList);
         deck.add(afghanistan);
        
         neighborList = new String[] {"India","Southeast Asia", "Mongolia", "Afghanistan", "Ural", "Siberia"};
         Country china  = new Country ("China" , "Asia" , neighborList);
         deck.add(china);
        
         neighborList = new String[] {"Japan","China","Siberia","Irkutsk","Kamchatka"};
         Country mongolia  = new Country ("Mongolia" , "Asia" , neighborList);
         deck.add(mongolia);
        
         neighborList = new String[] {"Kamchatka","Mongolia"};
         Country japan  = new Country ("Japan" , "Asia" , neighborList);
         deck.add(japan);
        
         neighborList = new String[] {"Kamchatka", "Mongolia ","Siberia", "Yakustk"};
         Country irkutsk = new Country ("Irkutsk" , "Asia" , neighborList);
         deck.add(irkutsk);
        
         neighborList = new String[] {"Japan","Mongolia","Yakutsk", "Irkutsk","Alaska"};
         Country kamchatka = new Country ("Kamchatka" , "Asia" , neighborList);
         deck.add(kamchatka);
         
         neighborList = new String[] {"Kamchatka","Irkutsk","Siberia"};
         Country yakutsk  = new Country ("Yakutsk" , "Asia" , neighborList);
         deck.add(yakutsk);
         
         neighborList = new String[] {"Ural","China","Mongolia" ,"Irkutsk","Yakutsk"};
         Country siberia  = new Country ("Siberia" , "Asia" , neighborList);
         deck.add(siberia);
         
         neighborList = new String[] { "Russia","Afghanistan","China","Siberia"};
         Country ural  = new Country ("Ural" , "Asia" , neighborList);
         deck.add(ural);
         
         //AUSTRALIA
         neighborList = new String[] {"Southeast Asia","New Guinea","Western Australia"};
         Country indonesia= new Country ("Indonesia" , "Australia" , neighborList);
         deck.add(indonesia);
         
         neighborList = new String[] {"Indonesia","Eastern Australia","Westerm Australia"};
         Country newGuinea = new Country ("New Guinea" , "Australia" , neighborList);
         deck.add(newGuinea);
         
         neighborList = new String[] {"New Guinea","Westerm Australia"};
         Country eastAustralia = new Country ("East Australia" , "Australia" , neighborList);
         deck.add(eastAustralia);
         
         neighborList = new String[] {"Indonesia","Eastern Australia","New Guinea"};
         Country westernAustralia = new Country ("West Australia" , "Australia" , neighborList);
         deck.add(westernAustralia);
    }        
        
    public String toString(){
         String deckString = "";   
         for (Country c: deck)   
            deckString += c;  
         return deckString;
    }    
 
    public Country deal(){
         // Generate num, deck.remove card# (array list) return deck.remove should pass. 
         Random randGen = new Random();
         int num = randGen.nextInt(deck.size());
         return deck.remove(num);
    }    
       
    public int getSize(){
         return deck.size();
    }
   
    public static Country getCountry(int index){
        return deck.get(index);    
    }
    
    // INSTANCE VARIABLES
    private static ArrayList<Country> deck = new ArrayList<Country>();
    public static final int MAX_NEIGHBORS = 25;
}