package co.edu.udea.reto4;

import java.time.LocalDate;

/*Hecho por: Samuel Acevedo(CC.1001016099)
             Efraín García(CC.1001370984)
*/


public class Vehiculo {

     private final int id;
     private final String placa;
     private final String tipodeVehiculo;
     private final String nombreModelo;
     private final int fechaModelo;
     private final int precioHora;
     private final String descripcion;

     public Vehiculo(int id, String placa,String tipodeVehiculo,String nombreModelo, int fechaModelo,int precioHora, String descripcion){
          this.id = id;
          this.placa=placa;
          this.tipodeVehiculo=tipodeVehiculo;
          this.nombreModelo=nombreModelo;
          this.fechaModelo=fechaModelo;
          this.precioHora = precioHora;
          this.descripcion=descripcion;
     }

    public void informacionVehiculo(){
        System.out.println("-------------------------------------------");
        System.out.println("id:"+getId());
        System.out.println("Modelo: "+getNombreModelo());
        System.out.println("Fecha Modelo: "+getFechaModelo());
        System.out.println("Tipo Vehiculo: "+getTipodeVehiculo());
        System.out.println("Placa: "+getPlaca());
        System.out.println("Antiguedad: "+antiguedad());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Precio por hora: "+getPrecioHora());
        System.out.println("-------------------------------------------");

    }




    public String antiguedad() {
          int anhoenCurso = LocalDate.now().getYear();
          int diferenciaAnho = anhoenCurso-fechaModelo;

          if(diferenciaAnho<=1) {
               return "Nuevo";
          }else if(diferenciaAnho>=5){
               return "Usado";
          }else{
               return "Medianamente usado";
          }
     }

    public int getPrecioHora() {
          return precioHora;
     }
    public int getId() {
          return id;
     }

    public String getNombreModelo() {
        return nombreModelo;
    }
    public int getFechaModelo() {
        return fechaModelo;
    }
    public String getTipodeVehiculo() {
        return tipodeVehiculo;
    }
    public String getPlaca() {
        return placa;
    }
    public String getDescripcion() {
        return descripcion;
    }
}

