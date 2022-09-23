#include <stdio.h>

void PrintArray(int array[], int tamanho);

void OrdenarVetor(int array[], int tamanho);

int PesquisarValorArray(int array[], int valorParaEncontrar, int tamanho);

int main (void) {
    int vetor[10];
    int tamanhoVetor = (int)(sizeof(vetor) / sizeof(vetor[0]));
    int valorParaEncontrar, posicaoValorEncontrado;

    for(int i = 0; i < tamanhoVetor; i++) {
        printf("\nDigite o valor %d do vetor: ", i+1);
        scanf("%d", &vetor[i]);
    }

    printf("\nDigite o valor que deseja encontrar: ");
    scanf("%d", &valorParaEncontrar);

    OrdenarVetor(vetor, tamanhoVetor);

    posicaoValorEncontrado = PesquisarValorArray(vetor, valorParaEncontrar, tamanhoVetor);

    if(posicaoValorEncontrado != -1) {
        printf("\nO valor que você procurou foi encontrado!\n");
    }
    else {
        printf("\nO valor que você procurou NÃO foi encontrado!\n");
    }

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

int PesquisarValorArray(int array[], int valorParaEncontrar, int tamanho) {
    int limiteInferior = 0;
    int limiteSuperior = tamanho;
    int meio;

    while(limiteInferior <= limiteSuperior) {
        meio = (limiteInferior + limiteSuperior) / 2;

        if(valorParaEncontrar == array[meio]) {
            return meio;
        } 
        else if(valorParaEncontrar < array[meio]) {
            limiteSuperior = meio - 1;
        }
        else {
            limiteInferior = meio + 1;
        }
    }

    return -1;
}