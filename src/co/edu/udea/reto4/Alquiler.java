package co.edu.udea.reto4;

import java.time.*;
import java.time.temporal.ChronoUnit;

/*Hecho por: Samuel Acevedo(CC.1001016099)
             Efraín García(CC.1001370984)
*/


public class Alquiler{
    private final int idVehiculo;
    private final LocalDateTime inicioAlquiler;
    private LocalDateTime finAlquiler;
    private final String tipoDocumento;
    private final String numDocumento;
    private final String nombreCompleto;
    private int valorPagar;
    private String descripcionUso;

    public Alquiler(int idVehiculo,String tipoDocumento,String numDocumento, String nombreCompleto){
        this.idVehiculo=idVehiculo;
        inicioAlquiler = LocalDateTime.now();
        this.numDocumento = numDocumento;
        this.nombreCompleto = nombreCompleto;
        this.tipoDocumento = tipoDocumento;
    }

    public void setFinAlquiler(String finAlquiler) {
        this.finAlquiler = LocalDateTime.parse(finAlquiler);
    }

    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }

    public LocalDateTime getInicioAlquiler() {
        return inicioAlquiler;
    }
    public LocalDateTime getFinAlquiler() {
        return finAlquiler;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDescripcionUso() {
        return descripcionUso;
    }
    public long horasAlquilado(){
        return ChronoUnit.HOURS.between(inicioAlquiler,finAlquiler);
    }
    public float totalPagar(){
        return horasAlquilado()*valorPagar;
    }
    public int getIdVehiculo() {
        return idVehiculo;
    }
    public void setValorPagar(int valorPagar) {
        this.valorPagar = valorPagar;
    }
    public void informacionAlquiler(){
        System.out.println("-------------------------------------------");
        System.out.println("id: "+getIdVehiculo());
        System.out.println();
        System.out.println("Informacion del arrendatario");
        System.out.println("Nombre: "+getNombreCompleto());
        System.out.println("Tipo de documento: "+getTipoDocumento());
        System.out.println("Numero de documento: "+getNumDocumento());
        System.out.println();
        System.out.println("Inicio del alquiler: "+getInicioAlquiler());
        System.out.println("Fin del alquiler: "+getFinAlquiler());
        System.out.println("Descripcion de uso: "+getDescripcionUso());
        System.out.println("Total Alquiler: "+totalPagar());
        System.out.println("-------------------------------------------");
    }
}
