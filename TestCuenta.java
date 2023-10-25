/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentaCorriente;

import java.util.Scanner;

/**
 *
 * @author Miguel de la Rubia
 * Añade al package una clase TestCuenta con el método main en el que se creen al menos dos cuentas. 
 * Crear un menú principal con las siguientes opciones 
 * teniendo presente que con cada operación se debe mostrar el estado actual de todas las cuentas:
Consultar saldo: ha de preguntar la cuenta  y mostrar el saldo que tiene.
Ingresar dinero: ha de preguntar la cuenta e añadir el saldo a la cuenta correspondiente.
Sacar dinero: ha de preguntar la cuenta, el saldo a sacar y mostrar el saldo restante.
Realizar transferencia: ha de sacar el dinero de una cuenta para meterlo en otra.
 */
public class TestCuenta {

    public static void main(String[] args) {
        //Creamos dos nuevas cuentas con las que trabajaremos en el ejercicio  y
        //probaremos el programa
        Cuenta cuenta1 = new Cuenta(1, 2000.0, "Miguel de la Rubia");
        Cuenta cuenta2 = new Cuenta(2, 800.0, "Manolo García");

        Scanner scanner = new Scanner(System.in);
        //Menú que aparece al niciar el programa y nos permite elegir lo que 
        //queramos realizar con las cuentas
        int opcion;
        do {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Realizar transferencia");
            System.out.println("5. Salir");
            
            opcion = Utilidades.pideEntero("Seleccione una opcion");

            switch (opcion) {
                case 1:
                    consultarSaldo(cuenta1, cuenta2);
                    break;
                case 2:
                    ingresarDinero(cuenta1, cuenta2);
                    break;
                case 3:
                    sacarDinero(cuenta1, cuenta2);
                    break;
                case 4:
                    transferirDinero(cuenta1, cuenta2);
                case 5 :
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }

    public static void consultarSaldo( Cuenta cuenta1, Cuenta cuenta2) {
        System.out.print("Ingrese el numero de cuenta: ");
        int numeroCuenta = Utilidades.pideEntero("");//usamos la funcion pideEntero de la clase Utilidades 

        if (numeroCuenta == cuenta1.getNumeroCuenta()) {
            System.out.println("El saldo de la cuenta " + cuenta1.getNumeroCuenta() + " es " + cuenta1.getSaldo());
        } else if (numeroCuenta == cuenta2.getNumeroCuenta()) {
            System.out.println("El saldo de la cuenta " + cuenta2.getNumeroCuenta() + " es " + cuenta2.getSaldo());
        } else {
            System.out.println("Cuenta invalida.");
        }
    }
    public static void ingresarDinero(Cuenta cuenta1, Cuenta cuenta2) {
        System.out.print("Ingrese el numero de cuenta: ");
        int numeroCuenta = Utilidades.pideEntero("");//usamos la funcion pideEntero de la clase Utilidades 

        if (numeroCuenta == cuenta1.getNumeroCuenta()) {
            double cantidad = Utilidades.pideDouble("Ingrese la cantidad a ingresar: ");
            cuenta1.setSaldo(cuenta1.getSaldo() + cantidad);
            System.out.println("Se ha ingresado " + cantidad + " a la cuenta " + cuenta1.getNumeroCuenta() + ".");
            System.out.println("El saldo de la cuenta:  "+ cuenta1.getNumeroCuenta() + " es: " + cuenta1.getSaldo());
        } else if (numeroCuenta == cuenta2.getNumeroCuenta()) {
            double cantidad = Utilidades.pideDouble("Ingrese la cantidad a ingresar: ");
            cuenta2.setSaldo(cuenta2.getSaldo() + cantidad);
            System.out.println("Se ha ingresado " + cantidad + " a la cuenta " + cuenta2.getNumeroCuenta() + ".");
        } else {
            System.out.println("Cuenta invalida.");
        }
        //al finalizar la función muestra el saldo actual de las dos cuentas
        System.out.println("El saldo de la cuenta " + cuenta1.getNumeroCuenta() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de la cuenta " + cuenta2.getNumeroCuenta() + " es: " + cuenta2.getSaldo());
    }
    public static void sacarDinero(Cuenta cuenta1, Cuenta cuenta2) {
       System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = Utilidades.pideEntero("");//usamos la funcion pideEntero de la clase Utilidades 
        Cuenta cuenta;
        if (numeroCuenta == cuenta1.getNumeroCuenta()) {
            cuenta = cuenta1;
        } else if (numeroCuenta == cuenta2.getNumeroCuenta()) {
            cuenta = cuenta2;
        } else {
            System.out.println("Cuenta inválida.");
            return;
        }
        double cantidad = Utilidades.pideDouble("Ingrese la cantidad a retirar: ");//usamos la funcion pideDouble de la clase Utilidades 
        
        //mediante un if/else controlamos que haya la cantidad suficiente en la cuenta de la que queremos retirar dinero. Si hay la cantidad 
        //realiza la resta, si no la hay muestra un mensaje y retorna
        if (cuenta.getSaldo() >= cantidad) {
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            System.out.println("Se ha retirado " + cantidad + " de la cuenta " + cuenta.getNumeroCuenta() + ".");
        } else {
            System.out.println("No hay suficiente saldo en la cuenta " + cuenta.getNumeroCuenta() + ".");
        }
        //al finalizar la función muestra el saldo actual de las dos cuentas
        System.out.println("El saldo de la cuenta " + cuenta1.getNumeroCuenta() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de la cuenta " + cuenta2.getNumeroCuenta() + " es: " + cuenta2.getSaldo());
      
    }
    
    public static void transferirDinero(Cuenta cuenta1, Cuenta cuenta2) {
        
        //En esta funcion debemos crear dos variables distinas de tipo int:  numeroCuentaOrigen 
        //y numeroCuentaDestino para poder realizar las transferencias de una cuenta a otra
        System.out.print("Ingrese el número de cuenta de origen: ");
        int numeroCuentaOrigen = Utilidades.pideEntero("");//usamos la funcion pideEntero de la clase Utilidades 
        Cuenta cuentaOrigen;
        if (numeroCuentaOrigen == cuenta1.getNumeroCuenta()) {
            cuentaOrigen = cuenta1;
        } else if (numeroCuentaOrigen == cuenta2.getNumeroCuenta()) {
            cuentaOrigen = cuenta2;
        } else {
            System.out.println("Cuenta de origen inválida.");
            return;
        }

        System.out.print("Ingrese el número de cuenta de destino: ");
        int numeroCuentaDestino = Utilidades.pideEntero("");//usamos la funcion pideEntero de la clase Utilidades 
        Cuenta cuentaDestino;
        if (numeroCuentaDestino == cuenta1.getNumeroCuenta()) {
            cuentaDestino = cuenta1;
        } else if (numeroCuentaDestino == cuenta2.getNumeroCuenta()) {
            cuentaDestino = cuenta2;
        } else {
            System.out.println("Cuenta de destino inválida.");
            return;
        }
        
        //no podemos transferir dinero en la misma cuenta de origen y destino, solucionamos este problema mediante un if
        if (cuentaOrigen == cuentaDestino) {
            System.out.println("No se puede transferir dinero en la misma cuenta.");
            return;
        }

        double cantidad = Utilidades.pideDouble("Ingrese la cantidad a transferir: ");//usamos la funcion pideDouble de la clase Utilidades 
        if (cuentaOrigen.getSaldo() >= cantidad) {
            //llamando a setSaldo podemos cambiar el valor realizando la resta de la cantidad en la variable getSaldo
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - cantidad);
            //llamando a setSaldo podemos cambiar el valor realizando la suma de la cantidad en la variable getSaldo
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + cantidad);
            System.out.println("Se ha transferido " + cantidad + " de la cuenta " + cuentaOrigen.getNumeroCuenta() + " a la cuenta " + cuentaDestino.getNumeroCuenta() + ".");
        } else {
            System.out.println("No hay suficiente saldo en la cuenta " + cuentaOrigen.getNumeroCuenta() + ".");
            return;
        }
        //al finalizar la función muestra el saldo actual de las dos cuentas
        System.out.println("El saldo de la cuenta " + cuenta1.getNumeroCuenta() + " es: " + cuenta1.getSaldo());
        System.out.println("El saldo de la cuenta " + cuenta2.getNumeroCuenta() + " es: " + cuenta2.getSaldo());
    }
}
    

