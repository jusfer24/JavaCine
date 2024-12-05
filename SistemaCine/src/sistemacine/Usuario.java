package sistemacine;

/**
 * Clase que representa a un Usuario.
 */
public class Usuario {
    private String nombre;
    private String cedula;

    /**
     * Constructor que inicializa 'nombre' y 'cedula'.
     *
     * @param nombre Nombre del usuario.
     * @param cedula Cédula del usuario.
     */
    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    // Override de 'toString()' para una representación legible
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cédula: " + cedula;
    }
}
