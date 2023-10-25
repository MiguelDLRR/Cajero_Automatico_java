/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentaCorriente;

/**
 *
 * @author Miguel de la Rubia
 * Añade al package una clase Cuenta, que tendrán los siguientes atributos: un número de cuenta que las identifica, un saldo, y el nombre del titular. La clase debe incorporar un constructor que reciba como parámetros todos los atributos. Implementar, además, los métodos siguientes:
getNumeroCuenta. Devuelve el número de la cuenta.
getSaldo. Devuelve el saldo de la cuenta.
getTitular. Devuelve el nombre del titular de la cuenta.
setSaldo. Establece el saldo de la cuenta.
setTitular. Establece el nombre del titular de la cuenta.
 

 */
public class Cuenta { //creamos una clase llamada Cuenta donde indicamos los 
    //atributos para la creacion de una cuenta
    
    private int numeroCuenta;
    private double saldo;
    private String titular;
    //a continuacion creamos los contructores de la clase Cuenta con sus Getters y 
    //sus Setters para poder tener acceso a los atributos desde cualquier clase 
    //del proyecto y así poder modificarlos si es necesario   
    public Cuenta(int numeroCuenta, double saldo, String titular){
    
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
            this.titular = titular;         
    }
    
    public int getNumeroCuenta(){
        
        return numeroCuenta;
    }
    
    public double getSaldo(){
        
        return saldo;
    }
    
    public String getTitular(){
        
        return titular;
    }
    
    public void setSaldo(double saldo){
        
        this.saldo = saldo;
    }
    
    public void setTitular(String titular){
        
        this.titular = titular;
    }
    
}
