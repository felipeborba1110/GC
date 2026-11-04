package repositories.exercicios.aula02;

import java.util.Scanner;

public class Exercicio04 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        boolean control = true;
        while(control){
            int option = menu();

            System.out.println("Digite o 1º número:");
            double num1 = input.nextDouble();
            System.out.println("Digite o 2º número:");
            double num2 = input.nextDouble();

            switch (option){
                case 1:
                    System.out.println("Resultado: " + somar(num1,num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + subtrair(num1,num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + dividir(num1,num2));
                    break;
                case 4:
                    System.out.println("Resultado: " + multiplicar(num1,num2));
                    break;
                case 5:
                    System.out.println("Resultado: " + potencia(num1,num2));
                    break;
                case 6:
                    System.out.println("Resultado: " + raiz(num1,num2));
                    break;
            }

            input.nextLine();

            System.out.println("Deseja realizar mais alguma operação? <s/n>");
            String leave = input.nextLine();

            if (leave.equalsIgnoreCase("n")){
                System.out.println("Saindo...");
                control = false;
            }
        }
    }

    private double somar(double num1, double num2) {
        return num1 + num2;
    }

    private double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    private double dividir(double num1, double num2) {
        return num1 / num2;
    }

    private double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    private double potencia(double num1, double num2) {
        return Math.pow(num1,num2);
    }

    private double raiz(double num1, double num2) {
        return Math.pow(num1,1/num2);
    }

    private int menu(){
        System.out.print("""
                ======== Calculadora ========
                1- Adição
                2- Subtração
                3- Divisão
                4- Multiplicação
                5- Potenciação
                6- Radiciação
                0- Sair
                Opção:""");
        int option = input.nextInt();

        if (option > 6){
            System.out.println("Opção Inválida, tente novamente!");
            return menu();
        } else {
            return option;
        }
    }
}
