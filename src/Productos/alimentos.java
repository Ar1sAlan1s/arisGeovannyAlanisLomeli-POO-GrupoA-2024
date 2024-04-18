package Productos;

import java.util.ArrayList;

public class alimentos extends producto {
    String caducidad;
    public alimentos(String nombre,float precio,String fechaDeImportacion,int numeroDeSerie,int stock,String caducidad) {
        super(nombre,precio,fechaDeImportacion,numeroDeSerie,stock);
        this.caducidad=caducidad;
    }
    ArrayList<alimentos> listaDealimentos=new ArrayList();
    ArrayList<alimentos> listaDeAlimentosComprados=new ArrayList();

    public void registrarLimpieza(){
        Scan.nextLine();
        System.out.println("Ingrese el Nombre del alimento:");
        String nombre=Scan.nextLine();
        System.out.println("Ingrese el precio del alimento: ");
        float precio=Scan.nextFloat();
        Scan.nextLine();
        System.out.println("Ingrese el fecha de importacion del alimento:");
        String fechaDeImportacion=Scan.nextLine();
        System.out.println("Ingrese el numero de serie del alimento:");
        int numeroDeSerie=Scan.nextInt();
        System.out.println("Ingrese el stock del alimento:");
        int stock=Scan.nextInt();
        System.out.println("Ingrese el area del alimento :");
        String caducidad=Scan.nextLine();
        alimentos alimentos=new alimentos(nombre,precio,fechaDeImportacion,numeroDeSerie,stock,caducidad);
        listaDealimentos.add(alimentos);
    }
    public void listarLimpieza(){
        for (int i = 0; i < listaDealimentos.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nCaducidad:%s Stock:%d",listaDealimentos.get(i).getNombre(),listaDealimentos.get(i).getPrecio(),listaDealimentos.get(i).getFechaDeImportacion(),listaDealimentos.get(i).getNumerDeSerie(),listaDealimentos.get(i).getCaducidad(),listaDealimentos.get(i).getStock());
            System.out.println();
        }
    }
    public void EliminarLimpieza(){
        for (int i = 0; i < listaDealimentos.size(); i++) {
            System.out.printf("%d %s %s\n",i+1,listaDealimentos.get(i).getNombre(),listaDealimentos.get(i).getStock());
        }
        System.out.println("Ingrese el iterador del producto a eliminar");

    }

    public void eliminarstock(){
        System.out.print("Cuantos productos eliminados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a eliminar:");
        for (int i = 0; i < listaDealimentos.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDealimentos.get(i).getNombre(),listaDealimentos.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDealimentos.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");
    }

    public void agregarStock(){
        System.out.print("Cuantos productos agregados son: ");
        int numeroDeProductos = Scan.nextInt();
        System.out.println("Ingrese el producto a agregar:");
        for (int i = 0; i < listaDealimentos.size(); i++) {
            System.out.printf("%d %s %s",i+1,listaDealimentos.get(i).getNombre(),listaDealimentos.get(i).getStock());
        }
        int opcion=Scan.nextInt();
        listaDealimentos.get(opcion-1).setStock(AgregarStock(numeroDeProductos));
        System.out.println("Se ha eliminado el stock producto a eliminar");

    }
    public void compraralimento(){
        System.out.println("Productos en existencia");
        for (int i = 0; i < listaDealimentos.size(); i++) {
            if (listaDealimentos.get(i).getStock()>0) {
                System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nArea:%s Stock:%d",listaDealimentos.get(i).getNombre(),listaDealimentos.get(i).getPrecio(),listaDealimentos.get(i).getFechaDeImportacion(),listaDealimentos.get(i).getNumerDeSerie(),listaDealimentos.get(i).getCaducidad(),listaDealimentos.get(i).getStock());
                System.out.println();}
        }
        System.out.println("Que producto comprara?");
        int opcion=Scan.nextInt();

        System.out.println("Ingrese el total de productos a comprar");
        int numeroDeProductos = Scan.nextInt();
        listaDealimentos.get(opcion-1).setStock(EliminaStock(numeroDeProductos));
        listaDealimentos.add(listaDealimentos.get(opcion-1));

    }
    public void eliminaralimento(){
        for (int i = 0; i < listaDealimentos.size(); i++) {
            System.out.printf("Nombre:%s Precio:%.2f\nFecha de importacion:%s Numero de serie:%d\nArea:%s Stock:%d",listaDealimentos.get(i).getNombre(),listaDealimentos.get(i).getPrecio(),listaDealimentos.get(i).getFechaDeImportacion(),listaDealimentos.get(i).getNumerDeSerie(),listaDealimentos.get(i).getCaducidad(),listaDealimentos.get(i).getStock());
            System.out.println();
        }
        System.out.println("Que producto eliminar?");
        int opcion=Scan.nextInt();
        if(listaDealimentos.get(opcion-1)==listaDeAlimentosComprados.get(opcion-1)){
            System.out.println("No se ha eliminado el producto a eliminar");
        }else{
            listaDeAlimentosComprados.remove(opcion-1);
        }

    }

    public String getCaducidad() {
        return caducidad;
    }
}
