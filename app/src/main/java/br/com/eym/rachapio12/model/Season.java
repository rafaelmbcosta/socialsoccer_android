package br.com.eym.rachapio12.model;

import java.util.List;

/**
 * Created by rafael on 23/08/16.
 */
public class Season {
    private int id;
    private List<Player> playerList;
    private int goalCount;
    private int matchCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }
}
