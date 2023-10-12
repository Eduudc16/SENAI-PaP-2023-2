public class outu6 {

    public static void main(String[] args) {
       
        int[] A = {9, 3, 55, 78, 23, 67, 1, 65, 67, 88};
        int[] B = {14, 5, 5, 73, 5, 7, 2, 56, 100, 45};
        
        int[] C = new int[10];
        
       
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] + B[i];
        }
        
        System.out.println("Vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        
        System.out.println("\nVetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        
        System.out.println("\nVetor C (soma dos elementos de A e B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
    
}
