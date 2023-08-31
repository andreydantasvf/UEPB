#include <stdio.h>

void OrdenarVetor(int array[], int tamanho);

void PrintArray(int array[], int tamanho);

int main(void) {
    int vetor[] = {5, 1, 4, 3, 2, 6, 0, 8, 19, 23, 12};
    int tamanho = sizeof(vetor) / sizeof(vetor[0]);

    OrdenarVetor(vetor, tamanho);
    PrintArray(vetor, tamanho);
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

    for(int indiceExterno = 0; indiceExterno < tamanho - 1; indiceExterno++) {
        PrintArray(array, tamanho);
        //compara cada valor com todos os próximos e coloca o menor na posicao array[i]
        for(int indiceInterno = indiceExterno + 1; indiceInterno < tamanho; indiceInterno++) {
            if(array[indiceExterno] > array[indiceInterno]) {
                valorTemp = array[indiceExterno];
                array[indiceExterno] = array[indiceInterno];
                array[indiceInterno] = valorTemp;
            }
        }
    }
}
