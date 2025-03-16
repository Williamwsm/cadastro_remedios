package controller;

import Dto.RemedioDTO;
import model.Remedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.RemedioService;

import java.util.List;

@RestController
@RequestMapping( "/remedios")  // Mapeamento base para o controlador
public class RemedioController {

    @Autowired
    private RemedioService service;

    @GetMapping( "/{id}")
    public RemedioDTO buscarRemId(@PathVariable Long id) {
        return service.buscarRemId(id);
    }

    @PostMapping
    public RemedioDTO salvarRem(@RequestBody Remedio remedio) {
        return service.salvarRem(remedio);
    }

    @GetMapping
    public List<RemedioDTO> listarRem() {
        return service.listarTodos();
    }
    @DeleteMapping( "/{id}")
    public Boolean deleteRemId(@PathVariable Long id){
        return service.deleteRemId(id);
    }
}