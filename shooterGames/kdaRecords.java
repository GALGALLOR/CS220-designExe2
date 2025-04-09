package shooterGames;

import java.util.*;

public class kdaRecords {
    // Each Kda Data, GameNumber
    private Integer gameNumber;
    private HashMap<Integer, kda> myRecords = new HashMap<>();
    private kda allTimekda = new kda(0,0,0) ;

    public kdaRecords(){
        gameNumber=0;
        allTimekda.addAssists(0);
        allTimekda.addDeaths(0);
        allTimekda.addKills(0);
    }

    public void insertGameStats(kda mykda){
        gameNumber++;
        //update the game stats numerically
        allTimekda.addAssists(mykda.getAssists());
        allTimekda.addDeaths(mykda.getDeaths());
        allTimekda.addKills(mykda.getKills());
        //Dont update, just add into a new row
        myRecords.put(gameNumber, mykda);
    }
    public Set<kda> getRows(){
            Set<kda> matchingNames = new HashSet<>();
            // I am going to getRows in form of string for user readability for now
            for (Map.Entry<Integer, kda> entry : myRecords.entrySet()) {
               matchingNames.add(entry.getValue());
            }
            return matchingNames;
    }
    @Override
    public String toString() {
        String myString="";
        for (Map.Entry<Integer, kda> entry : myRecords.entrySet()) {
            myString=myString+"Game "+entry.getKey()+": " + entry.getValue().toString()+"\n";
         }
        myString+="All Time Stats ; Assists: "+ allTimekda.getAssists()+ "; Kills: "+ allTimekda.getKills()+ "; Deaths : "+allTimekda.getDeaths()+ "\n";

        return myString;
    }
    

}
