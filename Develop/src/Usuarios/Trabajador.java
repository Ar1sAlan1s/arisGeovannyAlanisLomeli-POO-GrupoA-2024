package Usuarios;
import Usuarios.utils.Rol;
import java.time.LocalDate;
public class Trabajador extends Usuario {
    private double salario;
    private String RFC;
    private LocalDate fechaIngreso;
    private double nomina;
    public Trabajador(String nombre,String apellido,Rol rol,double salario,String RFC) {
        super(nombre,apellido,rol);
        this.salario = salario;
        this.RFC = RFC;
        fechaIngreso = LocalDate.now();
    }
    @Override
    public String toString() {
        return String.format("%s,Salario:%.2f RFC:%s, Fecha de Ingreso:%s",super.toString(),salario,RFC,fechaIngreso);
    }

    public double getNomina() {
        return nomina;
    }
}
