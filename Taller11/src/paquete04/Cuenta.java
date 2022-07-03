/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.ArrayList;
import paquete02.Menu;
/**
 *
 * @author camil
 */
public class Cuenta {
    
    protected String nomCliente;
    protected ArrayList<Menu> listado = new ArrayList<>();
    protected double valCancel; 
    protected double subtotal; 
    protected int iva; 
    
    public Cuenta (String n, int d, ArrayList<Menu> g){
        nomCliente = n; 
        listado = g;
        iva = d;
    }
    
    public void establecerNombre(String f){
        nomCliente = f;
    }
    
    public void establecerIva(int e){
        iva = e;
    }
    
    public void establecerSubTotal(){
        for (int i = 0; i < listado.size(); i++) {
            subtotal += listado.get(i).obtenerCalValorMenu();
        }
    }
    
    public void establerValorCancer(){
        valCancel = subtotal + (subtotal*(iva)/100);
    }
    
    public String obtenerNombreCliente(){
        return nomCliente;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public ArrayList<Menu> obtenerListado(){
        return listado;
    }
    
    public double obtenerSubTotal(){
        return subtotal;
    }
    
    public double obtenerValorCancelar(){
        return valCancel;
    }
    
    @Override 
    public String toString(){
        int i = 0;
        String cadena = String.format("Factura N~\n" + i++
        +"Nombre del Cliente: %s\n",obtenerNombreCliente());
        
        for (int j = 0; j < listado.size(); j++) {
            cadena = String.format("%s\n %s\n", cadena, listado.get(i));
        }
        cadena = String.format("%sSubtotal: %.2f\n"
                + "iva: %.2f\n"
                + "Total a pagar: %.2f\n",cadena,obtenerSubTotal(),obtenerIva(),
                obtenerValorCancelar());
        return cadena; 
    }
}
