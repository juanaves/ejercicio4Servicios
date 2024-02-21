package modelo;

import java.time.LocalDate;

public abstract class Servicio {
    String Trabajador;
    LocalDate FechaInicio;
    String Cliente;

    public Servicio(String trabajador, LocalDate fechaInicio, String cliente) {
        Trabajador = trabajador;
        FechaInicio = fechaInicio;
        Cliente = cliente;
    }

    public Servicio(String cliente) {
        Cliente = cliente;
    }

    public abstract double costeMaterial();
    public abstract double costeManoObra();
    public abstract double costeTotal();
    public abstract String detalleServicio();

}
