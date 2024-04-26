package Shapes;

public class Triangle implements Shape{
    public void calcularArea(double base,double height) {
        double area = (base*height)/2;
        System.out.println("Area: "+area);
    }
    public void calcularPerimetro(double base,double height) {
        double lado=Math.sqrt((base*base)+(height*height));
        double perimeter=lado*3;
        System.out.println("Perimetro: "+perimeter);
    }
    @Override
    public void calcularArea(double sides) {

    }

    @Override
    public void calcularPerimetro(double sides) {

    }
}
