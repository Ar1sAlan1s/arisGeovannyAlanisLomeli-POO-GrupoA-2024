import Biblioteca.Biblioteca;
import Biblioteca.menu;
import Usuarios.Gerente;
import Usuarios.Usuario;
import Usuarios.utils.Rol;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        menu menu = new menu(biblioteca);
        biblioteca.agregarGerente(new Gerente("Miguel","Garcia",Rol.GERENTE,LocalDate.of(2004,5,1),"Altozano",1,"gerente","gerente","44444"));
        menu.iniciarSesion();

    }
}