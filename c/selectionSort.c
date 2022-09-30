#include <stdio.h>

void OrdenarVetor(int array[], int tamanho);

void PrintArray(int array[], int tamanho);

int main(void) {
    int vetor[] = {5, 1, 4, 3, 2, 6, 0, 8, 19, 23, 12};
    int tamanho = sizeof(vetor) / sizeof(vetor[0]);

    OrdenarVetor(vetor, tamanho);
}

void PrintArray(int array[], int tamanho) {
    printf("\nSeu array está assim:\n");
    for (int i = 0; i < tamanho; i++) {
        printf("%d  ", array[i]);
    }
    printf("\n");
}

void OrdenarVetor(int array[], int tamanho) {
    int valorTemp = 0;

    for(int i = 0; i < tamanho; i++) {
        PrintArray(array, tamanho);
        //compara cada valor com todos os próximos e coloca o menor na posicao array[i]
        for(int j = i+1; j < tamanho; j++) {
            if(array[i] > array[j]) {
                valorTemp = array[i];
                array[i] = array[j];
                array[j] = valorTemp;
            }
        }
    }
}
