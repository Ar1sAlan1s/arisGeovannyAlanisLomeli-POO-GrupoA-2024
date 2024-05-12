package Libros;

import Libros.Constantes.Genero;

import java.time.LocalDate;

public class Libro {
    private static int Cantidad_Libros=1;
    private int id;
    private String titulo;
    private String autor;
    private String editorial;
    private LocalDate fechaDePublicacion;
    private Genero genero;
    private  double precio;
    public int stock;

    public Libro(int id,String titulo,String autor,String editorial,LocalDate fechaDePublicacion,Genero genero,double precio,int stock) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaDePublicacion = fechaDePublicacion;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        Cantidad_Libros++;
    }
}
