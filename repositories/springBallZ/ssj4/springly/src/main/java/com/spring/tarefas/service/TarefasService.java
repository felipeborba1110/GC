package com.spring.tarefas.service;

import com.spring.tarefas.dto.TarefaDTO;
import com.spring.tarefas.entity.PrioridadeEnum;
import com.spring.tarefas.entity.Tarefa;
import com.spring.tarefas.exception.TarefaNaoEncontrada;
import com.spring.tarefas.repository.TarefasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {
    @Autowired
    private TarefasRepository repository;

    public void criarTarefa(TarefaDTO tarefaDTO){
        Tarefa tarefa = new Tarefa(tarefaDTO.titulo(), tarefaDTO.descricao(), tarefaDTO.concluida(), tarefaDTO.prioridade());
        repository.save(tarefa);
    }

    public List<Tarefa> listarTarefas(){
        return repository.findAll();
    }

    public Tarefa buscarTarefa(int id) throws TarefaNaoEncontrada {
        return repository.findById(id).orElseThrow(() -> new TarefaNaoEncontrada("Tarefa não encontrada"));
    }

    public void concluirTarefa(int id) throws TarefaNaoEncontrada {
        Tarefa tarefa = buscarTarefa(id);
        tarefa.setConcluida(true);
        repository.save(tarefa);
    }

    public void deletarTarefa(int id) throws TarefaNaoEncontrada{
        Tarefa tarefa = buscarTarefa(id);
        repository.delete(tarefa);
    }
}
