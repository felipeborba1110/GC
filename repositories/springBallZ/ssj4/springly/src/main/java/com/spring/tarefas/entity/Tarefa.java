package com.spring.tarefas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;
    private PrioridadeEnum prioridade;

    public Tarefa(String titulo, String descricao, boolean concluida, PrioridadeEnum prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = concluida;
        this.prioridade = prioridade;
    }

    public Tarefa(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public PrioridadeEnum getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(PrioridadeEnum prioridade) {
        this.prioridade = prioridade;
    }
}
