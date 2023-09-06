import java.util.Scanner;

public class porcentagem {
    public static void main(String[] args){
       int total, score; 
       float percentage;
       Scanner inputNumScanner = new Scanner(System.in);
       
       System.out.println("Digite o valor total ou máximo: ");       
       total = inputNumScanner.nextInt();
       
       System.out.println("Digite o valor obtido: ");
       score = inputNumScanner.nextInt();
       
       percentage = (score * 100/ total);
       
       System.out.println("A porcentagem é = " + percentage + " %");
    }
}