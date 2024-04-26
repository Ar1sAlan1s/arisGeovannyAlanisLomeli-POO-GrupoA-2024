import Shapes.Square;
import Shapes.Triangle;
import Shapes.Rectangle;
import Shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Square cuadrado=new Square();
        System.out.println("Cuadrado");
        cuadrado.calcularArea(4);
        cuadrado.calcularPerimetro(4);
        Triangle triangulo=new Triangle();
        System.out.println("Triangulo");
        triangulo.calcularPerimetro(4,7);
        triangulo.calcularArea(4,4);
        Rectangle rectangulo=new Rectangle();
        System.out.println("Rectangulo");
        rectangulo.calcularArea(6,4);
        rectangulo.calcularPerimetro(9,8);
        Circle circulo=new Circle();
        System.out.println("Circulo");
        circulo.calcularArea(3,9);
        circulo.calcularPerimetro(9,4);

    }
}