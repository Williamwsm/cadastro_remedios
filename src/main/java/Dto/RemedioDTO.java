package Dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import model.Remedio;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
public class RemedioDTO {
    private long remNrId;
    private String remTxNome;
    private boolean remBlreceita;
    private Date remDtValidade;
    private String remTxLaboratorio;
    private double remDbValor;

    public RemedioDTO(Remedio remedio) {
        this.remNrId = remedio.getRemNrId();
        this.remTxNome = remedio.getRemTxNome();
        this.remBlreceita = remedio.isRemBlreceita();
        this.remDtValidade = remedio.getRemDtValidade();
        this.remTxLaboratorio = remedio.getRemTxLaboratorio();
        this.remDbValor =remedio.getRemDbValor();
    }
}
