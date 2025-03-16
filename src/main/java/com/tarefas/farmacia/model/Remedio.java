package com.tarefas.farmacia.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "remedio")
public class Remedio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rem_nr_id")
    private Long remNrId;
    @Column(name = "rem_tx_nome")
    private String remTxNome;
    @Column(name = "rem_bl_receita")
    private boolean remBlreceita;
    @Column(name = "rem_dt_validade")
    private Date remDtValidade;
    @Column(name = "rem_tx_laboratorio")
    private String remTxLaboratorio;
    @Column(name = "rem_db_valor")
    private double remDbValor;

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
