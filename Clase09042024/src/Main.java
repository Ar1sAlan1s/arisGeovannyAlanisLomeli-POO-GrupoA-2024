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
        menu.iniciarSesion();

    }
}