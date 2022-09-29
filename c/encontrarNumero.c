#include <stdio.h>

int busca(int vet[], int n, int x);

int main(void) {
    int numeros[30], numero, index = 0;
    int encontrarNumero, resultadoBusca;

    do {
        printf("Digite um número para inserir no Vetor (0 para parar o programa): ");
        scanf(" %d", &numero);
        if(numero != 0) {
            numeros[index] = numero;
            index++;
        }
    } while(numero != 0);

    printf("Digite um número para encontrar no vetor: ");
    scanf(" %d", &encontrarNumero);

    resultadoBusca = busca(numeros, sizeof(numeros), encontrarNumero);


    if(resultadoBusca == 0) {
        printf("Valor não encontrado!\n");
    }
    else {
        printf("Valor encontrado!\n");
    }
}

int busca(int vet[], int n, int x) {
    for(int i = 0; i < n; i++) {
        if(vet[i] == x) {
            return 1;
        }
    }
    return 0;
}