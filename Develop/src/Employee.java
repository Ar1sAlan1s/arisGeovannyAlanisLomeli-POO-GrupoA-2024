public class Employee {
    double SueldoBase;
    double bonificacion;
    double horasExtra;

    public Employee() {
    }

    public void calcularSalario(double sueldoBase) {
        this.SueldoBase = sueldoBase;
        System.out.printf("El salario es de: %.2f", sueldoBase);
    }

    public void calcularSalario(double sueldoBase, double bonificacion) {
        this.SueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        double fsueldo = sueldoBase + bonificacion;
        System.out.printf("El salario es de: %.2f", fsueldo);
    }

    public void calcularSalario(double sueldoBase, double bonificacion, double horasExtra) {
        this.SueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.horasExtra = horasExtra;
        double fsueldo = sueldoBase + bonificacion + horasExtra * 20.0;
        System.out.printf("El salario es de: %.2f", fsueldo);
    }
}
