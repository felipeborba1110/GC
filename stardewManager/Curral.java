package stardewManager;

import java.util.ArrayList;
import java.util.List;

public class Curral {
    private List<Animal> animais = new ArrayList<>();

    public void imprimirAnimais(){
        for (Animal animal : animais){
            System.out.println("Seu curral:");
            System.out.println(animal);
        }
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }
}
