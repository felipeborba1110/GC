package repositories.exercicios.aula02;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercicio05 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("Digite o seu texto:");
        String text = input.nextLine();

        System.out.println(text.substring(0,text.length()/2));
    }
}
