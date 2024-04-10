package Usuarios;

import Usuarios.utils.Rol;

import javax.management.relation.Role;
import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    protected static int cantidadUsuarios = 1;
    private int id;
    private String nombre;
    private String apellido;
    private  Enum<Rol> role;
    private LocalDate fechaNacimiento;
    private String contraseña;
    private String usuario;

    public Usuario(String nombre, String apellido, Enum<Rol> role,String contraseña,String usuario,LocalDate fechaNacimiento) {
        id = cantidadUsuarios;
        this.nombre = nombre;
        this.apellido = apellido;
        this.role = role;
        ++cantidadUsuarios;
        this.contraseña=contraseña;
        this.usuario=usuario;
    }
    @Override
    public String toString() {
        return String.format("Id: %d, Nombre completo: %s %s, Rol: %s", id, nombre,apellido, role);
    }
}
