package Productos;

import java.util.ArrayList;

public class limpieza extends producto {
    private String Area;
    public limpieza(String nombre,float precio,String fechaDeImportacion,int numeroDeSerie,int stock,String Area) {
        super(nombre,precio,fechaDeImportacion,numeroDeSerie,stock);
        this.Area=Area;
    }
    ArrayList<limpieza> listaDeLimpieza=new ArrayList();
    ArrayList<limpieza> listaDeLimpiezaComprados=new ArrayList();

    public void registrarLimpieza(){
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
        String Area=Scan.nextLine();
        limpieza limpieza=new limpieza(nombre,precio,fechaDeImportacion,numeroDeSerie,stock,Area);
        listaDeLimpieza.add(limpieza);
    }
    public void listarLimpieza(){
        for (int i = 0; i < listaDeLimpieza.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nArea:%s Stock:%d",listaDeLimpieza.get(i).getNombre(),listaDeLimpieza.get(i).getPrecio(),listaDeLimpieza.get(i).getFechaDeImportacion(),listaDeLimpieza.get(i).getNumerDeSerie(),listaDeLimpieza.get(i).getArea(),listaDeLimpieza.get(i).getStock());
            System.out.println();
        }
    }
    public void EliminarLimpieza(){
        for (int i = 0; i < listaDeLimpieza.size(); i++) {
            System.out.printf("%d %s %s\n",i+1,listaDeLimpieza.get(i).getNombre(),listaDeLimpieza.get(i).getStock());
        }
        System.out.println("Ingrese el iterador del producto a eliminar");

    }

    public void eliminarstock(){
        System.out.print("Cuantos productos eliminados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a eliminar:");
        for (int i = 0; i < listaDeLimpieza.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDeLimpieza.get(i).getNombre(),listaDeLimpieza.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDeLimpieza.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");
    }

    public void agregarStock(){
        System.out.print("Cuantos productos agregados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a agregar:");
        for (int i = 0; i < listaDeLimpieza.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDeLimpieza.get(i).getNombre(),listaDeLimpieza.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDeLimpieza.get(opcion-1).setStock(AgregarStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");

    }
    public void comprarLimpieza(){
        System.out.println("Productos en existencia");
        for (int i = 0; i < listaDeLimpieza.size(); i++) {
            if (listaDeLimpieza.get(i).getStock()>0) {
                System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nArea:%s Stock:%d",listaDeLimpieza.get(i).getNombre(),listaDeLimpieza.get(i).getPrecio(),listaDeLimpieza.get(i).getFechaDeImportacion(),listaDeLimpieza.get(i).getNumerDeSerie(),listaDeLimpieza.get(i).getArea(),listaDeLimpieza.get(i).getStock());
                System.out.println();}
        }
        System.out.println("Que producto comprara?");
        int opcion=Scan.nextInt();

        System.out.println("Ingrese el total de productos a comprar");
        int numeroDeProductos = Scan.nextInt();
        listaDeLimpieza.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        listaDeLimpiezaComprados.add(listaDeLimpieza.get(opcion-1));

    }
    public void eliminarLimpieza(){
        for (int i = 0; i < listaDeLimpieza.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nArea:%s Stock:%d",listaDeLimpieza.get(i).getNombre(),listaDeLimpieza.get(i).getPrecio(),listaDeLimpieza.get(i).getFechaDeImportacion(),listaDeLimpieza.get(i).getNumerDeSerie(),listaDeLimpieza.get(i).getArea(),listaDeLimpieza.get(i).getStock());
            System.out.println();
        }
        System.out.println("Que producto eliminar?");
        int opcion=Scan.nextInt();
        if(listaDeLimpiezaComprados.get(opcion-1)==listaDeLimpieza.get(opcion-1)){
            System.out.println("No se ha eliminado el producto a eliminar");
        }else{
            listaDeLimpiezaComprados.remove(opcion-1);
        }

    }

    public String getArea() {
        return Area;
    }
}
