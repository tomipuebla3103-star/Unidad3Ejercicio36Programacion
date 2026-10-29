public class CamionBomberos extends VehiculoEmergencia{
    private double capacidadAgua;
    private double longitudEscala;

    public CamionBomberos(String patente, String estacionBase, boolean enServicio,
                          double capacidadAgua, double longitudEscala) {
        super(patente, estacionBase, enServicio);
        this.capacidadAgua = capacidadAgua;
        this.longitudEscala = longitudEscala;
    }

    @Override
    public void activarAlerta() {
        System.out.println("Camion de bomberos despachado: sirenas y balizas activadas para un incendio.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capacidad de agua: " + capacidadAgua + " litros");
        System.out.println("Longitud de escala: " + longitudEscala + " metros");
    }
}
