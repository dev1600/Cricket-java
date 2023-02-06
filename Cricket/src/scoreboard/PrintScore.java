package scoreboard;
import team.Team;
import rungenerator.*;
public class PrintScore {
    public static void printScore(int target, int wickets_left, int balls, Team team) {
        int overs = (balls) / 6;
        int balls_in_over = balls % 6;
        System.out.println("Scoreboard: " + team.getName() + ":" + target + "/" + (10 - wickets_left) + " in " + overs + "." + balls_in_over + " overs");
    }

    public static void printScore(int target, int chase, int wicket_left, int balls_left, Team settingTeam) {
        System.out.print("team " + settingTeam.getName() + " needs " + (target - chase) + " runs to win with " + wicket_left + " wickets in hand with ");
        System.out.println(balls_left + " balls to spare");
    }
    public static void printWinner(Team teamWon,Chase chasingTeam,Target settingTeam){
         if(teamWon.getName().equals(chasingTeam.getChasingTeamObject().getName()))  printChasingTeamWinner(chasingTeam); else printSettingTeamWinner(settingTeam, chasingTeam);
    }
    private static void printSettingTeamWinner(Target settingTeam,Chase chasingTeam){
        System.out.println("Team " +settingTeam.getSettingTeamObject().getName() + " won by " + (settingTeam.getTarget() - chasingTeam.getChasingRun()) + " runs");
    }
    private static void printChasingTeamWinner(Chase chasingTeam){
        System.out.println("team " + chasingTeam.getChasingTeamObject().getName()+ " won with " + chasingTeam.getWickets() + " wickets to spare ");
    }
}
