//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Trabajador> carteraClientes = new ArrayList<>();


    carteraClientes.add(new EmpleadoRelacionDependencia("Juan Pérez", "20-35444111-9", 1800000.0));
    carteraClientes.add(new Autonomo("María Gómez", "27-28555666-4", 3200000.0));
    carteraClientes.add(new DirectorEmpresa("Carlos Rodríguez", "20-15333222-1", 9500000.0));
    carteraClientes.add(new EmpleadoRelacionDependencia("Ana López", "27-39111222-3", 2100000.0));
    carteraClientes.add(new Autonomo("Lucía Fernández", "27-31444555-8", 4500000.0));

    EstudioContable estudio = new EstudioContable();


    estudio.procesarYgenerarReporte(carteraClientes);

}
