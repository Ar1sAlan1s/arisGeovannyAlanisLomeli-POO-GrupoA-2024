class Users:
    def __init__(self, nombre, edad, comprado):
        self.nombre = nombre
        self.edad = edad
        self.comprado = comprado

class Books:
    def __init__(self, titulo, autor, disponible):
        self.titulo = titulo
        self.autor = autor
        self.disponible = disponible

class Registro:
    def __init__(self):
        self.usuarios = []
        self.libros = []

    def RegistroPersonas(self, user):
        self.usuarios.append(user)

    def mostrarUsers(self):
        for user in self.usuarios:
            print(f"Nombre: {user.nombre}, Edad: {user.edad}")

    def mostrarBooksComprados(self):
        for book in self.libros:
            if book.disponible:
                print(f"Titulo: {book.titulo}, Autor: {book.autor}")

    def RegistroLibros(self, book):
        self.libros.append(book)

    def mostrarBooks(self):
        for book in self.libros:
            print(f"Titulo: {book.titulo}, Autor: {book.autor}")

    def mostrarBooksDisponible(self):
        for book in self.libros:
            if book.disponible:
                print(f"Titulo: {book.titulo}, Autor: {book.autor}")

    def rentarLibro(self, opcion):
        self.libros[opcion - 1].disponible = False

    def comprarLibro(self, opcion, opcion2):
        self.libros[opcion - 1].disponible = False
        self.usuarios[opcion2 - 1].comprado = True

    def mostrarBooksRentados(self):
        for idx, book in enumerate(self.libros):
            if not book.disponible:
                print(f"{idx + 1}. Titulo: {book.titulo}, Autor: {book.autor}")

    def regresarLibro(self, opcion):
        self.libros[opcion - 1].disponible = True


registro = Registro()

while True:
    print("""
    1 Registrar Usuario
    2 Mostrar usuarios
    3 Mostrar usuarios que han comprado
    4 Registrar libro
    5 Mostrar libros registrados
    6 Mostrar libros disponibles
    7 Rentar libro
    8 Comprar libro
    9 Regresar libro
    10 Mostrar libros rentados
    """)
    opcion = int(input("Ingrese la opcion deseada: "))
    nombre = ""
    edad = ""
    if opcion in [1, 4]:
        nombre = input("Ingrese el nombre: ")
        edad = input("Ingrese la edad: ")
    if opcion == 1:
        user = Users(nombre, edad, False)
        registro.RegistroPersonas(user)
        print(f"Se ha agregado a: {nombre} con {edad} años.")
    elif opcion == 2:
        print("Los usuarios registrados son:")
        registro.mostrarUsers()
    elif opcion == 3:
        print("Los Usuarios compraron:")
        registro.mostrarBooksComprados()
    elif opcion == 4:
        titulo = input("Ingrese el título: ")
        autor = input("Ingrese el autor: ")
        book = Books(titulo, autor, True)
        registro.RegistroLibros(book)
        print(f"Se ha agregado a: {titulo} de {autor}.")
    elif opcion == 5:
        print("Los libros registrados son:")
        registro.mostrarBooks()
    elif opcion == 6:
        print("Los libros disponibles son:")
        registro.mostrarBooksDisponible()
    elif opcion == 7:
        print("Los libros disponibles son:")
        registro.mostrarBooksDisponible()
        opcion = int(input("Seleccione el libro que quiere rentar: "))
        registro.rentarLibro(opcion)
        print("El proceso de renta ha sido exitoso.")
    elif opcion == 8:
        print("¿Qué usuario comprará?")
        registro.mostrarUsers()
        opcion2 = int(input())
        print("Los libros disponibles son:")
        registro.mostrarBooksDisponible()
        opcion = int(input("Seleccione el libro que quiere comprar: "))
        registro.comprarLibro(opcion, opcion2)
    elif opcion == 9:
        print("¿Qué libro se regresará?")
        registro.mostrarBooksRentados()
        opcion = int(input())
        registro.regresarLibro(opcion)
    elif opcion == 10:
        print("Los libros rentados son:")
        registro.mostrarBooksRentados()
