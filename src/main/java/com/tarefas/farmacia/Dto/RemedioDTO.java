package com.tarefas.farmacia.Dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.tarefas.farmacia.model.Remedio;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
public class RemedioDTO {
    private Long remNrId;
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

    public Long getRemNrId() {
        return remNrId;
    }

    public void setRemNrId(Long remNrId) {
        this.remNrId = remNrId;
    }

    public String getRemTxNome() {
        return remTxNome;
    }

    public void setRemTxNome(String remTxNome) {
        this.remTxNome = remTxNome;
    }

    public boolean isRemBlreceita() {
        return remBlreceita;
    }

    public void setRemBlreceita(boolean remBlreceita) {
        this.remBlreceita = remBlreceita;
    }

    public Date getRemDtValidade() {
        return remDtValidade;
    }

    public void setRemDtValidade(Date remDtValidade) {
        this.remDtValidade = remDtValidade;
    }

    public String getRemTxLaboratorio() {
        return remTxLaboratorio;
    }

    public void setRemTxLaboratorio(String remTxLaboratorio) {
        this.remTxLaboratorio = remTxLaboratorio;
    }

    public double getRemDbValor() {
        return remDbValor;
    }

    public void setRemDbValor(double remDbValor) {
        this.remDbValor = remDbValor;
    }
}
