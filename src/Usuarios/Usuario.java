package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;

public class Usuario {
    protected static int cantidadUsuarios = 1;
    private int id;
    private String nombre;
    private String apellido;
    private Rol rol;
    private LocalDate fechaNacimiento;
    private String contraseña;
    private String usuario;

    public Usuario(String nombre, String apellido, Rol rol,String contraseña,String usuario,LocalDate fechaNacimiento) {
        id = cantidadUsuarios;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        ++cantidadUsuarios;
        this.contraseña=contraseña;
        this.usuario=usuario;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, Nombre completo: %s %s, Rol: %s", id, nombre,apellido, rol);



    }


    public String getContraseña() {
        return contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public Rol getRol() {
    return rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getId() {
        return id;
    }
}
