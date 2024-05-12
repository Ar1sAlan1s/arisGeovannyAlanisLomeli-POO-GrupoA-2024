package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;
public class Trabajador extends Usuario {

    private double salario;
    private String RFC;
    private LocalDate fechaIngreso;
    private double nomina;
    public Trabajador(String nombre,String apellido,Rol rol,double salario,String RFC,LocalDate fechedenacimiento,String usuario,String contraseña,String numeroDeTelefono) {
        super(nombre,apellido,Rol.TRABAJADOR,usuario,contraseña,fechedenacimiento,numeroDeTelefono);
        this.salario = salario;
        this.RFC = RFC;
        fechaIngreso = LocalDate.now();
    }


    public String getRfc() {return this.rfc;}

    public static void registrarTrabajador(){
        Scanner leer = new Scanner(System.in);
        ArrayList<String> datosComun = DatosComun.obtenerDatosComunes(Rol.Trabajador);

        String nombre = datosComun.get(0);
        String apellido = datosComun.get(1);
        String telefono = datosComun.get(2);
        String usuario = datosComun.get(3);
        String contrasena = datosComun.get(4);

        System.out.println("Ingrese dia de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese ano de nacimiento: ");
        int ano = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese RFC: ");
        String rfc= leer.nextLine();

        Trabajador trabajador = new Trabajador(nombre, apellido, rfc, LocalDate.of(ano, mes, dia),telefono, contrasena, usuario);

        if(!Biblioteca.usuarios.containsKey(Rol.Trabajador)){
            Biblioteca.usuarios.put(Rol.Trabajador, new ArrayList<Usuario>());
        }

        Biblioteca.usuarios.get(Rol.Trabajador).add(trabajador);

        System.out.println("Trabajador agregado correctamente.");
    }

    public static void mostrarTrabajador(Trabajador trabajadorDado){
        for (Usuario usuario: Biblioteca.usuarios.get(Rol.Trabajador)){
            Trabajador trabajador = (Trabajador) usuario;
            if(trabajador == trabajadorDado){
                Usuario.mostrarUsuario(trabajador);
                System.out.println(" RFC: "+trabajador.getRfc());
            }
        }
    }

    public static void mostrarTrabajadores(){
        for (Usuario usuario: Biblioteca.usuarios.get(Rol.Trabajador)){
            Trabajador trabajador = (Trabajador) usuario;
            Usuario.mostrarUsuario(trabajador);
            System.out.println(" RFC: "+trabajador.getRfc());
        }
    }

    public static void eliminarTrabajador(){
        Scanner leer = new Scanner(System.in);
        for (Usuario usuario: Biblioteca.usuarios.get(Rol.Trabajador)){
            Trabajador trabajador = (Trabajador) usuario;
            Usuario.mostrarUsuario(trabajador);
        }
        System.out.println("Ingrese el usuario a remover: ");
        String nombreUsuario = leer.nextLine();
        for (Usuario usuario: Biblioteca.usuarios.get(Rol.Trabajador)){
            Trabajador trabajador = (Trabajador) usuario;
            if (trabajador.getNombreUsuario().equals(nombreUsuario)){
                Biblioteca.usuarios.get(Rol.Trabajador).remove(trabajador);
                System.out.println("Trabajador eliminado.");
                return;
            }
        }
        System.out.println("Trabajador no encontrado");
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void checarEntrada(){
        System.out.println("Se registra la entrada");
    }

    public void checarSalida(){
        System.out.println("Se registra la salida");
    }
}
    public double getSalario() {
        return salario;
    }

    public String getRFC() {
        return RFC;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    @Override
    public String toString() {
        return String.format("%s,Salario:%.2f RFC:%s, Fecha de Ingreso:%s",super.toString(),salario,RFC,fechaIngreso);
    }

    public double getNomina() {
        return nomina;
    }
}
