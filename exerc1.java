import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
            System.out.println("O menor número é: " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
            System.out.println("O menor número é: " + numero1);
        } else {
            System.out.println("Os números são iguais.");
        }

        scanner.close();
    }
}