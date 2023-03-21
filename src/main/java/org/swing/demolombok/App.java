
package org.swing.demolombok;

/**
 * usando lombok... abrevia generación de código
 * @author sssoc
 */
public class App {

    
    public static void main(String[] args) {
        
        //creamos objetos, y con el objeto gracias al @Data salen todas las opciones autom. 
        Coche coche = new Coche();
        coche.setMatricula("8844GLZ");
        coche.setKilometros(267500);
        
        System.out.println(coche.toString());
        
    }
}
