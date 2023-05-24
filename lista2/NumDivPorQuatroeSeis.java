package lista2;

//LISTA 2

//5 - Crie um programa que apresente a quantidade de números divisíveis por 4 e 6
//que estejam no intervalo de 1 a 30000.



public class NumDivPorQuatroeSeis {
    public static void main(String[]args){
        int contador = 0;
        for(int i=1;i<=30000;i++){
            int a;
            a = i;
            if(a % 4 == 0 & a % 6 == 0){
                contador = contador + 1;
            }
        }
        System.out.println(""+contador);
    }
}
