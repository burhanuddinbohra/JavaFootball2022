
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
* This is the super class 
*/
class Football{
    String tournament1;
    String tournament2;

    //stadium Location
    private HashMap<Integer , String> stadiumLocation = new HashMap<Integer , String>();
    public HashMap<Integer , String> getStadiumLocation() {
        return stadiumLocation;
    }

    //constructor to initialize tournaments value









    Football(String tournament1, String tournament2)
    {
        this.tournament1=tournament1;
        this.tournament2=tournament2;
    }



    /*

    * this is because compiler will not create any other constructor "kyu ki maine ek parameterised constructor bana liya"
    * sub-class doesnot have any argumented constructor hence compiler will create a default constructor and will try to find a now agrument
    * or matching constructor in the base class
    */
    Football(){
    }
}

/**
 * Interfaces
 */
 interface DisplayTeamData {
    public void showteamNames();
    public void Names();
    
}

interface DisplayManagermData{
    public void Mangers();
}

interface DisplayTrophy{
    public void Trophy();
}

interface DispplayRanking{
    public void TeamRank();
}

interface DispplayPoints{
    public void TeamP();
}

//class for Premier League
class PremierLeague extends Football
{
   
   //constructor to initialize the values in the sub-class! 
   PremierLeague(String tournament1, String tournament2)
    {
        super(tournament1,tournament2);
    }
    
    //no argument constructor
    PremierLeague(){

    }
   
    public void PLtournament() {
        System.out.print("-------------Welcome to "+this.tournament1 + " Season 2022" );
        System.out.println("-------------" );
    }


    //Premier League Team Names
    private ArrayList<String> teamName = new ArrayList<>();
    public ArrayList<String> getTeamName() {
        return teamName;
    }

   
    
   

}

//teamData class for Premier League
class TeamDataPL  extends PremierLeague implements DisplayTeamData {

    //super calling constructor as its super-class
    TeamDataPL(String tournament1, String tournament2)
    {
        super(tournament1,tournament2);
    }


    //no argument constructor
    TeamDataPL(){}

    //Premier League trophy Cab
   private HashMap<Integer , String> trophyCab = new HashMap<Integer , String>();
   public HashMap<Integer , String> getTrophyCabin(){
       return trophyCab;
   }

    
    @Override
    public void Names()
    
    {
        getTeamName().add("1. Arsenal");
        getTeamName().add("2. Aston Villa");
        getTeamName().add("3. Bournemouth");
        getTeamName().add("4. Brentford");
        getTeamName().add("5. Brighton ");
        getTeamName().add("6. Chelsea");
        getTeamName().add("7. Crystal Palace");
        getTeamName().add("8. Everton");
        getTeamName().add("9. Fulham");
        getTeamName().add("10. Leeds");
        getTeamName().add("11. Leicester City");
        getTeamName().add("12. Liverpool");
        getTeamName().add("13. Manchester City");
        getTeamName().add("14. Manchester United");
        getTeamName().add("15. Newcastle United");
        getTeamName().add("16. Nottingham Forest");
        getTeamName().add("17. Southampton"); 
        getTeamName().add("18. Tottenham ");
        getTeamName().add("19. West Ham ");
        getTeamName().add("20. Wolves");


    }

    @Override
    public void showteamNames() {
        for (String s : getTeamName()) {
            System.out.println(s);
        }
        
    }

}

//Stadium Class For Premier League
class StadiumsPL extends PremierLeague{
   
   // private long capacity;
    String location;

    //Dispplay Stadium Name
   public void showStadium(int key){
    System.out.println(getStadiumName().get(key));
   }
    
   //display Stadium Location
   public void showStadiumLocation(int key){
    System.out.println(getStadiumLocation().get(key));
   }

   //display Capacitty
   public void showCapacity(int key){
    System.out.println(getStadiumCapacity().get(key-(1)));
   }

    //no argument constructor
    StadiumsPL(){}

    //super calling constructor as its super-class
    StadiumsPL(String tournament1, String tournament2)
    {
        super(tournament1,tournament2);
    }

    //Stadium Capacity
    private ArrayList<String> stadiumCap = new ArrayList<>();
    public ArrayList<String> getStadiumCapacity() {
        return stadiumCap;
    }

    public void Capacity() {
        
       getStadiumCapacity().add("60,704");
       getStadiumCapacity().add("42,657");
       getStadiumCapacity().add("11,307");
       getStadiumCapacity().add("17,250");
       getStadiumCapacity().add("31,800");
       getStadiumCapacity().add("40,343");
       getStadiumCapacity().add("25,486");
       getStadiumCapacity().add("39,414");
       getStadiumCapacity().add("22,384");
       getStadiumCapacity().add("37,608");
       getStadiumCapacity().add("32,262");
       getStadiumCapacity().add("53,394");
       getStadiumCapacity().add("53,400");
       getStadiumCapacity().add("74,310");
       getStadiumCapacity().add("52,305");
       getStadiumCapacity().add("30,445");
       getStadiumCapacity().add("32,384");
       getStadiumCapacity().add("62,850");
       getStadiumCapacity().add("62,550");
       getStadiumCapacity().add("31,750");
 
   }


