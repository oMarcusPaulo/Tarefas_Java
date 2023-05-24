package lista2;

//LISTA 2

//4 - Crie um programa em Java que escreva os números de 1 a 1000, com exceto os
//números que estejam no intervalo de 500 a 599

public class PulaQuinhentos {
    public static void main(String[]args){
        for(int i = 1; i<=499;i++){
            System.out.println(i);
        }
        for(int n = 600; n<=1000;n++){
            System.out.println(n);
        }
    }
}
