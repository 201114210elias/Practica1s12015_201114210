
package practica1s2015_201114210;

import javax.swing.JLabel;


public class matriz_campo {
    
    nodo_matriz ultimo;
    nodo_matriz cabeza;
    
    public matriz_campo(){
        
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
    
    
    
        public matriz_campo ingreso(String cabeza){
        
        
        if(Estavacio()){
             nodo_matriz nuevo = new nodo_matriz(cabeza);
            ultimo = nuevo;
            nuevo.arriba = null;
            nuevo.siguiente = null;
            nuevo.anterior = null;
            nuevo.abajo = nuevo;
             System.out.println("cabecera 1");

        }else{
        nodo_matriz nuevo = new nodo_matriz(cabeza); 
        
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
    public matriz_campo ingreso_fila(String nombre){
        
        
        if(Estavacio()){
             nodo_matriz nuevo = new nodo_matriz(nombre);
            ultimo.siguiente = nuevo;
            nuevo.arriba = null;
            nuevo.siguiente = nuevo;
            nuevo.anterior = null;
            nuevo.abajo = null;
           // System.out.println("" +nombre+nombre);
            cabeza=nuevo;
             System.out.println("jugador1");
              System.out.println(nombre);
        }else{
        nodo_matriz nuevo = new nodo_matriz(nombre); 
        
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
       
    
    
    public nodo_matriz ImprimirSiguiente(nodo_matriz Actual, JLabel mostrar){
        mostrar.setText(null);
        nodo_matriz actual = Actual;
        actual = actual.abajo;
        mostrar.setText( actual.nombre);
        return actual;
    }
}
