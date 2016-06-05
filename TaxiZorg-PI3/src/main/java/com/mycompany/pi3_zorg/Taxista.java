package com.mycompany.pi3_zorg;

import DAO.TaxistaDAO;
import DBConnection.DBConnection;
import java.util.ArrayList;

public class Taxista extends Funcionario {

    private int codTaxista;

    public Taxista(String nome, String sobrenome, String telefone, Usuario usuario, int codTaxista) {
        super(nome, sobrenome, telefone, usuario);
        this.codTaxista = codTaxista;
    }
    public Taxista(){
    }
    
    public ArrayList<Taxista> listarDisponiveis(){
        DBConnection con = new DBConnection();
        TaxistaDAO taxistaDao = new TaxistaDAO(con.getConexaoMySQL());

        ArrayList<Taxista> taxistas = new ArrayList<>();
        
        taxistas = taxistaDao.listarTaxista();
        return taxistas;
    }
    
    public ArrayList<Taxista> listarTodosDisponiveis(){
        DBConnection con = new DBConnection();
        TaxistaDAO taxistaDao = new TaxistaDAO(con.getConexaoMySQL());

        ArrayList<Taxista> taxistas = new ArrayList<>();
        
        taxistas = taxistaDao.listarTodosTaxista();
        return taxistas;
    }
    
    
}
