package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;
public class Cliente extends Usuario{
    private LocalDate fechaRegistro;

    public Cliente(String nombre, String apellido, Rol rol) {
        super(nombre,apellido,rol);
        this.fechaRegistro = LocalDate.now();
    }

    @Override
    public String toString() {
        return String.format("%s, fecha de registro: %s", super.toString(),fechaRegistro);
    }
}
