package com.spring.tarefas.controller;

import com.spring.tarefas.dto.TarefaDTO;
import com.spring.tarefas.entity.Tarefa;
import com.spring.tarefas.exception.TarefaNaoEncontrada;
import com.spring.tarefas.service.TarefasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {
    @Autowired
    private TarefasService service;

    @GetMapping
    public ResponseEntity<List<Tarefa>> listarTarefas(){
        return new ResponseEntity<>(service.listarTarefas(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> criarTarefa(@RequestBody TarefaDTO tarefaDTO){
        service.criarTarefa(tarefaDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarTarefa(@PathVariable int id) throws TarefaNaoEncontrada {
        return new ResponseEntity<>(service.buscarTarefa(id), HttpStatus.OK);
    }

    @PutMapping("/{id}/concluir")
    public ResponseEntity<Void> concluirTarefa(@PathVariable int id) throws TarefaNaoEncontrada {
        service.concluirTarefa(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTarefa(@PathVariable int id) throws TarefaNaoEncontrada {
        service.deletarTarefa(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
