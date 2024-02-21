package modelo;

import java.time.LocalDate;

public class TrabajoPintura extends Servicio{
    double Superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador, LocalDate fechaInicio, String cliente, double superficie, double precioPintura) {
        super(trabajador, fechaInicio, cliente);
        Superficie = superficie;
        PrecioPintura = precioPintura;
    }
    public  double costeMaterial(){
        return((this.Superficie/7.8)*this.PrecioPintura);
    }
    public  double costeManoObra(){
        return((this.Superficie/10)*9.5);
    }

    public  double costeTotal()
    {
        if(this.Superficie<50)
            return((costeMaterial()+costeManoObra())*1.15);
        else
            return((costeMaterial()+costeManoObra()));

    }
    public  String detalleServicio(){
        String cadena = "";

        cadena += "TRABAJO DE PINTURA\n";
        cadena += "Cliente: "+this.Cliente+"\n";
        cadena += "Fecha de Inicio: "+this.FechaInicio+"\n";
        cadena += "------------------\n";
        cadena += "Pintor: "+Trabajador+"\n";
        cadena += "Coste Material: "+costeMaterial()+"\n";
        cadena += "Coste Mano Obra: "+costeManoObra()+"\n";
        cadena += "TOTAL: "+costeTotal()+"\n";
        cadena += "------------------\n";
        return cadena;
    }

}
