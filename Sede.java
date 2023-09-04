import java.util.ArrayList;
import java.math.*;
public class Sede {
    //Atributos
    String nombreSede;
    int ID;
    ArrayList<Curso> cursos = new ArrayList<Curso>();
    ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
    
    //Métodos

    public Sede(int ID, String nombreSede, ArrayList<Curso> cursos, ArrayList<Estudiante> estudiante) {
        this.ID = ID;
        this.nombreSede = nombreSede;
        this.cursos = cursos;
        this.estudiante = estudiante;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public int getID(){
        return ID;
    }



    
    public double getPromedio(){
        double promedio = 0 ;
        return promedio;
    }

    public int getMediana(){
        int mediana = 0 ;
        return mediana;
    }

    public int getModa(){
        int moda = 0 ;
        return moda;
    }

    
    public double getDesviacion(){
        int desviacion = 0 ;
        return desviacion;
    }

    
    public int getRegistrados(int registrados){
        return registrados;
    }

    
    public int getMaximo(){
        int maximo = 0 ;
        return maximo;
    }
    
    public int getMinimo(){
        int minimo = 0 ;
        return minimo;
    }



}