   //stadium names
   private HashMap<Integer , String> stadiumName = new HashMap<Integer , String>();
   public HashMap<Integer , String> getStadiumName(){
       return stadiumName;
   }

   public void StadiumName()
   {

    getStadiumName().put(1, "Emirates Stadium");
    getStadiumName().put(2, "Villa Park");
    getStadiumName().put(3, "Dean Court");
    getStadiumName().put(4, "Brentford Community Stadium");
    getStadiumName().put(5, "Falmer Stadium");
    getStadiumName().put(6, "Stamford Bridge");
    getStadiumName().put(7, "Selhurst Park");
    getStadiumName().put(8, "Goodison Park");
    getStadiumName().put(9, "Craven Cottage");
    getStadiumName().put(10, "Elland Road");
    getStadiumName().put(11, "King Power Stadium");
    getStadiumName().put(12, "Anfield");
    getStadiumName().put(13, "Etihad Stadium");
    getStadiumName().put(14, "Old Trafford");
    getStadiumName().put(15, "St James' Park");
    getStadiumName().put(16, "City Ground");
    getStadiumName().put(17, "St Mary's Stadium");
    getStadiumName().put(18, "Tottenham Hotspur Stadium");
    getStadiumName().put(19, "London Stadium");
    getStadiumName().put(20, "Molineux Stadium");
   }

   public void StadiumLocation()
   {
    
    getStadiumLocation().put(1, "London (Holloway)");
    getStadiumLocation().put(2, "Birmingham");
    getStadiumLocation().put(3, "Bournemouth");
    getStadiumLocation().put(4, "London (Brentford)");
    getStadiumLocation().put(5, "Falmer");
    getStadiumLocation().put(6, "London (Fulham)");
    getStadiumLocation().put(7, "London (Selhurst)");
    getStadiumLocation().put(8, "Liverpool (Walton)");
    getStadiumLocation().put(9,"London (Fulham)");
    getStadiumLocation().put(10, "Leeds");
    getStadiumLocation().put(11, "Leicester");
    getStadiumLocation().put(12, "Liverpool (Anfield)");
    getStadiumLocation().put(13, "Manchester (Bradford)");
    getStadiumLocation().put(14, "Manchester (Old Trafford)");
    getStadiumLocation().put(15, "Newcastle upon Tyne");
    getStadiumLocation().put(16, "West Bridgford");
    getStadiumLocation().put(17, "Southampton");
    getStadiumLocation().put(18, "London (Tottenham)");
    getStadiumLocation().put(19, "London (Stratford)");
    getStadiumLocation().put(20, "Wolverhampton");

   }
 
}


class ManagerPL extends PremierLeague implements DisplayManagermData{
    
    private ArrayList<String> managerName = new ArrayList<>();
    public ArrayList<String> getMangerName() {
        return managerName;
    }

    //display Managers
   public void showManger(int key){
    System.out.println(getMangerName().get(key-(1)));
   }

   //Manger Names
   @Override
    public void Mangers() {
        
       getMangerName().add("Mikel Arteta"); //1
       getMangerName().add("Steven Gerrard"); //2 
       getMangerName().add("Gary O'Neil");      //3
       getMangerName().add("Thomas Frank");     //4
       getMangerName().add("Roberto De Zerbi"); //5
       getMangerName().add("Graham Potter");    //6
       getMangerName().add("Patrick Vieira");   //7
       getMangerName().add("Frank Lampard");    //8
       getMangerName().add("Marco Silva");      //9
       getMangerName().add("Jesse Marsch");     //10
       getMangerName().add("Brendan Rodgers");  //11
       getMangerName().add("Jürgen Klopp");     //12
       getMangerName().add("Pep Guardiola");    //13
       getMangerName().add("Erik ten Hag");     //14
       getMangerName().add("Eddie Howe");       //15
       getMangerName().add("Steve Cooper");     //16
       getMangerName().add("Ralph Hasenhüttl"); //17
       getMangerName().add("Antonio Conte");    //18
       getMangerName().add("David Moyes");      //19
       getMangerName().add("James Collins & Steve Davis (joint-caretakers");    //20
 
   }


}

//Trophy Cabinet Premier League
class TrophyCabinetPL extends TeamDataPL implements DisplayTrophy{
 
   //display Trophy
   public void showTrophy(int key){
    System.out.println(getTrophyCabin().get(key));
   }

   @Override
   public void Trophy()



