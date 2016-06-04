/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi3_zorg;

import DAO.AcessoDAO;
import DBConnection.DBConnection;
import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
public class Acesso {
    private int idAcesso;
    private String tipoAcesso;

    /**
     * @return the idAcesso
     */
    public int getIdAcesso() {
        return idAcesso;
    }

    /**
     * @param idAcesso the idAcesso to set
     */
    public void setIdAcesso(int idAcesso) {
        this.idAcesso = idAcesso;
    }

    /**
     * @return the tipoAcesso
     */
    public String getTipoAcesso() {
        return tipoAcesso;
    }

    /**
     * @param tipoAcesso the tipoAcesso to set
     */
    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }
    
    // Lista todos os tipos de acesso cadastrados no banco
    public ArrayList<Acesso> listarAcessos(){
        DBConnection con = new DBConnection();
        AcessoDAO acessoDAO = new AcessoDAO(con.getConexaoMySQL());
        return acessoDAO.listarAcessos();
    }
}
