package repositories.exercicios.aula01;

import java.math.BigDecimal;
import java.util.Scanner;

public class Exercicio04 {
    public final double SALARIO_MINIMO = 1320;
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("Digite o salário do colaborador:");
        double salary = input.nextDouble();

        System.out.printf("Este colaborador ganha %.2f salários mínimos", salary/SALARIO_MINIMO);


    }
}
