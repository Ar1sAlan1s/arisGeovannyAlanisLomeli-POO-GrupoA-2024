package Productos;

import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomesticos extends producto {
    ArrayList<Electrodomesticos> listaDeElectrodomesticos=new ArrayList();
    ArrayList<Electrodomesticos> listaDeElectrodomesticosComprados=new ArrayList();
    private String Marca;
    public Electrodomesticos(String nombre,double precio,String fechaDeImportacion,int numeroDeSerie,int stock,String Marca) {
        super(nombre,precio,fechaDeImportacion,numeroDeSerie,stock);
        this.Marca=Marca;
    }
    public void registrarElectrodomestico(){
        Scan.nextLine();
        System.out.println("Ingrese el Nombre del Electrodomestico:");
        String nombre=Scan.nextLine();
        System.out.println("Ingrese el precio del Electrodomestico: ");
        double precio=Scan.nextDouble();
        Scan.nextLine();
        System.out.println("Ingrese el fecha de importacion del Electrodomestico:");
        String fechaDeImportacion=Scan.nextLine();
        System.out.println("Ingrese el numero de serie del Electrodomestico:");
        int numeroDeSerie=Scan.nextInt();
        System.out.println("Ingrese el stock del Electrodomestico:");
        int stock=Scan.nextInt();
        System.out.println("Ingrese el Marca de Electrodomestico:");
        Electrodomesticos electrodomesticos=new Electrodomesticos(nombre,precio,fechaDeImportacion,numeroDeSerie,stock,Marca);
        listaDeElectrodomesticos.add(electrodomesticos);
    }
    public void listarElectrodomesticos(){
        for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nMarca:%s Stock:%d",listaDeElectrodomesticos.get(i).getNombre(),listaDeElectrodomesticos.get(i).getPrecio(),listaDeElectrodomesticos.get(i).getFechaDeImportacion(),listaDeElectrodomesticos.get(i).getNumerDeSerie(),listaDeElectrodomesticos.get(i).getMarca(),listaDeElectrodomesticos.get(i).getStock());
            System.out.println();
        }
    }
    public void EliminarElectrodomesticos(){
        for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
            System.out.printf("%d %s %s\n",i+1,listaDeElectrodomesticos.get(i).getNombre(),listaDeElectrodomesticos.get(i).getStock());
        }
        System.out.println("Ingrese el iterador del producto a eliminar");

    }

    public void eliminarstock(){
        System.out.print("Cuantos productos eliminados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a eliminar:");
        for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDeElectrodomesticos.get(i).getNombre(),listaDeElectrodomesticos.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDeElectrodomesticos.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");
    }

    public void agregarStock(){
        System.out.print("Cuantos productos agregados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a agregar:");
        for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDeElectrodomesticos.get(i).getNombre(),listaDeElectrodomesticos.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDeElectrodomesticos.get(opcion-1).setStock(AgregarStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");

    }
    public void comprarElectrodomesticos(){
        System.out.println("Productos en existencia");
        for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
            if (listaDeElectrodomesticos.get(i).getStock()>0) {
            System.out.printf("%d:Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nMarca:%s Stock:%d",i+1,listaDeElectrodomesticos.get(i).getNombre(),listaDeElectrodomesticos.get(i).getPrecio(),listaDeElectrodomesticos.get(i).getFechaDeImportacion(),listaDeElectrodomesticos.get(i).getNumerDeSerie(),listaDeElectrodomesticos.get(i).getMarca(),listaDeElectrodomesticos.get(i).getStock());
            System.out.println();}
        }
        System.out.println("Que producto comprara?");
        int opcion=Scan.nextInt();

        System.out.println("Ingrese el total de productos a comprar");
        int numeroDeProductos = Scan.nextInt();
        listaDeElectrodomesticos.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        listaDeElectrodomesticosComprados.add(listaDeElectrodomesticos.get(opcion-1));

    }
    public void eliminarElectrodomesticos(){
        for (int i = 0; i < listaDeElectrodomesticos.size(); i++) {
            System.out.printf("%d:Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nMarca:%s Stock:%d",i+1,listaDeElectrodomesticos.get(i).getNombre(),listaDeElectrodomesticos.get(i).getPrecio(),listaDeElectrodomesticos.get(i).getFechaDeImportacion(),listaDeElectrodomesticos.get(i).getNumerDeSerie(),listaDeElectrodomesticos.get(i).getMarca(),listaDeElectrodomesticos.get(i).getStock());
            System.out.println();
        }
        System.out.println("Que producto eliminar?");
        int opcion=Scan.nextInt();
        if(listaDeElectrodomesticosComprados.get(opcion-1)==listaDeElectrodomesticosComprados.get(opcion-1)){
            System.out.println("No se ha eliminado el producto a eliminar");
        }else{
            listaDeElectrodomesticosComprados.remove(opcion-1);
        }

    }
    public String getMarca() {
        return Marca;
    }
}
