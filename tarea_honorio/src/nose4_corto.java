import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class nose4_corto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Ingrese las dimensiones de la matriz: ");
        int f=scanner.nextInt();
        int c=scanner.nextInt();
        int [][]A=new int[f][c];
        int [][]B=new int[c][f];
        System.out.println("Ingresa los valores de la matriz: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j]=random.nextInt(0,11);}}
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(A[i][j]+" ");}
            System.out.println("");}
        System.out.println("La matriz transpuesta: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print( A[j][i]+" ");}
            System.out.println("");}}}
