package be.kdg;

public class Speler {
    private String username;
    private int highscore;

    public Speler(String naam){
        this.username = naam;
    }

    public void updateHighscore(int highscore){
        this.highscore += highscore;
    }

    public int getHighscore() {
        return highscore;
    }
}
