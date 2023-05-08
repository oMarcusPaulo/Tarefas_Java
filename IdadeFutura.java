//3 - Crie um programa em Java, que receba como parâmetros de entrada o ano de nascimento, o nome do indivíduo e 
//um determinado ano futuro, o programa deverá informar qual será a idade deste indivíduo neste ano futuro.





import java.util.Scanner;
public class IdadeFutura {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int nasc,idf,av;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        nasc = input.nextInt();
        System.out.println("Digite um ano futuro qualquer (Formato ****): ");
        av = input.nextInt();

        idf = av - nasc ;

        System.out.println(nome+" vai ter "+idf+" anos de idade em "+av);
    }
}
