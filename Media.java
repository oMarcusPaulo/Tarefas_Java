//2 - Crie um programa em Java, que receba como entrada dois números
//e apresente a média deles.



import java.util.Scanner;
public class Media {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a,b,soma,media;

        System.out.println("Digite um valor pra A");
        a = input.nextDouble();
        System.out.println("Digite um valor para B: ");
        b = input.nextDouble();

        soma = a+b;
        media = soma/2;

        System.out.println("A média é: "+media);

    }
}
