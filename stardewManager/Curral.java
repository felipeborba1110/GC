package stardewManager;

import java.util.ArrayList;
import java.util.List;

public class Curral {
    private static List<Animal> animais = new ArrayList<>();

    public static void imprimirAnimais(){
        System.out.println("-------------------------------");
        System.out.println("ANIMAIS NO CURRAL:");
        System.out.println("-------------------------------");
        for (Animal animal : animais){
            System.out.println(animal);
        }
        System.out.println("-------------------------------");
    }

    public static void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public static Animal procurarAnimalId(int id){
        for (Animal animal : animais){
            if (animal.getId() == id){
                return animal;
            }
        }
        return null;
    }

    public static void removerAnimal(Animal animal){
        animais.remove(animal);
    }

}
