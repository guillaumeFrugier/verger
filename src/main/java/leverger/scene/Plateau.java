package leverger.scene;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import leverger.modele.Corbeau;
import leverger.modele.De;
import leverger.modele.Panier;
import leverger.modele.fruit.*;
import leverger.utils.evenement.*;
import leverger.utils.ImageJeux;
import leverger.utils.VariablePlateau;
import leverger.utils.evenement.corbeau.EvenementBourse;
import leverger.utils.evenement.corbeau.EvenementCorbeau;
import leverger.utils.evenement.fruit.EvenementCerise;
import leverger.utils.evenement.fruit.EvenementPoire;
import leverger.utils.evenement.fruit.EvenementPomme;
import leverger.utils.evenement.fruit.EvenementPrune;
import leverger.utils.evenement.panier.EvenementPanierDeux;
import leverger.utils.evenement.panier.EvenementPanierQuatre;
import leverger.utils.evenement.panier.EvenementPanierTrois;
import leverger.utils.evenement.panier.EvenementPanierUn;


import java.io.FileNotFoundException;

public class Plateau {

    private BackgroundImage arrierPlanImage;
    private Background arrierePlan;
    //widget
    private Pane fond;



    private Label victoire;


    private Scene scene;
    private De de;

    private Corbeau corbeau;
    private Label nombreTour;

    private Label nomDuJoueur;


    //gestion image
    private ImageJeux imageJeux;
    private VariablePlateau variablePlateau;



    //les fruits
    private Fruit pomme;
    private Fruit poire;
    private Fruit prune;
    private Fruit cerise;

    //evenement
    private EvenementCerise evenementCerise;
    private EvenementPomme evenementPomme;
    private EvenementPrune evenementPrune;
    private EvenementPoire evenementPoire;

    private EvenementPanierUn evenementPanierUn;
    private EvenementPanierDeux evenementPanierDeux;
    private EvenementPanierTrois evenementPanierTrois;
    private EvenementPanierQuatre evenementPanierQuatre;

    private EvenementDe evenementDe;
    private FinDePartie finDePartie;


    private EvenementBourse evenementBourse;
    private EvenementCorbeau evenementCorbeau;

    //panier

    private Panier panierUn;
    private Panier panierDeux;
    private Panier panierTrois;
    private Panier panierQuatre;




    //Creation nombre en panier
    private Label nombrePanierUn;
    private Label nombrePanierDeux;
    private Label nombrePanierTrois;
    private Label nombrePanierQuatre;


    //bourse
    private ImageView bourse;


    public Plateau() throws FileNotFoundException {


        this.fond = new Pane();
        this.scene = new Scene(this.fond, 1300,900);



        //message victoire
        this.victoire = new Label("vous avez gagné !");
        this.victoire.setLayoutX(650);
        this.victoire.setLayoutY(450);
        this.victoire.setScaleX(10);
        this.victoire.setScaleY(10);
        this.victoire.setVisible(false);
        //corbeau
        this.corbeau = new Corbeau();
        this.corbeau.getCorb().setX(550);
        this.corbeau.getCorb().setY(500);
        //de
        this.de = new De(50);
        this.de.setX(450);
        this.de.setY(30);
        //nombre de tour
        this.nombreTour = new Label("1");
        this.nombreTour.setFont(new Font("Arial", 30));
        this.nombreTour.setTextFill(Color.GREY);
        this.nombreTour.setLayoutX(220);
        this.nombreTour.setLayoutY(35);
        //image
        this.imageJeux = new ImageJeux();
        //variable
        this.variablePlateau = new VariablePlateau();
        //arriere plan
        this.arrierPlanImage = new BackgroundImage(imageJeux.getArrierePlan(), BackgroundRepeat.NO_REPEAT,BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,BackgroundSize.DEFAULT);
        this.arrierePlan = new Background(this.arrierPlanImage);
        //fruit
        this.pomme = new Pomme(imageJeux.getPomme());
        this.poire = new Poire(imageJeux.getPoire());
        this.prune = new Prune(imageJeux.getPrune());
        this.cerise = new Cerise(imageJeux.getCerise());
        //creation des paniers
        this.panierUn = new Panier();
        this.panierDeux = new Panier();
        this.panierTrois = new Panier();
        this.panierQuatre = new Panier();
        //creation de la bourse du corbeau
        this.bourse = new ImageView(imageJeux.getBourse());
        //label des paniers (nb fruit)
        this.nombrePanierUn = new Label(" 0");
        this.nombrePanierDeux = new Label(" 0");
        this.nombrePanierTrois = new Label(" 0");
        this.nombrePanierQuatre = new Label(" 0");

        //nom des joueurs
        this.nomDuJoueur = new Label(variablePlateau.getJoueurUn());

        //evenement
        this.evenementCerise = new EvenementCerise((Cerise) this.cerise);
        this.evenementPomme = new EvenementPomme((Pomme) this.pomme);
        this.evenementPoire = new EvenementPoire((Poire) this.poire);
        this.evenementPrune = new EvenementPrune((Prune) this.prune);

        this.evenementPanierUn = new EvenementPanierUn(panierUn);
        this.evenementPanierDeux = new EvenementPanierDeux(panierDeux);
        this.evenementPanierTrois = new EvenementPanierTrois(panierTrois);
        this.evenementPanierQuatre = new EvenementPanierQuatre(panierQuatre);



        this.evenementDe = new EvenementDe(this.de);
        this.finDePartie = new FinDePartie(variablePlateau);

        this.evenementBourse = new EvenementBourse(bourse);
        this.evenementCorbeau = new EvenementCorbeau(corbeau);

    }



