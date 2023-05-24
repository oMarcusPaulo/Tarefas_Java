package lista2;

//LISTA 2
//7 - Crie um programa que execute uma rotina N vezes, essa rotina só deverá ser finalizada quando
//houver uma interação com o usuário e este não desejar mais executar a tal rotina.
//O programa deverá apresentar quantas vezes o programa executou a tal rotina.

import java.util.Scanner;
public class Rotina{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int soma,a = 1,b = 1;
        int z;
        do{
            soma = a+b;
            System.out.println(""+soma);
            contador = contador+1;
            System.out.println("Aperte 0 para parar: ");
            z = s.nextInt();
        }while(z !=1);

        System.out.println("A rotina foi rodada: "+contador+" vezes");

    }
    
}
