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
public class ListaSimple 
{   

   
    /* Lista Simple que mantiene referencias al PRIMERO y al ULTIMO nodo de
    la lista.  Ejercicio pendiente: programar sin referencia al ULTIMO nodo */
    Nodo primero;

   
    Nodo ultimo;    
    //Nodo Ayudante;

    public ListaSimple()
    {
        primero=ultimo=null;
    }


    public String verDatosLista ()
    {
        String salida="";
                      
	Nodo n;
	n = primero;
	while (n != null)
	{
	    salida=salida + n.dato + "->";
	    n = n.siguiente;
	}
	salida+="null\n";
        return salida;   
    }

    
    public void verLista ()
    {
        String salida="";
                      
	Nodo n;
	n = primero;
	while (n != null)
	{
	    salida=salida + n.dato + "->";
	    n = n.siguiente;
	}
	salida+="null\n";
        System.out.println (salida);   
    }
    
    
    /* Devuelve la referencia al nodo en el que se encuentra el valor destino,
    en caso de no encontrarlo devuelve null*/
    public Nodo buscarElemento (int destino)
    {
	for (Nodo indice = primero ; indice != null ; indice = indice.siguiente)
	    if (destino == indice.dato)
		return indice;
	return null;
    }

    
    /*Inserta un nuevo nodo después de un dato. Requiere como parámetros
    el valor después del cual se insertará el nvoValor*/
    public void insertarEnMedio(int destino, int nvoValor)
    {
     Nodo p = buscarElemento(destino);
     if ( p != null)
     {
        Nodo nuevo = new Nodo (nvoValor);
        nuevo.siguiente=p.siguiente;
        p.siguiente=nuevo;
     }
     else
        System.out.println("No se pudo insertar el nodo...no se encontro su antecesor...");
   }

    
    /*Inserta un nuevo nodo como el último de la lista */
    public void insertarFinal (int num)
    {
        Nodo nuevo;
        nuevo = new Nodo (num);
	if (primero == null)
	{
	   primero = ultimo = nuevo;
	}
	else
	{
	    ultimo.siguiente = nuevo;
	    ultimo = ultimo.siguiente;
	}
    }


    /* Inserta un nuevo nodo como el primer nodo de la lista */
    public void insertarInicio (int num)
    {
        Nodo nuevo;
        nuevo = new Nodo (num);
	nuevo.siguiente = primero;
        if (primero==null) ultimo=nuevo;
	primero = nuevo;
    }
    

    public boolean eliminar (int entrada)
    {
	Nodo actual;
        Nodo anterior;
	boolean encontrado;
	actual = primero;
	anterior = null;
	encontrado = false;
    
        //búsqueda del nodo a eliminar y del anterior.
	while ((actual != null) && (!encontrado))
	{
	    encontrado = (actual.dato == entrada);
	    if (!encontrado)
	    {
		anterior = actual;
		actual = actual.siguiente;
	    }
	}
        //Enlaza del nodo anterior con el siguiente. Distingue entre  que el 
        //nodo sea el primero de la lista u otro del resto de la lista.
	if (actual != null)
	{
	    if (actual == primero)
	    {
               primero = actual.siguiente;
	    }
	    else
	    {
		anterior.siguiente = actual.siguiente;
	    }
            return true;
	}
        else
            return false;
        }  
        
}