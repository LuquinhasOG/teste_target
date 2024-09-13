package org.exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public void run() {
        Exercicio1 ex = new Exercicio1();
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Digite um número inteiro: ");
        n = scanner.nextInt();

        if (pertenceFibonacci(n)) {
            System.out.println("O número " + n + " pertence a sequência de Fibonacci");
        } else {
            System.out.println("O número " + n + " não pertence a sequência de Fibonacci");
        }
    }

    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public boolean pertenceFibonacci(int n) {
        boolean testando = true;
        int i = 0;
        while (testando) {
            int fib = fibonacci(i);
            if (n == fib) {
                return true;
            } else if (fib > n) {
                break;
            }

            i++;
        }

        return false;
    }
}
