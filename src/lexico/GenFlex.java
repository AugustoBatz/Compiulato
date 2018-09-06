/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

import java.io.File;

/**
 *
 * @author sys515
 */
public class GenFlex {
     public static void main(String[] args) {
         System.out.println(System.getProperty("user.dir"));
         jflex.Main.generate(new File(
                 System.getProperty("user.dir")+File.separator+"src"+File.separator+"lexico"+File.separator+
                 "prueba1"
                ));
         
        
    }
    
}
