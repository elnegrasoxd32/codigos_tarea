import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class nose2_corto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Ingrese las dimensiones de la matriz: ");
        int d=scanner.nextInt();
        int [][]A=new int[d][d];
        System.out.println("Ingresa los valores de la matriz: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                A[i][j]=random.nextInt(0,11);
            }
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Matriz girada 90 grados");
        for (int i = 0; i < d; i++) {
            for (int j = A.length-1; j >= 0; j--) {
                System.out.print(A[j][i]+" "); 
            }
            System.out.println("");
        }
    }
    
}
