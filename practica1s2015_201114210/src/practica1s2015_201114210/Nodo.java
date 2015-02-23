/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s2015_201114210;

/**

 */
public class Nodo {
    String nombre;

    Nodo siguiente;
    Nodo anterior;
    
    public Nodo(String nombre){
        this.nombre = nombre;

        this.anterior = null;
        this.siguiente = null;
    }
}
