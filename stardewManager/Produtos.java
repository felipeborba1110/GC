package stardewManager;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private static List<String> produtos = new ArrayList<>();

    public static void adicionarProduto(String produto){
        produtos.add(produto);
        System.out.println("Produto coletado com sucesso!");
    }

    public static void imprimirProdutos(){
        System.out.println("-------------------------------");
        System.out.println("SEUS PRODUTOS:");
        System.out.println("-------------------------------");
        for (String produto : produtos){
            System.out.println("-> " + produto);
        }
        System.out.println("-------------------------------");
    }

    public static void removerProduto(String produto){
        if (produtos.contains(produto)){
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso");
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}
