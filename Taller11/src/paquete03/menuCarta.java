/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Locale;
import paquete02.Menu;

/**
 *
 * @author camil
 */
public class menuCarta extends Menu{
    
    protected double valorGuarnicion;
    protected double valorBebido;
    protected double valorAdicional; 
    
    public menuCarta(String nomPlat, double valorIn){
        super(nomPlat,valorIn);
    }
    
    public void establecerValorGuarnicion(double g){
         valorGuarnicion = g;
    }
    
    public void establecerValorBebida(double g){
         valorBebido = g;
    }
    
    public void establecerValorAdicional(double g){
         valorAdicional = g;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicial + obtenerValorGuarnicion() + obtenerValorBebida()
                + obtenerValorAdicional();
    }
    
    public double obtenerValorGuarnicion(){
        return valorGuarnicion;
    }
    
    public double obtenerValorBebida(){
        return valorBebido;
    }
    
    public double obtenerValorAdicional(){
        return valorAdicional;
    }
    
    public String toString(){
        String cadena = String.format("Menu");
        
        return cadena; 
    }
}
