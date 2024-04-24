package Shapes;

public abstract class Shape {
    public double base;
    public double height;
    public double sides;
    Shape(double sides) {
        this.sides = sides;
    }
    Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }




    public abstract void calcularArea(double sides);
    public abstract void calcularPerimetro(double sides);
    public abstract void calcularArea(double base, double height);
    public abstract void calcularPerimetro(double base, double height);
}
