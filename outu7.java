public class outu7 {
    
    public static void main(String[] args) {
        
        int[] A = {56, 4, 56, 8, 56, 44, 55, 26, 78, 9};
        int[] B = {10, 23, 40, 56, 23, 56, 49, 7, 4, 56};
        
        
        int[] C = new int[10];
        
  
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] - B[i];
        }
        
        // Imprimindo os vetores A, B e C
        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\nVetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        
        System.out.println("\nVetor C (subtração dos elementos de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
