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
public class Furgoneta extends VehiculoCarga
{
/**
 * Constructor por defecto
 */
    public Furgoneta() 
    {
        super();
    }

    /**
     * 
     * @param matricula
     * @param duracion_alquiler
     * @param n_plazas
     * @param carga_maxima 
     */
    public Furgoneta(String matricula, int duracion_alquiler, int n_plazas, double carga_maxima) {
        super(matricula, duracion_alquiler, n_plazas, carga_maxima);
    }
   
    
    @Override
    public double Alquiler ()
    {
        double importe_alquiler = 0;
        importe_alquiler = 50 * super.getDuracion_alquiler() + 20 * super.getCarga_maxima();
        return importe_alquiler;
    }
    
    @Override
    public void Recibo ()
    {
        System.out.println("Matrícula: " + super.getMatricula() + "\n" + "Duración: " + super.getDuracion_alquiler() + "\n" + "Tara:: " + super.getCarga_maxima() + "\n" + "Importe: " + this.Alquiler()+ "€");
    }
}
