package lista2;

//9 - Crie um programa em Java que faça o Casting Implícito e o Casting Explicito

public class Casting {
    public static void main(String[]args){
        int a;
        double b = 3.14;

        //Casting Implícito
        a = (int)b;
        System.out.println(""+a);

        //Casting Explícito
        byte byteB = 2;
        short shortB = 500;
        byteB = (byte)shortB;
        System.out.println("" + byteB);
    }
}
