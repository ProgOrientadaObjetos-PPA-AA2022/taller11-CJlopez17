/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Menu;
import paquete03.menuCarta;
import paquete03.menuDia;
import paquete03.menuEconomico;
import paquete03.menuNinos;
import paquete04.Cuenta;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    public static void main(String[] args) {
        
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
            {"Niños 02", "3.00", "1", "1.5"},
            {"Niños 03", "2.00", "2", "0.5"},
         };
        
        String[][] datos002 = {{"Econo 001", "4", "25"}, 
            {"Econo 002", "4", "15"},
            {"Econo 003", "4", "35"}
        };
        
        String[][] datos003 = { {"Dia 001", "5", "1", "1"}, 
            {"Dia 002", "6", "2", "2"},
            {"Dia 003", "5.5", "3", "1"},
        };
        
        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"}, 
            {"Carta 002", "7", "1.7", "2.1", "5"}, 
            {"Carta 003", "8", "1.9", "2.2", "5"}, 
            {"Carta 004", "9", "2.5", "2.9", "5"}, 
        };
                
        
        // Lista de Menus
        ArrayList lista = new ArrayList<>();
        
        for (int i = 0; i < datos001.length; i++) {
            String nomPlato = datos001[i][0];
            double valIncial = Double.parseDouble(datos001[i][1]);
            double valHelado = Double.parseDouble(datos001[i][2]);
            double valPastel = Double.parseDouble(datos001[i][3]);
            menuNinos mnn1 = new menuNinos(nomPlato,valIncial,valHelado,valPastel);
            lista.add(mnn1);
        }
        for (int i = 0; i < datos002.length; i++) {
            String nomPlato = datos002[i][0];
            double valInicial = Double.parseDouble(datos002[i][1]);
            double descuento = Double.parseDouble(datos002[i][2]);
            menuEconomico mco1 = new menuEconomico(nomPlato,valInicial,descuento);
            lista.add(mco1);
        }
        for (int i = 0; i < datos003.length; i++) {
            String nomPlato = datos003[i][0];
            double valInicial = Double.parseDouble(datos003[i][1]);
            double valPostre = Double.parseDouble(datos003[i][2]);
            double valBebida = Double.parseDouble(datos003[i][3]);
            menuDia mdia1 = new menuDia(nomPlato,valInicial,valPostre,valBebida);
            lista.add(mdia1);
        }
        for (int i = 0; i < datos004.length; i++) {
            String nomPlato = datos004[i][0];
            double valInicial = Double.parseDouble(datos004[i][1]);
            double valGuarnicion = Double.parseDouble(datos004[i][2]);
            double valBebida = Double.parseDouble(datos004[i][3]);
            double porsAdicional = Double.parseDouble(datos004[i][4]);
            menuCarta mcar1 = new menuCarta(nomPlato,valInicial,valGuarnicion,
                                            valBebida,porsAdicional);
            lista.add(mcar1);
        }
        
        
        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        
        // Fin de solución
        
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularValorMenu();
        }
        
        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade",10, lista);
        miCuenta.establecerSubTotal();
        miCuenta.establerValorCancer();
        System.out.printf("%s\n", miCuenta);
        


    }
}
