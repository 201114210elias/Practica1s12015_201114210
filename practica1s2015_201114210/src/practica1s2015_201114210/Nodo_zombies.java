package practica1s2015_201114210;

public class Nodo_zombies {
   
     String nombre;
     String punteo;
     String ataque;


    Nodo_zombies sig;
    Nodo_zombies ant;
    
    public Nodo_zombies(String nombre, String ataque, String punteo ){
        
        this.nombre = nombre;
        this.ataque = ataque;
        this.punteo = punteo;
        this.ant = null;
        this.sig = null;
    
}
}
