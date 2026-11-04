package repositories.exercicios.aula01;

import java.util.Scanner;

public class Exercicio06 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("Digite sua idade:");
        int age = input.nextInt();

        if (age >= 18 && age <= 65){
            System.out.println("Seu voto é obrigatório!");
        } else if (age < 16){
            System.out.println("Você ainda não pode votar!");
        } else {
            System.out.println("Seu voto é facultativo!");
        }
    }
}
