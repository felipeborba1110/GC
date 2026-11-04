package repositories.exercicios.aula02;

import java.util.Scanner;

public class Exercicio06 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("Digite o seu texto:");
        StringBuilder text = new StringBuilder(input.nextLine());

        System.out.println(text.reverse());

    }

}
