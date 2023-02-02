package Game;
import Format.Format;
import RunGenerator.Generator;

import java.lang.annotation.Target;

public class Match {
    private Format f;
    // Will tell which team will bat First
    // 1 for Team A

    // 1 for

    private int target;
    private int chase;
    private String settingTeam;
    private String chasingTeam;

    public Match(int overs){
        f=new Format();
        target=0;
        f.setNoOfOvers(overs);
        doToss();
        setTarget();
        chaseTarget();
    }

    void printScore(int target,int wickets_left,int balls,String team){
        int overs=(balls)/6;
        int balls_in_over=balls%6;
        System.out.println("Scoreboard: "+team+":"+target+"/"+(10-wickets_left)+" in "+overs+"."+balls_in_over+" overs");
    }
    void printScore(int target,int chase,int wicket_left,int balls_left,String settingTeam){
        System.out.print("Team "+settingTeam+" needs "+(target-chase)+" runs to win with "+wicket_left+" in hand with ");
        System.out.println(balls_left+" balls to spare");
    }
    void setTarget(){
        int wickets_left=10;
        int total_balls=f.getNoOfOvers()*6;
        int curr=0;
        while(curr<=total_balls && wickets_left>0){
            int g=Generator.generateRuns();
            if(g==7){
                System.out.println("That's a WICKET!!!");
                wickets_left--;
            }
            else{
                target+=g;
            }
            curr++;
           printScore(target,wickets_left,curr,settingTeam);
        }
    }
    void chaseTarget(){
        int wickets_left=10;
        int total_balls=f.getNoOfOvers()*6;
        int curr=0;
        while(curr<=total_balls && wickets_left>0 && chase< target){
            int g=Generator.generateRuns();
            if(g==7){
                System.out.println("That's a WICKET!!!");
                wickets_left--;
            }
            else{
                chase+=g;
            }
            curr++;
            if(wickets_left==0 || chase>target){
                break;
            }
            printScore(chase,wickets_left,curr,chasingTeam);
            printScore(target,chase,wickets_left,total_balls-curr,chasingTeam);
        }
        if(chase<target){
            System.out.println("Team "+settingTeam+" won by "+(target-chase)+" runs");
        }
        else{
            System.out.println("Team "+chasingTeam+" won with "+wickets_left+" wickets to spare ");
        }

    }
    // By default assume that heads for team A and tails for team B
    //  > 0.5 Heads
    public void doToss(){
        double teamToss=Math.random();
        double batFieldToss=Math.random();
        if(teamToss>0.5){
            System.out.print("Team A won the toss");
            if(batFieldToss>0.5){
                settingTeam="A";
                chasingTeam="B";
                System.out.println(" and decided to bat first");
            }
            else {
                settingTeam="B";
                chasingTeam="A";
                System.out.println(" and decided to field first");
            }
        }
        else {
            System.out.print("Team B won the toss");
            if (batFieldToss > 0.5) {
                settingTeam="B";
                chasingTeam="A";
                System.out.println(" and decided to bat first");
            } else {
                settingTeam="A";
                chasingTeam="B";
                System.out.println(" and decided to bowl first");
            }
        }
    }

}
