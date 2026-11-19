package com.cybertron.autobot;

import java.util.ArrayList;
import java.util.List;

/**
 * Responsável por adicinar e buscar autobots na lista de autobos. Além de calcular o energon total e classifica os autobots.
 */
public class GerenciadorAutobots {

    private final int ENERGON_MINIMO_AUTOBOT_ELITE = 500;
    private final int ENERGON_MINIMO_AUTOBOT_PADRAO = 200;
    private final int ENERGON_POR_REPARO = 100;

    private List<Autobot> lista = new ArrayList<>();

    public void adicionar(Autobot autobot) {
        lista.add(autobot);
    }

    public double calcularEnergonTotal() {
        double total = 0;
        for (int i = 0; i < lista.size(); i++) {
            total += lista.get(i).getEnergon();
        }
        return total;
    }

    public Autobot buscar(String nome) {
        for (Autobot autobot : lista) {
            if (autobot.getNome().equalsIgnoreCase(nome)) {
                return autobot;
            }
        }
        return null;
    }

    public void reparar(Autobot autobot) throws EnergonNegativoException {
        if (autobot.getEnergon() < 0) {
            throw new EnergonNegativoException("Energon negativo");
        }
        autobot.setEnergon(autobot.getEnergon() + ENERGON_POR_REPARO);
    }

    public String classificar(Autobot autobot) {
        if (autobot.getEnergon() > ENERGON_MINIMO_AUTOBOT_ELITE) {
            return ClassificacaoAutobots.ELITE.name();
        } else if (autobot.getEnergon() > ENERGON_MINIMO_AUTOBOT_PADRAO) {
            return ClassificacaoAutobots.PADRAO.name();
        } else {
            return ClassificacaoAutobots.RESERVA.name();
        }
    }
}