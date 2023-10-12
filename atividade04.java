import java.util.Scanner;
public class atividade04 {
    public static void main(String[] args) {
        
    int vet[] = new int[50]; //delaração de vetor inteiro de 50 posições.

    Scanner entrada = new Scanner (System.in);

    //organizando as variaveis.
    int i;
    int j;

    for (i=0; i<50; i++){ //for que vai da linha 0 ate a linha 50, indo de uma a uma.
        System.out.print("Digite o valor da posição " + i + ": ");
        vet [i] = entrada.nextInt(); // aqui ela vai indo para o proxima entrada, de outro numero.
        
        for(j=0; j<50; j++){ // mesma coisa de antes, um numero e 0 até 50, vai indo de 1 a 1, (necessario colocar, pois se não colocar a condição de verificação do numero repetido não funciona) 
            
            if(vet[i]==vet[j] && i!=j){ //condição, se caso o primeiro numeor que digitei for igual ao numero da outra condição, ele vai avisar que ela tá repetida
                System.out.println("o número " + vet[i] + " é repetido");
                break; // para parar caso encontre um numero repetido.

            }
        }    
    }
entrada.close(); //fecha o scanner.

    }
}