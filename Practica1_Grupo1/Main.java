import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Agregar");
            System.out.println("2. Buscar");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregar(arbol);
                    break;
                case 2:
                    buscar(arbol);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);

        scanner.close();
    }


    public static void agregar(Arbol arbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor a agregar: ");
        int valor = scanner.nextInt();
        arbol.insertar(valor);
        System.out.println("Valor agregado: " + valor);
    }

    public static void buscar(Arbol arbol) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar: ");
        int valor = scanner.nextInt();
        boolean encontrado = arbol.buscar(valor);
        if (encontrado) {
            System.out.println("Valor " + valor + " encontrado.");
        } else {
            System.out.println("Valor " + valor + " no encontrado.");
        }
    }
}