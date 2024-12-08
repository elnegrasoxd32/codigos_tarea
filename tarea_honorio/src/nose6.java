import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class nose6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Ingrese las dimensiones de la matriz: ");
        int f=scanner.nextInt();
        int c=scanner.nextInt();
        int [][]A=new int[f][c];
        List <Integer>B=new ArrayList<>();
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j]=random.nextInt(0,11);}}
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j]+" ");}
            System.out.println("");}
        int inicio=0;
        int fina=A.length-1;
        int cola=0;
        int colafin=A[0].length-1;
        System.out.println(colafin);
        while(inicio<=fina && cola<=colafin) {
            for (int i = cola; i <= colafin; i++) {
               B.add(A[inicio][i]);
            }
            inicio++;
            for (int i = inicio; i <= fina; i++) {
                B.add(A[i][colafin]);
            }
            colafin--;
            if(inicio <= fina){
                for (int i = colafin; i >= cola; i--) {
                    B.add(A[fina][i]);
                }
                fina--;
            }
            if(cola<=colafin){
                for (int i = fina; i >= inicio; i--) {
                    B.add(A[i][cola]);
                }
                cola++;
            }
        }
        System.out.println(B);
    }
    
}
