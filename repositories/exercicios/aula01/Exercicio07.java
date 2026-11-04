package repositories.exercicios.aula01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio07 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.print("Digite sua idade:");
        int age = input.nextInt();
        System.out.print("Digite seu salário:");
        BigDecimal salary = BigDecimal.valueOf(input.nextDouble());

        if (age >= 18 && (salary.compareTo(BigDecimal.valueOf(2000)) >= 0)){
            System.out.println("Seu consórcio foi aprovado.");
        } else {
            System.out.println("Consórcio negado.");
        }
    }
}
