

public class Curso {
    //Atributos
    String nombre, sede;
    int ID_curso, nota;
    String estudiante;


    //Métodos

    public Curso(String nombre, int ID_curso) {
        this.nombre = nombre;
        this.ID_curso = ID_curso;
    }

    //Se agregaron setSede , setEstudiante y setNota para poder setear los valores sin necesidad del constructor cuando se le pida al usuario las notas
    public void setSede(String sede){
        this.sede = sede;
    }
    public void setNota(int nota){
        this.nota = nota;
    }
    public void setEstudiante(String estudiante){
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
        return "Curso de " + nombre + ", con ID: " + ID_curso + " y nota de " + nota;
    }










}
