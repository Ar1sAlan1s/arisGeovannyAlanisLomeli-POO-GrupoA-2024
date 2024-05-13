package Biblioteca;

import Usuarios.Cliente;
import Usuarios.Gerente;
import Usuarios.Trabajador;
import Usuarios.Usuario;
import Usuarios.utils.Rol;
import Utils.UsuarioEnSesion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    static Scanner leer= new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();


    public void iniciarSesion(){

        boolean datoscorrectos= false;
        int cont = 5;
        biblioteca.registrarGerente();

        do {
            System.out.println("BIENVENIDO AL SISTEMA DE LA BIBLIOTECA.");
            System.out.printf("Inicia sesion para continuar, tienes %d intentos: \n",cont);

            System.out.println("Ingresa tu nombre de usuario: ");
            String user= leer.nextLine();

            System.out.println("Ingresa tu contraseña: ");
            String contra= leer.nextLine();

            Usuario actual= biblioteca.verificarInicioSesion(user,contra);

            if (actual != null && cont > 0){
                UsuarioEnSesion.getInstancia().setUsuario(actual);
                seleccionarMenu();
                cont = 5;
            } else if (cont == 1) {
                System.out.println("INTENTOS TERMINADOS, TERMINANDO EL PROGRAMA. ");
                datoscorrectos=true;
            } else{
                System.out.println("DATOS INCCORRECTOS. ");
                cont--;
            }

        } while (!datoscorrectos);

    }

    private static void seleccionarMenu(){
        switch (UsuarioEnSesion.getInstancia().getUsuarioActual().getRol()){
            case Gerente -> ejecutarMenuGerente(); //la flechita es una funcion lambda, sirve en versiones de java mas actuales
            case Trabajador -> ejecutarMenuTrabajador();
            case Clientes -> ejecutarMenuCliente();
        }
    }


    private static void ejecutarMenuCliente(){
        String option = "";
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("1 - Ver rentas");
            System.out.println("2 - Ver tu informacion");
            System.out.println("3 - Ver libros disponibles");
            System.out.println("E - Cerrar sesion.");
            option=leer.nextLine();
            switch (option){
                case "1" :
                    break;
                case "2" :
                    break;
                case "3" :
                    break;
                case "E" :
                    UsuarioEnSesion.getInstancia().cerrarSesion();
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!option.equals("E"));
    }
    private static void ejecutarMenuTrabajador(){
        String option = "" ;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("1 - Registrar cliente");
            System.out.println("2 - Actualizar la informacion del cliente");
            System.out.println("3 - Eliminar cliente");
            System.out.println("4 - Registrar libro");
            System.out.println("5 - Actualizar la informacion del libro");
            System.out.println("6 - Eliminar libro");
            System.out.println("E - Cerrar sesion.");
            option=leer.nextLine();
            switch (option){
                case "1" :
                    biblioteca.registrarCliente();
                    break;
                case "2" :
                    break;
                case "3" :
                    break;
                case "4" :
                    break;
                case "5" :
                    break;
                case "6" :
                    break;
                case "E" :
                    UsuarioEnSesion.getInstancia().cerrarSesion();
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!option.equals("E"));
    }
    private static void ejecutarMenuGerente(){
        String option = "";
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("1 - Registrar cliente");
            System.out.println("2 - Actualizar la informacion del cliente");
            System.out.println("3 - Eliminar cliente");
            System.out.println("4 - Registrar trabajador");
            System.out.println("5 - Actualizar la informacion del trabajador");
            System.out.println("6 - Eliminar trabajador");
            System.out.println("7 - Registrar gerente");
            System.out.println("8 - Actualizar la informacion del gerente");
            System.out.println("9 - Eliminar gerente");
            System.out.println("11 - Mostrar clientes");
            System.out.println("12 - Mostrar trabajadores");
            System.out.println("13 - Mostrar gerentes");
            System.out.println("14 - Mostrar usuario especifico");
            System.out.println("15 - Mostrar usuarios");
            System.out.println("E - Cerrar sesion.");
            option=leer.nextLine();
            switch (option){
                case "1" :
                    biblioteca.registrarCliente();
                    break;
                case "2" :
                    biblioteca.actualizarUsuario();
                    break;
                case "3" :
                    biblioteca.eliminarCliente();
                    break;
                case "4" :
                    biblioteca.registrarTrabajador();
                    break;
                case "5" :
                    biblioteca.actualizarUsuario();
                    break;
                case "6" :
                    biblioteca.eliminarTrabajador();
                    break;
                case "7":
                    biblioteca.registrarGerente();
                    break;
                case "8":
                    biblioteca.actualizarUsuario();
                    break;
                case "9" :
                    biblioteca.eliminarGerente();
                    break;
                case "10" :
                    biblioteca.mostrarClientes();
                    break;
                case "11":
                    biblioteca.mostrarTrabajadores();
                    break;
                case "12":
                    biblioteca.mostrarGerentes();
                    break;
                case "13" :
                    biblioteca.mostrarUsuarios();
                    String usuario = leer.nextLine();
                    biblioteca.mostrarUsuarioEspecifico(usuario);
                    break;
                case "14" :
                    biblioteca.consultarUsuarios();
                    break;
                case "15":
                    biblioteca.mostrarUsuarios();
                    break;
                case "E" :
                    UsuarioEnSesion.getInstancia().cerrarSesion();
                    break;
                default :
                    System.out.println("Opcion invalida");
                    break;
            }
        }while(!option.equals("E"));
    }
    private static void registrarLibroMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean esDatoValido = false;

        do {
            System.out.println("OPCION DE REGISTRAR UN LIBRO. ");
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Terror.");
            System.out.println("2. Comedia.");
            System.out.println("3. Acccion. ");
            System.out.println("4. Regresar al menu principal. ");
            while (!esDatoValido) {
                try {
                    opcion = leer.nextInt();
                    if (opcion < 1 || opcion > 4) {
                        throw new InputMismatchException(); //agrega un error de manera "forzosa"
                    }
                    esDatoValido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Opcion no valida, ingresa otra porfavor..");
                } finally { //el finally siempre va a fincionar, sin importar si entra a los errores o no
                    sc.nextLine();
                }
            }
            esDatoValido = false;
            switch (opcion) {
                case 1:
                    System.out.println("REGISTRAR LIBRO DE TERROR. ");
                    Biblioteca.registrarTerror();
                    break;
                case 2:
                    System.out.println("REGISTRAR LIBRO DE COMEDIA. ");
                    Biblioteca.registrarComedia();
                    break;
                case 3:
                    System.out.println("REGISTRAR LIBRO ACCION. ");
                    Biblioteca.registrarAccion();
                    break;
                case 4:
                    break;
            }


        }while (true);
    }

}