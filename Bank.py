import random

class Bank:
    def __init__(self):
        self.k = 0
        self.clientes = []

    def get_clientes(self):
        return self.clientes

    def clientes(self, cliente):
        self.clientes.append(cliente)

    def imprimir_clientes(self):
        for cliente in self.clientes:
            print(f"{cliente.get_name()} {cliente.get_last_name()} No {cliente.get_account().get_account_number()} Type:{cliente.get_account().get_type()} Balance:{cliente.get_account().get_amount()}")

    def info(self, espacio):
        espacio = self.k
        if espacio >= 0:
            cliente = self.clientes[self.k]
            print(f"{cliente.get_name()} {cliente.get_last_name()} No {cliente.get_account().get_account_number()} Type:{cliente.get_account().get_type()} Balance:{cliente.get_account().get_amount()}")

    def buscar_user(self, nombre, last_name):
        for cliente in self.clientes:
            if cliente.get_name() == nombre and cliente.get_last_name() == last_name:
                print(f"{cliente.get_name()} {cliente.get_last_name()} No {cliente.get_account().get_account_number()} Type:{cliente.get_account().get_type()} Balance:{cliente.get_account().get_amount()}")

    def validacion_num(self, acc):
        for cliente in self.clientes:
            if cliente.get_account().get_account_number() == acc:
                acc = random.randint(1, 10)
                return acc
        return acc

    def log_in(self, name, last_name, acc):
        personanew = None
        n, ln, nc = name, last_name, acc
        for k, cliente in enumerate(self.clientes):
            if cliente.get_name() == n and cliente.get_last_name() == ln and cliente.get_account().get_account_number() == nc:
                personanew = cliente
                self.k = k
                self.info(self.k)
                print(f"{cliente.get_name()} {cliente.get_last_name()} No {cliente.get_account().get_account_number()} Type:{cliente.get_account().get_type()} Balance:{cliente.get_account().get_amount()}")
        return personanew
