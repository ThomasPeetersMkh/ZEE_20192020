package be.kdg.model;

public class Game {
    private Bord bord;
    private Speler speler;
    private Schip carrier;
    private Schip battleship;
    private Schip cruiser;
    private Schip submarine;
    private Schip destroyer;

    public Game(int bordGrootte,String spelerNaam){
        this.bord = new Bord(bordGrootte);
        this.speler = new Speler(spelerNaam);
        this.carrier = new Schip(5,0,0,true);
        this.battleship = new Schip(4,1,0,false);
        this.bord.addShip(this.carrier);
        this.bord.addShip(this.battleship);
    }

    public void vuur(int doelX, int doelY){
        if (this.bord.schipGeraakt(doelX,doelY, speler)){
            System.out.println("Het schip is geraakt!");
            System.out.println("Je hebt momenteel "+speler.getHighscore()+" punten!");
        }
        else {
            System.out.println("Je hebt gemist!");
        }
    }
    public boolean isGameOver(){
        return bord.isGameOver();
    }
}
