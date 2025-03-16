package com.tarefas.farmacia.Dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.tarefas.farmacia.model.Remedio;

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

    public long getRemNrId() {
        return remNrId;
    }

    public String getRemTxNome() {
        return remTxNome;
    }

    public boolean isRemBlreceita() {
        return remBlreceita;
    }

    public Date getRemDtValidade() {
        return remDtValidade;
    }

    public String getRemTxLaboratorio() {
        return remTxLaboratorio;
    }

    public double getRemDbValor() {
        return remDbValor;
    }
}
