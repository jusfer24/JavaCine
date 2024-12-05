package sistemacine;
import java.util.ArrayList;

public class ListaUsuario {
    private ArrayList<Usuario> listaUsuarios;

    public ListaUsuario() {
        this.listaUsuarios = new ArrayList<>();
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    public boolean agregarUsuario(String nombre, String cedula) {
        if (buscarUsuarioPorCedula(cedula) != null) {
            System.out.println("La cédula ya existe. No se puede agregar.");
            return false;
        }
        Usuario nuevoUsuario = new Usuario(nombre, cedula);
        listaUsuarios.add(nuevoUsuario);
        System.out.println("Usuario agregado correctamente.");
        return true;
    }

    public Usuario buscarUsuarioPorCedula(String cedula) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCedula().equals(cedula)) {
                return usuario;
            }
        }
        return null;
    }

    public String obtenerInformacionUsuarios() {
        if (listaUsuarios.isEmpty()) {
            return "No hay usuarios registrados.";
        } else {
            StringBuilder info = new StringBuilder();
            for (Usuario usuario : listaUsuarios) {
                info.append(usuario.toString()).append("\n");
            }
            return info.toString();
        }
    }
}
