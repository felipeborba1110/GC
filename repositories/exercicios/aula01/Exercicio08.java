package repositories.exercicios.aula01;

import java.util.Scanner;

public class Exercicio08 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        if (menu() < 4){
            System.out.println("Você está na fila prioritária.");
        } else {
            System.out.println("Você está na fila normal.");
        }
    }

    private int menu(){
        System.out.print("""
                ======== MENU ========
                1- Ficha de PCD
                2- Ficha de Pessoa Idosa
                3- Ficha de Gestante
                4- Ficha Normal
                0- Sair
                Opção:""");
        int option = input.nextInt();

        if (option > 4){
            System.out.println("Opção Inválida, tente novamente!");
            return menu();
        } else {
            return option;
        }
    }
}
