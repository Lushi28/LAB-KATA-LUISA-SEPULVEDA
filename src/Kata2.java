import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreBebida;
        double temperatura;
        String clasificacion;

        System.out.println("Bienvenido a la cafetería JAVA");

        System.out.print("Ingresa el nombre de tu bebida: ");
        nombreBebida = teclado.nextLine();

        System.out.print("Ingresa la temperatura: ");
        temperatura = teclado.nextDouble();

        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura >= 30) {
            clasificacion = "Templada";
        } else {
            clasificacion = "Fría";
        }

        System.out.println(nombreBebida + ": " + clasificacion);

        teclado.close();
    }
}