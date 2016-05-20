package com.mycompany.pi3_zorg;

public class Endereco {

    private String cep;
    private String logadouro;
    private String numero;
    private int codEndereco;

    public Endereco(String cep, String logadouro, String numero) {
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(int codEndereco) {
        this.codEndereco = codEndereco;
    }
}