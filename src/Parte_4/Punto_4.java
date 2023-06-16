/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author lucho
 */
public class Punto_4 {
    public static void main(String[] args) {
        
        Stack<Integer> person;
        person = new Stack<>();
        //Se agregan los elementos con sus índices
        person.push(8);
        person.push(5);
        person.push(10);
        person.push(3);
        person.push(4);
        person.push(20);
        person.push(1);
        person.push(15);
        person.push(6);
        person.push(7);
        person.push(2);
        person.push(11);
        person.push(9);
        person.push(13);
        person.push(19);
        person.push(14);
        person.push(18);
        person.push(12);
        person.push(17);
        person.push(16);
        System.out.println("Estos son los numeros ya ordenados y sus multiplos: ");
        listaPersonal(person);
        
       
        System.out.println();
        Collections.sort(person);
        //Mostrando el tamaño de la pila
        System.out.println("este es el tamaño de la pila: " + person);
        //verificando si la cola está vacia y en caso que no lo esté dirá falso
        System.out.println("La pila esta vacia? " + person.isEmpty());
        //Eliminando el elemento de la parte superior y devolviendo al que le sigue
        person.pop();
        //Busando un elemento
        System.out.println("Buscando un elemento de la lista: " + person.search(2));
        System.out.println("Se eliminó el numero: " + person.pop() + " y 20");
        //Accediendo a un elemento en la parte superior sin tener que eliminarlo
        System.out.println("Último en ser agregado: " + person.peek());
        System.out.print("Asi queda la lista ahora: " + person);

    }
    
       public static void listaPersonal(List<Integer> person){
        int i=0, e=0;
        while (i++ <20){
            System.out.println(i);
            
            if(i%4==0){
                System.out.println("El numero " +i+ " es multiplo de 4");
            }
            
            if(i%6==0){
                System.out.println("El numero " +i+ " es multiplo de 6");
            }
        }
    }
}
