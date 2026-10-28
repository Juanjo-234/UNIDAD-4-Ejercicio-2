public class EmpleadoRelacionDependencia extends Trabajador{

private double sueldoAnual;

    public EmpleadoRelacionDependencia(String nombre, String cuil, double sueldoAnual){
        super(nombre, cuil);
        this.sueldoAnual = sueldoAnual;
    }

    @Override
    public double calcularImpuesto() {
        return sueldoAnual * 0.10;
    }
}
