
package com.mycompany.pooe47clasesabstractas;

/**
 *
 * @author melis
 */
public class Gato extends Felino {
    
    @Override
    public String getSonido() {
       return "Maullido";
    }
    
    @Override
    public String getAlimentos() {
        return "Ratones";
    }
    
    @Override
    public String getHabitat() {
        return "Doméstico";
    }
  
    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
    
    
}
