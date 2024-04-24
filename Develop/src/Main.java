import Shapes.Square;
import Shapes.Triangle;
import Shapes.Rectangle;
import Shapes.Circle;

public class Main {
    public static void main(String[] args) {
        Square cuadrado=new Square(4);
        System.out.println("Cuadrado");
            cuadrado.calcularArea(cuadrado.sides);
            cuadrado.calcularPerimetro(cuadrado.sides);
        Triangle triangulo=new Triangle(5,6);
        System.out.println("Triangulo");
          triangulo.calcularPerimetro(triangulo.base,triangulo.height);
          triangulo.calcularArea(triangulo.base,triangulo.height);
       Rectangle rectangulo=new Rectangle(7,6);
       System.out.println("Rectangulo");
           rectangulo.calcularArea(rectangulo.base,rectangulo.height);
        rectangulo.calcularPerimetro(rectangulo.base,rectangulo.height);
        Circle circulo=new Circle(3,6);
        System.out.println("Circulo");
        circulo.calcularArea(circulo.base,circulo.height);
        circulo.calcularPerimetro(circulo.base,circulo.height);

    }
}