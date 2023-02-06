package team;

import java.util.Scanner;
import player.Player;

public class Team {
    private Player[] t;
    private String teamName;

    public Team(String teamName) {
        this.teamName = teamName;
        t = new Player[11];
        inputTeamPlayer();
    }
    public void inputTeamPlayer(){
        Scanner dev = new Scanner(System.in);
        System.out.println("Enter Role of Players for Team " + teamName);
        for (int i = 0; i < 11; i++) {
            String role = dev.next();
            t[i] = new Player(role);
        }
    }
    public String getName() {
        return teamName;
    }

    public String getCurrrentPlayerRole(int wicketsFallen) {
        return t[wicketsFallen + 1].getRole();

    }

}
