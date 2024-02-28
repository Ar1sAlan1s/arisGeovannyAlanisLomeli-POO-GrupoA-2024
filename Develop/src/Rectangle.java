public class Rectangle {
    int height;
    int widht;
    int perimeter;
    int area;
    double dheight;
    double dwidht;
    double dperimeter;
    double darea;

    public Rectangle() {
    }

    public void perimeter(int height, int widht) {
        this.height = height;
        this.widht = widht;
        this.perimeter = height * 2 + 2 * widht;
        System.out.printf("El perimetro del rectangulo es: %d", this.perimeter);
    }

    public void perimeter(double dheight, double dwidht) {
        this.dheight = dheight;
        this.dwidht = dwidht;
        this.dperimeter = dheight * 2.0 + 2.0 * dwidht;
        System.out.printf("El perimetro del rectangulo es: %.2f", this.dperimeter);
    }

    public void area(int height, int widht) {
        this.height = height;
        this.widht = widht;
        this.area = height * widht;
        System.out.printf("El area del rectangulo es: %d", this.area);
    }

    public void area(double dheight, double dwidht) {
        this.dheight = dheight;
        this.dwidht = dwidht;
        this.darea = dheight * dwidht;
        System.out.printf("El area del rectangulo es: %.2f", this.darea);
    }
}
