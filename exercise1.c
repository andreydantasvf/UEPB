#include <stdio.h>

int main(void) {
    int valor1, valor2, resultado, operacao;

    printf("Digite um valor: \n");
    scanf("%d", &valor1);
    printf("Digite outro valor: \n");
    scanf("%d", &valor2);

    printf("Escolha uma das opções: \n");
    printf("[1] Adição \n");
    printf("[2] Subtração \n");
    printf("[3] Multiplicação \n");
    printf("[4] Divisão \n");
    scanf("%d", &operacao);

    switch (operacao) {
        case 1:
            resultado = valor1 + valor2;
            break;
        case 2:
            resultado = valor1 - valor2;
            break;
        case 3:
            resultado = valor1 * valor2;
            break;
        case 4:
            resultado = valor1 / valor2;
            break;
        default:
            printf("Operação invalida!");
    }

    printf("O resultado da operação é: %d ", resultado);
}