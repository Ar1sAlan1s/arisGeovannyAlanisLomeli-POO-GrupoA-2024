package Usuarios;
import java.util.Scanner;
import java.util.ArrayList;

public class Cliente {
    Scanner sc = new Scanner(System.in);
    ArrayList<Cliente> clientes=new ArrayList<>();
    private String nombre;
    private String apellido;
    private int edad;
    public Cliente(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void RegistrarCliente() {
        System.out.println("Ingrese el nombre del cliente");
        String nombre=sc.nextLine();
        System.out.println("Ingrese el apellido del cliente");
        String apellido=sc.nextLine();
        System.out.println("Ingrese el edad del cliente");
        int edad=sc.nextInt();
        clientes.add(new Cliente(nombre,apellido,edad));
    }
    public void ListarClientes() {
        System.out.println("Clientes Registrados");
        for (Cliente cliente : clientes) {
            System.out.printf("Nombre: %s Apellido: %s Edad: %d\n", cliente.getNombre(),cliente.getApellido(),cliente.getEdad());
        }

    }
    public void EliminarCliente() {
        int i=0;
        for (Cliente cliente : clientes) {
            i++;
            System.out.printf("%dNombre: %s Apellido: %s Edad: %d\n", i,cliente.getNombre(),cliente.getApellido(),cliente.getEdad());
        }
        System.out.println("Cliente a elminar:");
        int opcion=sc.nextInt();
        clientes.remove(i-1);
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
