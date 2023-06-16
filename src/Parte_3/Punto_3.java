/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_3;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author lucho
 */

/*
Tome como base los 2 escenarios que ha descrito como ejemplos de Colas 
en el punto (12) de la primera parte de esta actividad, y realice un programa 
para cada por cada uno de estos escenarios, este programa debe utilizar la 
Cola cola FIFO y la Cola LIFO que ha desarrollado en los puntos (1) y (2) de 
esta tercera parte de la actividad
*/
public class Punto_3 {
    //Escenarios con cola FIFO
    public static void main(String[] args) {
        Punto_3 person = new Punto_3();
        // Escenario 1: Ejemplo cola FIFO de un restaurante de clientes premium y no premium.
        person.offer("Cliente Premium");
        person.offer("Cliente Premium");
        person.offer("Cliente Premium");
        person.offer("Cliente Premium");
        person.offer("Cliente NO Premium");
        person.offer("Cliente NO Premium");
        person.offer("Cliente NO Premium");
        person.offer("Cliente NO Premium");
        person.offer("Cliente NO Premium");
        person.offer("Cliente Regular");
        person.offer("Cliente Regular");
        person.offer("Cliente Regular");
        person.offer("Cliente Regular");
        person.offer("Cliente Pobre");
        person.offer("Cliente Cachon");
        System.out.println("Restaurante de clientes premium y no premium. \n");
        System.out.println("Grupo de clientes Premium en pasar: ");
        System.out.println(person.poll() + " 1");
        System.out.println(person.poll() + " 2");
        System.out.println(person.poll() + " 3");
        System.out.println(person.poll() + " 4");
        System.out.println();
        System.out.println("Grupo de clientes NO Premium: ");
        System.out.println("Quinto cliente en ser atentido: " + person.poll());
        System.out.println("Sexto cliente en ser atentido: " + person.poll());
        System.out.println("Septimo cliente en ser atentido: " + person.peek());
        System.out.println("Octavo cliente en ser atentido: " + person.peek());
        System.out.println("Noveno cliente en ser atentido: " + person.peek());
        
        System.out.println();
        Object quitado = person.poll();
        System.out.println("Elemento removido de la cola: " + quitado);
        System.out.println("El siguiente elemento que le sigue despues del anterior es: " + person.poll());
          
        // Peek - Acceder al elemento en la parte superior de la cola sin eliminarlo
        Object acceder = person.peek();
         System.out.println("Elemento accedido sin ser eliminado es: " + acceder);
                  
        /*
        for(Object l : person.person){
            System.out.println(l );
        }*/

    }
    private LinkedList<Object> person = new LinkedList<>();
    public void offer(Object o){
        person.add(o);
    }
    public Object peek(){
        if(!(person.isEmpty())){
            return person.get(0);
        }else{
            return null;
        }
    }
    
    public Object poll(){
        if(!(person.isEmpty())){
            Object o = person.get(0);
            person.remove(0);
            return o;
        }else{
        return null;
        } 
    } 
}
