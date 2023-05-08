//4 - Crie um programa que calcule o IMC de um indivíduo qualquer. O programa deverá receber como parâmetros de entrada o nome do individuo, seu peso e sua altura.
//Deverá informar qual é o seu IMC, e qual o grau de seu IMC.



import java.util.Scanner;
public class IMC {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double peso, altura,imc;
        String nome;

        System.out.println("Olá usuário! Digite seu nome: ");
        nome = input.nextLine();
        System.out.println(nome+" digite sua altura: ");
        altura = input.nextDouble();
        System.out.println(nome+" digite seu peso: ");
        peso = input.nextDouble();

        imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.println("Abaixo do normal");
        }
        if(imc > 18.6 && imc < 24.9){
            System.out.println("Normal");
        }
        if(imc > 25.0 && imc < 29.9){
            System.out.println("Sobrepeso");
        }
        if(imc > 30.0 && imc < 34.9){
            System.out.println("Obesidade grau 1");
        }
        if(imc > 35.0 && imc < 39.9){
            System.out.println("Obesidade grau 2");
        }
        if(imc > 40.0){
            System.out.println("Obesidade grau 3");
        }
    }
}
