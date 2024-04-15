package Biblioteca;
import Usuarios.Cliente;
import Usuarios.Trabajador;
import Usuarios.Usuario;
import Usuarios.Gerente;
import Usuarios.utils.Rol;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    static Scanner sc = new Scanner(System.in);
    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Trabajador> trabajadores = new ArrayList<>();
    private ArrayList<Gerente> gerentes = new ArrayList<>();

    public  Usuario verificarInicioSesion(String usuarioActual, String password){
        for (Usuario usuario: usuarios){
            if (usuario.getUsuario().equals(usuarioActual)){
                if (usuario.getContraseña().equals(password)){
                    return usuario;
                }
            }
        }
        return null;
    }

    public void agregarCliente(Cliente client) {
        usuarios.add(client);
        clientes.add(client);
    }

    public void agregarGerente(Gerente geren) {
        usuarios.add(geren);
        gerentes.add(geren);
    }

    public void agregarTrabajador(Trabajador trajo) {
        usuarios.add(trajo);
        trabajadores.add(trajo);
    }

    public void mostrarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getUsuario());
        }
    }
    public void mostrarCliente(){
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getUsuario());
        }
    }
    public void mostrarGerentes() {
        for (Gerente gerente : gerentes) {
            System.out.println(gerente.getUsuario());
        }
    }
    public void mostrarTrabajadores() {
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.getUsuario());
        }
    }
    public void mostrarGerenteEnEspecifico() {
        System.out.println("Ingrese el nombre del Gerente a mostrar:");
        String nombre = sc.nextLine();
        for (Gerente gerente : gerentes) {
            if (gerente.getUsuario().equals(nombre)) {
                System.out.print(gerente.getNombre());
                System.out.print(gerente.getApellido());
                System.out.print(gerente.getRol()+"\n");
                System.out.print(gerente.getFechaNacimiento());
                System.out.print(gerente.getDireccion());
                System.out.print(gerente.getSueldo()+"\n");
                System.out.print(gerente.getUsuario());
                System.out.print(gerente.getContraseña());
            }
        }
    }
    public void mostrarTrabajadorEnEspecifico() {
        System.out.println("Ingrese el nombre del Trabajador a mostrar:");
        String nombre = sc.nextLine();
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getUsuario().equals(nombre)) {
                System.out.print(trabajador.getNombre());
                System.out.print(trabajador.getApellido());
                System.out.print(trabajador.getRol()+"\n");
                System.out.print(trabajador.getSalario());
                System.out.print(trabajador.getRFC());
                System.out.print(trabajador.getFechaIngreso());
                System.out.print(trabajador.getUsuario());
                System.out.print(trabajador.getContraseña());
            }
        }
    }
    public void mostrarClienteEnEspecifico() {
        System.out.println("Ingrese el nombre del Cliente a mostrar:");
        String nombre = sc.nextLine();
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(nombre)) {
                System.out.print(cliente.getNombre());
                System.out.print(cliente.getApellido());
                System.out.print(cliente.getRol()+"\n");
                System.out.print(cliente.getFechaNacimiento());
                System.out.print(cliente.getUsuario());
                System.out.print(cliente.getContraseña());
            }
        }
    }
    public void registrarCliente() {
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su Fecha de Nacimiento:");
        LocalDate fechaDeNacimineot = LocalDate.of(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        boolean band = true;String usuario="",password="";
        while (band) {
            System.out.println("Ingrese el usuario deseado:");
            usuario = sc.nextLine();
            System.out.println("Ingrese su password:");
            password = sc.nextLine();
            for (Usuario usuar : usuarios) {
                if (!usuar.getUsuario().equals(usuario)) {
                    band = false;
                }
            }
        }
        Cliente cliente=new Cliente(nombre,apellido, Rol.CLIENTE,fechaDeNacimineot,usuario,password);
        agregarCliente(cliente);
    }
    public void registrarTrabajador() {
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese salario:");
        double salario = Double.parseDouble(sc.nextLine());
        System.out.println("Ingrese RFC:");
        String rfc = sc.nextLine();
        System.out.println("Ingrese su Fecha de Nacimiento:");
        LocalDate fechaDeNacimineot = LocalDate.of(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        boolean band = true;String usuario="",password="";
        while (band) {
            System.out.println("Ingrese el usuario deseado:");
            usuario = sc.nextLine();
            System.out.println("Ingrese su password:");
            password = sc.nextLine();
            for (Usuario usuar : usuarios) {
                if (!usuar.getUsuario().equals(usuario)) {
                    band = false;
                }
            }
        }
        Trabajador trabajador=new Trabajador(nombre,apellido, Rol.TRABAJADOR,salario,rfc,fechaDeNacimineot,usuario,password);
        agregarTrabajador(trabajador);
    }
    public void registrarGerente() {
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su Fecha de Nacimiento:");
        LocalDate fechaDeNacimineot = LocalDate.of(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese direccion:");
        String direccion = sc.nextLine();
        System.out.println("Ingrese sueldo:");
        double sueldo = Double.parseDouble(sc.nextLine());
        boolean band = true;String usuario="",password="";
        while (band) {
            System.out.println("Ingrese el usuario deseado:");
            usuario = sc.nextLine();
            System.out.println("Ingrese su password:");
            password = sc.nextLine();
            for (Usuario usuar : usuarios) {
                if (!usuar.getUsuario().equals(usuario)) {
                    band = false;
                }
            }
        }
        Gerente gerente=new Gerente(nombre,apellido, Rol.TRABAJADOR,fechaDeNacimineot,direccion,sueldo,usuario,password);
        agregarGerente(gerente);
    }
}