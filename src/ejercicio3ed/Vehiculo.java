/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3ed;

/**
 *
 * @author kisko
 */
public class Vehiculo 
{
    
    private String matricula;
    private int duracion_alquiler;
    
    /**
     * Constructor por defecto
     */
    public Vehiculo ()
    {
        matricula = "";
        duracion_alquiler = 0;
    }
    
    /**
     * Constructor con parametros
     * @param matricula
     * @param duracion_alquiler 
     */
    
    public Vehiculo(String matricula, int duracion_alquiler) 
    {
        this.matricula = matricula;
        this.duracion_alquiler = duracion_alquiler;
    }

    /**
     * Metodos get y set
     * @return 
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDuracion_alquiler() {
        return duracion_alquiler;
    }

    public void setDuracion_alquiler(int duracion_alquiler) {
        this.duracion_alquiler = duracion_alquiler;
    }
    
    /**
     * Metodo alquiler 
     * @return 
     */
    public double Alquiler ()
    {
        double importe_alquiler = 0;
        
        return importe_alquiler;
    }

    /**
     * Metodo alquiler para saber el precio que hay que pagar
     */
    public void Recibo ()
    {
        System.out.println("La matricula del vehiculo es: " + matricula);
        System.out.println("La duración del alquiler es: " + duracion_alquiler);
        System.out.println("El importe del alquiler es: " +this.Alquiler());
        
    }
    
    
    
    
    
    
    
}
