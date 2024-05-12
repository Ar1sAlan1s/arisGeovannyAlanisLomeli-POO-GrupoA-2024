package Libros;

import Libros.Constantes.Genero;
import Libros.Constantes.SubgeneroTerror;

import java.time.LocalDate;

public class LibroTerror extends Libro {
    private SubgeneroTerror subgeneroTerror;
    public LibroTerror(int id,String titulo,String autor,String editorial,LocalDate fechaDePublicacion,Genero genero,double precio,int stock,SubgeneroTerror subgeneroTerror) {
        super(id,titulo,autor,editorial,fechaDePublicacion,Genero.Terror,precio,stock);
        this.subgeneroTerror=subgeneroTerror;
    }
}
