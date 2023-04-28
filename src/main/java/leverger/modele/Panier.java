package leverger.modele;

import leverger.modele.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Fruit> fruits;

    public Panier(){
        this.fruits = new ArrayList<Fruit>();
    }

    public void ajoutFruit(Fruit fruit){
        this.fruits.add(fruit);
    }
}
