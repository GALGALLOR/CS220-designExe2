package shooterGames;

public class Main {
    public static void main(String[] args) {
        kdaRecords mykdaRecords = new kdaRecords();
        kda myKda = new kda(10,20,7);
        
        mykdaRecords.insertGameStats(myKda);
        //System.out.println(mykdaRecords.getRows());

        mykdaRecords.insertGameStats(new kda(3, 3, 3));
        System.out.println(mykdaRecords.toString());
    
    }
}

//Kills, Deaths, Assists, 
