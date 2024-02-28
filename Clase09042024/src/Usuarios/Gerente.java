package Usuarios;

import Usuarios.utils.Rol;

import java.time.LocalDate;

public class Gerente extends Usuario {

    private double sueldo;
    public Gerente(String nombre, String apellido, Rol rol,LocalDate fechedenacimiento,String usuario,String contraseña) {
        super(nombre,apellido,Rol.GERENTE,usuario,contraseña,fechedenacimiento);

    }

    @Override
    public String toString() {
        return String.format("%s, Numero de usuarios: %s",super.toString(),cantidadUsuarios-2);
    }
}
