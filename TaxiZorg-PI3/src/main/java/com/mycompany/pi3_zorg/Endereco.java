package com.mycompany.pi3_zorg;

public class Endereco {

    private String cep;
    private String logadouro;
    private int numero;

    public Endereco(String cep, String logadouro, int numero) {
        this.cep = cep;
        this.logadouro = logadouro;
        this.numero = numero;
    }
    
    public Endereco(){
        
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}