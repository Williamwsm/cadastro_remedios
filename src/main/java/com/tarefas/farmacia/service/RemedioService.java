package com.tarefas.farmacia.service;

import com.tarefas.farmacia.Dto.RemedioDTO;

import com.tarefas.farmacia.model.Remedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tarefas.farmacia.repository.IRemedioRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RemedioService {
    @Autowired
    private IRemedioRepository remedioRepository;
    public RemedioDTO buscarRemId(Long id){
        Remedio remedio = remedioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Remédio não encontrado"));
        return new RemedioDTO(remedio);
    }



    public RemedioDTO salvarRem(Remedio remedio){
        Remedio rem = remedioRepository.save(remedio); // verificar se existe
        RemedioDTO remedioDTO = new RemedioDTO(rem);
        return  remedioDTO;
    }
    @Transactional(readOnly  = true)
    public List<RemedioDTO> listarTodos(){
      List<Remedio> remedios = remedioRepository.findAll();
     return remedios.stream().map(RemedioDTO::new).collect(Collectors.toList());
    }
    public Boolean deleteRemId(Long id){
        if (!remedioRepository.existsById(id)) {
            throw new RuntimeException("Remédio com ID " + id + " não encontrado para exclusão");
        }
        remedioRepository.deleteById(id);
        return true;
    }

}
