package repositories.exercicios.aula01;

import java.util.Scanner;

public class Exercicio02 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("Digite o 1º número:");
        int num1 = input.nextInt();
        System.out.println("Digite o 2º número:");
        int num2 = input.nextInt();

        System.out.println("Seus números da sorte são: " + num1 + ", " + num2);
    }
}
