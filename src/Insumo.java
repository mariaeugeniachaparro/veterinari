import java.util.Date;

public class Insumo {
    public String nombre;
    public Date fechaDeIngreso;
    public Date fechaDeCaducidad;
    public double costo;
    public double precio;

//Ahora bienen los métodos (la funcionalidad)

public boolean estaVencido () {
    Date hoy = new Date(); //Date es un objeto que new Date genera x defecto la fecha de hoy.
    if (this.fechaDeCaducidad. after(hoy)){
        return true;
    }
        return false;
}

}


