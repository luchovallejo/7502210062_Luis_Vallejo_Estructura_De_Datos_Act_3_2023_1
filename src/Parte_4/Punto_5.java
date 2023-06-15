/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class Punto_5 {
    public static void main(String[] args) {        
        LinkedList<Integer> person;
        person = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        person.add(8);
        person.add(5);
        person.add(10);
        person.add(3);
        person.add(4);
        person.add(20);
        person.add(1);
        person.add(15);
        person.add(6);
        person.add(7);
        person.add(2);
        person.add(11);
        person.add(9);
        person.add(13);
        person.add(19);
        person.add(14);
        person.add(18);
        person.add(12);
        person.add(17);
        person.add(16);
        
        System.out.println("Estos son los numeros ya ordenados y sus multiplos: ");
        listaPersonal((List<Integer>) person);
        LinkedList<Object> pila = new LinkedList<>();
        System.out.print("Estos son todos los elementos en la pila: " + person);
        System.out.println();
        
        
        System.out.println("Tamaño de la pila: " + person.size());
        
        String lista = scanner.nextLine();
        while (!lista.equals("para")) {
            person.addFirst(person.removeFirst());
            person.addFirst(person.size());
            lista = scanner.nextLine();
        }
          
        System.out.println("Elementos de la pila con el numeros agregado: " + person);
          
        // Pop - Eliminar y devolver el elemento en la parte superior de la pila
        int quitado = person.removeFirst();
        System.out.println("Elemento removido de la pila: " + quitado);
        System.out.println("El siguiente elemento que le sigue despues del anterior es: " + person);
          
        // Peek - Acceder al elemento en la parte superior de la pila sin eliminarlo
        Integer acceder = person.peek();
         System.out.println("Elemento accedido sin ser eliminado es: " + acceder);
          
        // IsEmpty - Verificar si la pila está vacía
        boolean llenaOvacia = person.isEmpty();
        System.out.println("La pila esta o no vacia? " + llenaOvacia);
        
        System.out.println("Tamaño de la pila después de remover todos los elementos: " + person.size());

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
