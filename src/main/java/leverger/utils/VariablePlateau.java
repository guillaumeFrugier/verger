package leverger.utils;

public class VariablePlateau {

    //tour
    private Integer tour;
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
    //corbeau
    private Integer nombreCorbeau;
    private Boolean corbeauFini;
    // variable panier fruit
    private int nombreFruitPanierUn;
    private int nombreFruitPanierDeux;
    private int nombreFruitPanierTrois;
    private int nombreFruitPanierQuatre;
    //nom joueur
    private String joueurUn;
    private String joueurDeux;
    private String joueurTrois;

    private Integer joueurActuelle;

    private Integer nombreActions;

    public  VariablePlateau(){
        //tour
        this.tour = 1;
        //fruit
        this.nombreFruit = 40;

        //poire
        this.ajoutPoire = 0;
        this.coordonneXPoire = 110;
        this.coordonneYPoire = 200;
        this.positionPoire = 0;

        //pomme
        this.ajoutPomme = 0;
        this.coordonneXPomme = 800;
        this.coordonneYPomme = 200;
        this.positionPomme = 0;

        //prune
        this.coordonneXPrune = 110;
        this.coordonneYPrune = 600;
        this.ajoutPrune = 0;
        this.positionPrune = 0;

        //cerise
        this.coordonneXCerise = 800;
        this.coordonneYCerise = 600;
        this.ajoutCerise = 0;
        this.positionCerise = 0;

        //corbeau
        this.nombreCorbeau = 0;
        this.corbeauFini = false;
        //de tombe sur panier
        this.nombreActions = 0;

        //nombre fruit dans panier
        this.nombreFruitPanierUn = 0;
        this.nombreFruitPanierDeux = 0;
        this.nombreFruitPanierTrois = 0;
        this.nombreFruitPanierQuatre = 0;
        //nom joueur
        this.joueurUn = "";
        this.joueurDeux = "";
        this.joueurTrois = "";

        this.joueurActuelle = 1;


    }
    //tour
    public void ajoutTour(){
        this.tour++;
    }

    public Integer getTour() {
        return tour;
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
            this.positionCerise++;
        }
    }

    public int getPositionCerise() {
        return positionCerise;
    }

    //fruit
    public void retraitFruit(){
        this.nombreFruit--;
    }

    public int getNombreFruit() {
        return nombreFruit;
    }

    //corbeau
    public void ajoutPieceCorbeau(){
        if (this.nombreCorbeau < 9){
            this.nombreCorbeau = this.nombreCorbeau + 1;
        }
    }

    public Integer getNombreCorbeau() {
        return nombreCorbeau;
    }

    public void setCorbeauFini(Boolean corbeauFini) {
        this.corbeauFini = corbeauFini;
    }

    public Boolean getCorbeauFini() {
        return corbeauFini;
    }

    //fruti dans panier
    public void ajoutPanierUn(){
        this.nombreFruitPanierUn++;
    }
    public void ajoutPanierDeux(){
        this.nombreFruitPanierDeux++;
    }
    public void ajoutPanierTrois(){
        this.nombreFruitPanierTrois++;
    }
    public void ajoutPanierQuatre(){
        this.nombreFruitPanierQuatre++;
    }

    public Integer getNombreFruitPanierUn() {
        return nombreFruitPanierUn;
    }

    public Integer getNombreFruitPanierDeux() {
        return nombreFruitPanierDeux;
    }

    public Integer getNombreFruitPanierTrois() {
        return nombreFruitPanierTrois;
    }

    public Integer getNombreFruitPanierQuatre() {
        return nombreFruitPanierQuatre;
    }
    //de tombe sur panier


    public void uneAction(){
        this.nombreActions = 1;
    }
    public void moinsUneAction(){
        this.nombreActions--;
    }
    public void deuxActions(){
        this.nombreActions = 2;
    }
    public void remiseAZeroActions(){
        this.nombreActions = 0;
    }

    public Integer getNombreActions() {
        return nombreActions;
    }

    //nom joueur


    public String getJoueurUn() {
        return joueurUn;
    }

    public String getJoueurDeux() {
        return joueurDeux;
    }

    public String getJoueurTrois() {
        return joueurTrois;
    }

    public void setJoueurUn(String joueurUn) {
        this.joueurUn = joueurUn;
    }

    public void setJoueurDeux(String joueurDeux) {
        this.joueurDeux = joueurDeux;
    }

    public void setJoueurTrois(String joueurTrois) {
        this.joueurTrois = joueurTrois;
    }

    public void joueurSuivant(){
        if (joueurTrois.isEmpty()){
            if (joueurActuelle < 2){
                this.joueurActuelle++;
            }else {
                this.joueurActuelle = 1;
            }
        }else {
            if (joueurActuelle < 3){
                this.joueurActuelle++;
            }else {
                this.joueurActuelle = 1;
            }
        }
    }
    public Integer getJoueurActuelle() {
        return joueurActuelle;
    }
}
