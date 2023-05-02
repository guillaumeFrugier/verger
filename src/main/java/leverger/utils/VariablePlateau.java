package leverger.utils;

public class VariablePlateau {

    //fruit
    private int nombreFruit;
    //poire
    private float coordonneXPoire;
    private float coordonneYPoire;
    private int ajoutPoire;
    private int positionPoire;
    //pomme
    private float coordonneXPomme;
    private float coordonneYPomme;
    private int ajoutPomme;
    private int positionPomme;
    //prune
    private float coordonneXPrune;
    private float coordonneYPrune;
    private int ajoutPrune;
    private int positionPrune;
    //cerise
    private float coordonneXCerise;
    private float coordonneYCerise;
    private int ajoutCerise;
    private int positionCerise;

    public  VariablePlateau(){
        //fruit
        this.nombreFruit = 40;

        //poire
        this.ajoutPoire = 0;
        this.coordonneXPoire = 110;
        this.coordonneYPoire = 200;
        this.positionPoire = 0;
        //pomme
        this.ajoutPomme = 0;
        this.coordonneXPomme = 900;
        this.coordonneYPomme = 200;
        this.positionPomme = 0;
        //prune
        this.coordonneXPrune = 110;
        this.coordonneYPrune = 660;
        this.ajoutPrune = 0;
        this.positionPrune = 0;
        //cerise
        this.coordonneXCerise = 900;
        this.coordonneYCerise = 660;
        this.ajoutCerise = 0;
        this.positionCerise = 0;
    }
//poire
    public void setCordonnePoire(){
        if (this.ajoutPoire < 5){
            this.coordonneXPoire = this.coordonneXPoire + 64;
            this.ajoutPoire = this.ajoutPoire + 1;
        }else{
            this.coordonneXPoire = 110;
            this.coordonneYPoire = this.coordonneYPoire + 64;
            this.ajoutPoire = 0;
        }
    }

    public float getCoordonneXPoire() {
        return coordonneXPoire;
    }

    public float getCoordonneYPoire() {
        return coordonneYPoire;
    }

    public void ajoutEnPositionPoire(){
        if (this.positionPoire < 10){
            this.positionPoire = this.positionPoire + 1;
        }
    }

    public int getPositionPoire() {
        return positionPoire;
    }

    //pomme

    public void setCordonnePomme(){
        if (this.ajoutPomme < 5){
            this.coordonneXPomme = this.coordonneXPomme + 64;
            this.ajoutPomme = this.ajoutPomme + 1;
        }else{
            this.coordonneXPomme = 900;
            this.coordonneYPomme = this.coordonneYPomme + 64;
            this.ajoutPomme = 0;
        }
    }

    public float getCoordonneXPomme() {
        return coordonneXPomme;
    }

    public float getCoordonneYPomme() {
        return coordonneYPomme;
    }


    public void ajoutEnPositionPomme(){
        if (this.positionPomme < 10){
            this.positionPomme = this.positionPomme + 1;
        }
    }

    public int getPositionPomme() {
        return positionPomme;
    }

    //prune

    public void setCordonnePrune(){
        if (this.ajoutPrune < 5){
            this.coordonneXPrune = this.coordonneXPrune + 64;
            this.ajoutPrune = this.ajoutPrune + 1;
        }else{
            this.coordonneXPrune = 110;
            this.coordonneYPrune = this.coordonneYPrune + 64;
            this.ajoutPrune = 0;
        }
    }

    public float getCoordonneXPrune() {
        return coordonneXPrune;
    }

    public float getCoordonneYPrune() {
        return coordonneYPrune;
    }


    public void ajoutEnPositionPrune(){
        if (this.positionPrune < 10){
            this.positionPrune = positionPrune + 1;
        }
    }

    public int getPositionPrune() {
        return positionPrune;
    }

//cerise

    public void setCoordonneCerise(){
        if (this.ajoutCerise < 5){
            this.coordonneXCerise = this.coordonneXCerise + 64;
            this.ajoutCerise = this.ajoutCerise + 1;
        }else{
            this.coordonneXCerise = 900;
            this.coordonneYCerise = this.coordonneYCerise + 64;
            this.ajoutCerise = 0;
        }
    }


    public float getCoordonneXCerise() {
        return coordonneXCerise;
    }

    public float getCoordonneYCerise() {
        return coordonneYCerise;
    }
    public void ajoutEnPositionCerise(){
        if (this.positionCerise < 10){
            this.positionCerise = this.positionCerise + 1;
        }
    }

    public int getPositionCerise() {
        return positionCerise;
    }

    //fruit
    public void retraitFruit(){
        this.nombreFruit = this.nombreFruit - 1;
    }

    public int getNombreFruit() {
        return nombreFruit;
    }
}
