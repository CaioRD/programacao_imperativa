// Leia um vetorde 20 valores inteiros e, em seguida, exiba-os na ordem inversa do que foram digitados.

import java.util.Scanner;

public class exerciciojava_02 {
 

   // public class Main {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            int tamanho = 20;
            int[] vetor = new int[tamanho];
    
            System.out.println("Digite os 20 valores inteiros:");
    
            // Lê os valores inteiros e armazena no vetor
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Digite o " + (i + 1) + "° valor: ");
                vetor[i] = s.nextInt();
            }
    
            System.out.println("Valores na ordem inversa:");
    
            // Exibe os valores na ordem inversa
            for (int i = tamanho - 1; i >= 0; i--) {
                System.out.println(vetor[i]);
            }
    
            s.close();
        }
    }
        

