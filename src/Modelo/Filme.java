/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Elisson
 */
public class Filme {
    private int codigo;
    private String titulo;
    private int ano;
    private String duracao;
    private int cod_categora;
    private int cod_classificacao;
    private String capa;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public int getCod_categora() {
        return cod_categora;
    }

    public void setCod_categora(int cod_categora) {
        this.cod_categora = cod_categora;
    }

    public int getCod_classificacao() {
        return cod_classificacao;
    }

    public void setCod_classificacao(int cod_classificacao) {
        this.cod_classificacao = cod_classificacao;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
    
            
}