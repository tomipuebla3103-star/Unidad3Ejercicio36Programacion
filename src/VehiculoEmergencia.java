public class VehiculoEmergencia {
    protected String patente;
    protected String estacionBase;
    protected boolean enServicio;

    public VehiculoEmergencia(String patente, String estacionBase, boolean enServicio) {
        this.patente = patente;
        this.estacionBase = estacionBase;
        this.enServicio = enServicio;
    }

    public void activarAlerta() {
        System.out.println("Sirenas y balizas activadas.");
    }

    public void mostrarDatos() {
        System.out.println("Patente: " + patente);
        System.out.println("Estacion base: " + estacionBase);
        System.out.println("En servicio: " + enServicio);
    }
}
