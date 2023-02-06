package rungenerator;

import scoreboard.PrintScore;
import team.Team;
public class Target {
    private int target;
    private Team teamName;
    public Target(Team teamName){
        this.teamName=teamName;
        this.target=0;
    }
    public Team getSettingTeamObject(){
        return teamName;
    }
    public int getTarget(){
        return target;
    }
    public void setTarget(int total_balls) {
        int wickets_left = 10;
        int curr = 0;
        while (curr < total_balls && wickets_left > 0) {
            int g = Generator.generateRuns(teamName.getCurrrentPlayerRole(10-wickets_left));

            if (g == 7) {
                System.out.println("That's a WICKET!!!");
                wickets_left--;
            } else {
                target += g;
            }
            curr++;
            PrintScore.printScore(target, wickets_left, curr, teamName);
        }
    }

}
