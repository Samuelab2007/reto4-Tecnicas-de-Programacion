package co.edu.udea.reto4;

import java.util.Scanner;

/*Hecho por: Samuel Acevedo(CC.1001016099)
             Efraín García(CC.1001370984)
*/
public class codigoPrincipal {

    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args){
        Vehiculo carro1 = new Vehiculo(0,"DHT165","Automóvil","Renault logan",2006,3500,"Automóvil para 5 personas, espacio en baúl");
        Vehiculo carro2 = new Vehiculo(1,"GKP667", "Automóvil", "Hyundai Kona EV", 2020,8000,"Vehiculo 100% eléctrico, 5 puertas, 204 caballos de potencia y una autonomía de 484 kilómetros ");
        Vehiculo bicicleta = new Vehiculo(2,"No aplica","Bicicleta de transporte","Specialized turbo vado 4.0 EQ",2020,3800,"Para transporte habitual por la ciudad, con batería, luces y conectividad");
        Vehiculo moto1 = new Vehiculo(3,"VLH34D","Motocicleta","Super Soco TC Max",2021,6000,"Moto 100% eléctrica, velocidad maxima de 100km/h con 130 km de autonomía");
        Vehiculo moto2 = new Vehiculo(4,"ASD12F","Motocicleta","Super Soco TC Max",2021,6000,"Moto 100% eléctrica, velocidad maxima de 100km/h con 130 km de autonomía");

        Vehiculo[] Vehiculos = {carro1,carro2,bicicleta,moto1,moto2};
        System.out.println("Bienvenido a Renta Ya!");
        System.out.println("Vehiculos disponibles para alquiler");

        for(Vehiculo elemento: Vehiculos){
            elemento.informacionVehiculo();
        }

        System.out.print("Escriba el id del vehiculo que quiere alquilar: ");
        int info = lector.nextInt();

        if(info>4 || info<0){
            System.out.print("Ese id no existe, ingrese un id valido: ");
            info = lector.nextInt();
        }


        System.out.println("Ingrese los siguientes datos ");
        System.out.print("Tipo de Documento(CC, TI, o CE): ");
        String tipoDocumento = lector.next();
        System.out.print("Numero de documento: ");
        String numDocumento = lector.next();
        System.out.print("Nombre completo: ");
        String saltoDeLinea = lector.nextLine();
        String nombreCompleto = lector.nextLine();

        Alquiler miAlquiler = new Alquiler(info,tipoDocumento,numDocumento,nombreCompleto);


        System.out.println("Su alquiler inicia en este mismo instante, ingrese la fecha límite(formato: año-mes-dia): ");
        String finAlquiler = lector.next();

        miAlquiler.setFinAlquiler(finAlquiler+"T18:00:00");
        System.out.println("Su alquiler quedó entre las siguientes fechas: "+miAlquiler.getInicioAlquiler()+" hasta "+ miAlquiler.getFinAlquiler());
        System.out.println("Describa el uso que se le dará al vehiculo: ");
        saltoDeLinea = lector.nextLine();
        String descripcion = lector.nextLine();

        miAlquiler.setDescripcionUso(descripcion);
        System.out.println();
        //Seguro
        System.out.println("Necesitaremos información para su seguro");
        System.out.print("Nombre de la empresa aseguradora: ");
        saltoDeLinea = lector.nextLine();
        String empsegu = lector.nextLine();
        System.out.print("Descripcion del seguro: ");
        String descrip = lector.nextLine();
        Seguro seguro1 = new Seguro(info,empsegu,descrip);

        System.out.println("Su seguro empieza y termina en las mismas fechas que su alquiler");

        seguro1.setInicioCobertura(miAlquiler.getInicioAlquiler().toLocalDate());
        seguro1.setFinCobertura(miAlquiler.getFinAlquiler().toLocalDate());
        System.out.println();
        System.out.println("A continuación el resumen de su proceso");
        System.out.println();
        System.out.println("El vehículo alquilado es el siguiente");

        Vehiculos[miAlquiler.getIdVehiculo()].informacionVehiculo();

        System.out.println();
        miAlquiler.setValorPagar(Vehiculos[miAlquiler.getIdVehiculo()].getPrecioHora());
        System.out.println("Informacion del alquiler");
        miAlquiler.informacionAlquiler();
        System.out.println();
        System.out.println("Informacion del seguro");
        seguro1.informacionSeguro();
        System.out.println("El tiempo asegurado es: " + seguro1.numeroDias()+" días");
        System.out.println("Las horas en alquiler son: "+miAlquiler.horasAlquilado());
        System.out.println("Total: "+miAlquiler.totalPagar());
    }
}
