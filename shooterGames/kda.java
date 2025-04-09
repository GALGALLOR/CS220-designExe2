package shooterGames;

public class kda {
    private Integer kills;
    private Integer deaths;
    private Integer assists;

    public kda(Integer newkills, Integer newdeaths, Integer newassists){
        kills=newkills;
        deaths=newdeaths;
        assists=newassists;
    }
    public void addKills(Integer newKills){
        kills+=newKills;
    }
    public void addDeaths(Integer newDeaths){
        deaths+=newDeaths;
    }
    public void addAssists(Integer newAssists){
        assists+=newAssists;
    }
    public Integer getKills(){
        return kills;
    }
    public Integer getDeaths(){
        return deaths;
    }
    public Integer getAssists(){
        return assists;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  " Assists: "+assists+"; Kills: "+kills+"; Deaths : "+deaths;
    }
}
