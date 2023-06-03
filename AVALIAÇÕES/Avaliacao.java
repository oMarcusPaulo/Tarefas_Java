import java.util.Random;
import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário se deseja executar o programa 1
        System.out.println("Deseja executar o programa 1? (S/N)");
        String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("S")) {
            executarPrograma1();
        }

        // Pergunta ao usuário se deseja executar o programa 2
        System.out.println("Deseja executar o programa 2? (S/N)");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("S")) {
            executarPrograma2();
        }

        System.out.println("Fim do programa.");
    }

    public static void executarPrograma1() {
        Random random = new Random();
        int maior = 0;
        int menor = 1000000;
        int qntdPrimos = 0;
        int j;
        int i;
        int c = 0;
        int vetor[] = new int[500];
        int vPrimos[] = new int[500];

        // Gerando números aleatórios e armazenando no vetor
        for (i = 0; i < 500; i++) {
            vetor[i] = random.nextInt(100000) + 1;
        }

        // Verificando quais números são primos
        for (i = 0; i < 500; i++) {
            c = 0;
            for (j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    c = c + 1;
                }
            }
            if (c == 2) {
                // Verificando qual é o maior e qual é o menor número primo
                if (vetor[i] < menor) {
                    menor = vetor[i];
                }
                if (vetor[i] > maior) {
                    maior = vetor[i];
                }
                // Armazenando o número primo no vetor de primos
                vPrimos[qntdPrimos] = vetor[i];
                qntdPrimos = qntdPrimos + 1;
            }
        }

        // Exibindo os números primos
        for (i = 0; i < qntdPrimos; i++) {
            System.out.println("O número " + vPrimos[i] + ", da posição " + i + " do vetor, é primo.");
        }

        // Exibindo o maior e o menor número primo
        System.out.println("O maior número primo sorteado é: " + maior);
        System.out.println("O menor número primo sorteado é: " + menor);

        // Verificando se algum número primo foi sorteado, se não foi sorteado nenhum, é exibida uma mensagem indicando isso
        if (qntdPrimos == 0) {
            System.out.println("Nenhum dos números sorteados é primo.");
        }
    }

    public static boolean Primo(int numero) {
        // Verificando se o número é divisível por algum número além de 1 e ele mesmo
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void executarPrograma2() {
        int[] numeros = new int[500];
        Random random = new Random();

        // Gerando números aleatórios e armazenando no vetor
        for (int i = 0; i < 500; i++) {
            numeros[i] = random.nextInt(100000) + 1;
        }

        int maiorPrimo = -1;
        int menorPrimo = -1;
        boolean primeiroPrimoEncontrado = false;

        // Verificando se algum número primo foi sorteado
        for (int i = 0; i < 500; i++) {
            if (Primo(numeros[i])) {
                // Verificando o maior e o menor número primo
                if (!primeiroPrimoEncontrado) {
                    maiorPrimo = numeros[i];
                    menorPrimo = numeros[i];
                    primeiroPrimoEncontrado = true;
                } else {
                    if (numeros[i] > maiorPrimo) {
                        maiorPrimo = numeros[i];
                    }
                    if (numeros[i] < menorPrimo) {
                        menorPrimo = numeros[i];
                    }
                }
            }
        }

        // Exibindo o resultado
        if (primeiroPrimoEncontrado) {
            System.out.println("Um número primo foi sorteado.");
            System.out.println("O maior número primo sorteado é: " + maiorPrimo);
            System.out.println("O menor número primo sorteado é: " + menorPrimo);
        } else {
            System.out.println("Nenhum número primo foi sorteado.");
        }
    }
}
