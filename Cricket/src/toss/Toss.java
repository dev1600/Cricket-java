package toss;

import rungenerator.Chase;
import rungenerator.Target;
import game.Match;
import team.*;

public class Toss {
    double teamToss;
    double batFieldToss;
    Team teamA;
    Team teamB;
    Match match;


    public Toss(Match match){
        teamToss = Math.random();
        batFieldToss = Math.random();
        teamA=match.getTeamA();
        teamB=match.getTeamB();
        this.match=match;
    }
    public void doToss() {

        Target settingTeam;
        Chase chasingTeam;

        if (teamToss > 0.5) {
            System.out.print("Team A won the toss");
            if (batFieldToss > 0.5) {
                 settingTeam=new Target(teamA);
                 chasingTeam=new Chase(teamB,teamA);

                System.out.println(" and decided to bat first");
            } else {
                settingTeam=new Target(teamB);
                chasingTeam=new Chase(teamA,teamB);
                System.out.println(" and decided to field first");
            }
        } else {
            System.out.print("Team B won the toss");
            if (batFieldToss > 0.5) {

                settingTeam=new Target(teamB);
                chasingTeam=new Chase(teamA,teamB);
                System.out.println(" and decided to bat first");
            } else {

                settingTeam=new Target(teamA);
                chasingTeam=new Chase(teamB,teamA);
                System.out.println(" and decided to bowl first");
            }
        }
        match.setTargetTeam(settingTeam);
        match.setChasingTeam(chasingTeam);
    }
}
