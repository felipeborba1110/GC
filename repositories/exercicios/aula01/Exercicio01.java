package repositories.exercicios.aula01;

import java.util.Scanner;

public class Exercicio01 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("Digite seu nome:");
        String name = input.nextLine();

        System.out.println("Seu nome:" + name);
    }
}
