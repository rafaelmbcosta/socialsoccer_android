package br.com.eym.rachapio12.model;

/**
 * Created by rafael on 23/08/16.
 */
public class Presence {
    private int id;
    private int team;
    private Player player;
    private int goals;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }
}
