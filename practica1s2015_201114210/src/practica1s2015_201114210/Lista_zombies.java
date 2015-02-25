package practica1s2015_201114210;

import javax.swing.JLabel;

/**
 *
 * @author Danyela Elias
 */
public class Lista_zombies {
      Nodo_zombies primero3;
    Nodo_zombies ultimo3;
    
    public Lista_zombies(){
        primero3 = null;
        ultimo3 = null;
    }
    
    public boolean Estavacio3(){
        if(primero3 == null){
            return true;
        }else{
            return false;
        }
    }
    
    //+
    public Lista_zombies ingresar(String nombre,String puntos, String ataque){
        if(Estavacio3()){
            Nodo_zombies nuevo3 = new Nodo_zombies(nombre,puntos,ataque);
            primero3 = nuevo3;
            ultimo3 = nuevo3;
            nuevo3.sig = nuevo3;
            System.out.println(nuevo3);
            nuevo3.ant = null;
            
            
            
        }else{
           Nodo_zombies nuevo3 = new Nodo_zombies(nombre,puntos,ataque);
            ultimo3.sig = nuevo3;
            nuevo3.ant = ultimo3;
            primero3.ant = nuevo3;
            nuevo3.sig = primero3;
            ultimo3 = nuevo3;
            
            System.out.println(nuevo3+"hola");
        }
        return this;
    }
    
    public Nodo_zombies ImprimirNext(Nodo_zombies Actual3, JLabel mostrar3){
        mostrar3.setText(null);
        Nodo_zombies actual3 = Actual3;
        actual3 = actual3.sig;
        mostrar3.setText(actual3.nombre  );
        return actual3;
    }
    
    public Nodo_zombies ImprimirAnterior(Nodo_zombies Actual, JLabel mostrar){
        mostrar.setText(null);
        Nodo_zombies actual = Actual;
        actual = actual.ant;
        mostrar.setText( actual.nombre );
       return actual;
    }
    
}
