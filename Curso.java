

public class Curso {
    //Atributos
    String nombre, sede;
    int ID_curso, nota;


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
    
    public String getNombre() {
        return nombre;
    }



    public int getID_curso() {
        return ID_curso;
    }


    public int getNota() {
        return nota;
    }



    @Override
    public String toString() {
        return "Curso de " + nombre + ", con ID: " + ID_curso + " y nota de " + nota;
    }










}