   {
    getTrophyCabin().put(1, "13 Premier League Titles: 1931, 1933, 1934, 1935, 1938, 1948, 1953, 1971, 1989, 1991, 1998, 2002, 2004");
    getTrophyCabin().put(2, "0 Premier League Titles");
    getTrophyCabin().put(3, "0 Premier League Titles");
    getTrophyCabin().put(4, "0 Premier League Titles");
    getTrophyCabin().put(5, "0 Premier League Titles");
    getTrophyCabin().put(6, "6 Premier League Titles: 1955, 2005, 2006, 2010, 2015, 2017");
    getTrophyCabin().put(7, "0 Premier League Titles");
    getTrophyCabin().put(8, "9 Premier League Titles:  1891, 1915, 1928, 1932, 1939, 1963, 1970, 1985, 1987");
    getTrophyCabin().put( 9,"0 Premier League Titles");
    getTrophyCabin().put(10, "3 Premier League Titles: 1969, 1974, 1992");
    getTrophyCabin().put(11, "1 Premier League Titles: 2016");
    getTrophyCabin().put(12, "19 Premier League Titles: 1901, 1906, 1922, 1923, 1947, 1964, 1966, 1973, 1976, 1977, 1979, 1980, 1982, 1983, 1984, 1986, 1988, 1990, 2020");
    getTrophyCabin().put(13, "8 Premier League Titles: 1937, 1968, 2012, 2014, 2018, 2019, 2021, 2022");
    getTrophyCabin().put(14, "20 Premier League Titles: 1908, 1911, 1952, 1956, 1957, 1965, 1967, 1993, 1994, 1996, 1997, 1999, 2000, 2001, 2003, 2007, 2008, 2009, 2011, 2013");
    getTrophyCabin().put(15, "0 Premier League Titles");
    getTrophyCabin().put(16, "0 Premier League Titles");
    getTrophyCabin().put(17, "0 Premier League Titles");
    getTrophyCabin().put(18, "2 Premier League Titles: 1951, 1961");
    getTrophyCabin().put(19, "0 Premier League Titles");
    getTrophyCabin().put(20, "0 Premier League Titles:");
   }

}

// Multiple Inheritance!!
class RankingPL extends PremierLeague implements DispplayRanking,DisplayTeamData{
    
    //get Ranking
    private HashMap<String , String> rankTeam = new HashMap<String , String>();
   public HashMap<String , String> getRank(){
       return rankTeam;
   }

   //display Ranking
   public void showRank(String key){
    System.out.print(getRank().get(key));
   }
    //rankings

    @Override
    public void TeamRank()


    {
        getRank().put("Arsenal", "1st");
        getRank().put("ManchesterCity", "2nd");
        getRank().put("Tottenham", "3rd");
        getRank().put("Chelsea", "4th");
        getRank().put("ManchesterUnited", "5th");
        getRank().put("NewcastleUnited", "6th");
        getRank().put("Brighton", "7th");
        getRank().put("Bournemouth", "8th");
        getRank().put("Fulham","9th");
        getRank().put("Liverpool", "10th");
        getRank().put("Brentford", "11th");
        getRank().put("Everton", "12th");
        getRank().put("West", "13th");
        getRank().put("Leeds", "14th");
        getRank().put("CrystalPalace", "15th");
        getRank().put("AstonVilla", "16th");
        getRank().put("Southampton", "17th");
        getRank().put("Wolves",  "18th");
        getRank().put("NottinghamForest", "19th");
        getRank().put("Leicester", "20th");
    }

    //Converting HashSet To ArrayList To get the keys!    
    Set<String> keySet = getRank().keySet(); 
    ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
    
   
    @Override
    public void showteamNames() {
        for( Object obj : keySet){
            System.out.println(obj);
        }
    }

    @Override
    public void Names() { }
    

}

class PointsPL extends PremierLeague implements DisplayTeamData,DispplayPoints{
    //get Points
    private HashMap<String , String> pointTeam = new HashMap<String , String>();
   public HashMap<String , String> getPoints(){
       return pointTeam;
   }
   
   //display Points
   public void showPoints(String key){
    System.out.println(getPoints().get(key));
   }
    //rankings
    
    @Override
    public void TeamP()
    
    
    
    {
        pointTeam.put("Arsenal", "24");
        pointTeam.put("ManchesterCity", "23");
        pointTeam.put("Tottenham", "20");
        pointTeam.put("Chelsea", "16");
        pointTeam.put("ManchesterUnited", "15");
        pointTeam.put("NewcastleUnited", "14");
        pointTeam.put("Brighton", "14");
        pointTeam.put("Bournemouth", "12");
        pointTeam.put("Fulham","11");
        pointTeam.put("Liverpool", "10");
        pointTeam.put("Brentford", "10");
        pointTeam.put("Everton", "10");
        pointTeam.put("WestHam", "10");
        pointTeam.put("Leeds", "9");
        pointTeam.put("CrystalPalace", "9");
        pointTeam.put("AstonVilla", "9");
        pointTeam.put("Southampton", "7");
        pointTeam.put("Wolves", "6");
        pointTeam.put("NottinghamForest", "5");
        pointTeam.put("Leicester", "4");
    }

    //Converting HashSet To ArrayList To get the keys!    
   Set<String> keySet = pointTeam.keySet(); 
   ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
   
   @Override
   public void showteamNames() 
   {
       for( Object obj : keySet){
           System.out.println(obj);
       }
   }

    @Override
    public void Names()
    
    {
    }
    
}




//class for Laliga
class Laliga extends Football{
    //parameterised constructor
    Laliga(String tournament1, String tournament2)
    {
        super(tournament1,tournament2);
    }

    //no argument constructor
    Laliga()
    {

    }

    public void LLtournament() {
        System.out.print("-------------Welcome to "+this.tournament2 + " Season 2022");
        System.out.println("-------------" );
        }

    //Laliga Team Names 
        private ArrayList<String> teamName = new ArrayList<>();
        public ArrayList<String> getTeamName() {
            return teamName;
        }




    //Laliga get Ranking
    private HashMap<String , String> rankTeam = new HashMap<String , String>();

