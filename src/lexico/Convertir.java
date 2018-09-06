/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexico;

/**
 *
 * @author sys515
 */
public class Convertir {
    public String numero;
    public Convertir()
    {
        numero="";
    }
    public String Convertir2(String romano)
    {
        String x="";
             char Rom[]= {' ','I','V','X','L','C','D','M'}; //GUARDAN LETRAS A COMPARAR

        int valor[] = {0,1,5,10,50,100,500,1000};//SE LE DA VALOR A LA LETRAS

        int ant = 0;

        int suma = 0;

        char letra = ' ';

        for(int i = 0; i < romano.length(); i++){//RECORRER TODA LA FRASE(numero romano)

                letra = romano.charAt(i);

                for(int j = 0; j < Rom.length; j++){//RECORRE ARREGLO ROM

                    if(letra == Rom[j]){//si letra recorrida = a letra contenida en rom                 

                                suma = suma + valor [j]; //sumar el valor de la letra

                            if( ant < valor[j]){ //si el valor de letra anterior menor a valor letra   //actual

                                    suma = suma - ant*2 ; // restale el doble del menor de los dos

                                    ant = valor[j]; // valor anterior = valor letra actual

                            }else {//si no se cumple lo anterior  

                        ant = valor[j];//el dato actual se guarda en anterior

 }

                    }              

                }

        }

        x=String.valueOf(suma);
        return x;
    }
}
