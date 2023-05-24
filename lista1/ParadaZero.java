package lista1;
//6 - Crie um programa que receba n números de entrada até que seja digitado o número 0
//ao final o programa deverá informar quantos números foram digitados bem como a soma dos números digitados.


import java.util.Scanner;
public class ParadaZero {
    public static void main(){
        Scanner input = new Scanner(System.in);
        int n,soma = 0,contador = 0;

        do{
            System.out.println("Digite números ae");
            n = input.nextInt();
            if(n !=0){
                contador = contador + 1;
                soma = soma+n;
            }
        }while(n != 0);
        System.out.println("Você digitou: "+contador+ "números.");
        System.out.println("A soma dos números digitados é: "+soma);
    }
}
