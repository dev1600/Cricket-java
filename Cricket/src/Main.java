import game.Match;
import scoreboard.PrintScore;
import team.Team;
import toss.*;
public class Main {
    public static void main(String[] args) {

        Match match=new Match(20);
        Toss toss=new Toss(match);
        toss.doToss();
        match.getSettingTeam().setTarget(match.getFormat().getNoOfOvers()*6);
        Team teamWon=match.getChasingTeam().chaseTarget(match.getFormat().getNoOfOvers()*6,match.getSettingTeam().getTarget());
        PrintScore.printWinner(teamWon,match.getChasingTeam(),match.getSettingTeam());
    }
}