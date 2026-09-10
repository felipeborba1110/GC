package stardewManager;

import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public void menuPrincipal(){
        System.out.println("""
                ----- Menu -----
                1. Ver curral
                2. Comércio
                3. Sair
                """);
        menuPrincipalProcess(userInput());
    }

    public void menuComercio(){
        System.out.println("""
                ----- Menu Comércio -----
                1. Coletar Produtos
                2. Vender Produtos
                3. Comprar Animais
                4. Vender Animais
                5. Voltar
                """);
        menuComercioProcess(userInput());
    }

    public int userInput(){
        System.out.print("Escolha uma opção: ");
        return input.nextInt();
    }

    private void menuPrincipalProcess(int option){
        switch(option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opção Inválida! Tente novamente");
                menuPrincipal();
        }
    }

    private void menuComercioProcess(int option){
        switch(option){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opção Inválida! Tente novamente");
                menuComercio();
        }
    }
}
