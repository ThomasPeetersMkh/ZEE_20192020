package be.kdg;

public class Schip {
    private int beginX;
    private int eindX;
    private int beginY;
    private int eindY;
    private boolean isGezonken;
    private int levenspunten;

    public Schip(int grootte, int beginX, int beginY, boolean isVerticaal){
        this.beginX = beginX;
        this.beginY = beginY;
        if (isVerticaal){
            this.eindY = this.beginY+grootte-1;
            this.eindX = this.beginX;
        }
        else {
            this.eindX = this.beginX + grootte-1;
            this.eindY = this.beginY;
        }
        this.isGezonken = false;
        this.levenspunten = grootte;
    }

    public int getBeginX() {
        return beginX;
    }

    public int getEindX() {
        return eindX;
    }

    public int getBeginY() {
        return beginY;
    }

    public int getEindY() {
        return eindY;
    }

    private boolean isGezonken() {
        return isGezonken;
    }

    public boolean updateLevensPunten(){
        this.levenspunten -= 1;
        if (this.levenspunten == 0){
            this.isGezonken = true;
        }
        return isGezonken();
    }



}
