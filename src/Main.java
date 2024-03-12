import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrece el numero por favor: ");
        int n = scanner.nextInt();
        System.out.print("Elija un tipo de bucle  (For/While/Do-while): ");
        String eleccion = scanner.next();
        int sum = 0;
        int i = 1;

        switch (eleccion) {
            case "For":
                for (; i <= n; i++) {
                    sum += i * i;
                }
                break;

            case "While":
                while (i <= n) {
                    sum += i * i;
                    i++;
                }

                break;
            case "Do-while":
                do {
                    sum += i * i;
                    i++;
                } while (i <= n);
                break;

            default: {
                System.out.println("Tipo de bucle no válido.");
                return;
            }

        }
        System.out.println("la suma de los cuadrados de su numero" + n + " es " + sum);
    }
}

