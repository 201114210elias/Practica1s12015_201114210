/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s2015_201114210;

import javax.swing.JTextArea;

/**
 *

 */
public class Lista {
    Nodo primero;
    Nodo ultimo;
    
    public Lista(){
        primero = null;
        ultimo = null;
    }
    
    public boolean Estavacio(){
        if(primero == null){
            return true;
        }else{
            return false;
        }
    }
    
    public Lista ingreso(String nombre){
        if(Estavacio()){
            Nodo nuevo = new Nodo(nombre);
            primero = nuevo;
            ultimo = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
        }else{
            Nodo nuevo = new Nodo(nombre);
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            primero.anterior = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
        }
        return this;
    }
    
    public Nodo ImprimirSiguiente(Nodo Actual, JTextArea mostrar){
        mostrar.setText(null);
        Nodo actual = Actual;
        actual = actual.siguiente;
        mostrar.setText( actual.nombre);
        return actual;
    }
    
    public Nodo ImprimirAnterior(Nodo Actual, JTextArea mostrar){
        mostrar.setText(null);
        Nodo actual = Actual;
        actual = actual.anterior;
        mostrar.setText(actual.nombre);
        return actual;
    }
}
