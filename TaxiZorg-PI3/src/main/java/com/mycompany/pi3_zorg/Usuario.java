package com.mycompany.pi3_zorg;

import Criptografia.Criptografia;
import DAO.UsuarioDAO;

public class Usuario {

    private String login;
    private String senha;
    private Acesso acesso;
    private int unidade;
    private int codUsuario;

    public Usuario() {

    }

    public Usuario(String login, String senha, int acesso) {
        this.login = login;
        this.senha = Criptografia.gerarHash(senha);
        this.acesso.setIdAcesso(acesso);
    }
    

    public boolean deslogar() {
        return false;
    }

    public boolean verificarPermissao(int codUsuario) {
        return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Acesso getAcesso() {
        return acesso;
    }

    public void setAcesso(Acesso acesso) {
        this.acesso = acesso;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }
}
