package lista2;

//LISTA 2

//6 - Crie um programa que receba um numero N qualquer e apresente o seu sucessor
//e seu antecessor (utilize o pós incremento e o pré incremento).

import java.util.Scanner;
public class SucessorEAntecessor {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n;
        int a;
        System.out.println("Digite um número ae: ");
        n = s.nextInt();
        a = n;

        System.out.println("Sucessor: "+ ++a);
        System.out.println("Antecessor: "+ --n);

    }
}
