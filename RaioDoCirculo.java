//5 - Crie um programa que calcule a área de um circulo.


import java.util.Scanner;
public class RaioDoCirculo {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Double r,d; 

        System.out.println("Digite o valor do diâmetro: ");
        d = input.nextDouble();

        r = d/2;

        System.out.println("O raio da circunfêrencia é "+r+" cm");
    }
}
