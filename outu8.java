public class outu8 {
    public static void main(String[] args) {
      
        int[] A = {56, 34, 565, 46, 76, 49, 95, 35, 29, 12};
        int[] B = {10, 34, 66, 37, 24, 34, 84, 56, 59, 11};
        
        int[] C = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
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
        
        System.out.println("\nVetor C (multiplicação dos elementos de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }


}
