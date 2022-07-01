/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author camil
 */
public abstract class Menu {
 
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial; 
    
    public Menu(String nom, double valIns){
        nombrePlato = nom;
        valorInicial = valIns;
    }
    public void establecerNombrePlato(String n){
        nombrePlato = n;
    }
    public void establecerValorInicial(double s){
        valorInicial = s;
    }
    public abstract void calcularValorMenu();
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    public double obtenerValorInicial(){
        return valorInicial;
    }
    public double obtenerCalValorMenu(){
        return valorMenu;
    }
}
