/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s2015_201114210;

import javax.swing.JLabel;

/**
 *
 * @author Danyela Elias
 */
public class Lista_personajes {
    NodoPlay primero2;
    NodoPlay ultimo2;
    
    public Lista_personajes(){
        primero2 = null;
        ultimo2 = null;
    }
    
    public boolean Estavacio2(){
        if(primero2 == null){
            return true;
        }else{
            return false;
        }
    }
    
    //+
    public Lista_personajes ingresar(String nombre,String puntos, String ataque){
        if(Estavacio2()){
            NodoPlay nuevo2 = new NodoPlay(nombre,puntos,ataque);
            primero2 = nuevo2;
            ultimo2 = nuevo2;
            nuevo2.sig = nuevo2;
            System.out.println(nuevo2);
            nuevo2.ant = null;
            
            
            
        }else{
           NodoPlay nuevo2 = new NodoPlay(nombre,puntos,ataque);
            ultimo2.sig = nuevo2;
            nuevo2.ant = ultimo2;
            primero2.ant = nuevo2;
            nuevo2.sig = primero2;
            ultimo2 = nuevo2;
            
            System.out.println(nuevo2+"hola");
        }
        return this;
    }
    
    public NodoPlay ImprimirNext(NodoPlay Actual2, JLabel mostrar2){
        mostrar2.setText(null);
        NodoPlay actual2 = Actual2;
        actual2 = actual2.sig;
        mostrar2.setText(actual2.nombre  );
        return actual2;
    }
    
    public NodoPlay ImprimirAnterior(NodoPlay Actual, JLabel mostrar){
        mostrar.setText(null);
        NodoPlay actual = Actual;
        actual = actual.ant;
        mostrar.setText( actual.nombre );
       return actual;
    }
}
