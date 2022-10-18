#include <stdio.h>

int main(void) {
    int matriz[5][5];

    for(int i = 0; i < 5; i++) {
        for(int j=0; j < 5; j++) {
            scanf("%d", &matriz[i][j]);
        }
    }
    printf("\n");

    for(int i= 0; i < 5; i++) {
        for(int j= 0; j < 5; j++) {
            printf("%d ", matriz[i][j]);
        }
        printf("\n");
    }
    printf("\n");

    for(int i= 0; i < 5; i++) {
        for(int j= 0; j < 5; j++) {
            printf("%d ", matriz[j][i]);
        }
        printf("\n");
    }
}