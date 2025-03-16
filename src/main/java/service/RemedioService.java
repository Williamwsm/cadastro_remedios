package service;

import Dto.RemedioDTO;

import model.Remedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.IRemedioRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RemedioService {
    @Autowired
    private IRemedioRepository remedioRepository;
    public RemedioDTO buscarRemId(Long id){
      Remedio remedio = remedioRepository.findById(id).get();
      RemedioDTO remedioDTO = new RemedioDTO(remedio);
      return remedioDTO;
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
        remedioRepository.deleteById(id);
        return true;
    }
}
