package lista02;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros[] = new int[10];

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int aux = 0;
        for(int i = 0; i < numeros.length - 1; i++) {
            for(int j = i+1; j < numeros.length; j++) {
                if(numeros[i] > numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.print("Numeros em ordem crescente: ");
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }

        aux = 0;
        for(int i = 0; i < numeros.length - 1; i++) {
            for(int j = i+1; j < numeros.length; j++) {
                if(numeros[i] < numeros[j]) {
                    aux = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }

        System.out.print("\nNumeros em ordem decrescente: ");
        for(int numero : numeros) {
            System.out.print(numero + " ");
        }
        sc.close();
    }
}
