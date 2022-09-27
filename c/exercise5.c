#include <stdio.h>

int main(void) {
    int senhaJogador1, senhaJogador2;
    char opcao;

    do {
        printf("Jogador 1, digite a senha: ");
        scanf("%d", &senhaJogador1);

        for (int i = 0; i < 5; i++) {
            printf("\nJogador 2, digite a senha: ");
            scanf("%d", &senhaJogador2);

            if ((senhaJogador2 + 1) == senhaJogador1 || (senhaJogador2 - 1) == senhaJogador1) {
                if (i != 4) {
                    printf("TÁ QUENTE!!!\n");
                }
                else {
                    printf("Você perdeu!\n");
                }
            }
            else if (senhaJogador2 > senhaJogador1) {
                if (i != 4) {
                    printf("Você colocou uma senha maior que a senha do jogador 1\n");
                }
                else {
                    printf("Você perdeu!\n");
                }
            }
            else if (senhaJogador2 < senhaJogador1) {
                if (i != 4) {
                    printf("Você colocou uma senha menor que a senha do jogador 1\n");
                }
                else {
                    printf("Você perdeu!\n");
                }
            }
            else {
                printf("Você acertou a senha!\n");
                break;
            }
        }

        printf("\nDigite 's' para jogar novamente: ");
        scanf(" %c", &opcao);
    } while(opcao == 's');
}