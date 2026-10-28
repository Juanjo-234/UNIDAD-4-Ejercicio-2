import java.util.List;

public class EstudioContable {
    public void procesarYgenerarReporte(List<Trabajador> Trabajadores){
        System.out.println("==========================================================");
        System.out.println("             REPORTE FINANCIERO - ESTUDIO CONTABLE        ");
        System.out.println("==========================================================");
        System.out.printf("%-20s %-18s %-15s%n", "NOMBRE", "CUIL", "IMPUESTO A PAGAR");
        System.out.println("----------------------------------------------------------");

        double totalRecaudacion = 0.0;

        for(Trabajador trabajador : Trabajadores){
            double impuesto = trabajador.calcularImpuesto();
            totalRecaudacion += impuesto;
            System.out.printf("%-20s %-18s $%,12.2f%n",
                    trabajador.getNombre(),
                    trabajador.getCuil(),
                    impuesto);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("RECAUDACIÓN FISCAL TOTAL: $%,26.2f%n", totalRecaudacion);
        System.out.println("==========================================================");
    }

}


