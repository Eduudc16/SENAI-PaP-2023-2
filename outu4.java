public class outu4 {
    public static void main(String[] args) {
      
        int[] A = new int[]{8, 4, 9, 16, 25, 36, 36, 84, 81, 100, 126, 144, 169, 1996, 235};
        
       
        double[] B = new double[15];
        
      
        for (int i = 0; i < A.length; i++) {
            B[i] = Math.sqrt(A[i]);
        }
        
        
        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\nVetor B (raiz quadrada dos elementos de A):");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}
