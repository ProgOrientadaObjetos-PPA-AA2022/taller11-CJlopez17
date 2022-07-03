/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Menu;
import paquete03.menuCarta;
import paquete03.menuDia;
import paquete03.menuEconomico;
import paquete03.menuNinos;
import paquete04.Cuenta;
import java.util.ArrayList;
/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Menu> listado = new ArrayList<>();
        
        menuNinos mnn1 = new menuNinos("Niños 01", 2.00, 1.00, 1.50);
        mnn1.calcularValorMenu();
        listado.add(mnn1);
        
        menuNinos mnn2 = new menuNinos("Niños 02", 3.00, 1.00, 1.50);
        mnn2.calcularValorMenu();
        listado.add(mnn2);
        
        menuEconomico mco1 = new menuEconomico("Econo 001", 4.00, 25.00);
        mco1.calcularValorMenu();
        listado.add(mco1);
        
        menuDia mdia1 = new menuDia("Dia 001", 5.00, 1.00, 1.00);
        mdia1.calcularValorMenu();
        listado.add(mdia1);
        
        menuCarta mcar1 = new menuCarta("Carta 001", 6.0, 1.5, 2.0, 10.00);
        mcar1.calcularValorMenu();
        listado.add(mcar1);
        
        Cuenta ceun1 = new Cuenta("Rene Elizalde", 10, listado);
        ceun1.establecerSubTotal();
        ceun1.establerValorCancer();
        
        System.out.println(ceun1);
    }
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del Niño:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del Niño:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/