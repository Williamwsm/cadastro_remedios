package com.tarefas.farmacia.controller;

import com.tarefas.farmacia.Dto.RemedioDTO;
import com.tarefas.farmacia.model.Remedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tarefas.farmacia.service.RemedioService;

import java.util.List;

@RestController
@RequestMapping("/remedios")
public class RemedioController {

    @Autowired
    private RemedioService service;

    @PostMapping("/salvar")
    public RemedioDTO salvarRem(@RequestBody Remedio remedio) {
        return service.salvarRem(remedio);
    }

    @GetMapping("/{id}")
    public RemedioDTO buscarRemId(@PathVariable Long id) {
        return service.buscarRemId(id);
    }

    @GetMapping
    public List<RemedioDTO> listarRem() {
        return service.listarTodos();
    }

    @DeleteMapping("remover/{id}")
    public Boolean deleteRemId(@PathVariable Long id){
        return service.deleteRemId(id);
    }
}

