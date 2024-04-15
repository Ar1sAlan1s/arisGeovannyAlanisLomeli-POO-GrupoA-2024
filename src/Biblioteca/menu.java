package Biblioteca;
import Usuarios.Gerente;
import Usuarios.Usuario;
import java.time.LocalDate;
import java.util.Scanner;
import Usuarios.utils.Rol;



public class menu {

    static Scanner sc = new Scanner(System.in);
    static boolean band=true;
    Biblioteca biblioteca = new Biblioteca();
    public void regreso(){


    }
    public void iniciarSesion(){
        boolean datosCorrectos=false;
        do {
            System.out.println("Bienvenido al sistema de la biblioteca");
            System.out.println("Inicia sesion para continuar");
            System.out.println("Ingresa tu usuario:");
            String usuarioActual = sc.nextLine();
            System.out.println("Ingresa su password:");
            String password = sc.nextLine();
            Usuario user=biblioteca.verificarInicioSesion(usuarioActual, password);
            if (usuarioActual!=null){
               seleccionarMenu(user);
            }else{
                System.out.println("Usuario o contraseña incorrectos. Intenta de nuevo");}
        }while(!datosCorrectos);
    }

    private void seleccionarMenu(Usuario user){
        switch (user.getRol()){
            case CLIENTE -> ejecutarMenuCliente();
            case GERENTE -> ejecutarMenuGerente();
            case TRABAJADOR -> ejecutarMenuTrabajador();
        }
    }
    public static void ejecutarMenuCliente(){
        System.out.println("**Bienvenido al menu Cliente**");
        while(band){
            System.out.println("1 - Ver Rentas");
            System.out.println("2 - Ver info");
            System.out.println("3 - Ver libros rentados");
            System.out.println("4 - Ver libros disponibles");
            System.out.println("5 - Salir");
            System.out.print("Ingrese su opcion:");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    band=false;

                    break;

            }



        }

    }
    public static void ejecutarMenuTrabajador(){
        System.out.println("**Bienvenido al menu Trabajador**");
        while(band){
            System.out.println("1 - Ver Rentas");
            System.out.println("2 - Registrar libro");
            System.out.println("3 - Ver libros rentados");
            System.out.println("4 - Ver libros disponibles");
            System.out.println("5 - Salir");
            System.out.print("Ingrese su opcion:");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    band=false;


                    break;

            }



        }

    }
    public static void ejecutarMenuGerente(){
        System.out.println("**Bienvenido al menu Gerente*");
        while(band){
            System.out.println("1 - Ver Rentas");
            System.out.println("2 - Ver Empleados");
            System.out.println("3 - Ver libros rentados");
            System.out.println("4 - Ver libros disponibles");
            System.out.println("5 - Ver clientes registrados");
            System.out.println("6 - Ver clientes que rentaron libros");
            System.out.println("8 - Ver clientes que compraron libros");
            System.out.println("9 - Salir");
            System.out.print("Ingrese su opcion:");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    break;
                case 9:
                    band=false;

                    break;

            }



        }

    }
}
