import random


class Employee:
    def __init__(self, name, last_name, account_number=None, type=None):
        if type not in ['A', 'B', 'C']:
            print("Tipo de cuenta invalido")
            print("Recuerda que solo hay tipo 'A', 'B' y 'C'")
            print("Ingrese de nuevo el tipo de cuenta:")
            type = input().upper()

        self.name = name
        self.last_name = last_name
        if account_number is not None and type is not None:
            self.account = BankAccount(account_number, type)
        else:
            self.account = None

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_last_name(self):
        return self.last_name

    def set_last_name(self, last_name):
        self.last_name = last_name

    def get_account(self):
        return self.account

    def mostrar_info_all(self):
        pass


class BankAccount:
    def __init__(self, account_number, account_type):
        self.account_number = account_number
        self.account_type = account_type

    def agregar_dinero(self, amount):
        pass

    def quitar_dinero(self, amount):
        pass


class Bank:
    def __init__(self):
        pass

    def validacion_num(self, account_number):
        pass

    def clientes(self, employee):
        pass

    def info(self, espacio):
        pass

    def log_in(self, name, last_name, account_number):
        pass

    def imprimir_clientes(self):
        pass

    def buscar_user(self, name, last_name):
        pass


def main():
    band = True
    clientes = Bank()
    persona = None
    amount = 0
    validacion = ""
    espacio = 0

