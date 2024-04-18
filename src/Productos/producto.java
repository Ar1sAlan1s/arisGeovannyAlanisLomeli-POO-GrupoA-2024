package Productos;

import java.util.Scanner;
public class producto {
    protected String nombre;
    protected double precio;
    protected String fechaDeImportacion;
    protected int numerDeSerie;
    protected int stock;
    protected int numeroDeProductos;
    Scanner Scan=new Scanner(System.in);
    public producto(String nombre,double precio,String fechaDeImportacion,int numeroDeSerie,int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.fechaDeImportacion = fechaDeImportacion;
        this.numerDeSerie = numeroDeSerie;
        this.stock = stock;
    }
    public int AgregarStock(int cantidad){
        stock=stock+cantidad;
        return stock;
    }
    public int EliminaStock(int cantidad){
        stock=stock-cantidad;
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getFechaDeImportacion() {
        return fechaDeImportacion;
    }

    public int getNumerDeSerie() {
        return numerDeSerie;
    }

    public int getStock() {
        return stock;
    }
}
