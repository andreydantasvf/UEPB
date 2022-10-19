#include <stdio.h>

int SomaArray(int vetor[], int tamanho) {
    if(tamanho == 0) {
        return 0;
    }else {
        return vetor[tamanho - 1] + SomaArray(vetor, tamanho - 1);
    }

}

int main(void) {
    int vetor[10], tamanho = 10;

    for(int i = 0; i < tamanho; i++) {
        printf("Digite o %dº valor do vetor: ", i+1);
        scanf(" %d", &vetor[i]);
    }

    printf("A soma do vetor é: %d\n", SomaArray(vetor, tamanho));
}