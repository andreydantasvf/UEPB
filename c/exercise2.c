#include <stdio.h>

int main(void) {
    float p1, p2, media;

    printf("Digite a nota da primeira prova: ");
    scanf("%f", &p1);
    printf("Digite a nota da segunda prova: ");
    scanf("%f", &p2);

    media = (p1 + p2) / 2;

    if (media >= 5 && p1 >= 3 && p2 >= 3) {
        printf("A sua média foi: %f. Você foi aprovado! ", media);
    }
    else {
        float p3;

        printf("Digite a nota da terceira prova: ");
        scanf("%f", &p3);

        if (p1 > p2) {
            media = (p1 + p3) / 2;
        }
        else if (p2 > p1) {
            media = (p2 + p3) / 2;
        }
        else {
            media = (p1 + p3) / 2;
        }

        if (media >= 5) {
            printf("A sua média foi: %f. Você foi aprovado! ", media);
        }
        else {
            printf("A sua média foi: %f. Você foi aprovado! ", media);
        }
    }
}