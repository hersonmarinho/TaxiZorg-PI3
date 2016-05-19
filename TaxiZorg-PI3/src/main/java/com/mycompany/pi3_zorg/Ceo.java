package com.mycompany.pi3_zorg;

public class Ceo extends Funcionario{
    
    private int codCeo;
    
    public Ceo(String nome, String sobrenome, String telefone, Usuario usuario, int codCeo) {
        super(nome, sobrenome, telefone, usuario);
        this.codCeo = codCeo;
    }
}