    private void placageDesFruitsEtDesPaniersDuCorbeauEtDeLaBourse(){

        this.corbeau.getCorb().setFitWidth(172);
        this.corbeau.getCorb().setFitHeight(172);

        this.bourse.setX(1000);
        this.bourse.setFitWidth(200);
        this.bourse.setFitHeight(200);

        for (int i = 0; i < 10; i++) {
            this.poire.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXPoire());
            this.poire.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYPoire());
            variablePlateau.setCordonnePoire();

            this.pomme.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXPomme());
            this.pomme.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYPomme());
            variablePlateau.setCordonnePomme();

            this.prune.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXPrune());
            this.prune.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYPrune());
            variablePlateau.setCordonnePrune();

            this.cerise.getAffichageFruit().get(i).setX(variablePlateau.getCoordonneXCerise());
            this.cerise.getAffichageFruit().get(i).setY(variablePlateau.getCoordonneYCerise());
            variablePlateau.setCoordonneCerise();
        }
        //panier
        this.panierUn.getImage().setFitHeight(150);
        this.panierUn.getImage().setFitWidth(150);
        this.panierUn.getImage().setX(600);
        this.panierUn.getImage().setY(700);


        this.panierDeux.getImage().setFitHeight(150);
        this.panierDeux.getImage().setFitWidth(150);
        this.panierDeux.getImage().setX(900);
        this.panierDeux.getImage().setY(400);

        this.panierTrois.getImage().setFitWidth(150);
        this.panierTrois.getImage().setFitHeight(150);
        this.panierTrois.getImage().setX(600);
        this.panierTrois.getImage().setY(225);

        this.panierQuatre.getImage().setFitWidth(150);
        this.panierQuatre.getImage().setFitHeight(150);
        this.panierQuatre.getImage().setX(225);
        this.panierQuatre.getImage().setY(400);

        this.nombrePanierUn.setTextFill(Color.WHITE);
        this.nombrePanierUn.setLayoutX(665);
        this.nombrePanierUn.setLayoutY(780);
        this.nombrePanierUn.setFont(new Font("Arial", 25));


        //label
        this.nombrePanierDeux.setTextFill(Color.WHITE);
        this.nombrePanierDeux.setLayoutX(965);
        this.nombrePanierDeux.setLayoutY(500);
        this.nombrePanierDeux.setFont(new Font("Arial", 25));


        //panier poire


        //label
        this.nombrePanierTrois.setTextFill(Color.WHITE);
        this.nombrePanierTrois.setLayoutX(665);
        this.nombrePanierTrois.setLayoutY(300);
        this.nombrePanierTrois.setFont(new Font("Arial", 25));
        //panier prune


        //label
        this.nombrePanierQuatre.setTextFill(Color.WHITE);
        this.nombrePanierQuatre.setLayoutX(290);
        this.nombrePanierQuatre.setLayoutY(500);
        this.nombrePanierQuatre.setFont(new Font("Arial", 25));

        this.nomDuJoueur.setTextFill(Color.WHITE);
        this.nomDuJoueur.setFont(new Font("Arial",25));
        this.nomDuJoueur.setLayoutX(600);
    }


    private void evenementPlateau(){
            //evenement
           evenementDe.clique(variablePlateau, nombreTour,
                corbeau,nomDuJoueur);

            evenementDe.sourisSurDe();
            evenementDe.sourisQuitteDe();



            //si de tombe sur panier

            evenementCerise.attraperEtLacher(de);


            evenementPomme.attraperEtLacher(de);


            evenementPrune.attraperEtLacher(de);


            evenementPoire.attraperEtLacher(de);


            evenementPanierUn.lacher(variablePlateau,nombrePanierUn,cerise,pomme,poire,prune);
            evenementPanierDeux.lacher(variablePlateau,nombrePanierDeux,cerise,pomme,poire,prune);
            evenementPanierTrois.lacher(variablePlateau,nombrePanierTrois,cerise,pomme,poire,prune);
            evenementPanierQuatre.lacher(variablePlateau,nombrePanierQuatre,cerise,pomme,poire,prune);

            evenementBourse.prendre();
            evenementCorbeau.lacher(variablePlateau, de);


            finDePartie.initialisation(fond,victoire,
                    pomme,
                    poire,
                    prune,
                    cerise,
                    de,
                    corbeau,
                    panierUn,
                    panierDeux,
                    panierTrois,
                    panierQuatre);
    }
    public Scene plateauInitialisation(String joueurUn, String joueurDeux, String joueurTrois){


        variablePlateau.setJoueurUn(joueurUn);
        variablePlateau.setJoueurDeux(joueurDeux);
        if (joueurTrois != ""){
            variablePlateau.setJoueurTrois(joueurTrois);
        }
        this.nomDuJoueur.setText(variablePlateau.getJoueurUn());
        placageDesFruitsEtDesPaniersDuCorbeauEtDeLaBourse();
        evenementPlateau();
        for (int i = 0; i < 10; i++) {
            this.fond.getChildren().add(poire.getAffichageFruit().get(i));
            this.fond.getChildren().add(pomme.getAffichageFruit().get(i));
            this.fond.getChildren().add(prune.getAffichageFruit().get(i));
            this.fond.getChildren().add(cerise.getAffichageFruit().get(i));

        }
        this.fond.getChildren().addAll(this.victoire,this.de,nombreTour, this.corbeau.getCorb());
        this.fond.getChildren().addAll(this.panierUn.getImage(),
                this.panierDeux.getImage(),
                this.panierTrois.getImage(),
                this.panierQuatre.getImage());
        this.fond.getChildren().add(nomDuJoueur);
        this.fond.getChildren().add(bourse);

        this.fond.getChildren().addAll(nombrePanierUn,nombrePanierDeux, nombrePanierTrois, nombrePanierQuatre);

        this.fond.setBackground(this.arrierePlan);
        return scene;
    }


}
