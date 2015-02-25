/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s2015_201114210;

/**

 */
public class Nodo {
    String nombre, nom;

    Nodo siguiente;
    Nodo anterior;
    Nodo arriba;
    Nodo abajo;
    
    public Nodo(String nombre ){
        
        this.nombre = nombre;
        
        this.anterior = null;
        this.siguiente = null;
        this.arriba = null;
        this.abajo = null;
    }
}
