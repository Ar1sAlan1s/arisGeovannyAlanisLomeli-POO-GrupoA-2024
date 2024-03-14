class Books:
    def __init__(self, name, autor, disponible):
        self.name = name
        self.autor = autor
        self.disponible = disponible

    def getDisponible(self):
        return self.disponible

    def setDisponible(self, disponible):
        self.disponible = disponible

    def getName(self):
        return self.name

    def getAutor(self):
        return self.autor
