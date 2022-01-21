package co.edu.udea.reto4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*Hecho por: Samuel Acevedo(CC.1001016099)
             Efraín García(CC.1001370984)
*/

public class Seguro{

    private final int idVehiculo;
    private final String nombreEmpresa;
    private LocalDate inicioCobertura;
    private LocalDate finCobertura;
    private final String descripcion;

    public Seguro(int idVehiculo,String nombreEmpresa,String descripcion){
        this.idVehiculo = idVehiculo;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
    }


    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFinCobertura() {
        return finCobertura;
    }

    public void setFinCobertura(LocalDate finCobertura) {
        this.finCobertura = finCobertura;
    }

    public LocalDate getInicioCobertura() {
        return inicioCobertura;
    }

    public void setInicioCobertura(LocalDate inicioCobertura) {
        this.inicioCobertura = inicioCobertura;
    }

    public long numeroDias(){
        return ChronoUnit.DAYS.between(inicioCobertura,finCobertura);
    }
    public void informacionSeguro(){
        System.out.println("-------------------------------------------");
        System.out.println("id: "+getIdVehiculo());
        System.out.println("Empresa aseguradora: "+getNombreEmpresa());
        System.out.println("Inicio cobertura: "+getInicioCobertura());
        System.out.println("Fin cobertura: "+getFinCobertura());
        System.out.println("Descripcion del seguro: "+getDescripcion());
        System.out.println("-------------------------------------------");
    }
}
