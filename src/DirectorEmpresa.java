public class DirectorEmpresa extends Trabajador{
    private double honorariosAnuales;

    public DirectorEmpresa(String nombre, String cuil, double honorariosAnuales){
        super(nombre, cuil);
        this.honorariosAnuales = honorariosAnuales;
    }

    @Override
    public double calcularImpuesto() {
        return honorariosAnuales * 0.35;
    }
}
