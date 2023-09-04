import java.util.ArrayList;

/**
 * Clase que representa a un estudiante en una universidad.
 */
public class Estudiante {

    // Atributos

    private String nombre, apellido, fechaNac, correo, sede;
    private int codigoUnico;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    // Métodos

    /**
     * Constructor para crear un objeto Estudiante.
     *
     * @param nombre       El nombre del estudiante.
     * @param apellido     El apellido del estudiante.
     * @param codigoUnico  El código único del estudiante.
     * @param fechaNac     La fecha de nacimiento del estudiante.
     * @param correo       El correo del estudiante.
     * @param sede         La sede a la que pertenece el estudiante.
     * @param cursos       La lista de cursos del estudiante.
     */
    public Estudiante(String nombre, String apellido, int codigoUnico, String fechaNac, String correo, String sede, ArrayList<Curso> cursos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoUnico = codigoUnico;
        this.fechaNac = fechaNac;
        this.correo = correo;
        this.sede = sede;
        this.cursos = cursos;
    }

    /**
     * Obtiene el nombre del estudiante.
     *
     * @return El nombre del estudiante.
     */
    public String getNombres() {
        return this.nombre;
    }

    /**
     * Obtiene el código único del estudiante.
     *
     * @return El código único del estudiante.
     */
    public int getCodigoUnico() {
        return this.codigoUnico;
    }

    /**
     * Obtiene la sede a la que pertenece el estudiante.
     *
     * @return La sede del estudiante.
     */
    public String getSede() {
        return this.sede;
    }

    /**
     * Obtiene la lista de cursos del estudiante.
     *
     * @return La lista de cursos del estudiante.
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * Obtiene un curso específico del estudiante por nombre.
     *
     * @param nombreCurso El nombre del curso que se busca.
     * @return El curso correspondiente al nombre especificado o null si no se encuentra.
     */
    public Curso getCursoEspecficio(String nombreCurso) {
        for (Curso curso : cursos) {
            if (curso.getNombre().equals(nombreCurso)) {
                return curso;
            }
        }
        return null;
    }

    /**
     * Establece la lista de cursos del estudiante.
     *
     * @param cursos La lista de cursos a asignar al estudiante.
     */
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * Sobrescribe el método toString para obtener una representación en cadena del estudiante.
     *
     * @return Una cadena que representa al estudiante.
     */
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", sede=" + sede + ", codigoUnico="
                + codigoUnico + ", cursos=" + cursos + "]";
    }
}
