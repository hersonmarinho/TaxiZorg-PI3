package com.mycompany.pi3_zorg;

public class Usuario {

    private String login;
    private String senha;
    private String acesso;
    private int codUsuario;

    public Usuario() {

    }

    public Usuario(String login, String senha, String acesso) {
        this.login = login;
        this.senha = senha;
        this.acesso = acesso;
    }

    public String autenticar(String login, String senha) {
        return this.getAcesso();
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

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }
}
