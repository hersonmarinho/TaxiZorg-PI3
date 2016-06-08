package com.mycompany.pi3_zorg;


import DAO.ViagemDAO;
import DBConnection.DBConnection;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Viagem {
    
    private int codViagem;
    private int id_end_partida;
    private int id_end_destino;
    private String nomeCliente;
    private String status;
    private GregorianCalendar inicioViagem;
    private GregorianCalendar fimViagem;
    private int matricula_funcionario;
    private String tipoViagem;
    
    
    public Viagem(){
        
    }

    public Viagem(int codViagem, int id_end_partida, int id_end_destino, String nomeCliente, String status, GregorianCalendar inicioViagem, GregorianCalendar fimViagem, int matricula_funcionario) {
        this.codViagem = codViagem;
        this.id_end_partida = id_end_partida;
        this.id_end_destino = id_end_destino;
        this.nomeCliente = nomeCliente;
        this.status = status;
        this.inicioViagem = inicioViagem;
        this.fimViagem = fimViagem;
        this.matricula_funcionario = matricula_funcionario;
    }
    
    public ArrayList<Viagem> listarViagens() {
        DBConnection con = new DBConnection();
        ViagemDAO viagemDAO = new ViagemDAO(con.getConexaoMySQL());

        ArrayList<Viagem> viagens = new ArrayList<>();
        viagens = viagemDAO.listarViagens();
        
        return viagens;
    }
    
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GregorianCalendar getInicioViagem() {
        return inicioViagem;
    }

    public void setInicioViagem(GregorianCalendar inicioViagem) {
        this.inicioViagem = inicioViagem;
    }

    public GregorianCalendar getFimViagem() {
        return fimViagem;
    }

    public void setFimViagem(GregorianCalendar fimViagem) {
        this.fimViagem = fimViagem;
    }

    public int getCodViagem() {
        return codViagem;
    }
    
    public void setCodViagem(int codViagem) {
        this.codViagem = codViagem;
    }
    
    public int getId_end_partida() {
        return id_end_partida;
    }

    public void setId_end_partida(int id_end_partida) {
        this.id_end_partida = id_end_partida;
    }

    public int getId_end_destino() {
        return id_end_destino;
    }

    public void setId_end_destino(int id_end_destino) {
        this.id_end_destino = id_end_destino;
    }
    
    public int getMatricula_funcionario() {
        return matricula_funcionario;
    }

    public void setMatricula_funcionario(int matricula_funcionario) {
        this.matricula_funcionario = matricula_funcionario;
    }
    
    public String getTipoViagem() {
        return tipoViagem;
    }

    public void setTipoViagem(String tipoViagem) {
        this.tipoViagem = tipoViagem;
    }
    
    public void getRelatorioReceitaPorPonto(){
        
    }
    
    public void getRelatorioReceitaTodosPontos(){
        
    }
    
    public void getRelatorioReceitaTaxistaPonto(){
        
    }
    
    public void getRelatorioReceitaTodosTaxistas(){
        
    }

    

    
    
}