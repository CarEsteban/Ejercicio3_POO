import java.util.ArrayList;
import java.math.*;

public class PrincipalUniversidad{
    public static void main(String[] args) {
        ArrayList<Curso> cursos1 = new ArrayList<Curso>();
        Estudiante est1 = new Estudiante("Esteban", "Carcamo", 1, "27 de mayo", "estebancarcamou@gmail.com", "Mazatenango", cursos1);
        System.out.println(est1);



    }
}