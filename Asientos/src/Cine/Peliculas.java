package Cine;

import SistemaCine.src.Fecha;

public class Peliculas extends Fecha{
    private String nombre;
    private String descripcion;
    private String genero;
    private String formato;
    private int duracion;
    private Fecha date;


    public Peliculas(String nombre, String descripcion, String formato, String genero, int duracion, Fecha date) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.formato = formato;
        this.genero = genero;
        this.duracion = duracion;
        this.date = date;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Fecha getDate() {
        return date;
    }

    public void setDate(Fecha date) {
        this.date = date;
    }
}
