package ejercicio3ed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kisko
 */
public class VehiculoCarga extends VehiculoTransporte
{
    private double carga_maxima;

    /**
     * Constructor por defecto
     */
    public VehiculoCarga() 
    {
        super();
        carga_maxima = 0;
    }
    
    /**
     * Contructor con parametros
     * @param matricula
     * @param duracion_alquiler
     * @param n_plazas
     * @param carga_maxima 
     */
    public VehiculoCarga(String matricula, int duracion_alquiler, int n_plazas, double carga_maxima)
    {
        super(matricula, duracion_alquiler, n_plazas);
        this.carga_maxima=carga_maxima;
    }

    /**
     * Metodos get y set
     * @return 
     */
    public double getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(double carga_maxima) {
        this.carga_maxima = carga_maxima;
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
        System.out.println("Matrícula: " + super.getMatricula() + "\n" + "Duración: " + super.getDuracion_alquiler() + "\n" + "Tara:: " + carga_maxima + "\n" + "Importe: " + this.Alquiler()+ "€");
    }
    
    
    
}
