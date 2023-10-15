
package com.mycompany.pooe81;
import java.util.*;

public class ListaPersonas {
    Vector listaPersonas; // Atributo que identifica un vector de personas
/**
* Constructor de la clase ListaPersonas
*/
    public ListaPersonas() {
        listaPersonas = new Vector(); // Crea el vector de personas
    }
  
    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    } 
    
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}
