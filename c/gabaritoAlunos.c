#include <stdio.h>

int main(void) {
  int gabarito[5], alunos[5][5], contadorAcertos = 0;

  for (int i = 0; i < 5; i++) {
    printf("Digite a alternativa correta da %dº questão: [1 = a, 2 = b, 3 = c, 4 = d, 5 = e] ", i + 1);
    scanf(" %d", &gabarito[i]);
  }

  for(int i = 0; i < 5; i++) {
    for(int j = 0; j < 5; j++) {
      printf("Digite a alternativa da %dº questão do %dº aluno: [1 = a, 2 = b, 3 = c, 4 = d, 5 = e] ",
           j + 1, i+1);
      scanf(" %d", &alunos[i][j]);
    }
  }

  for(int i = 0; i < 5; i++) {
    contadorAcertos = 0;
    for(int j = 0; j < 5; j++) {
      if(alunos[i][j] == gabarito[j]){
        contadorAcertos++;
      }
    }
    printf("O %dº aluno acertou %d questoes!\n", i+1, contadorAcertos);
  }

  return 0;
}