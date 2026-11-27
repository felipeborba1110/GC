package com.spring.tarefas.dto;

import com.spring.tarefas.entity.PrioridadeEnum;

public record TarefaDTO(String titulo, String descricao, boolean concluida, PrioridadeEnum prioridade) {
}