    public HashMap<String , String> getRank(){
       return rankTeam;

   }


}


//Stadium Class for Laliga
class StadiumsLL extends Laliga {
 
// private long capacity;
String location;

//Dispplay Stadium Name
public void showStadium(int key)

{
System.out.println(getStadiumName().get(key));
}

//display Stadium Location
public void showStadiumLocation(int key)

{
System.out.println(getStadiumLocation().get(key));
}

//display Capacitty
public void showCapacity(int key)

{
System.out.println(getStadiumCapacity().get(key-(1)));
}

//no argument constructor
StadiumsLL(){}

//super calling constructor as its super-class
StadiumsLL(String tournament1, String tournament2)
{
    super(tournament1,tournament2);
}



//Stadium Capacity
private ArrayList<String> stadiumCap = new ArrayList<>();
public ArrayList<String> getStadiumCapacity() 

{
    return stadiumCap;
}

public void Capacity() 

{
    
   getStadiumCapacity().add("15,000");
   getStadiumCapacity().add("53,289");
   getStadiumCapacity().add("68,456");
   getStadiumCapacity().add("99,354");
   getStadiumCapacity().add("20,724");
   getStadiumCapacity().add("29,000");
   getStadiumCapacity().add("33,732");
   getStadiumCapacity().add("40,000");
   getStadiumCapacity().add("17,393");
   getStadiumCapacity().add("11,810");
   getStadiumCapacity().add("24,262");
   getStadiumCapacity().add("23,576");
   getStadiumCapacity().add("14,708");
   getStadiumCapacity().add("60,721");
   getStadiumCapacity().add("81,044");
   getStadiumCapacity().add("39,500");
   getStadiumCapacity().add("43,883");
   getStadiumCapacity().add("49,430");
   getStadiumCapacity().add("28,012");
   getStadiumCapacity().add("26,354");

}


//stadium names
private HashMap<Integer , String> stadiumName = new HashMap<Integer , String>();
public HashMap<Integer , String> getStadiumName()

{
   return stadiumName;
}

public void StadiumName()


{

getStadiumName().put(1, "Power Horse Stadium");
getStadiumName().put(2, "San Mamés");
getStadiumName().put(3, "Cívitas Metropolitano");
getStadiumName().put(4, "Camp Nou");
getStadiumName().put(5, "Nuevo Mirandilla");
getStadiumName().put(6, "Abanca-Balaídos");
getStadiumName().put(7, "Martínez Valero");
getStadiumName().put(8, "RCDE Stadium");
getStadiumName().put(9, "Coliseum Alfonso Pérez");
getStadiumName().put(10, "Montilivi");
getStadiumName().put(11, "Visit Mallorca Estadi");
getStadiumName().put(12, "El Sadar");
getStadiumName().put(13, "Vallecas");
getStadiumName().put(14, "Benito Villamarín");
getStadiumName().put(15, "Santiago Bernabéu");
getStadiumName().put(16, "Reale Arena");
getStadiumName().put(17, "Ramón Sánchez Pizjuán");
getStadiumName().put(18, "Mestalla");
getStadiumName().put(19, "José Zorilla");
getStadiumName().put(20, "Ciutat de València");



}

public void StadiumLocation()

{

getStadiumLocation().put(1, "City Of Almería");
getStadiumLocation().put(2, "Bilbao");
getStadiumLocation().put(3, "Madrid");
getStadiumLocation().put(4, "Barcelona");
getStadiumLocation().put(5, "Cádiz");
getStadiumLocation().put(6, "Vigo");
getStadiumLocation().put(7, "Elche");
getStadiumLocation().put(8, "Cornellà de Llobregat");
getStadiumLocation().put(9,"Getafe");
getStadiumLocation().put(10, "Girona");
getStadiumLocation().put(11, "Palma");
getStadiumLocation().put(12, "Pamplona");
getStadiumLocation().put(13, "Madrid");
getStadiumLocation().put(14, "Seville");
getStadiumLocation().put(15, "Madrid");
getStadiumLocation().put(16, "San Sebastián");
getStadiumLocation().put(17, "Seville");
getStadiumLocation().put(18, "Valencia");
getStadiumLocation().put(19, "Valladolid");
getStadiumLocation().put(20, "Villarreal");

}

}

class TeamDataLL extends Laliga implements DisplayTeamData{


        //super calling constructor as its super-class
        TeamDataLL(String tournament1, String tournament2)
        {
            super(tournament1,tournament2);
        }
    
        //no argument constructor
        TeamDataLL(){}
    
        //Laliga trophy Cab
        private HashMap<Integer , String> trophyCab = new HashMap<Integer , String>();
        public HashMap<Integer , String> getTrophyCabin()
        
        {
        return trophyCab;
   }
        //Laliga Team Names
        @Override
        public void Names()
        
