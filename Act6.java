package act6;

public class Act6 {

    public static void main(String[] args) {
        ListaSimple lista1=new ListaSimple();
        lista1.insertarInicio(1);
        lista1.insertarFinal(2);
        lista1.insertarFinal(3);
        lista1.insertarFinal(4);
        lista1.insertarFinal(5);
        lista1.insertarFinal(6);
        lista1.insertarFinal(10);
        System.out.println(lista1.verDatosLista());
        lista1.insertarInicio(0);
        lista1.verLista();
        if(lista1.eliminar(5)==true){System.out.println("La operación fue llevada con éxito");}else{System.out.println("No fue posible eliminar ya que que el elemento no se encontraba en la lista");}
        lista1.insertarEnMedio(3, 8);
        lista1.verLista(); 
        lista1.insertarEnMedio(5, 7);
        lista1.verLista();
        if(lista1.eliminar(10)==true){System.out.println("La operación fue llevada con éxito");}else{System.out.println("No fue posible eliminar ya que que el elemento no se encontraba en la lista");}
        System.out.println(lista1.verDatosLista());
    }
}