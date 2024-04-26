package Shapes;

public class Circle implements Shape {

    public void calcularArea(double base,double height){
        double area=Math.PI*(base*base);
        System.out.println("Area = "+area);
    }



    public void calcularPerimetro(double radius,double height){
        double perimetro=height*Math.PI;
        System.out.println("Perimetro = "+perimetro);
    }
    @Override
    public void calcularPerimetro(double base) {

    }
    @Override
    public void calcularArea(double sides) {

    }
}
