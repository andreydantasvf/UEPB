#include <stdio.h>

int main(void) {
    int senhaJogador1, senhaJogador2;

    printf("Jogador 1, digite a senha: ");
    scanf("%d", &senhaJogador1);

    for (int i = 0; i < 5; i++) {
        printf("\nJogador 2, digite a senha: ");
        scanf("%d", &senhaJogador2);

        if (senhaJogador2 > senhaJogador1) {
            printf("Você colocou uma senha maior que a senha do jogador 1\n");
        }
        else if (senhaJogador2 < senhaJogador1) {
            printf("Você colocou uma senha menor que a senha do jogador 1\n");
        }
        else {
            printf("Você acertou a senha!\n");
            break;
        }
    }
}