package Productos;

import java.util.ArrayList;

public class belleza extends producto {
    String tono;
    public belleza(String nombre,float precio,String fechaDeImportacion,int numeroDeSerie,int stock,String tono) {
        super(nombre,precio,fechaDeImportacion,numeroDeSerie,stock);
        this.tono = tono;
    }
    ArrayList<belleza> listaDeBelleza=new ArrayList();
    ArrayList<belleza> listaDeBellezaComprados=new ArrayList();

    public void registrarBelleza(){
        Scan.nextLine();
        System.out.println("Ingrese el Nombre del producto de limpieza:");
        String nombre=Scan.nextLine();
        System.out.println("Ingrese el precio del producto de limpieza: ");
        float precio=Scan.nextFloat();
        Scan.nextLine();
        System.out.println("Ingrese el fecha de importacion del producto de limpieza:");
        String fechaDeImportacion=Scan.nextLine();
        System.out.println("Ingrese el numero de serie del producto de limpieza:");
        int numeroDeSerie=Scan.nextInt();
        System.out.println("Ingrese el stock del producto de limpieza:");
        int stock=Scan.nextInt();
        System.out.println("Ingrese el area del producto de limpieza:");
        String tono=Scan.nextLine();
        belleza belleza=new belleza(nombre,precio,fechaDeImportacion,numeroDeSerie,stock,tono);
        listaDeBelleza.add(belleza);
    }
    public void listarLimpieza(){
        for (int i = 0; i < listaDeBelleza.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nCaducidad:%s Stock:%d",listaDeBelleza.get(i).getNombre(),listaDeBelleza.get(i).getPrecio(),listaDeBelleza.get(i).getFechaDeImportacion(),listaDeBelleza.get(i).getNumerDeSerie(),listaDeBelleza.get(i).getTono(),listaDeBelleza.get(i).getStock());
            System.out.println();
        }
    }
    public void EliminarLimpieza(){
        for (int i = 0; i < listaDeBelleza.size(); i++) {
            System.out.printf("%d %s %s\n",i+1,listaDeBelleza.get(i).getNombre(),listaDeBelleza.get(i).getStock());
        }
        System.out.println("Ingrese el iterador del producto a eliminar");

    }

    public void eliminarstock(){
        System.out.print("Cuantos productos eliminados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a eliminar:");
        for (int i = 0; i < listaDeBelleza.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDeBelleza.get(i).getNombre(),listaDeBelleza.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDeBelleza.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");
    }

    public void agregarStock(){
        System.out.print("Cuantos productos agregados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a agregar:");
        for (int i = 0; i < listaDeBelleza.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDeBelleza.get(i).getNombre(),listaDeBelleza.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDeBelleza.get(opcion-1).setStock(AgregarStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");

    }
    public void comprarLimpieza(){
        System.out.println("Productos en existencia");
        for (int i = 0; i < listaDeBelleza.size(); i++) {
            if (listaDeBelleza.get(i).getStock()>0) {
                System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nCaducidad:%s Stock:%d",listaDeBelleza.get(i).getNombre(),listaDeBelleza.get(i).getPrecio(),listaDeBelleza.get(i).getFechaDeImportacion(),listaDeBelleza.get(i).getNumerDeSerie(),listaDeBelleza.get(i).getTono(),listaDeBelleza.get(i).getStock());
                System.out.println();}
        }
        System.out.println("Que producto comprara?");
        int opcion=Scan.nextInt();

        System.out.println("Ingrese el total de productos a comprar");
        int numeroDeProductos = Scan.nextInt();
        listaDeBelleza.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        listaDeBellezaComprados.add(listaDeBelleza.get(opcion-1));

    }
    public void eliminarLimpieza(){
        for (int i = 0; i < listaDeBelleza.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nCaducidad:%s Stock:%d",listaDeBelleza.get(i).getNombre(),listaDeBelleza.get(i).getPrecio(),listaDeBelleza.get(i).getFechaDeImportacion(),listaDeBelleza.get(i).getNumerDeSerie(),listaDeBelleza.get(i).getTono(),listaDeBelleza.get(i).getStock());
            System.out.println();
        }
        System.out.println("Que producto eliminar?");
        int opcion=Scan.nextInt();
        if(listaDeBelleza.get(opcion-1)==listaDeBelleza.get(opcion-1)){
            System.out.println("No se ha eliminado el producto a eliminar");
        }else{
            listaDeBelleza.remove(opcion-1);
        }

    }

    public String getTono() {
        return tono;
    }
}
