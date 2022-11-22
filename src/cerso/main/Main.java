
package cerso.main;

import cerso.compras.Computadora;
import cerso.compras.Monitor;
import cerso.compras.Orden;
import cerso.compras.Raton;
import cerso.compras.Teclado;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Monitor m = new Monitor("Dell", 15);
        Teclado t = new Teclado("PS/2", "Dell");
        Raton r = new Raton("PS/2", "Dell");

        Computadora c = new Computadora("Dell", m, t, r);
        
        Orden or=new Orden();
        or.agregarComputadora(c);
        or.mostrarOrden();
        
        
          Monitor m2 = new Monitor("HP", 15);
        Teclado t2 = new Teclado("USB", "Dell");
        Raton r2 = new Raton("USB", "Dell");

        Computadora ensamblada = new Computadora("Ensamblada", m2, t2, r2);
        Orden or2=new Orden();
        or2.agregarComputadora(ensamblada);
        or2.mostrarOrden();

    }

}
