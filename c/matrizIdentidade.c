#include <stdio.h>

int matriz_identidade(int mat[3][3]); 

int main(void) {
    int matriz[3][3];
    int matrizIdentidade;

    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            printf("Digite o valor da matriz[%d][%d]: ", i+1, j+1);
            scanf("%d", &matriz[i][j]);
        }
    }

    matrizIdentidade = matriz_identidade(matriz);
    
    if(matrizIdentidade != 1) {
        printf("Não é uma matriz identidade!\n");
    }
    else {
        printf("É uma matriz identidade!\n");
    }
}

int matriz_identidade(int mat[3][3]) {
    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++) {
            if(i == j) {
                if(mat[i][j] != 1) {
                    return 0;
                }
            }
            else {
                if(mat[i][j] != 0) {
                    return 0;
                }
            }
        }
    }

    return 1;
}