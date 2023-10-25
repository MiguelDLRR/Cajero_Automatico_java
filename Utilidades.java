/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaCorriente;

import java.util.Scanner;

/**
 *
 * @author Miguel de la Rubia
 * Utilidades que contendrá dos métodos para pedir datos al usuario:
pedirEntero. Recibe una pregunta como parámetro, la muestra por consola y pide un dato al usuario hasta que el usuario introduzca un valor entero válido.
pedirDecimal. Recibe una pregunta como parámetro, la muestra por consola y pide un dato al usuario hasta que el usuario introduzca un valor doble válido. 

 */
public class Utilidades {
    
      public static int pideEntero(String pregunta){
        
        System.out.println(pregunta);
        
        boolean preguntar = true;
        int numero = 0;
        do{            
            try{
                Scanner sc = new Scanner (System.in);
                numero = sc.nextInt();
                preguntar = false;
            }catch(Exception e){
                    
                System.out.println("Por favor introduce un valor correcto. Numeros Enteros");
                    
                    }       
        }while(preguntar);
        
        return numero;
    }
            
      public static double pideDouble (String pregunta){
          System.out.println(pregunta);
        
        boolean preguntar = true;
        double resultado = 0;
        do{           
            try{
                Scanner sc = new Scanner (System.in);
                resultado = sc.nextDouble();
                preguntar = false;
            }catch(Exception e){
                    
                System.out.println("Por favor introduce un valor correcto. Numeros decimales");
                    
                    }       
        }while(preguntar);
        
        return resultado;
     
    }
    
}
