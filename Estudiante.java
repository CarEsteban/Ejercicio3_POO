
import java.util.ArrayList;
public class Estudiante {

    //Atributos
    private String nombre,apellido,fechaNac,correo,sede;
    private int codigoUnico;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    //Métodos
    public Estudiante(String nombre, String apellido, int codigoUnico, String fechaNac, String correo, String sede, ArrayList<Curso> cursos){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoUnico = codigoUnico;
        this.fechaNac =fechaNac;
        this.correo = correo;
        this.sede = sede;
        this.cursos = cursos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCodigoUnico() {
        return this.codigoUnico;
    }

    public String getSede() {
        return this.sede;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", sede=" + sede + ", codigoUnico="
                + codigoUnico + ", cursos=" + cursos + "]";
    }



    
}
