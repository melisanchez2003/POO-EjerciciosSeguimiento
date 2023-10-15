
package CarreraCiclistica;


public class Contrarrelojista extends Ciclista{
    
    private double velocidadMaxima;
    
    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima){
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    
    protected double getvelocidadMaxima(){
        return velocidadMaxima;
    }
    
    protected void setvelocidadMaxima(double velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
    
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleración promedio =" + velocidadMaxima);
    }
   
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    } 
}


