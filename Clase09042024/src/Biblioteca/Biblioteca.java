package Biblioteca;
import Usuarios.Cliente;
import Usuarios.Trabajador;
import Usuarios.Usuario;
import Usuarios.Gerente;


import java.util.ArrayList;
public class Biblioteca {


    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Trabajador> trabajadores = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public Usuario verificarInicioSesion(String nombreusuario, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreusuario)) {
                if (usuario.getContrasena().equals(contrasena)) {
                    return usuario;
                }
            }
        }
        return null;
    }

    public void agregarCliente(Cliente client){
        usuarios.add(client);
        clientes.add(client);
    }

    public void agregarGerente(Gerente geren){
        usuarios.add(geren);
        gerentes.add(geren);
    }

    public void agregarTrabajador(Trabajador trajo){
        usuarios.add(trajo);
        trabajadores.add(trajo);
    }

    public void mostrarUsuarios(){
        for (Usuario usuario:usuarios){
            System.out.println(usuario.getUsuario());
        }
    }
}