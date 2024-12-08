import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class nose3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Ingrese las dimensiones de la matriz: ");
        int f=scanner.nextInt();
        int c=scanner.nextInt();
        int [][]A=new int[f][c];
        System.out.println("Ingresa los valores de la matriz: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j]=random.nextInt(0,11);
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
        int suma=0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if(i==0 || i==A.length-1){
                    suma+=A[i][j];
                }
                else if(j==0 || j==c-1){
                    suma+=A[i][j];
                }
            }            
        }
        System.out.println("La suma del perimetro es: "+suma);
    }  
}
