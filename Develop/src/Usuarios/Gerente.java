package Usuarios;

import Usuarios.utils.Rol;

import java.time.LocalDate;

public class Gerente extends Usuario {


    public Gerente(String nombre, String apellido, Rol rol) {
        super(nombre,apellido,rol);

    }

    @Override
    public String toString() {
        return String.format("%s, Numero de usuarios: %s",super.toString(),cantidadUsuarios-2);
    }
}
