
public class Main {
    public static void main(String[] args) {
        Producto p1=new Producto("Coca",18);
        p1.setNombre("Lacteo");
        p1.setPrecio(25);
        System.out.println(p1.getNombre());
        System.out.println(p1.getPrecio());

        Producto p2=new Producto("Pan",30,5);
        p2.aumentar(4);
        p2.reducirStock(5);
        System.out.println(p2.getNombre());
        System.out.println(p2.getStock());
    }
}