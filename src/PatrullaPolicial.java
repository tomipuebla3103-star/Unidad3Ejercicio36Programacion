public class PatrullaPolicial extends VehiculoEmergencia{
    private int cantidadEfectivos;
    private boolean blindaje;

    public PatrullaPolicial(String patente, String estacionBase, boolean enServicio,
                            int cantidadEfectivos, boolean blindaje) {
        super(patente, estacionBase, enServicio);
        this.cantidadEfectivos = cantidadEfectivos;
        this.blindaje = blindaje;
    }

    @Override
    public void activarAlerta() {
        System.out.println("Patrulla policial despachada: balizas activadas para un operativo de seguridad.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de efectivos: " + cantidadEfectivos);
        System.out.println("Blindaje: " + blindaje);
    }
}
