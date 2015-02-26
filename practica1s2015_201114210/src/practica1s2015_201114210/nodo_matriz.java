package practica1s2015_201114210;
public class nodo_matriz {
     String nombre, nom;

     nodo_matriz siguiente;
     nodo_matriz anterior;
     nodo_matriz arriba;
     nodo_matriz abajo;
    
    public nodo_matriz(String nombre ){
        
        this.nombre = nombre;
        
        this.anterior = null;
        this.siguiente = null;
        this.arriba = null;
        this.abajo = null;
    }
}
