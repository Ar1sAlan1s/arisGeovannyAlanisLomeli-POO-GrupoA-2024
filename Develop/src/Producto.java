public class Producto {
    int cantidad;
    private String nombre;
    private float precio;
    private int stock;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre!=null){ this.nombre = nombre;}
    }
    public float getPrecio() {
        return precio;
    }



    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        if(stock>=0){stock = stock;}
    }
    public Producto(String nombre, float precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;

    }
    public Producto(String nombre,float precio){
        this.nombre=nombre;
        this.precio=precio;
        stock=0;


    }
    public void aumentar(int cantidad) {
        this.cantidad = cantidad;
        if (cantidad > 0) {
            stock = stock + cantidad;
        }
    }

    public void reducirStock(int cantidad){
        this.cantidad=cantidad;
        if(cantidad>0&&cantidad<=stock){
            stock=stock-cantidad;
        }


    }

}
