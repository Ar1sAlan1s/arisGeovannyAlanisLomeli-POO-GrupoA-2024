package Shapes;

public class Square extends Shape {


    public Square(double sides) {
        super(sides);
    }


    public void calcularArea(double sides){
        double area = sides*sides;
        System.out.println("Area: " + area);
    }
    public void calcularPerimetro(double sides){
        double perimetro = sides*4;
        System.out.println("Perimetro: " + perimetro);
    }

    @Override
    public void calcularArea(double base, double height) {

    }

    @Override
    public void calcularPerimetro(double base, double height) {

    }
}
