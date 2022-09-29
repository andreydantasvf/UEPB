#include <stdio.h>

int Fibonacci(numero) {
    if(numero == 1) {
        return 1;
    }
    
    if(numero == 2) {
        return 1;
    }

    return Fibonacci(numero-1) + Fibonacci(numero-2);

}

int main(void) {
    // int valuePosition, valueCurrent = 1, valuePast = 0, valueTemp;

    // printf("Digite até qual posição a sequencia de Fibonacci deve ir: ");
    // scanf("%d", &valuePosition);

    // for(int i = 0; i < valuePosition; i++) {
    //     valueTemp = valueCurrent;
    //     printf("%d ", valueTemp);
    //     valueCurrent = valueCurrent + valuePast;
    //     valuePast = valueTemp;
    // }

    int numero;

    printf("Sequencia: ");
    scanf(" %d", &numero);

    int fibonacci = Fibonacci(numero);
    
    printf("Fibonacci: %d \n", fibonacci);
}