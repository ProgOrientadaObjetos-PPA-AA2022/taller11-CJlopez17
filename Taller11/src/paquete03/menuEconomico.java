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
public class menuEconomico extends Menu {

    protected double porceDescuento;
    public menuEconomico(String nomPlat, double valorIn, double porsDescuento){
        super(nomPlat,valorIn);
        porceDescuento = porsDescuento;
    }

    public void establecerPorcentajeDescuento(){
        porceDescuento = porceDescuento * 100;
    }

    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicial - porceDescuento;
    }

    public double obtenerPercentajeDescuento(){
        return porceDescuento;
    }

    public String toString(){
        String cadena = String.format("Menu Económico: \n" +
                "\tPlato: %s\n" +
                "\tValor Inicial: %.2f\n" +
                "\tPorcentaje Descuento: %.2f\n" +
                "\tValor del Menu: %.2f\n",obtenerNombrePlato(),
                obtenerValorInicial(),obtenerPercentajeDescuento(),
                valorMenu);
        return cadena;
    }
}
