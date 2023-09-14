//Leia  um vetorde  notas, em  que  a quantidade éespecificadapelo  usuário.
 //Em seguida, calcule a média dasnotas digitadas. 
 //Finamente, exiba o conjunto das notas maiores do que a média calculada, bem como e conjunto de notas menores do que a média.
 //OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.

import java.util.Scanner;

public class exerciciojava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja para tirar a média: ");
        int quantidadeNotas = scanner.nextInt();

        // Verifica se a quantidade de notas é válida (maior que 0)
        if (quantidadeNotas <= 0) {
            System.out.println("Quantidade inválida de notas.");
          
        }

        double[] notas = new double[quantidadeNotas];

        // Lê as notas e verifica se estão no intervalo válido (0 a 10)
        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota : ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
                i--; // Reduz o contador para permitir nova entrada para a mesma nota.
            } else {
                notas[i] = nota;
            }
        }

        // Calcula a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / quantidadeNotas;

        System.out.println("A média das notas é: " + media);

        System.out.println("Notas maiores que a média:");
        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }

        System.out.println("Notas menores que a média:");
        for (double nota : notas) {
            if (nota < media) {
                System.out.println(nota);
            }
        }

        scanner.close();
    }
}
