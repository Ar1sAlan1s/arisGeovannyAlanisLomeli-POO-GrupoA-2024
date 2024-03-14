class Registro:
    def __init__(self):
        self.users = []
        self.books = []
        self.books_disponibles = []
        self.books_rentados = []
        self.users_compraron = []
        self.books_compraron = []

    def registro_personas(self, persona):
        self.users.append(persona)

    def mostrar_users(self):
        for i, user in enumerate(self.users):
            print(f"{i} Nombre: {user.getName()} Edad: {user.getEdad()}")

    def registro_libros(self, libro):
        self.books.append(libro)
        self.books_disponibles.append(libro)

    def mostrar_books(self):
        for book in self.books:
            print(f"Titulo: {book.getName()} Autor: {book.getAutor()}")

    def mostrar_books_disponible(self):
        for i, book in enumerate(self.books_disponibles):
            print(f"{i} Titulo: {book.getName()} Autor: {book.getAutor()}")

    def mostrar_books_rentados(self):
        for i, book in enumerate(self.books_rentados):
            print(f"{i} Titulo: {book.getName()} Autor: {book.getAutor()}")

    def mostrar_books_comprados(self):
        for i in range(len(self.books_compraron)):
            print(f"El usuario: {self.users_compraron[i].getName()} de {self.users_compraron[i].getEdad()} años compró: {self.books_compraron[i].getName()} de {self.books_compraron[i].getAutor()}")

    def rentar_libro(self, opcion):
        libro_rentado = self.books_disponibles[opcion]
        self.books_rentados.append(libro_rentado)
        del self.books_disponibles[opcion]
        print("******************")

    def regresar_libro(self, opcion):
        libro_regresado = self.books_rentados[opcion]
        self.books_disponibles.append(libro_regresado)
        print("Se ha regresado Exitosamente")

    def comprar_libro(self, opcion, opcion2):
        libro_comprado = self.books_disponibles[opcion]
        user_comprador = self.users[opcion2]
        self.users_compraron.append(user_comprador)
        self.books_compraron.append(libro_comprado)
        self.books.remove(libro_comprado)
        del self.books_disponibles[opcion]
        print("Su compra ha sido exitosa:)")
