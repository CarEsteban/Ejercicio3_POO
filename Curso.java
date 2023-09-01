import java.util.ArrayList;

public class Curso {
    //Atributos
    String nombre, sede;
    int ID_curso, nota;
    ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();


    //Métodos

    public Curso(String nombre, String sede, int ID_curso, int nota, ArrayList<Estudiante> estudiante) {
        this.nombre = nombre;
        this.sede = sede;
        this.ID_curso = ID_curso;
        this.nota = nota;
        this.estudiante = estudiante;
    }


    public String getNombre() {
        return nombre;
    }


    public String getSede() {
        return sede;
    }


    public int getID_curso() {
        return ID_curso;
    }


    public int getNota() {
        return nota;
    }


    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }










}
