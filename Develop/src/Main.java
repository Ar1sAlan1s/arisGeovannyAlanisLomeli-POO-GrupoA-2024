import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        boolean band=true; Bank clientes=new Bank();Employee persona = null;double amount; String validacion;int espacio=0;
        String opcion; String name;String Apellido;
        while (band) {
            System.out.println("Ingrese su opcion:\nSign Up Log In\nDepositar Retirar\nInfo Mostrar clientes\nBuscar Exit");

            Scanner leer=new Scanner(System.in);
            opcion=leer.nextLine();

            switch (opcion.toUpperCase()){
                case "SIGN UP":
                    System.out.println("Ingrese los siguientes datos:");
                    System.out.print("Nombre:");
                    name=leer.nextLine();
                    System.out.print("Apellido:");
                    Apellido=leer.nextLine();
                    Random num=new Random();
                    long accountNumber=num.nextLong(10)+1;
                    clientes.validacionNum(accountNumber);
                    System.out.print("Tipo:");
                    char Type=leer.next().toUpperCase().charAt(0);
                    persona = new Employee(name, Apellido, clientes.validacionNum(accountNumber), Type);
                    clientes.clientes(persona);
                    clientes.info(espacio);
                    espacio++;
                    break;
                case "LOG IN":
                    System.out.println("Ingrese los siguientes datos:");
                    System.out.print("Nombre:");
                    name=leer.nextLine();
                    System.out.print("Apellido:");
                    Apellido=leer.nextLine();
                    System.out.println("Ingrese el numero de cuenta:");
                    long acc=leer.nextLong();
                    persona=clientes.logIn(name,Apellido,acc);


                    break;
                case "DEPOSITAR":
                    System.out.print("Ingrese la cantidad a depositar:");
                    amount=leer.nextLong();
                    System.out.println();
                    System.out.print("Estas seguro?: Y/N");
                    leer.nextLine();
                    validacion= leer.nextLine();
                    if(validacion.charAt(0)=='Y'){
                        persona.getAccount().agregarDinero(amount);}
                    else {
                        System.out.println("No se hizo ningun deposito");
                    }
                    System.out.println();
                    break;

                case "RETIRAR":
                    System.out.print("Ingrese la cantidad a retirar:");
                    amount=leer.nextLong();
                    System.out.println();
                    System.out.print("Estas seguro?: Y/N");
                    leer.nextLine();
                    validacion= leer.nextLine();
                    if(validacion.charAt(0)=='Y'){
                        persona.getAccount().quitarDinero(amount);}
                    else {
                        System.out.println("No se hizo ningun deposito");
                    }
                    System.out.println();
                    break;

                case "INFO":
                    clientes.info(espacio);

                    break;

                case "MOSTRAR CLIENTES":
                    clientes.imprimirClientes();

                    break;

                case "BUSCAR":
                    System.out.println("Ingrese los siguientes datos:");
                    System.out.print("Nombre:");
                    name=leer.nextLine();
                    System.out.print("Apellido:");
                    Apellido=leer.nextLine();
                    clientes.buscarUser(name,Apellido);
                    break;

                case "EXIT":
                    band=false;
                    System.out.println("Sesion cerrada");
                    break;
            }
        }
    }
}
