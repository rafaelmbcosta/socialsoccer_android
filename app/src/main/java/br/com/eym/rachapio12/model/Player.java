package br.com.eym.rachapio12.model;

/**
 * Created by rafael on 23/08/16.
 */
public class Player {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    private int id;
    private int goals;
    private String name;
    private String nickName;
    private int matchesPlayed;



}