        {
            getTeamName().add("1. Almeria");
            getTeamName().add("2. Athletic Bilbao");
            getTeamName().add("3. Atletico Madrid");
            getTeamName().add("4. FC Barcelona");
            getTeamName().add("5. Cadiz");
            getTeamName().add("6. Celta Vigo");
            getTeamName().add("7. Elche");
            getTeamName().add("8. Espanyol");
            getTeamName().add("9. Getafe");
            getTeamName().add("10. Girona");
            getTeamName().add("11. Mallorca");
            getTeamName().add("12. Osasuna");
            getTeamName().add("13. Rayo Vallecano");
            getTeamName().add("14. Real Betis");
            getTeamName().add("15. Real Madrid");
            getTeamName().add("16. Real Sociedad");
            getTeamName().add("17. Sevilla");
            getTeamName().add("18. Valencia");
            getTeamName().add("19. Valladolid");
            getTeamName().add("20. Villareal");
            
        }

        @Override
        public void showteamNames() 
        
        {
            for (String s : getTeamName()) {
                System.out.println(s);
            }
            
        }

}

class ManagerLL extends Laliga implements DisplayManagermData{
    private ArrayList<String> managerName = new ArrayList<>();
    public ArrayList<String> getMangerName()
    
    {
        return managerName;
    }

    //display Managers
   public void showManger(int key){
    System.out.println(getMangerName().get(key-(1)));
   }

   //Manger Names
   @Override

    public void Mangers()
    
    {
        
       getMangerName().add("Rubi"); //1
       getMangerName().add("Ernesto Valverde"); //2 
       getMangerName().add("Diego Simeone");      //3
       getMangerName().add("Xavi");     //4
       getMangerName().add("Sergio González"); //5
       getMangerName().add("Eduardo Coudet");    //6
       getMangerName().add("Jorge Almirón");   //7
       getMangerName().add("Diego Martínez");    //8
       getMangerName().add("Quique Sánchez Flores");      //9
       getMangerName().add("Míchel Sánchez");     //10
       getMangerName().add("Javier Aguirre");  //11
       getMangerName().add("Jagoba Arrasate");     //12
       getMangerName().add("Andoni Iraola");    //13
       getMangerName().add("Manuel Pellegrini");     //14
       getMangerName().add("Carlo Ancelotti");       //15
       getMangerName().add("Imanol Alguacil");     //16
       getMangerName().add("Jorge Sampaoli"); //17
       getMangerName().add("Gennaro Gattuso");    //18
       getMangerName().add("Pacheta");      //19
       getMangerName().add("Unai Emery");    //20
   }
}

class TrophyCabinetLL extends TeamDataLL implements DisplayTrophy{
//display Trophy
    public void showTrophy(int key){
    System.out.println(getTrophyCabin().get(key));
   }
   
   String newline = System.lineSeparator(); 
    @Override
    public void Trophy() 

    {

    getTrophyCabin().put(1, "0 Laliga League Titles");
    getTrophyCabin().put(2, "8 Laliga League Titles :   1930, 1931, 1934, 1936, 1943, 1956, 1983, 1984");
    getTrophyCabin().put(3, "11 Laliga League Titles :   1940, 1941, 1950, 1951, 1966, 1970, 1973, 1977, 1996, 2014, 2021");
    getTrophyCabin().put(4, "26 Laliga League Titles :  1929, 1945, 1948, 1949, 1952, 1953, 1959, 1960, 1974, 1985, 1991, 1992, 1993, 1994, 1998, 1999, 2005, 2006, 2009, 2010, 2011, 2013, 2015, 2016, 2018, 2019");
    getTrophyCabin().put(5, "0 Laliga League Titles");
    getTrophyCabin().put(6, "0 Laliga League Titles");
    getTrophyCabin().put(7, "0 Laliga League Titles");
    getTrophyCabin().put(8, "0 Laliga League Titles");
    getTrophyCabin().put( 9,"0 Laliga League Titles");
    getTrophyCabin().put(10, "0 Laliga League Titles");
    getTrophyCabin().put(11, "0 Laliga League Titles");
    getTrophyCabin().put(12, "0 Laliga League Titles");
    getTrophyCabin().put(13, "0 Laliga League Titles");
    getTrophyCabin().put(14, "1 Laliga League Titles:   1935");
    getTrophyCabin().put(15, "35 Laliga League Titles: 1932, 1933, 1954, 1955, 1957, 1958, 1961, 1962, 1963, 1964" +newline+ " 1965, 1967, 1968, 1969, 1972, 1975, 1976, 1978, 1979, 1980" +newline+ " 1986, 1987, 1988, 1989, 1990, 1995, 1997, 2001, 2003" +newline+ " 2007, 2008, 2012, 2017, 2020, 2022");
    getTrophyCabin().put(16, "2 Laliga League Titles:   1981, 1982");
    getTrophyCabin().put(17, "1 Laliga League Titles:   1946");
    getTrophyCabin().put(18, "6 Laliga League Titles:   1942, 1944, 1947, 1971, 2002, 2004");
    getTrophyCabin().put(19, "0 Laliga League Titles");
    getTrophyCabin().put(20, "0 Laliga League Titles:");

    }
}

class RankingLL extends Laliga implements DispplayRanking,DisplayTeamData{

       //display Ranking
   public void showRank(String key){
    System.out.print(getRank().get(key));
   }

