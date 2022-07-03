/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import paquete02.Menu;

/**
 *
 * @author camil
 */
public class menuDia extends Menu{
 
    protected double valorPostre;
    protected double valorBebida;
    
     public menuDia(String nomPlat, double valorIn, double valPos, double 
                    valBebi){
        super(nomPlat,valorIn);
        valorPostre = valPos;
        valorBebida = valBebi;
    }

    public void establecerValorPostre(double d){
         valorPostre = d;
    }

    public void establecerValorBebida(double d){
         valorBebida = d;
    }

    public void calcularValorMenu(){
        valorMenu = valorInicial + obtenerValorPostre() + obtenerValorBebida();
    }

    public double obtenerValorPostre(){
         return valorPostre;
    }

    public double obtenerValorBebida(){
         return valorBebida;
    }

    public String toStirng(){
         String cadena = String.format("Menu del Dia: \n" +
                 "\tValor inicial: %.2f\n" +
                 "\tValor dedida: %.2f\n" +
                 "\tValor postre: %.2f\n" +
                 "\tValor del Menu: %.2f\n",obtenerNombrePlato(),
                 obtenerValorBebida(),obtenerValorPostre(),
                 valorMenu);
         return cadena;
    }

}