import random

class Employee:
    def __init__(self, nombre, apellido, numero_cuenta, tipo):
        self.nombre = nombre
        self.apellido = apellido
        self.numero_cuenta = numero_cuenta
        self.tipo = tipo

class Account:
    def __init__(self):
        self.balance = 0

    def agregarDinero(self, cantidad):
        self.balance += cantidad

    def quitarDinero(self, cantidad):
        if cantidad <= self.balance:
            self.balance -= cantidad
        else:
            print("No hay suficiente dinero en la cuenta.")

class Bank:
    def __init__(self):
        self.clientes_list = []

    def validacionNum(self, numero):
        # Aquí puedes agregar cualquier lógica de validación que necesites
        return numero

    def clientes(self, persona):
        self.clientes_list.append(persona)

    def logIn(self, nombre, apellido, numero_cuenta):
        for cliente in self.clientes_list:
            if cliente.nombre == nombre and cliente.apellido == apellido and cliente.numero_cuenta == numero_cuenta:
                return cliente
        print("Usuario no encontrado.")
        return None

    def info(self, espacio):
        print("Información del cliente aquí")

    def imprimirClientes(self):
        for cliente in self.clientes_list:
            print(f"Nombre: {cliente.nombre}, Apellido: {cliente.apellido}, Número de cuenta: {cliente.numero_cuenta}, Tipo: {cliente.tipo}")

    def buscarUser(self, nombre, apellido):
        for cliente in self.clientes_list:
            if cliente.nombre == nombre and cliente.apellido == apellido:
                print("Usuario encontrado.")
                return
        print("Usuario no encontrado.")

def main():
    band = True
    clientes = Bank()
    persona = None
    amount = 0
    validacion = ""
    espacio = 0

    while band:
        print("Ingrese su opcion:\nSign Up Log In\nDepositar Retirar\nInfo Mostrar clientes\nBuscar Exit")

        opcion = input().upper()

        if opcion == "SIGN UP":
            print("Ingrese los siguientes datos:")
            name = input("Nombre: ")
            apellido = input("Apellido: ")
            accountNumber = random.randint(1, 10)
            clientes.validacionNum(accountNumber)
            Type = input("Tipo: ").upper()[0]
            persona = Employee(name, apellido, clientes.validacionNum(accountNumber), Type)
            clientes.clientes(persona)
            clientes.info(espacio)
            espacio += 1

        elif opcion == "LOG IN":
            print("Ingrese los siguientes datos:")
            name = input("Nombre: ")
            apellido = input("Apellido: ")
            acc = int(input("Ingrese el numero de cuenta: "))
            persona = clientes.logIn(name, apellido, acc)

        elif opcion == "DEPOSITAR":
            amount = float(input("Ingrese la cantidad a depositar: "))
            print()
            validacion = input("Estas seguro?: Y/N ")
            if validacion.upper() == 'Y':
                persona.getAccount().agregarDinero(amount)
            else:
                print("No se hizo ningun deposito")
            print()

        elif opcion == "RETIRAR":
            amount = float(input("Ingrese la cantidad a retirar: "))
            print()
            validacion = input("Estas seguro?: Y/N ")
            if validacion.upper() == 'Y':
                persona.getAccount().quitarDinero(amount)
            else:
                print("No se hizo ningun retiro")
            print()

        elif opcion == "INFO":
            clientes.info(espacio)

        elif opcion == "MOSTRAR CLIENTES":
            clientes.imprimirClientes()

        elif opcion == "BUSCAR":
            print("Ingrese los siguientes datos:")
            name = input("Nombre: ")
            apellido = input("Apellido: ")
            clientes.buscarUser(name, apellido)

        elif opcion == "EXIT":
            band = False
            print("Sesion cerrada")

if __name__ == "__main__":
    main()
