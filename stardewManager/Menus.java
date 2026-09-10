package stardewManager;

import java.util.Scanner;

public class Menus {
    private Scanner inputNum = new Scanner(System.in);
    private Scanner inputText = new Scanner(System.in);


    public void menuPrincipal(){
        System.out.println("""
                ----- Menu -----
                1. Ver curral
                2. Comércio
                3. Sair
                """);
        menuPrincipalProcess(userInput());
    }

    private void menuComercio(){
        System.out.println("""
                ----- Menu Comércio -----
                1. Comprar Animal
                2. Vender Animal
                3. Procriar Animal
                4. Coletar Produtos
                5. Listar Produtos
                6. Vender Produtos
                7. Voltar
                """);
        menuComercioProcess(userInput());
    }

    private int userInput(){
        System.out.print("Escolha uma opção: ");
        return inputNum.nextInt();
    }

    private void menuPrincipalProcess(int option){
        switch(option){
            case 1:
                Curral.imprimirAnimais();
                menuPrincipal();
                break;
            case 2:
                menuComercio();
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
                menuCriarAnimal();
                break;
            case 2:
                menuVenderAnimal();
                break;
            case 3:
                menuProcriarAnimal();
                break;
            case 4:
                menuColetarProduto();
                break;
            case 5:
                Produtos.imprimirProdutos();
                menuComercio();
                break;
            case 6:
                menuVenderProduto();
                break;
            case 7:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção Inválida! Tente novamente");
                menuComercio();
        }
    }

    private void menuCriarAnimal(){
        System.out.println("Comprando seu animal perfeito:");

        System.out.println("Qual o tipo do seu animal: (1- Vaca/2- Galinha) *Digite apenas o número*");
        int animalTipo = inputNum.nextInt();

        System.out.println("Seu animal tem capacidade de procrial? (S/N)");
        String animalMae = inputText.nextLine();

        System.out.println("Qual o id do seu animal:");
        int animalId = inputNum.nextInt();

        System.out.println("Qual o nome do seu animal:");
        String animalNome = inputText.nextLine();

        System.out.println("Qual a raça do seu animal:");
        String animalRaca = inputText.nextLine();

        System.out.println("Qual a idade do seu animal:");
        int animalIdade = inputNum.nextInt();

        String animalStatus = "Novo de fábrica!";

        System.out.println("Animal comprado com sucesso, botei na sua conta!");

        boolean ehMae = false;
        if(animalMae.equalsIgnoreCase("s")){
            ehMae = true;
        }

        switch (animalTipo){
            case 1:
                if (ehMae){
                    Curral.adicionarAnimal(new VacaMae(animalId,animalNome,animalRaca,animalIdade,animalStatus));
                } else {
                    Curral.adicionarAnimal(new Vaca(animalId,animalNome,animalRaca,animalIdade,animalStatus));
                }
                break;
            case 2:
                if (ehMae){
                    Curral.adicionarAnimal(new GalinhaMae(animalId,animalNome,animalRaca,animalIdade,animalStatus));
                } else {
                    Curral.adicionarAnimal(new Galinha(animalId,animalNome,animalRaca,animalIdade,animalStatus));
                }
                break;
            default:
                System.out.println("===============================");
                System.out.println("      ERRO AO CRIAR ANIMAL     ");
                System.out.println("===============================");
                menuComercio();
        }
    }

    private void menuVenderAnimal(){
        System.out.println("Insira o nº do ID do animal que deseja vender:");
        int animalId = inputNum.nextInt();
        Animal animal = Curral.procurarAnimalId(animalId);

        if (animal != null){
            Curral.removerAnimal(animal);
            System.out.println("Animal removido com sucesso!");
        } else {
            System.out.println("Animal não encontrado!");
        }

        menuComercio();
    }

    private void menuProcriarAnimal(){
        System.out.println("Insira o nº do ID do animal que deseja procriar:");
        int animalId = inputNum.nextInt();
        Animal animal = Curral.procurarAnimalId(animalId);

        if (animal.getClass() != null) {
            if (animal.getClass() == VacaMae.class){
                VacaMae maeVaca = (VacaMae) animal;
                Bezerro filho = criarBezerro();
                filho.setMae(maeVaca);
                maeVaca.procriar(filho);
                Curral.adicionarAnimal(filho);
                System.out.println("Parabéns agora você tem um Bezerrinho!");

            } else if (animal.getClass() == GalinhaMae.class){
                GalinhaMae maeGalinha = (GalinhaMae) animal;
                Pintinho filho = criarPintinho();
                filho.setMae(maeGalinha);
                maeGalinha.procriar(filho);
                Curral.adicionarAnimal(filho);
                System.out.println("Parabéns agora você tem um Pintinho!");
            }

        } else {
            System.out.println("Erro ao procriar animal!");
        }

        menuComercio();
    }

    private Bezerro criarBezerro(){
        System.out.println("Criando seu animal bebê:");

        System.out.println("Qual o id do seu animal:");
        int animalId = inputNum.nextInt();

        System.out.println("Qual o nome do seu animal:");
        String animalNome = inputText.nextLine();

        System.out.println("Qual a raça do seu animal:");
        String animalRaca = inputText.nextLine();

        String animalStatus = "Filhote";

        return new Bezerro(animalId,animalNome,animalRaca,animalStatus);
    }

    private Pintinho criarPintinho(){
        System.out.println("Criando seu animal bebê:");

        System.out.println("Qual o id do seu animal:");
        int animalId = inputNum.nextInt();

        System.out.println("Qual o nome do seu animal:");
        String animalNome = inputText.nextLine();

        System.out.println("Qual a raça do seu animal:");
        String animalRaca = inputText.nextLine();

        String animalStatus = "Filhote";

        return new Pintinho(animalId,animalNome,animalRaca,animalStatus);
    }

    private void menuColetarProduto(){
        System.out.println("Insira o nº do ID do animal que deseja coletar produto:");
        int animalId = inputNum.nextInt();
        Animal animal = Curral.procurarAnimalId(animalId);

        if (animal != null) {
            animal.coletarProduto();
        }

        menuComercio();
    }

    private void menuVenderProduto(){
        System.out.println("Qual o produto que deseja remover?");
        String produto = inputText.nextLine();

        Produtos.removerProduto(produto);

        menuComercio();
    }


}
