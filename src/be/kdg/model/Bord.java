package be.kdg.model;

public class Bord {

    static int STANDAARD_GROOTTE_BORD = 8;

    Schip bord[][];

    public Bord (int aantalVakjes){
        this.bord = new Schip[aantalVakjes][aantalVakjes];
        initialiseBord();
    }
    public Bord(){
        this(STANDAARD_GROOTTE_BORD);
    }
    public void initialiseBord(){
        for(int i =0;i<this.bord.length;i++){
            for(int j=0;j<this.bord.length;j++){
                this.bord[i][j] = null;
            }
        }
    }
    public void addShip(Schip schip){
        for (int i = schip.getBeginX();i<=schip.getEindX();i++){
            for (int j = schip.getBeginY();j<=schip.getEindY();j++){
                this.bord[i][j] = schip;
            }
        }
    }
    public boolean schipGeraakt(int doelX, int doelY, Speler speler){
        if(this.bord[doelX][doelY] != null){
            this.bord[doelX][doelY].updateLevensPunten();
            speler.updateHighscore(1);
            this.bord[doelX][doelY]=null;
            return true;
        }else {
            return false;
        }
    }
    public boolean isGameOver(){
        boolean allesGeraakt = true;
        for(int i =0;i<this.bord.length;i++){
            for(int j=0;j<this.bord.length;j++){
                if(this.bord[i][j] != null){
                    allesGeraakt = false;
                }
            }
        }
        return allesGeraakt;
    }



}
