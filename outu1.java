public class outu1 {
    public static void main(String[] args) {
       
        int[] A = new int[]{8, 6, 9, 3, 6};
        
        
        int[] B = new int[5];
        
       
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