    @Override
    public void TeamRank() 
    {
      
        
        getRank().put("RealMadrid", "1st");
        getRank().put("Barcelona", "2nd");
        getRank().put("AtleticoMadrid", "3rd");
        getRank().put("RealBetis", "4th");
        getRank().put("RealSociedad", "5th");
        getRank().put("AthleticClub", "6th");
        getRank().put("Villarreal", "7th");
        getRank().put("Valencia", "8th");
        getRank().put("Osasuna","9th");
        getRank().put("RayoVallecano", "10th");
        getRank().put("CeltaVigo", "11th");
        getRank().put("Mallorca", "12th");
        getRank().put("Espanyol", "13th");
        getRank().put("Sevilla", "14th");
        getRank().put("Girona", "15th");
        getRank().put("Getafe", "16th");
        getRank().put("RealValladolid", "17th");
        getRank().put("Almeria", "18th");
        getRank().put("Cadiz", "19th");
        getRank().put("Elche", "20th");
    }

   //Converting HashSet To ArrayList To get the keys!    
   Set<String> keySet = getRank().keySet(); 
   ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
   
   @Override
   public void showteamNames() 
   {
       for( Object obj : keySet){
           System.out.println(obj);
       }
   }

    @Override
    public void Names()
    
    {
    }
        
}

//Multiple Inheritance
class PointsLL extends PremierLeague implements DisplayTeamData,DispplayPoints{

      //get Points
      private HashMap<String , String> pointTeam = new HashMap<String , String>();
      public HashMap<String , String> getPoints(){
          return pointTeam;
      }
      
      //display Points
      public void showPoints(String key){
       System.out.println(getPoints().get(key));
      }
       //rankings
       
       @Override
       public void TeamP()
       
       {
           pointTeam.put("RealMadrid", "25");
           pointTeam.put("Barcelona", "22");
           pointTeam.put("AtleticoMadrid", "19");
           pointTeam.put("RealBetis", "19");
           pointTeam.put("RealSociedad", "19");
           pointTeam.put("AthleticClub", "17");
           pointTeam.put("Villarreal", "15");
           pointTeam.put("Valencia", "14");
           pointTeam.put("Osasuna", "13");
           pointTeam.put("RayoVallecano","11");
           pointTeam.put("CeltaVigo", "10");
           pointTeam.put("Mallorca", "9");
           pointTeam.put("Espanyol", "9");
           pointTeam.put("Sevilla", "9");
           pointTeam.put("Girona", "8");
           pointTeam.put("Getafe", "8");
           pointTeam.put("RealValladolid", "8");
           pointTeam.put("Almeria", "7");
           pointTeam.put("Cadiz", "6");
           pointTeam.put("Elche", "3");
        
       }
   
       //Converting HashSet To ArrayList To get the keys!    
      Set<String> keySet = pointTeam.keySet(); 
      ArrayList<String> listOfKeys = new ArrayList<String>(keySet);
      
      @Override
      public void showteamNames() 
      {
          for( Object obj : keySet){
              System.out.println(obj);
          }
      }
   
       @Override
       public void Names(){
       }

}
//driver Hai Ye
public class Run 

