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
public class menuCarta extends Menu {

    protected double valorGuarnicion;
    protected double valorBebida;
    protected double valorAdicional;

    public menuCarta(String nomPlat, double valorIn, double valGuar, double valBebida,
                    double valAdicio) {
        super(nomPlat, valorIn);
        valorGuarnicion = valGuar;
        valorBebida = valBebida;
        valorAdicional = valAdicio;
    }

    public void establecerValorGuarnicion(double g) {
        valorGuarnicion = g;
    }

    public void establecerValorBebida(double g) {
        valorBebida = g;
    }

    public void establecerValorAdicional(double g) {
        valorAdicional = g;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + obtenerValorGuarnicion() + obtenerValorBebida()
                + obtenerValorAdicional();
    }

    public double obtenerValorGuarnicion() {
        return valorGuarnicion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    @Override
    // arrobaOberrride
    public String toString() {
        String cadena = String.format("Menu Carta: \n"
                + "\tPlato: %s\n"
                + "\tValor guarnicion: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor adicional: %.2f\n"
                + "\tValor menu: .2f\n", obtenerNombrePlato(), obtenerValorGuarnicion(),
                obtenerValorBebida(), obtenerValorAdicional(), valorMenu);
        return cadena;
    }
}
