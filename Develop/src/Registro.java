import java.util.ArrayList;

public class Registro {
    ArrayList<Users> Users = new ArrayList();
    ArrayList<Books> Books = new ArrayList();
    ArrayList<Books> Booksdisponibles = new ArrayList();
    ArrayList<Books> Booksrentados = new ArrayList();
    ArrayList<Users> UsersCompraron = new ArrayList();
    ArrayList<Books> BooksCompraron = new ArrayList();

    public Registro() {
    }

    public void RegistroPersonas(Users persona) {
        this.Users.add(persona);
    }

    public ArrayList<Users> getUsers() {
        return this.Users;
    }

    public void mostrarUsers() {
        for(int i = 0; i < this.Users.size(); ++i) {
            System.out.printf("%d Nombre:%s Edad:%s\n",i, ((Users)this.Users.get(i)).getName(), ((Users)this.Users.get(i)).getEdad());
        }

    }

    public void RegistroLibros(Books libro) {
        this.Books.add(libro);
        this.Booksdisponibles.add(libro);
    }

    public ArrayList<Books> getBooks() {
        return this.Books;
    }

    public void mostrarBooks() {
        for(int i = 0; i < this.Books.size(); ++i) {
            System.out.printf("Titulo:%s Autor:%s\n", ((Books)this.Books.get(i)).getName(), ((Books)this.Books.get(i)).getAutor());
        }

    }

    public void mostrarBooksDisponible() {
        for(int i = 0; i < this.Booksdisponibles.size(); ++i) {
            System.out.printf("%d Titulo:%s Autor:%s\n", i, ((Books)this.Booksdisponibles.get(i)).getName(), ((Books)this.Booksdisponibles.get(i)).getAutor());
        }

    }

    public void mostrarBooksRentados() {
        for(int i = 0; i < this.Booksrentados.size(); ++i) {
            System.out.printf("%d Titulo:%s Autor:%s\n", i, ((Books)this.Booksrentados.get(i)).getName(), ((Books)this.Booksrentados.get(i)).getAutor());
        }

    }
    public void mostrarBooksComprados() {
        for(int i = 0; i < this.BooksCompraron.size(); ++i) {

            System.out.printf("El usuario: %s de %s años compro: %s de %s\n",UsersCompraron.get(i).getName(),UsersCompraron.get(i).getEdad(),BooksCompraron.get(i).getName(),BooksCompraron.get(i).getAutor());


        }

    }

    public void rentarLibro(int opcion) {
        Books librorentado = (Books)this.Booksdisponibles.get(opcion);
        this.Booksrentados.add(librorentado);
        this.Booksdisponibles.remove(opcion);
        System.out.println("****************** ");
    }

    public void regresarLibro(int opcion) {
        Books libroRegresado =Booksrentados.get(opcion);
        this.Booksdisponibles.add(libroRegresado);
        System.out.println("Se ha regresado Exitosamente");
    }

    public void comprarLibro(int opcion,int opcion2) {
        Books librocomprado = Booksdisponibles.get(opcion);
        Users usercomprador=Users.get(opcion2);
        UsersCompraron.add(usercomprador);
        BooksCompraron.add(librocomprado);
        for(int i = 0; i < this.Books.size(); ++i) {
            if (librocomprado == this.Books.get(i)) {
                this.Books.remove(i);
            }
        }

        this.Booksdisponibles.remove(opcion);
        System.out.println("Su compra ha sido exitosa:)");
    }
}
