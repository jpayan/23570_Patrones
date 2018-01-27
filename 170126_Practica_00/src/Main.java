import Behaviors.CaminarDosPies;
import Behaviors.CaminarManos;
import Behaviors.NoCaminar;
import People.Estudiante;
import People.Profesor;
import People.Troquero;

public class Main {
    public static void main(String[] args) {
        Profesor profe = new Profesor("John", 25, new CaminarDosPies());
        profe.caminar();

        Estudiante estudiante = new Estudiante("Phil", 20, new CaminarManos());
        estudiante.caminar();

        Troquero troquero = new Troquero("Donald", 70, new NoCaminar());
        troquero.caminar();
    }
}