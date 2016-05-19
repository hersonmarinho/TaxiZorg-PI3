package com.mycompany.pi3_zorg;

import DAO.FuncionarioDAO;

public class Funcionario {

    private String nome;
    private String sobrenome;
    private String telefone;
    private String matricula;
    private String status;
    private Usuario usuario;

    public Funcionario() {

    }

    public Funcionario(String nome, String sobrenome, String telefone, Usuario usuario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
