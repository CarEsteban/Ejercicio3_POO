

public class Curso {
    //Atributos
    String nombre, sede;
    int ID_curso, nota;
    String estudiante;


    //Métodos

    public Curso(String nombre, String sede, int ID_curso, Integer nota, String estudiante) {
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


    public String getEstudiante() {
        return estudiante;
    }


    @Override
    public String toString() {
        return "Curso de " + nombre + ", con ID: " + ID_curso + " y nota de" + nota;
    }










}
