public class Rectangulo {
    double ancho;
    double alto;

    Rectangulo(double ancho, double alto) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double Area() {
        double Area ;
        Area = this.alto * this.ancho;
        System.out.println(Area);
        return Area;
    }

    public double Perimetro() {
        double perimetro = 0.0;
        perimetro = this.alto * 2.0 + this.ancho * 2.0;
        System.out.println(perimetro);
        return perimetro;}
}
