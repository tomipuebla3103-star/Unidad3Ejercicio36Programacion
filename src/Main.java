//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Ambulancia ambulancia = new Ambulancia(
            "AB123CD", "Base Central", true, 5, 2
    );

    CamionBomberos bomberos = new CamionBomberos(
            "AC456EF", "Cuartel Norte", true, 5000, 15
    );

    PatrullaPolicial patrulla = new PatrullaPolicial(
            "AD789GH", "Comisaria Centro", true, 3, false
    );

    System.out.println("=== AMBULANCIA ===");
    ambulancia.mostrarDatos();
    ambulancia.activarAlerta();

    System.out.println("\n=== CAMION DE BOMBEROS ===");
    bomberos.mostrarDatos();
    bomberos.activarAlerta();

    System.out.println("\n=== PATRULLA POLICIAL ===");
    patrulla.mostrarDatos();
    patrulla.activarAlerta();
}
