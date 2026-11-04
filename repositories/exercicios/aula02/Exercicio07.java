package repositories.exercicios.aula02;

import java.util.Scanner;

public class Exercicio07 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println(" - Leonidas: Soldados, me digam quantos inimigos iremos enfrentar!");

        boolean correct = false;

        while(!correct){
            System.out.print("Resposta: ");
            long answer = input.nextLong();

            if (answer < 300000) {
                System.out.println("Um pouco mais!");
            } else if (answer > 300000) {
                System.out.println("Calma lá também né, um pouco menos!");
            } else {
                System.out.println("SIM! 300.000 soldados inimigos!");
                correct = true;
            }
        }
    }
}
