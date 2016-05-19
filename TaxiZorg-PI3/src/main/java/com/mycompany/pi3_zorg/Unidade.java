package com.mycompany.pi3_zorg;

public class Unidade {
    
    private int codUnidade;
    private String cidade;
    private String uf;
    
    public Unidade(String cidade, String uf){
        this.cidade = cidade;
        this.uf = uf;
    }

    public int getCodUnidade() {
        return codUnidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}