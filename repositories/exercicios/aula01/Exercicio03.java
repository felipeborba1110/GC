package repositories.exercicios.aula01;

import java.util.Scanner;

public class Exercicio03 {
    private final Scanner input = new Scanner(System.in);
    private double[] numbers = new double[3];

    void run(){
        System.out.println("Digite o 1º número:");
        numbers[0] = input.nextDouble();
        System.out.println("Digite o 2º número:");
        numbers[1] = input.nextDouble();
        System.out.println("Digite o 3º número:");
        numbers[2] = input.nextDouble();

        double maior = numbers[0];
        double menor = numbers[0];
        double total = 0;

        for(double number : numbers){
            maior = Math.max(maior, number);
            menor = Math.min(menor, number);
            total += number;
        }

        double media = total/numbers.length;

        System.out.printf("Menor: %.0f\nMaior: %.0f\nMédia: %.2f\n",menor,maior,media);

    }
}
