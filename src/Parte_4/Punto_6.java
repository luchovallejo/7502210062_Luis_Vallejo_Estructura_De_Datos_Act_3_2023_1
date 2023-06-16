/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_4;

import java.util.Stack;

/**
 *
 * @author lucho
 */
public class Punto_6 {
    public static void main(String[] args) {
        Stack<Object> person;
        person = new Stack<>();
        //Se agregan los elementos con sus índices
        person.push("transaccion de 1.000 pesos");
        person.push("transaccion de 2.000 pesos");
        person.push("transaccion de 30.000 pesos");
        person.push("transaccion de 400.000 pesos");
        person.push("transaccion de 59.000 pesos");
        person.push("transaccion de 6.600 pesos");
        person.push("transaccion de 78.000 pesos");
        person.push("transaccion de 8.300 pesos");
        person.push("transaccion de 921.870 pesos");
        System.out.println("Tener la última transacción bancaria del cliente. \n");
        Object acceder = person.lastElement();
        System.out.println("Numeros de transacciones: ");
        System.out.println("Numero de transacciones en total: " + person.size());
        System.out.println("La " + acceder + " es la mas reciente");
        person.pop();
        System.out.println("La " + person.pop() + " ha sido movida");
        System.out.println("La primera transaccion fue: " + person.firstElement());
        System.out.println();
        while (person.empty()== false){
            System.out.println(person.pop());
        }
        //verificando si la pila está vacia o llena
        System.out.println("La pila esta llena? :" + person.isEmpty());        
    }
    /*
    private Stack<Object> person = new Stack<>();
    */
}
