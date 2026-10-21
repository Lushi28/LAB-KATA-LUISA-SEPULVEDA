import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Día de la semana (1=Lunes, 7=Domingo): ");
        int numeroDia = lector.nextInt();

        System.out.print("Hora actual (0-23): ");
        int horaActual = lector.nextInt();

        if (numeroDia < 1 || numeroDia > 7) {
            System.out.println("Error: día inválido");
        } else if (horaActual < 0 || horaActual > 23) {
            System.out.println("Error: hora inválida");
        } else {
            String horario = "";
            boolean abierta = false;

            switch (numeroDia) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    horario = "Horario de lunes a viernes: 6:00 AM - 8:00 PM";
                    abierta = horaActual >= 6 && horaActual < 20;
                    break;
                case 6:
                    horario = "Horario de sábado: 7:00 AM - 2:00 PM";
                    abierta = horaActual >= 7 && horaActual < 14;
                    break;
                case 7:
                    horario = "Horario de domingo: cerrado todo el día";
                    break;
            }

            if (abierta) {
                System.out.println("La cafetería está abierta.");
            } else {
                System.out.println("La cafetería está cerrada.");
            }

        System.out.println(horario);
        }

        lector.close();
    }
}