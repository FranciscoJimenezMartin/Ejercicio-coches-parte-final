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
public class Bus extends VehiculoTransporte
{
    
    /**
     * Constructor por defecto
     */

    public Bus() 
    {
        super();
    }

    /**
     * Contructor por parametros
     * @param matricula
     * @param duracion_alquiler
     * @param n_plazas 
     */
    public Bus(String matricula, int duracion_alquiler, int n_plazas) {
        super(matricula, duracion_alquiler, n_plazas);
    }
    
    /**
     * Método alquiler para saber el precio que tienen que pagar
     * @return 
     */
    @Override
    public double Alquiler ()
    {
        double importe_alquiler = 0;
        importe_alquiler = 1.5 * (super.getDuracion_alquiler()) + (1.5 * (super.getN_plazas())*2) + 50;
        return importe_alquiler;
    }
    
    /**
     * metodo tooString con el recibo
     */
    
     @Override
    public void Recibo ()
    {
        System.out.println("---------------------");
        System.out.println("BUS");
        System.out.println("---------------------");
        System.out.println("Matrícula: " + super.getMatricula() + "\n" + "Duración: " + super.getDuracion_alquiler() + "\n" + "Plazas: " + super.getN_plazas() + "\n" + "Importe: " + this.Alquiler() + "€");
    }
    
    
}
