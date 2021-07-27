import java.util.Date;

public class Empleado extends Persona {
    public int numeroDeLegajo;
    public String numeroDeCuil;
    public Date fechadeIngreso;
    public String diasDeTrabajo;//lunes a viernes
    public String turnoDeTrabajo;
    public String cbu;
    public double sueldo;

public boolean esValidoCBU() {
    if (this.cbu.length()==23){
            return true;

    }
            return false;

}

    
}

