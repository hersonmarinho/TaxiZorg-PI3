package com.mycompany.pi3_zorg;

public class Taxista extends Funcionario {

    private int codTaxista;

    public Taxista(String nome, String sobrenome, String telefone, Usuario usuario, int codTaxista) {
        super(nome, sobrenome, telefone, usuario);
        this.codTaxista = codTaxista;
    }
}
