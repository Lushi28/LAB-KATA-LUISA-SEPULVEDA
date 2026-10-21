import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        int totalPedido = 0;

        while (opcion != 6) {
            System.out.println("\n--- Menu de la Cafeteria ---");
            System.out.println("1. Cafe ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Te ($3.000)");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    totalPedido = totalPedido + 4000;
                    System.out.println("Producto agregado: Cafe ($4.000)");
                    break;
                case 2:
                    totalPedido = totalPedido + 3500;
                    System.out.println("Producto agregado: Muffin ($3.500)");
                    break;
                case 3:
                    totalPedido = totalPedido + 7500;
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                    break;
                case 4:
                    totalPedido = totalPedido + 5000;
                    System.out.println("Producto agregado: Jugo ($5.000)");
                    break;
                case 5:
                    totalPedido = totalPedido + 3000;
                    System.out.println("Producto agregado: Te ($3.000)");
                    break;
                case 6:
                    System.out.println("Pedido terminado.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        System.out.println("Total del pedido: $" + totalPedido);
        teclado.close();
    }
}