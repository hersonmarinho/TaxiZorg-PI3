package com.mycompany.pi3_zorg;

import DAO.UnidadeDAO;
import DBConnection.DBConnection;
import java.util.ArrayList;

public class Unidade {

    private int codUnidade;
    private String cidade;
    private String uf;

    public Unidade(String cidade, String uf) {
        this.cidade = cidade;
        this.uf = uf;
    }

    public Unidade() {

    }

    public int getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(int codUnidade) {
        this.codUnidade = codUnidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public ArrayList<Unidade> listarLocais() {
        DBConnection con = new DBConnection();
        UnidadeDAO unidadeDAO = new UnidadeDAO(con.getConexaoMySQL());

        ArrayList<Unidade> unidades = new ArrayList<>();

        unidades = unidadeDAO.listarUnidade();
        return unidades;
    }

}
