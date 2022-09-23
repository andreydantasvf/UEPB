#include <stdio.h>

int main(void) {
    int n1, n2, n3;

    printf("Digite o primeiro valor: ");
    scanf("%d", &n1);
    printf("Digite o segundo valor: ");
    scanf("%d", &n2);
    printf("Digite o terceiro valor: ");
    scanf("%d", &n3);

    if (n1 <= n2 && n2 <= n3) {
        printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
    }
    else if (n1 <= n3 && n3 <= n2) {
        printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
    }
    else if (n2 <= n1 && n1 <= n3) {
        printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
    }
    else if (n2 <= n3 && n3 <= n1) {
        printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
    }
    else if (n3 <= n1 && n1 <= n2) {
        printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
    }
    else {
        printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
    }
}