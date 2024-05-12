package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;
public class Cliente extends Usuario{
    private LocalDate fechaRegistro;


    public Cliente(String nombre, String apellido, Rol rol,LocalDate fechedenacimiento,String usuario,String contraseña,String numeroDeTelefono) {
        super(nombre,apellido,Rol.CLIENTE,usuario,contraseña,fechedenacimiento,numeroDeTelefono);
        this.fechaRegistro = LocalDate.now();
    }
     if(!Biblioteca.usuarios.containsKey(Rol.Gerente)){
        Biblioteca.usuarios.put(Rol.Gerente, new ArrayList<Usuario>());
    }

        Biblioteca.usuarios.get(Rol.Gerente).add(gerente);

        System.out.println("Gerente agregado correctamente.");
}

public static void mostrarGerente(Gerente gerenteDado){
    for (Usuario usuario: Biblioteca.usuarios.get(Rol.Gerente)){
        Gerente gerente = (Gerente) usuario;
        if(gerente == gerenteDado){
            Usuario.mostrarUsuario(gerente);
            System.out.println(" CURP: "+gerente.getCurp());
        }
    }
}

public static void mostrarGerentes(){
    for (Usuario usuario: Biblioteca.usuarios.get(Rol.Gerente)){
        Gerente gerente = (Gerente) usuario;
        Usuario.mostrarUsuario(gerente);
        System.out.println(" CURP: "+gerente.getCurp());
    }
}

public static void eliminarGerente(){
    Scanner leer = new Scanner(System.in);
    for (Usuario usuario: Biblioteca.usuarios.get(Rol.Gerente)){
        Gerente gerente = (Gerente) usuario;
        Usuario.mostrarUsuario(gerente);
    }
    System.out.println("Ingrese el usuario a remover: ");
    String nombreUsuario = leer.nextLine();
    for (Usuario usuario: Biblioteca.usuarios.get(Rol.Gerente)){
        Gerente gerente = (Gerente) usuario;
        if (gerente.getNombreUsuario().equals(nombreUsuario)){
            Biblioteca.usuarios.get(Rol.Gerente).remove(gerente);
            System.out.println("Gerente eliminado.");
            return;
        }
    }
    System.out.println("Gerente no encontrado");
}

public void setCurp(String curp) {
    this.curp = curp;
}

public void checarEntrada(){
    System.out.println("Se registra la entrada");
}

public void checarSalida(){
    System.out.println("Se registra la salida");
}
}
    @Override
    public String toString() {
        return String.format("%s, fecha de registro: %s", super.toString(),fechaRegistro);
    }
}
