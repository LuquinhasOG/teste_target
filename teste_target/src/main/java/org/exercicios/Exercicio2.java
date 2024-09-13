package org.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public void run() {
        Exercicio2 ex = new Exercicio2();
        Scanner scanner = new Scanner(System.in);
        String frase;

        System.out.print("Digite um frase: ");
        frase = scanner.nextLine();

        System.out.println("A letra 'a' se repete " + repeticaoLetra(frase, 'a') + " vezes na frase");
    }

    public int repeticaoLetra(String frase, char letra) {
        int quantidade = 0;

        for (char l : frase.toLowerCase().toCharArray()) {
            if (l == letra) {
                quantidade++;
            }
        }

        return quantidade;
    }
}
