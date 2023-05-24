package lista1;
//1 - Crie um programa em Java, que recebe como entrada 10 números inteiros quaisquer
//e deverá informar como saída quais deste números de entrada são pares.


import java.util.Scanner;
public class Pares{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a[] = new int [10],b[] = new int[10],i;

        for(i = 0; i<10;i++){
            System.out.println("Digite valores por favor: ");
            a[i] = input.nextInt();
        }
        for(i = 0; i<10;i++){
            if(a[i] %2 == 0){
                b[i] = a[i];
                System.out.println("O número "+b[i]+" é par");
            }
        }
    }
}
