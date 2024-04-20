package Biblioteca;
import Usuarios.Cliente;
import Usuarios.Trabajador;
import Usuarios.Usuario;
import Usuarios.Gerente;
import Usuarios.utils.Rol;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    @SuppressWarnings("RawTypes")
    HashMap<Rol,ArrayList<Usuario>> usuarios = new HashMap<>();
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
    public  Usuario verificarInicioSesion(String nombreusuario, String contrasena) {
        Collection<ArrayList<Usuario>> usuariosCollection = usuarios.values();
        for (ArrayList<Usuario> usuariosLista : usuariosCollection) {
            for (Usuario usuario : usuariosLista) {
                if (usuario.getUsuario().equals(nombreusuario)) {
                    if (usuario.getContraseña().equals(contrasena)) {
                        return usuario;
                    }
                }
            }
        }
        return null;
    }


    private ArrayList<String> obtenerDatosComun (Rol rol){
        ArrayList<String> datosComun = new ArrayList<>();
        Scanner leer= new Scanner(System.in);
        //OPERADOR TERNARIO
        // EL ? significa un if a todo lo que pongas antes de eso, los : funcionan como un else para todo lo que venga despues
        String rolActual = rol == Rol.CLIENTE ? "Cliente": rol == Rol.TRABAJADOR ? "Trabajador" : "Gerente";
        System.out.printf("\n Registar %s", rolActual);

        System.out.println("Ingresa el nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingresa el apellido");
        String apellido = leer.nextLine();
        String numero = obtenerNumeroTelefono();
        String nombreUsuario = obtenerNombreUsuario();

        System.out.println("Ingresa la contraseña: ");
        String contraseña = leer.nextLine();

        datosComun.addAll(Arrays.asList(nombre,apellido,numero,nombreUsuario,contraseña));
        return datosComun;
    }

    public void agregarCliente(){
        Scanner leer= new Scanner(System.in);
        System.out.println("HAS SELECCIONADO LA OPCION DE REGISTRAR UN CLIENTE. ");
        ArrayList<String> datosComun = obtenerDatosComun(Rol.CLIENTE);

        String nombre = datosComun.get(0);
        String apellido = datosComun.get(1);
        String telefono = datosComun.get(2);
        String nombreUsuarii = datosComun.get(3);
        String pass = datosComun.get(4);

        System.out.println("Ahora, ingresa en numero el dia de nacimiento  ");
        int day = leer.nextInt();
        System.out.println("Ahora el mes: ");
        int month = leer.nextInt();
        System.out.println("Finalmente, el año: ");
        int year = leer.nextInt();
        LocalDate fecha =LocalDate.of(year,month,day);



        Cliente client = new Cliente(nombre,apellido,Rol.CLIENTE,fecha,telefono,nombreUsuarii,pass);

        if (!usuarios.containsKey(Rol.CLIENTE)){
            usuarios.put(Rol.CLIENTE, new ArrayList<>()); // si es la primera vez q entra un cliente, crea el hashmap con la llave para acceder
            //como el rol y una arraylist que contendra a los clientes
        }

        usuarios.get(Rol.CLIENTE).add(client);

    }

    public void agregarTrabajador(){
        Scanner leer= new Scanner(System.in);
        System.out.println("HAS SELECCIONADO LA OPCION DE REGISTRAR UN TRABAJADOR. ");
        ArrayList<String> datosComun = obtenerDatosComun(Rol.TRABAJADOR);

        String nombre = datosComun.get(0);
        String apellido = datosComun.get(1);
        String telefono = datosComun.get(2);
        String nombreUsuarii = datosComun.get(3);
        String contraseñoa = datosComun.get(4);


        System.out.println("Ahora, ingresa en numero el dia de nacimiento  ");
        int day = leer.nextInt();
        System.out.println("Ahora el mes: ");
        int month = leer.nextInt();
        System.out.println("Finalmente, el año: ");
        int year = leer.nextInt();
        LocalDate fecha =LocalDate.of(year,month,day);
        System.out.println("Ingrese el salario: ");
        double salario=leer.nextDouble();

        System.out.println("Finalmente, ingresa su RFC: ");
        String rfc= leer.nextLine();

        Trabajador trabajador = new Trabajador(nombre,apellido,Rol.TRABAJADOR,salario,rfc,fecha,telefono,contraseñoa,nombreUsuarii);

        if (!usuarios.containsKey(Rol.TRABAJADOR)){
            usuarios.put(Rol.TRABAJADOR, new ArrayList<>()); // si es la primera vez q entra un cliente, crea el hashmap con la llave para acceder
            //como el rol y una arraylist que contendra a los clientes
        }

        usuarios.get(Rol.TRABAJADOR).add(trabajador);

    }

    public void agregarGerente(){
        Scanner leer= new Scanner(System.in);
        ArrayList<String> datosComun = obtenerDatosComun(Rol.GERENTE);

        String nombre = datosComun.get(0);
        String apellido = datosComun.get(1);
        String telefono = datosComun.get(2);
        String nombreUsuarii = datosComun.get(3);
        String contraseñoa = datosComun.get(4);


        System.out.println("Ahora, ingresa en numero el dia de nacimiento  ");
        int day = leer.nextInt();
        System.out.println("Ahora el mes: ");
        int month = leer.nextInt();
        System.out.println("Finalmente, el año: ");
        int year = leer.nextInt();
        LocalDate fecha =LocalDate.of(year,month,day);

        System.out.println("Ingresa la direccion: ");
        leer.nextLine();
        String direccion = leer.nextLine();
        System.out.println("Ingrese sueldo:");
        double sueldo=leer.nextDouble();
        Gerente gerente = new Gerente(nombre,apellido,Rol.GERENTE,fecha,direccion,sueldo,telefono,contraseñoa,nombreUsuarii);

        if (!usuarios.containsKey(Rol.GERENTE)){
            usuarios.put(Rol.GERENTE, new ArrayList<>());
        }

        usuarios.get(Rol.GERENTE).add(gerente);
    }

    private String obtenerNumeroTelefono() {
        Scanner scanner = new Scanner(System.in);
        boolean numeroExistente;
        String telefono;
        Collection<ArrayList<Usuario>> usuariosCollection = usuarios.values(); //obtenemos la coleccion de todos llos dato
        do {
            System.out.println("Ingresa el número de teléfono");
            telefono = scanner.nextLine();
            numeroExistente = false;
            for (ArrayList<Usuario> usuariosLista : usuariosCollection) {
                for (Usuario usuario : usuariosLista) {
                    if (usuario.getNumeroDeTelefono().equals(telefono)) {
                        numeroExistente = true;
                        break;
                    }
                }
            }
            if (numeroExistente) {
                System.out.println("El número ya existe. Inténtalo de nuevo\n");
            }
        } while (numeroExistente);
        return telefono;
    }

    private String obtenerNombreUsuario() {
        Scanner scanner = new Scanner(System.in);
        boolean nombreUsuarioExistente;
        String nombreUsuario;
        Collection<ArrayList<Usuario>> usuariosCollection = usuarios.values(); //obtenemos la coleccion de todos llos dato
        do {
            System.out.println("Ingresa el nombre de usuario");
            nombreUsuario = scanner.nextLine();
            nombreUsuarioExistente = false;
            for (ArrayList<Usuario> usuariosLista : usuariosCollection) {
                for (Usuario usuario : usuariosLista) {
                    if (usuario.getUsuario().equals(nombreUsuario)) {
                        nombreUsuarioExistente = true;
                        break;
                    }
                }
            }
            if (nombreUsuarioExistente) {
                System.out.println("El nombre de usuario ya existe. Inténtalo de nuevo\n");
            }
        } while (nombreUsuarioExistente);
        return nombreUsuario;
    }





    public void mostrarUsuarios(){
        Collection<ArrayList<Usuario>> usuariosCollection = usuarios.values();
        System.out.println("---MOSTRAR A TODOS LOS USUARIOS---");
        for (ArrayList<Usuario> usuariosLista : usuariosCollection){
            for (Usuario usuario : usuariosLista){
                System.out.println();
                System.out.printf("Usuario de nombre: %s %s. ROL: %s ID: %s Fecha de nacimiento: %s. Nombre de usuario: %s \n",usuario.getNombre(),usuario.getApellido(),usuario.getRol()
                        ,usuario.getId(),usuario.getFechaNacimiento(),usuario.getUsuario());
            }

        }

        public void agregarCliente() {
            ArrayList<String> datosComun = obtenerDatosComun(Rol.CLIENTE);
        }

        public void agregarTrabajador() {
            ArrayList<String> datosComun = obtenerDatosComun(Rol.TRABAJADOR);

        }

        public void agregarGerente() {
            ArrayList<String> datosComun = obtenerDatosComun(Rol.GERENTE);
            // Agregar el código para crear un gerente usando los datos comunes y específicos del gerente
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



}