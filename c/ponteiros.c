#include <stdio.h>

int main(void) {
    int x, y, *p, *q;

    x = 2;
    y = 8;
    p = &x;
    q = &y;

    printf("O endereço de X: %p \n", &x);
    printf("O valor de X: %d \n\n", x);

    printf("O valor de P: %p \n", p);
    printf("O valor de *P: %d \n\n", *p);

    printf("O endereço de Y: %p \n", &y);
    printf("O valor de Y: %d \n\n", y);

    printf("O valor de Q: %p \n", q);
    printf("O valor de *Q: %d \n\n", *q);
}