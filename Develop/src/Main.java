
public class Main {
    public static void main(String[] args) {
        Rectangle Rec = new Rectangle();
        Rec.area(2, 5);
        System.out.println();
        Rec.perimeter(2, 5);
        System.out.println();
        Rec.area(3.44444, 5.0);
        System.out.println();
        Rec.perimeter(3.44444, 5.0);
        System.out.println();
        System.out.println("#####################################");
        Employee empleado = new Employee();
        empleado.calcularSalario(7800.503242);
        System.out.println();
        empleado.calcularSalario(7800.503242, 250.7);
        System.out.println();
        empleado.calcularSalario(7800.503242, 250.7, 5.0);
        System.out.println();
        System.out.println("#####################################");
        CalculadoraImpuestos p1 = new CalculadoraImpuestos();
        p1.calcularImpuestos(4569);
        System.out.println();
        p1.calcularImpuestos(4569, 20.0);
        System.out.println();
        p1.calcularImpuestos(4569.0, 20.0, 325.0);
    }
}