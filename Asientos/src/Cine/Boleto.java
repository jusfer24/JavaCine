package Asientos.src.Cine;

import Cine.Peliculas;
import SistemaCine.src.SistemaCine.src.User;

import java.time.LocalDate;
import java.time.LocalTime;

public class Boleto {
    private String asiento;
    private User user;
    private Cine.Peliculas pelicula;
    private LocalDate fechaCompra;
    private LocalTime horaCompra;

    public Boleto(String asiento, User user, Cine.Peliculas pelicula) {
        this.asiento = asiento;
        this.user = user;
        this.pelicula = pelicula;
        this.fechaCompra = LocalDate.now();
        this.horaCompra = LocalTime.now();
    }

    public String getAsiento() {
        this.asiento = "A1";
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalTime getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(LocalTime horaCompra) {
        this.horaCompra = horaCompra;
    }

    public void mostrarDetalles() {
        System.out.println("Boleto de Cine");
        System.out.println("---------------------------");
        System.out.println("Película: " + pelicula.getNombre());
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Formato: " + pelicula.getFormato());
        System.out.println("Asiento: " + asiento);
        System.out.println("Nombre: " + user.getNombre() + " " + user.getApellido());
        System.out.println("Cédula: " + user.getCedula());
        System.out.println("Fecha de compra: " + fechaCompra);
        System.out.println("Hora de compra: " + horaCompra);
    }

//    public static void main(String[] args) {
//
//        Cine.Peliculas pelicula = new Cine.Peliculas("Inception", "2D", "Ciencia Ficción", 148);
//        Cine.User user1 = new Cine.User("Vasquez", "Luis", "100021202");
//        Sala sala = new Sala(pelicula);
//        sala.comprarBoletos(user1);
//        Boleto boleto = new Boleto("A1", user1, pelicula);
//        boleto.mostrarDetalles();
//    }
}

