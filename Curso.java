/**
 * Clase que representa un curso en una universidad.
 */
public class Curso {
    // Atributos

    private String nombre;
    private int ID_curso, nota;

    // Métodos

    /**
     * Constructor para crear un objeto Curso.
     *
     * @param nombre   El nombre del curso.
     * @param ID_curso El identificador único del curso.
     */
    public Curso(String nombre, int ID_curso) {
        this.nombre = nombre;
        this.ID_curso = ID_curso;
    }

    /**
     * Establece la nota del curso.
     *
     * @param nota La nota asignada al curso.
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * Obtiene el nombre del curso.
     *
     * @return El nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el identificador único del curso.
     *
     * @return El identificador único del curso.
     */
    public int getID_curso() {
        return ID_curso;
    }

    /**
     * Obtiene la nota del curso.
     *
     * @return La nota del curso.
     */
    public int getNota() {
        return nota;
    }

    /**
     * Sobrescribe el método toString para obtener una representación en cadena del curso.
     *
     * @return Una cadena que representa al curso, incluyendo nombre, ID y nota.
     */
    @Override
    public String toString() {
        return "Curso de " + nombre + ", con ID: " + ID_curso + " y nota de " + nota;
    }
}
