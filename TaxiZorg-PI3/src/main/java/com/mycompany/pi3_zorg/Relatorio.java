/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pi3_zorg;

import DAO.RelatorioDAO;
import DBConnection.DBConnection;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fabricio
 */
public class Relatorio {
    
    private String nomeCliente;
    private String statusViagem;
    private String tipoViagem;
    private int matriculaFuncionario;
    private String nomeFuncionario;
    private String sobrenomeFuncionario;
    private Date inicioViagem;
    private Date fimViagem;

    public Relatorio(String nomeCliente, String statusViagem, String tipoViagem, int matriculaFuncionario, String nomeFuncionario, String sobrenomeFuncionario, Date inicioViagem, Date fimViagem) {
        this.nomeCliente = nomeCliente;
        this.statusViagem = statusViagem;
        this.tipoViagem = tipoViagem;
        this.matriculaFuncionario = matriculaFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.sobrenomeFuncionario = sobrenomeFuncionario;
        this.inicioViagem = inicioViagem;
        this.fimViagem = fimViagem;
    }

    

    public Relatorio(){
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getStatusViagem() {
        return statusViagem;
    }

    public void setStatusViagem(String statusViagem) {
        this.statusViagem = statusViagem;
    }

    public String getTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(String tipoViagem) {
        this.tipoViagem = tipoViagem;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getSobrenomeFuncionario() {
        return sobrenomeFuncionario;
    }

    public void setSobrenomeFuncionario(String sobrenomeFuncionario) {
        this.sobrenomeFuncionario = sobrenomeFuncionario;
    }
    
    public Date getInicioViagem() {
        return inicioViagem;
    }

    public void setInicioViagem(Date inicioViagem) {
        this.inicioViagem = inicioViagem;
    }

    public Date getFimViagem() {
        return fimViagem;
    }

    public void setFimViagem(Date fimViagem) {
        this.fimViagem = fimViagem;
    }
    
    public ArrayList<Relatorio> listarRelatoriosTaxista(){
        DBConnection con = new DBConnection();
        RelatorioDAO relatorioDao = new RelatorioDAO(con.getConexaoMySQL());

        ArrayList<Relatorio> relatorios = new ArrayList<>();
        
        relatorios = relatorioDao.listarRelatorioTaxi();
        
        return relatorios;
    }
}
