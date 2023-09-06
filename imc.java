import java.util.Scanner;


public class imc {


    public static void main(String[] args) {
    
  double peso = 0;
  double altura = 0;
  double imc = 0;

  Scanner entrada = new Scanner(System.in);

  System.out.println("informe o seu peso:");
  peso = entrada.nextDouble();

  System.out.println("informe a sua altura:");
  altura = entrada.nextDouble();

 imc = peso/(altura * altura);

  System.out.println("Seu Imc é");
   System.out.println(imc);

    if(imc < 18.5){
    
     System.out.println("magreza");
    }
    
    if(imc > 25 & imc > 29.9){
    
     System.out.println("Sobrepeso");
    }

    if(imc > 18.5 & imc < 24.9){
    
     System.out.println("Peso normal");
    }

    if(imc > 30 & imc < 34.9){
    
     System.out.println("Obesidade grau I");
    }

     if(imc > 35 & imc < 40){
    
     System.out.println("Obesidade grau II");
    }

     if(imc > 40){
    
     System.out.println("Obesidade grau III");
    }

    }
}
