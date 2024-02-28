public class CalculadoraImpuestos {
    int ingresos;
    double porcentajeImpuestos;
    double dividendos;
    double exencion;

    public CalculadoraImpuestos() {
    }

    public void calcularImpuestos(int ingresos) {
        this.ingresos = ingresos;
        double ingresos2 = (double)ingresos * 0.15;
        ingresos2 += (double)ingresos;
        System.out.printf("Sus ingresos son: %.2f", ingresos2);
    }

    public void calcularImpuestos(int ingresos, double porcentajeImpuestos) {
        this.ingresos = ingresos;
        this.porcentajeImpuestos = porcentajeImpuestos;
        double r = (double)ingresos * (porcentajeImpuestos / 100.0);
        System.out.printf("Sus ingresos son: %.2f", r);
    }

    public void calcularImpuestos(double porcentajeImpuestos, double dividendos, double exencion) {
        this.dividendos = dividendos;
        this.exencion = exencion;
        this.porcentajeImpuestos = porcentajeImpuestos;
        double impuestos = dividendos * (porcentajeImpuestos / 100.0);
        if (impuestos > exencion) {
            double r = impuestos - exencion;
            System.out.printf("Sus impuestos son %.2f", r);
        } else {
            System.out.println("0");
        }

    }
}
