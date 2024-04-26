package Shapes;

public class Square implements Shape {
    public void calcularArea(double base, double height) {
        double area = base*height;
        System.out.println("Area: " + area);
    }
    public void calcularPerimetro(double base, double height) {
        double perimeter = (2*base)+(2*height);
        System.out.println("Perimeter: " + perimeter);
    }
    @Override
    public void calcularArea(double sides) {

    }

    @Override
    public void calcularPerimetro(double sides) {

    }
}
