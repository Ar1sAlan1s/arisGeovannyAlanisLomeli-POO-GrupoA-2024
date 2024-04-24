package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;
public class Cliente extends Usuario{
    private LocalDate fechaRegistro;


    public Cliente(String nombre, String apellido, Rol rol,LocalDate fechedenacimiento,String usuario,String contraseña,String numeroDeTelefono) {
        super(nombre,apellido,Rol.CLIENTE,usuario,contraseña,fechedenacimiento,numeroDeTelefono);
        this.fechaRegistro = LocalDate.now();
    }
    public void agregarCliente(Cliente cliente) {

    }
    @Override
    public String toString() {
        return String.format("%s, fecha de registro: %s", super.toString(),fechaRegistro);
    }
}