{
    public static void main(String[] args) 
     {

     
        //obj creation for Premier League
        Football f1= new PremierLeague("Premier League ","Laliga"); //upcasting
        PremierLeague p1 = (PremierLeague) f1; //downcasting to access sub-class of PremierLeague's method even after creating obj for Fooball

        //obj creation for Laliga
        Football f2 = new Laliga("Premier League", "Laliga"); //upcasting...
        Laliga l1= (Laliga) f2; //downcasting...

        //Team Names 
        TeamDataPL n= new TeamDataPL();
        n.Names();    

        //Stadium Names
        StadiumsPL sn= new StadiumsPL();
        sn.StadiumName();

       //Stadium Location
        StadiumsPL sl= new StadiumsPL();
        sl.StadiumLocation();

       //Stadium Capacity
        StadiumsPL c= new StadiumsPL();
        c.Capacity();
        
        //ManagesPL
        ManagerPL m= new ManagerPL();
        m.Mangers();
        
        //TrophyCabinetPL
        TrophyCabinetPL tc= new TrophyCabinetPL();
        tc.Trophy();

        //rankingPL
        RankingPL r= new RankingPL();
        r.TeamRank();

        //pointsPL
        PointsPL p= new PointsPL();
        p.TeamP();

        //Laliga Objs

        //Laliga TeamNames
        TeamDataLL nll = new TeamDataLL();
        nll.Names();

        //LL Stadium Names
        StadiumsLL snLL= new StadiumsLL();
        snLL.StadiumName();

        //Stadium Location
        StadiumsLL slLL= new StadiumsLL();
        slLL.StadiumLocation();

       //Stadium Capacity
        StadiumsLL cLL= new StadiumsLL();
        cLL.Capacity();
        
        //Managers LL
        ManagerLL mLL= new ManagerLL();
        mLL.Mangers();

        //Trophy Cab LL
        TrophyCabinetLL tcLL= new TrophyCabinetLL();
        tcLL.Trophy();

        //rankingPL
        RankingLL rLL= new RankingLL();
        rLL.TeamRank();

        PointsLL pLL = new PointsLL();
        pLL.TeamP();

        int mainMenuChoice;
        int secondMenuChoice;
        int thirdMenuChoice;
        boolean goToMain = false;
        try
        
        {
        do
        
        {
        System.out.println("1. Premier League");
        System.out.println("2. Laliga");
        System.out.println("3. Exit");

        //switchBaazi
        Scanner sc= new Scanner(System.in);
        int first=sc.nextInt();
        
        System.lineSeparator();
            

        switch (first){    //switchOne
            case 1: do{
                    p1.PLtournament();          //main case 1
                    System.out.println("1. Team Data");
                    System.out.println("2. Team Current Rankings");
                    System.out.println("3. Team Current Ponints");
                    System.out.println("4. Exit");
                    System.out.println();
                    System.out.println("OR");
                    System.out.println();
                    System.out.println("Enter 0 to go to main menu");
                    int second=sc.nextInt();         


                    if(second==0){
                    // menuChoice=sc.nextInt();
                    //wasteComment
                    if(second==0 )
                    {
                        goToMain = true;
                        break;
                    }
                }

                    System.out.println();
                        
                        switch (second) {   //switchTWO
                            case 1: n.showteamNames();
                                    System.out.println(" Press Corresponding Team Number to know more about the team");
                                    int third=sc.nextInt(); //select team number
                                    System.out.println();
                                    if(third >20 || third <1){
                                        System.out.println("please choose a number corresponding to its team. You have entered a wrong choice.");
                                        break;
                                    }
                                    
                                    System.out.println("1. Stadim");
                                    System.out.println("2. Manager");
                                    System.out.println("3.Trophy Cabinet");
                                    System.out.print("Enter your choice: ");
                                    System.out.println();
                                    int fourth=sc.nextInt(); //fourth choice for 3rd switch
                                    System.out.println();
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println();
                                    switch (fourth) {       //switch third
                                        case 1:     //for stadium
                                        System.out.println("------------DETAILS OF STADIUM ------------ ");
                                                    System.out.println(n.getTeamName().get(third-(1)));
                                                    System.out.println();
                                                    System.out.print("Stadium Name: ");
                                                    sn.showStadium(third);
                                                    System.out.println();
                                                    System.out.println();
                                                    
                                                    System.out.println("---------------LOCATION---------------");
                                                    System.out.println();
                                                    System.out.print("It is Located in the City: ");
                                                    sl.showStadiumLocation(third);
                                                    
                                                    System.out.println();
                                                    System.out.println();
                                                    System.out.println("------------CAPACITY OF STATIUM------------");
                                                    System.out.println();
                                                    System.out.print("Maximum Capacity of Stadium is =" );
                                                    c.showCapacity(third);
                                                    System.out.println();
                                                    System.out.println("------------------------------------------------------------------");
                                                


                                                break;
                                            
                                            case 2: //for Manager
                                                    System.out.println("------ MANAGER OF "+n.getTeamName().get(third-(1))+"------");
                                                    System.out.println();
                                                    m.showManger(third);

                                            break;

                                            case 3: //For Trophy Cabiner
                                                    System.out.println("------------TROPHY CABINET------------");
                                                    System.out.println();
                                                    tc.showTrophy(third);

                                                break;
                                            
                                            
                                            default:    System.out.println("Wrong Input!");
                                                        System.out.println("Please Try Again");
                                                break;
                                        } //end of third switch
                                break;
                            case 2: // Current Team Ranking
                                        
                                    r.showteamNames();      
                                    System.out.println("---------------------------------------------------------------------");
                                    System.out.println("Enter a team name to know its current team ranking in Premier League:");
                                    String teamChoice=sc.next();
                                    System.out.println();
                                    System.out.print("Current Rank Of "+teamChoice +" in the Premier League is ");
                                    r.showRank(teamChoice);
                                    

                                break;
                            case 3:// Current Points
                                    p.showteamNames();      
                                    System.out.println("---------------------------------------------------------------------");
                                    System.out.println("Enter a team name to know its current team ranking in Premier League:");
                                    String teamChoiceTwo=sc.next();
                                    System.out.println();
                                    System.out.print("Current Points Of "+teamChoiceTwo +" in the Premier League PointsTable are ");
                                    p.showPoints(teamChoiceTwo);
                                    System.out.println();
                                    System.out.print(teamChoiceTwo+" -------Currenlty Stands at ");
                                    r.showRank(teamChoiceTwo);
                                    System.out.println(" position in the Points Table of Premier League-----");       
                                break;

                            
                            case 4: System.out.print("exiting.");
                                    Thread.sleep(2);
                                    System.out.print(".");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    System.exit(0);
                                        break;
                            default:
                                        System.out.println("Invalid Choice...");
                                break;
                         }//switch two ends

                         System.out.println();
                         System.out.println("---------------------Press 1 for back to Premier League---------------------");
                         secondMenuChoice=sc.nextInt();
                        }while(secondMenuChoice==1);


                break;
               

        
            case 2: do{
                    l1.LLtournament();              //main case2 
                    System.out.println("1. Team Data");
                    System.out.println("2. Team Current Rankings");
                    System.out.println("3. Team Current Ponints");
                    System.out.println("4. Exit");
                    System.out.println();
                    System.out.println("OR");
                    System.out.println();
                    System.out.println("Enter 0 to go to main menu");
                             
                    int secondll=sc.nextInt();   //switchTwo
                    
                    if(secondll==0)
                    {
                    if(secondll==0 )
                    {
                        break;
                    }
                    }
                    
                    System.out.println();

                        switch (secondll)
                        
                        {
                            case 1: nll.showteamNames();
                                    System.out.println(" Press Corresponding Team Number to know more about the team");
                                    int thirdll=sc.nextInt(); //select team number
                                    System.out.println();

                                    System.out.println("1. Stadim");
                                    System.out.println("2. Manager");
                                    System.out.println("3.Trophy Cabinet");
                                    System.out.print("Enter your choice: ");
                                    System.out.println();
                                    int fourthll=sc.nextInt(); //fourth choice for 3rd switch
                                    System.out.println();
                                    System.out.println("------------------------------------------------------------------");
                                    System.out.println();

                                    switch (fourthll)
                                    
                                    {
                                        case 1: //for stadium
                                        System.out.println("------------DETAILS OF STADIUM ------------ ");
                                                System.out.println(nll.getTeamName().get(thirdll-(1)));
                                                System.out.println();
                                                System.out.print("Stadium Name: ");
                                                snLL.showStadium(thirdll);
                                                System.out.println();
                                                System.out.println();

                                                System.out.println("---------------LOCATION---------------");
                                                System.out.println();
                                                System.out.print("It is Located in the City: ");
                                                slLL.showStadiumLocation(thirdll);

                                                System.out.println();
                                                System.out.println();
                                                System.out.println("------------CAPACITY OF STATIUM------------");
                                                System.out.println();
                                                System.out.print("Maximum Capacity of Stadium is =" );
                                                cLL.showCapacity(thirdll);
                                                System.out.println();
                                                System.out.println("------------------------------------------------------------------");
                                                    
                                            break;
                                        
                                        case 2://for Manager
                                                System.out.println("------ MANAGER OF "+nll.getTeamName().get(thirdll-(1))+"------");
                                                System.out.println();
                                                mLL.showManger(thirdll);

                                            break;
                                        
                                        case 3://For Trophy Cabiner
                                                System.out.println("------------TROPHY CABINET------------");
                                                System.out.println();
                                                tcLL.showTrophy(thirdll);

                                            break;
                                        default:
                                            break;
                                    } //end of Third Switch

                                
                                break;
                            case 2: // Current Team Ranking
                                    rLL.showteamNames();      
                                    System.out.println("---------------------------------------------------------------------");
                                    System.out.println("Enter a team name to know its current team ranking in Premier League:");
                                    String teamChoice=sc.next();
                                    System.out.println();
                                    System.out.print("Current Rank Of "+teamChoice +" in the Laliga is ");
                                    rLL.showRank(teamChoice);
                                    

                                break;

                            case 3: // Current Points
                                    
                                    pLL.showteamNames();      
                                    System.out.println("---------------------------------------------------------------------");
                                    System.out.println("Enter a team name to know its current team ranking in Premier League:");
                                    String teamChoiceTwo=sc.next();
                                    System.out.println();
                                    System.out.print("Current Points Of "+teamChoiceTwo +" in the Laliga League PointsTable are ");
                                    pLL.showPoints(teamChoiceTwo);
                                    System.out.println();
                                    System.out.println(teamChoiceTwo+" Currenlty Stands at ");
                                    rLL.showRank(teamChoiceTwo);   
                                    System.out.println(" position in the Points Table of Laliga League Table-----");   
                                    break; 
                                    
                                   
                            
                            case 4: 
                                    System.out.print("exiting.");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    Thread.sleep(800);
                                    System.out.print(".");
                                    System.exit(0);
                                break;
                            default:
                                    System.out.println();
                                    System.out.println("You have given a wrong input");
                                    System.out.println();
                                    System.out.println("Please try again");
                                    break;      
                                }
                            System.out.println();
                            System.out.println("---------------------Press 1 for back to Laliga League---------------------");
                            thirdMenuChoice=sc.nextInt();
            }while(thirdMenuChoice==1);
                break;
                                
        
            
            case 3:     sc.close();
                    System.out.print("exiting.");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    Thread.sleep(800);
                    System.out.print(".");
                    System.exit(0);
            break;
            default:    
                    System.out.println();
                    System.out.println("You have entered wrong choice");

                break;
       
            }   //switch one ends
            
            if (goToMain == true) {
                mainMenuChoice = 1;
            }else{
                System.out.println();
                System.out.println("---------------------Press 1 to go to main menu---------------------");
                mainMenuChoice=sc.nextInt();
            }
            

        }while(mainMenuChoice==1);
        
        }
        catch(Exception e){
            
            System.out.println("You have Encountered an Exception");
            System.out.println("Please Try ReExecuting the Program");
            System.out.println();
            System.out.print("exiting.");
            try {
                Thread.sleep(800);
                System.out.print(".");
                Thread.sleep(800);
                System.out.print(".");
                Thread.sleep(800);
                System.out.print(".");
                Thread.sleep(800);
                System.out.print(".");
            } catch (InterruptedException ex) {
                ex.printStackTrace(); // Or handle the InterruptedException appropriately
            }
            System.exit(0);
        }
    
    }//main close
    static
    {
        System.out.println("--------------------------------WELCOME TO FOOTBALL SEASON 2022-------------------------------");    
        System.out.println();
        
    }    

    
}//run close