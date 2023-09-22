import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double y = scanner.nextDouble();

        System.out.println("Números originais:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
       
        double temp = x;
        x = y;
        y = temp;

        System.out.println("\nNúmeros após a troca:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        scanner.close();
    }
}