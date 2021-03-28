/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author mike
 */
public class Analizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "/home/mike/NetBeansProjects/Analizador/src/codigo/Lex.flex";
        generarLex(ruta);
    }
    
    public static void generarLex(String ruta){
        File archivo = new File(ruta);  
        JFlex.Main.generate(archivo);
    }
    
}
