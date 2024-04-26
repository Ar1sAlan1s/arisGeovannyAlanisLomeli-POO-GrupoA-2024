package Shapes;

public interface Shape {
    public double base = 0;
    public double height = 0;
    public double sides = 0;





    public abstract void calcularArea(double sides);
    public abstract void calcularPerimetro(double sides);
    public abstract void calcularArea(double base, double height);
    public abstract void calcularPerimetro(double base, double height);
}

