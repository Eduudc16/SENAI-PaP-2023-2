public class outu2 {
    public static void main(String[] args) {
        
        int[] A = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        
        int[] B = new int[8];    
        
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * 2;
        }
        
        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\nVetor B (elementos de A multiplicados por 2):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }




    
}
