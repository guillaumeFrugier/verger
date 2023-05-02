package test;

import leverger.modele.Panier;
import leverger.modele.fruit.Fruit;
import leverger.modele.fruit.Prune;
import leverger.utils.ImageJeux;
import org.testng.Assert;

import java.io.FileNotFoundException;

public class Test {


    public static void main(String[] args) throws FileNotFoundException {
        ImageJeux imageJeux = new ImageJeux();
        //arrange
        Panier panier =  new Panier();
        //act
        panier.ajoutFruit(new Prune(imageJeux.getPoire()));
        //assert
        Assert.assertEquals(0,1);
    }
}
