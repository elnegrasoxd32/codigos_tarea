import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class nose5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Ingrese las dimensiones de la matriz: ");
        int d=scanner.nextInt();
        int [][]A=new int[d][d];
        System.out.println("Ingresa los valores de la matriz: ");
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                A[i][j]=scanner.nextInt();}}
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(A[i][j]+" ");}
            System.out.println("");}
        boolean simetrica=true;
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                if(i!=j){
                if(A[i][j]!=A[j][i]){
                    simetrica=false;
                    break;}}}
            if(simetrica==false){
                break;}}
        if(simetrica){
            System.out.println("Es simetrica");}
        else{
            System.out.println("No es simetrica");}
}}
