# Cajero_Automatico_java
Proyecto creación Cajero Automático con diversas funcionalidades

OBJETIVOS
- Crear clases e instanciar objetos.
- Definir atributos y métodos.
- Crear y utilizar constructores.
- Utilizar los atributos y los métodos de los objetos.
- Crear y utilizar clases heredadas, interfaces y clases abstractas.
- Crear y utilizar atributos estáticos.
- Crear clases heredadas que sobrecarguen la implementación de métodos de la superclase.
- Realizar programas que implementen y utilicen jerarquías de clases.

1 Crear un package "cuentaCorriente" con una clase llamada "Utilidades" que contendrá dos métodos para pedir datos al usuario:
  - pedirEntero. Recibe una pregunta como parámetro, la muestra por consola y pide un dato
    al usuario hasta que el usuario introduzca un valor entero válido.
  - pedirDecimal. Recibe una pregunta como parámetro, la muestra por consola y pide un
    dato al usuario hasta que el usuario introduzca un valor doble válido.

2 Añade al package una clase Cuenta, que tendrán los siguientes atributos: un número de
cuenta que las identifica, un saldo, y el nombre del titular. La clase debe incorporar un
constructor que reciba como parámetros todos los atributos. Implementar, además, los
métodos siguientes:   
  - getNumeroCuenta. Devuelve el número de la cuenta.
  - getSaldo. Devuelve el saldo de la cuenta.
  - getTitular. Devuelve el nombre del titular de la cuenta.
  - setSaldo. Establece el saldo de la cuenta.
  - setTitular. Establece el nombre del titular de la cuenta.
Se deberán utilizar las funciones pedirEntero y pedirDecimal definidas en la clase Utilidades siempre
que se quiera pedir un valor entero o un valor doble.

3 Añade al package una clase TestCuenta con el método main en el que se creen al menos dos
cuentas. Crear un menú principal con las siguientes opciones teniendo presente que con cada
operación se debe mostrar el estado actual de todas las cuentas:
  - Consultar saldo: ha de preguntar la cuenta y mostrar el saldo que tiene.
  - Ingresar dinero: ha de preguntar la cuenta y añadir el saldo a la cuenta correspondiente.
  - Sacar dinero: ha de preguntar la cuenta, el saldo a sacar y mostrar el saldo restante.
  - Realizar transferencia: ha de sacar el dinero de una cuenta para meterlo en otra.


