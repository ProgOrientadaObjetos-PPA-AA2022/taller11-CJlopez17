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
public class menuNinos extends Menu {

    protected double valorHelado;
    protected double valorPastel;

    public menuNinos(String nomPlat, double valorIn, double valHelado, double 
                    valPastel){
        super(nomPlat,valorIn);
        valorHelado = valHelado;
        valorPastel = valPastel;
    }

    public void establecerValHelado(double f){
        valorHelado = f;
    }

    public void establecerValPastel(double f){
        valorPastel = f;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + obtenerValHelado() + obtenervalPastel();
    }

    public double obtenerValHelado(){
        return valorHelado;
    }

    public double obtenervalPastel(){
        return valorPastel;
    }

    public String toString(){
        String cadena = String.format("Menu de Niño: \n" +
                "\tPlato: %s\n" +
                "\tValor Inicial: %.2f\n" +
                "\tValor Helado: %.2f\n" +
                "\tValor Pastel: %.2f\n" +
                "\tValor del menu: %.2f\n",obtenerNombrePlato(),obtenerValorInicial(),
                obtenerValHelado(),obtenervalPastel(),valorMenu);
        return cadena;
    }
}