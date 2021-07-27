import javax.management.RuntimeMBeanException;

public class App {
    public static void main(String[] args) throws Exception {
        
        Paciente michi = new Paciente();
        michi.nombre= "Mabel";
        michi.especie= "gato";

        Paciente perri = new Paciente();
        perri.nombre="Rubencio";
        perri.especie="perro";

        ClinicaVeterinaria vete = new ClinicaVeterinaria();
        vete.nombre="vete";

        vete.ingresar(michi);
        vete.ingresar (perri);
        vete.imprimirListadoPacientes();

        
    }
}
