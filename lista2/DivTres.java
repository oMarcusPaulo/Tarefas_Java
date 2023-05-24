package lista2;

//Lista 2
//2 - Crie um programa em Java que escreva todos os números pares divisíveis por 3
// que estejam no intervalo de 2000 a 20000.

import java.util.Scanner;
public class DivTres {
    public static void main(String[]args){
        int i,a;
        
        for(i = 2000;i<20000;i++){
            a = i;
             if(a % 2 == 0){
                if(a%3 == 0){
                    System.out.println(": "+a);
                }
             }    
        }
    }
}
