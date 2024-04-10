package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;
public class Cliente extends Usuario{
    private LocalDate fechaRegistro;

    public Cliente(String nombre, String apellido, Rol rol,LocalDate fechedenacimiento,String usuario,String contraseña) {
        super(nombre,apellido,Rol.CLIENTE,usuario,contraseña,fechedenacimiento);
        this.fechaRegistro = LocalDate.now();
    }

    @Override
    public String toString() {
        return String.format("%s, fecha de registro: %s", super.toString(),fechaRegistro);
    }
}
