import Usuarios.Cliente;
import Usuarios.Gerente;
import Usuarios.Trabajador;
import Usuarios.Usuario;
import Usuarios.utils.Rol;

public class Main {
    public static void main(String[] args) {
        Cliente cliente=new Cliente("Maria","Gomez",Rol.CLIENTE);
        Trabajador trabajador=new Trabajador("Juan","Perez",Rol.TRABAJADOR,12500.23,"AAA341F3");
        Gerente gerente = new Gerente("pedro","Pascal",Rol.GERENTE);
        System.out.println(cliente.toString());
        System.out.println(trabajador.toString());
        System.out.println(gerente.toString());
    }
}