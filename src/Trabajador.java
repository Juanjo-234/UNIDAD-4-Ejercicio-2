public abstract class Trabajador {
    String nombre;
    String cuil;

    public Trabajador(String nombre, String cuil){
      this.nombre = nombre;
      this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuil() {
        return cuil;
    }

    public abstract double calcularImpuesto();

}
