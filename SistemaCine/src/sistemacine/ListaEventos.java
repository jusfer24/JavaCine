package sistemacine;

public enum ListaEventos {
    ACCION("Gladiador II", 7.5, "2024-12-15",25),
    ROMANCE("El Tiempo que vivimos", 8.5, "2024-12-20",30),
    COMEDIA("Codigo Rojo", 3.75, "2024-12-25",2);
    
    private Boleto boleto;
    private final String nombre;
    private final double precio;
    private final String fecha;
    private int capacidad;

    // Constructor del enum
    ListaEventos(String nombre, double precio, String fecha, int capacidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
        this.capacidad=capacidad;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    // Validar si hay asientos disponibles
    public boolean validarAsientos(int cantidad) {
        return cantidad <= capacidad;
    }

    // Reducir la cantidad de asientos disponibles
    public void reducirAsientos(int cantidad) {
        if (validarAsientos(cantidad)) {
            capacidad -= cantidad;
        } else {
            throw new IllegalArgumentException("No hay suficientes asientos disponibles.");
        }
    }

    @Override
    public String toString() {
        return "Género: " + this.name() + ", Nombre: " + nombre + ", Precio: $" + precio + ", Fecha: " + fecha;
    }

}