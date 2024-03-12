import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Users user;
        Books book = null;
        Scanner leer=new Scanner(System.in);
        String nombre,edad;
        Registro registro= new Registro();

        for (boolean band=true;band=true;) {
            System.out.println("1 Registrar Usuario\n2 Mostrar usuarios\n3 Mostrar usuarios que han comprado\n4 Registrar libro\n5 Mostrar libros registrados\n6 Mostrar libros disponibles\n7 Rentar libro\n8 Comprar libro\n9 Regresar libro\n10 Mostrar libros rentados"
            );
            System.out.print("Ingrese la opcion deseada:");
            int opcion=leer.nextInt();
            leer.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese su nombre:");
                    nombre=leer.nextLine();
                    System.out.println("Ingrese su edad:");
                    edad=leer.nextLine();
                    user=new Users(nombre,edad,false);
                    registro.RegistroPersonas(user);
                    System.out.printf("Se a agregado a: %s con %s años.\n",nombre,edad);
                    break;
                case 2:
                    System.out.println("Los usuarios registrados son:");
                    registro.mostrarUsers();
                    break;
                case 3:
                    System.out.println("Los Usuarios compraron:");
                    registro.mostrarBooksComprados();
                    break;
                case 4:
                    System.out.println("Ingrese el titulo:");
                    nombre=leer.nextLine();
                    System.out.println("Ingrese su autor:");
                    edad=leer.nextLine();
                    book=new Books(nombre,edad,true);
                    registro.RegistroLibros(book);
                    System.out.printf("Se a agregado a: %s con %s años.\n",nombre,edad);
                    break;
                case 5:
                    System.out.println("Los libros registrados son:");
                    registro.mostrarBooks();
                    break;
                case 6:
                    System.out.println("Los libros disponibles son:");
                    registro.mostrarBooksDisponible();
                    break;
                case 7:
                    System.out.println("Los libros disponibles son:");
                    registro.mostrarBooksDisponible();
                    System.out.println("Seleccione el libro que quiere rentar:");
                    opcion=leer.nextInt();
                    registro.rentarLibro(opcion);
                    System.out.println("El poceso de renta ha sido exitoso");
                    break;
                case 8:
                    System.out.println("Que usuario comprara?");
                    registro.mostrarUsers();
                    int opcion2= leer.nextInt();
                    System.out.println("Los libros disponibles son:");
                    registro.mostrarBooksDisponible();
                    System.out.println("Seleccione el libro que quiere comprar:");
                    opcion=leer.nextInt();
                    registro.comprarLibro(opcion,opcion2);
                    break;
                case 9:
                    System.out.println("Que libro es el que se regresara?");
                    registro.mostrarBooksRentados();
                    opcion=leer.nextInt();
                    registro.regresarLibro(opcion);
                    break;
                case 10:
                    System.out.println("Los libros rentados son:");
                    registro.mostrarBooksRentados();
                    break;


            }
        }
    }
}