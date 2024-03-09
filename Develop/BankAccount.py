class BankAccount:
    def __init__(self, account_number, type):
        self.account_number = account_number
        self.amount = 0
        self.type = type

    def get_account_number(self):
        return self.account_number

    def get_amount(self):
        return self.amount

    def set_amount(self, amount):
        self.amount = amount

    def agregar_dinero(self, amount):
        if self.type == 'A':
            self.agregar_dinero_a(amount)
        elif self.type == 'B':
            self.agregar_dinero_b(amount)
        elif self.type == 'C':
            self.amount += amount
            print("Su deposito fue EXITOSO")

    def agregar_dinero_a(self, amount):
        if self.amount + amount <= 50000:
            self.amount += amount
            print("Su deposito fue EXITOSO")
        else:
            print("Su monto excede la cantidad máxima")
            self.amount = self.amount

    def agregar_dinero_b(self, amount):
        if self.amount + amount <= 100000:
            self.amount += amount
            print("Su deposito fue EXITOSO")
        else:
            print("Su monto excede la cantidad máxima")
            self.amount = self.amount

    def quitar_dinero(self, amount):
        if self.type == 'A':
            self.sacar_dinero_a(amount)
        elif self.type == 'B':
            self.sacar_dinero_b(amount)
        elif self.type == 'C':
            if self.amount - amount >= 0:
                self.amount -= amount
                print("Su retiro fue EXITOSO")
            else:
                print("No tiene suficiente dinero")

    def sacar_dinero_a(self, amount):
        if self.amount - amount >= 0:
            self.amount -= amount
            print("Su retiro fue EXITOSO")
        else:
            print("No tiene suficiente dinero")

    def sacar_dinero_b(self, amount):
        if self.amount - amount >= 0:
            self.amount -= amount
            print("Su retiro fue EXITOSO")
        else:
            print("No tiene suficiente dinero")
