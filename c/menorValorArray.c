#include <stdio.h>

int main(void) {
    int numeros[10], menorValor, indexMenorValor;

    for(int i = 0; i < 10; i++) {
        scanf("%d", &numeros[i]);
    }

    menorValor = numeros[0];
    indexMenorValor = 0;

    for(int i = 1; i < 10; i++) {
        if(numeros[i] < menorValor) {
            menorValor = numeros[i];
            indexMenorValor = i;
        }
    }

    printf("Menor Valor recebido: %d\n", menorValor);
    printf("Índice do menor valor: %d\n", indexMenorValor);

    if(indexMenorValor != 0) {
        printf("Valor armazenado na posição anterior [%d]: %d\n", indexMenorValor-1, numeros[indexMenorValor-1]);
    }
    if(indexMenorValor != 9) {
        printf("Valor armazenado na posição posterior [%d]: %d\n", indexMenorValor+1, numeros[indexMenorValor+1]);
    }
}