import java.util.ArrayList;
import java.math.*;
public class Sede {
    //Atributos
    String nombreSede;
    ArrayList<Curso> cursos = new ArrayList<Curso>();
    ArrayList<Estudiante> estudiante = new ArrayList<Estudiante>();
    
    //Métodos

    public Sede(String nombreSede, ArrayList<Curso> cursos, ArrayList<Estudiante> estudiante) {
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

    
    public int getRegistrados(){
        int registrados = 0 ;
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
