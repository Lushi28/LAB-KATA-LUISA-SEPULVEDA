import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int precio;
        int subtotal = 0;
        int iva;
        int totalConIVA;
        int descuento = 0;
        int totalFinal;

        do {
            System.out.print("Ingresa el precio del producto (0 para terminar): ");
            precio = teclado.nextInt();

            if (precio > 0) {
                subtotal = subtotal + precio;
            }
        } while (precio != 0);

        iva = subtotal * 19 / 100;
        totalConIVA = subtotal + iva;

        if (totalConIVA > 50000) {
            descuento = totalConIVA * 10 / 100;
        }

        totalFinal = totalConIVA - descuento;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total con IVA: $" + totalConIVA);
        System.out.println("Descuento (10%): $" + descuento);
        System.out.println("Total a pagar: $" + totalFinal);

        teclado.close();
    }
}