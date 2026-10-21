import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double totalCuenta;
        double porcentajePropina;
        double propina;
        double totalPagar;

        System.out.print("Ingresa el total de la cuenta: ");
        totalCuenta = teclado.nextDouble();

        if (totalCuenta <= 0) {
            System.out.println("Error: total inválido");
        } else {
            System.out.print("Ingresa el porcentaje de propina: ");
            porcentajePropina = teclado.nextDouble();

            if (porcentajePropina < 0 || porcentajePropina > 100) {
                System.out.println("Error: porcentaje inválido");
            } else {
                propina = totalCuenta * porcentajePropina / 100;
                totalPagar = totalCuenta + propina;

                System.out.println("Propina: $" + propina);
                System.out.println("Total a pagar: $" + totalPagar);

                if (porcentajePropina > 30) {
                    System.out.println("¡Propina generosa!");
                } else if (porcentajePropina < 5) {
                System.out.println("Propina muy baja");
                }
            }
        }

        teclado.close();
    }
}