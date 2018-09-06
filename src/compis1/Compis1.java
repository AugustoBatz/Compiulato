/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compis1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import lexico.Numeros;

/**
 *
 * @author sys515
 */
public class Compis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros scanner=null;
        try {
            java.io.FileInputStream stream = new java.io.FileInputStream(
                    System.getProperty("user.dir")+File.separator+"src"+File.separator+"compis1"+
                    File.separator+"datos.txt");
           Reader reader = new InputStreamReader(stream);
          scanner = new Numeros(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
            System.out.println("Totales:");
            System.out.println("Decimales: "+Numeros.contador.getDecimales());
            System.out.println("HexaDecimales: "+Numeros.contador.getHexadeimales());
            System.out.println("Romano: "+Numeros.contador.getRomano());
            System.out.println("Binario: "+Numeros.contador.getBinario());
            System.out.println("Octal: "+Numeros.contador.getOctal());
            

            // TODO code application logic here
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Compis1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Compis1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
