#include <stdio.h>

int main(void) {
    int valuePosition, valueCurrent = 1, valuePast = 0, valueTemp;

    printf("Digite até qual posição a sequencia de Fibonacci deve ir: ");
    scanf("%d", &valuePosition);

    for(int i = 0; i < valuePosition; i++) {
        valueTemp = valueCurrent;
        printf("%d ", valueTemp);
        valueCurrent = valueCurrent + valuePast;
        valuePast = valueTemp;
    }
}