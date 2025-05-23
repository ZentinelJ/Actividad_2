public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("===== MENÚ =====");
            System.out.println("1. Capturar personas");
            System.out.println("2. Mostrar nombre y género");
            System.out.println("3. Calcular promedio de edad");
            System.out.println("4. Contar personas de género Masculino");
            System.out.println("5. Contar personas de género Femenino");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    capturarPersonas();
                    break;
                case 2:
                    mostrarNombreYGenero();
                    break;
                case 3:
                    System.out.println("Promedio de edades: " + calcularPromedioEdad());
                    break;
                case 4:
                    System.out.println("Cantidad de hombres: " + contarGenero("masculino"));
                    break;
                case 5:
                    System.out.println("Cantidad de mujeres: " + contarGenero("femenino"));
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);
    }
}