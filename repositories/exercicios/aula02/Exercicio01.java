package repositories.exercicios.aula02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    private final Scanner input = new Scanner(System.in);

    void run(){
        System.out.println("=== Buscador de numeros primos ===");
        System.out.println("Digite o começo do intervalo que deseja buscar:");
        int start = input.nextInt();
        System.out.println("Digite o final do intervalo que deseja buscar:");
        int end = input.nextInt();

        System.out.println(primeFinder(start,end));
    }

    private List<Integer> primeFinder(int start, int end){
        List<Integer> primes = new ArrayList<>();

        for(int i = start; i < end; i++){
            if (i == 2){
                primes.add(i);
                continue;
            }
            boolean prime = true;

            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                    break;
                }
            }

            if (prime){
                primes.add(i);
            }
        }
        return primes;
    }

}
