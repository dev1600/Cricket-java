package game;
import format.Format;
import team.Team;
import scoreboard.PrintScore;
import rungenerator.*;

public class Match {
    private Format format;
    private Team teamA;
    private Team teamB;

    private Target settingTeam;
    private Chase  chasingTeam;

    public Match(int overs) {
        teamA = new Team("A");
        teamB = new Team("B");
        format = new Format();
        format.setNoOfOvers(overs);
    }
    public Team getTeamA(){
        return teamA;
    }
    public Team getTeamB(){
        return teamB;
    }
    public Format getFormat() {
        return format;
    }

    public Target getSettingTeam() {
        return settingTeam;
    }

    public Chase getChasingTeam() {
        return chasingTeam;
    }
    public void setChasingTeam(Chase chasingTeam ){
        this.chasingTeam=chasingTeam;
    }
    public void setTargetTeam(Target settingTeam){
        this.settingTeam=settingTeam;
    }

}
