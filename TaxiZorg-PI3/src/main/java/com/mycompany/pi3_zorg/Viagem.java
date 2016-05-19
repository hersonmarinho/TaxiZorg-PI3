package com.mycompany.pi3_zorg;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import java.util.GregorianCalendar;

public class Viagem {
    
    private int codViagem;
    private Endereco enderecoPartida;
    private Endereco enderecoDestino;
    private String nomeCliente;
    private String status;
    private GregorianCalendar inicioViagem;
    private GregorianCalendar fimViagem;
    
    
    public Viagem(){
        
    }
    
    public Viagem(int codViagem, String status, GregorianCalendar inicioViagem, GregorianCalendar fimViagem) {
        this.codViagem = codViagem;
        this.status = status;
        this.inicioViagem = inicioViagem;
        this.fimViagem = fimViagem;
    }
    
    public Endereco getEnderecoPartida() {
        return enderecoPartida;
    }

    public void setEnderecoPartida(Endereco enderecoPartida) {
        this.enderecoPartida = enderecoPartida;
    }

    public Endereco getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setEnderecoDestino(Endereco enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
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
    
    public void getRelatorioReceitaPorPonto(){
        
    }
    
    public void getRelatorioReceitaTodosPontos(){
        
    }
    
    public void getRelatorioReceitaTaxistaPonto(){
        
    }
    
    public void getRelatorioReceitaTodosTaxistas(){
        
    }
}