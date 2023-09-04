import java.util.ArrayList;

/**
 * Clase que representa una sede en una universidad.
 */
public class Sede {
    // Atributos

    private String nombreSede;
    private int ID;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

    // Métodos

    /**
     * Constructor para crear un objeto Sede.
     *
     * @param ID          El identificador único de la sede.
     * @param nombreSede  El nombre de la sede.
     * @param estudiantes La lista de estudiantes asociados a la sede.
     */
    public Sede(int ID, String nombreSede, ArrayList<Estudiante> estudiantes) {
        this.ID = ID;
        this.nombreSede = nombreSede;
        this.estudiantes = estudiantes;
    }

    /**
     * Establece la lista de cursos asociados a la sede.
     *
     * @param cursos La lista de cursos a asignar a la sede.
     */
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * Obtiene el nombre de la sede.
     *
     * @return El nombre de la sede.
     */
    public String getNombreSede() {
        return nombreSede;
    }

    /**
     * Obtiene la lista de cursos asociados a la sede.
     *
     * @return La lista de cursos asociados a la sede.
     */
    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    /**
     * Obtiene la lista de estudiantes asociados a la sede.
     *
     * @return La lista de estudiantes asociados a la sede.
     */
    public ArrayList<Estudiante> getEstudiante() {
        return estudiantes;
    }

    /**
     * Obtiene el identificador único de la sede.
     *
     * @return El identificador único de la sede.
     */
    public int getID() {
        return ID;
    }
}
