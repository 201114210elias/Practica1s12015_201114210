/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s2015_201114210;

import javax.swing.JLabel;

/**
 *

 */
public class Lista {
   
    Nodo ultimo;
    Nodo cabeza;
    
    public Lista(){
        
        ultimo = null;
        cabeza = null;
    }
    
    public boolean Estavacio(){
        if(cabeza == null){
            return true;
        }else{
            return false;
        }
    }
    
    
    
        public Lista ingreso(String cabeza){
        
        
        if(Estavacio()){
             Nodo nuevo = new Nodo(cabeza);
            ultimo = nuevo;
            nuevo.arriba = null;
            nuevo.siguiente = null;
            nuevo.anterior = null;
            nuevo.abajo = nuevo;
                        System.out.println("cabecera 1");

        }else{
        Nodo nuevo = new Nodo(cabeza); 
        
            ultimo.siguiente = null;
            ultimo.abajo = nuevo;
            
            nuevo.arriba = nuevo;
            
            nuevo.abajo = nuevo;
            
            
            nuevo.abajo = ultimo;
            
             ultimo = nuevo;
            
           // System.out.println("" +cabeza+cabeza);
               System.out.println("cabecera 2");
        }
        return this;
    }
    
    
    
    /////////////////////////////////
    /////////////////////////////////
    /////////////////////////////////
    public Lista ingreso_jugador(String nombre){
        
        
        if(Estavacio()){
             Nodo nuevo = new Nodo(nombre);
            ultimo.siguiente = nuevo;
            nuevo.arriba = null;
            nuevo.siguiente = nuevo;
            nuevo.anterior = null;
            nuevo.abajo = null;
           // System.out.println("" +nombre+nombre);
            cabeza=nuevo;
             System.out.println("jugador1");
        }else{
        Nodo nuevo = new Nodo(nombre); 
        
            ultimo.siguiente = nuevo;
            ultimo.abajo = null;
            
            nuevo.arriba = null;
            
            nuevo.abajo = null;
            
            
            nuevo.siguiente = ultimo;
            
             ultimo = nuevo;
           // System.out.println("" +nombre+nombre);
               System.out.println("jugador2");
            
        }
        return this;
    }
    
    /////////////////////////////////
    /////////////////////////////////
    /////////////////////////////////
       
    
    
    public Nodo ImprimirSiguiente(Nodo Actual, JLabel mostrar){
        mostrar.setText(null);
        Nodo actual = Actual;
        actual = actual.abajo;
        mostrar.setText( actual.nombre);
        return actual;
    }
   /** 
    public Nodo ImprimirAnterior(Nodo Actual, JLabel mostrar){
        mostrar.setText(null);
        Nodo actual = Actual;
        actual = actual.anterior;
        mostrar.setText(actual.nombre);
        return actual;
    }
    */
}
