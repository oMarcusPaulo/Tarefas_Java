package lista3;


//8 - Crie um programa que receba como parâmetro de entrada os valores de A, B e C
//para uma equação do 2º grau, e apresente como saída os valores de Delta, X1 e X2 caso existam.

import java.lang.Math;
import java.util.Scanner;
public class SegundoGrau {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

            System.out.println("Digite um valor para A (QUE SEJA DIFERENTE DE ZERO!!!)");
            int a = s.nextInt();

            System.out.println("Digite um valor para B: ");
            int b = s.nextInt();

            System.out.println("Digite um valor para C: ");
            int c = s.nextInt();

            if(a == 0){
                System.out.println("\nDigite outro valor para A!!!!");
            }else{
                double delta = (a*a) - 4*a*c;
                
                //bhaskara 

                double x = -b + Math.sqrt(delta)/(2*a);
                int x1 = (int) x;
                System.out.println("\n"+x1);

                double x3 = ((-b - Math.sqrt(delta)))/(2*a);
                int x2 = (int) x3;
                System.out.println(""+x2);
            }

    }
}
