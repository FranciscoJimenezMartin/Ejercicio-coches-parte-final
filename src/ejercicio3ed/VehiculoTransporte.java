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
public class VehiculoTransporte extends Vehiculo
{
    private int n_plazas;
    
    /**
     * Constructor por defecto
     */
    public VehiculoTransporte()
    {
        super();
        n_plazas = 0;
    }
    
    /**
     * Constructor por parametros
     * @param matricula
     * @param duracion_alquiler
     * @param n_plazas 
     */
    public VehiculoTransporte(String matricula, int duracion_alquiler, int n_plazas)
    {
        super(matricula, duracion_alquiler);
        this.n_plazas= n_plazas;
    }

    /**
     * Metodos get y set
     * @return 
     */
    public int getN_plazas() {
        return n_plazas;
    }

    public void setN_plazas(int n_plazas) {
        this.n_plazas = n_plazas;
    }
    
    /**
     * Metodo alquiler
     * @return 
     */
    @Override
    public double Alquiler ()
    {
        double importe_alquiler = 0;
        
        return importe_alquiler;
    }
    
    /**
     * Metodo alquiler para saber el precio que hay que pagar
     */
    @Override
    public void Recibo ()
    {
        System.out.println("Matrícula: " + super.getMatricula() + "\n" + "Duración: " + super.getDuracion_alquiler() + "\n" + "Plazas: " + n_plazas + "\n" + "Importe: " + this.Alquiler() + "€");
    }
    
}
