package Usuarios;

import Usuarios.utils.Rol;

import javax.management.relation.Role;

public class Usuario {
    protected static int cantidadUsuarios = 1;
    private int id;
    private String nombre;
    private String apellido;
    private  Enum<Rol> role;

    public Usuario(String nombre, String apellido, Enum<Rol> role) {
        id = cantidadUsuarios;
        this.nombre = nombre;
        this.apellido = apellido;
        this.role = role;
        ++cantidadUsuarios;
    }
    @Override
    public String toString() {
        return String.format("Id: %d, Nombre completo: %s %s, Rol: %s", id, nombre,apellido, role);
    }
}
