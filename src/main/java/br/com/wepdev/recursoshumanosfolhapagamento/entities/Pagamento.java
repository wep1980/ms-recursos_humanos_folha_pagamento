package br.com.wepdev.recursoshumanosfolhapagamento.entities;

import java.io.Serializable;

public class Pagamento implements Serializable {


    private String nome;

    private Double ganhoPorDia;

    private Integer dias;



    public Pagamento() {

    }


    public Pagamento(String nome, Double ganhoPorDia, Integer dias) {
        this.nome = nome;
        this.ganhoPorDia = ganhoPorDia;
        this.dias = dias;
    }


    public double getTotal(){
        return dias * ganhoPorDia;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGanhoPorDia() {
        return ganhoPorDia;
    }

    public void setGanhoPorDia(Double ganhoPorDia) {
        this.ganhoPorDia = ganhoPorDia;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}
