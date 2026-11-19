package com.cybertron.autobot;

/*
 * Realiza a instanciação de alguns autobots e adiciona-os a lista de autobots. Além disso calcula o energon total, busca um autobot, repara um autobot e classifica um autobot.
 */
public class Main {

    public static void main(String[] args) throws EnergonNegativoException {

        GerenciadorAutobots gerenciador = new GerenciadorAutobots();

        Autobot optimus = new Autobot("Optimus Prime", 850.0, 10);
        Autobot bumblebee = new Autobot("Bumblebee", 320.0, 5);
        Autobot ratchet = new Autobot("Ratchet", 180.0, 7);

        gerenciador.adicionar(optimus);
        gerenciador.adicionar(bumblebee);
        gerenciador.adicionar(ratchet);

        System.out.println("Energon total: " + gerenciador.calcularEnergonTotal());

        Autobot encontrado = gerenciador.buscar("Bumblebee");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.getNome());
        } else {
            System.out.println("src.main.java.com.cybertron.autobot.Autobot nao encontrado");
        }

        gerenciador.reparar(ratchet);
        System.out.println("Energon do Ratchet: " + ratchet.getEnergon());
        System.out.println("Classificacao: " + gerenciador.classificar(ratchet));
    }
}