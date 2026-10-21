import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int hora;
        int clientes;
        int totalClientes = 0;
        int contadorHoras = 0;
        int horaPico = -1;
        int maxClientes = -1;

        System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
        hora = teclado.nextInt();

        while (hora != -1) {
            if (hora < 0 || hora > 23) {
                System.out.println("Hora invalida");
            } else {
                System.out.print("Ingresa el numero de clientes en esa hora: ");
                clientes = teclado.nextInt();

                while (clientes < 0) {
                    System.out.println("El numero de clientes no puede ser negativo.");
                    System.out.print("Ingresa nuevamente el número de clientes: ");
                    clientes = teclado.nextInt();
                }

                totalClientes = totalClientes + clientes;
                contadorHoras = contadorHoras + 1;

                if (clientes > maxClientes) {
                    maxClientes = clientes;
                    horaPico = hora;
                }
            }

            System.out.print("Ingresa la hora (0-23, -1 para terminar): ");
            hora = teclado.nextInt();
        }

        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");
        } else {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: " + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico
                    + " (" + maxClientes + " clientes)");
        }

        teclado.close();
    }
}