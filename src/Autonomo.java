public class Autonomo extends Trabajador{
    private double facturacionAnual;

    public Autonomo(String nombre, String cuil, double facturacionAnual){
        super(nombre, cuil);
        this.facturacionAnual = facturacionAnual;
    }

    @Override
    public double calcularImpuesto() {
        return facturacionAnual * 0.21;
    }
}
