/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act6;

/**
 *
 * @author pedro
 */
public class Nodo{
        int dato;
        Nodo siguiente;

        public Nodo (int x)
        {
            dato = x;
            siguiente = null;
        }

        public Nodo (int x, Nodo n)
        {
            dato = x;
            siguiente = n;
        }
    
        public int getDato()
        {    
        return dato;
        }
        
        public Nodo getSiguiente()
        {    
        return siguiente;
        }
        
        public void setSiguiente(Nodo siguiente)
        {    
        this.siguiente= siguiente;
        }
}
