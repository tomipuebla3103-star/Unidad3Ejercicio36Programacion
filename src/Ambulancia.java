public class Ambulancia extends VehiculoEmergencia{
    private int stockOxigeno;
    private int medicosAbordo;

    public Ambulancia(String patente, String estacionBase, boolean enServicio,
                      int stockOxigeno, int medicosAbordo) {
        super(patente, estacionBase, enServicio);
        this.stockOxigeno = stockOxigeno;
        this.medicosAbordo = medicosAbordo;
    }

    @Override
    public void activarAlerta() {
        System.out.println("Ambulancia despachada: sirenas y balizas activadas para una emergencia medica.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Stock de oxigeno: " + stockOxigeno);
        System.out.println("Medicos a bordo: " + medicosAbordo);
    }
}
