package Usuarios;

import Usuarios.utils.Rol;

import java.time.LocalDate;


public class Gerente extends Usuario {
    String Direccion;
    private double sueldo;
    public Gerente(String nombre, String apellido, Rol rol,LocalDate fechedenacimiento,String direccion,double sueldo,String usuario,String contraseña,String numeroDeTelefono) {
        super(nombre,apellido,Rol.GERENTE,usuario,contraseña,fechedenacimiento,numeroDeTelefono);
        this.Direccion = direccion;
        this.sueldo = sueldo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return String.format("%s, Numero de usuarios: %s",super.toString(),cantidadUsuarios-2);
    }
}
