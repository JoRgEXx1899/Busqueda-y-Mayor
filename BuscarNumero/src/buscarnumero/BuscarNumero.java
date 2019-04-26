/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarnumero;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author John Jairo
 */
public class BuscarNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    ArrayList<Integer> Numeros = new ArrayList<Integer>();
    
        System.out.println("Cuantos Numeros Desea Ingresar En El Arreglo?");
    
        Scanner reader = new Scanner(System.in);
        int Cantidad = reader.nextInt();
        
        for(int x=0;x<Cantidad;x++){
            
        // double numeros = reader.nextDouble();
        int ValorEntero = (int) Math.floor(Math.random()*(0-100+1)+100);
        
        Numeros.add(ValorEntero);
            
        }
        
        System.out.println("El Arreglo Es :" + Numeros);
        System.out.println("Que Desea Hacer?\n "
                +  "1) Buscar Un Numero En El Arreglo\n"
                + "2)Imprimir El Numero Mayor Y Su Antecesor");
        
        int Seleccion = reader.nextInt();
        
        
        if(Seleccion==1){
            
            System.out.println("Ingrese el numero a buscar>> ");int Busqueda = reader.nextInt();
                if(Numeros.contains(Busqueda)==true){
                System.out.println("El Numero Si Se Encuentra En El Arreglo");
                }else{
                System.out.println("El Numero No Se Encuentra En El Arreglo");
            }
        }
        
        else if (Seleccion==2){
        
            Collections.sort(Numeros, Integer::compareTo);
            System.out.println("El Arreglo Ordenado Es : " +Numeros);
            System.out.println("El Numero Mayor Es :" + Numeros.get(Numeros.size()-1) + " Y Su Antecesor Es : " + Numeros.get(Numeros.size()-2));
        
           
        }
      
    }
    
}
