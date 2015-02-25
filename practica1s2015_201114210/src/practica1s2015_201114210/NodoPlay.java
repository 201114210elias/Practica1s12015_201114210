/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1s2015_201114210;

/**
 *
 * @author Danyela Elias
 */
public class NodoPlay {
     String nombre;
     String punteo;
     String ataque;


    NodoPlay sig;
    NodoPlay ant;
    
    public NodoPlay(String nombre, String ataque, String punteo ){
        
        this.nombre = nombre;
        this.ataque = ataque;
        this.punteo = punteo;
        this.ant = null;
        this.sig = null;
    }
}
