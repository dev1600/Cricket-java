package player;


public class Player {
    private String role;

    public Player() {
    }

    public Player(String role) {
        this.role = role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Player{" +
                "role='" + role + '\'' +
                '}';
    }

}
