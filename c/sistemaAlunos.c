#include <stdio.h>

struct Notas {
    float prova1;
    float prova2;
    float prova3;
};

struct Aluno {
    int matricula;
    char nome[255];
    struct Notas provas;
    float media;
};

void SituacaoAluno(struct Aluno alunos[], int tamanho);

int MaiorNotaProva1(struct Aluno alunos[], int tamanho);

int MaiorMedia(struct Aluno alunos[], int tamanho);

int MenorMedia(struct Aluno alunos[], int tamanho);


int main(void) {
    struct Aluno alunos[5];
    
    printf("Cadastro de alunos: \n");

    for(int i = 0; i < 5; i++) {
        printf("Digite a matricula do %dº aluno: ", i+1);
        scanf("%d", &alunos[i].matricula);
        setbuf(stdin, NULL);
        printf("Digite o nome do %dº aluno: ", i+1);
        fgets(alunos[i].nome, 255, stdin);
        setbuf(stdin, NULL);
        printf("Digite a primeira nota do %dº aluno: ", i+1);
        scanf("%f", &alunos[i].provas.prova1);
        printf("Digite a segunda nota do %dº aluno: ", i+1);
        scanf("%f", &alunos[i].provas.prova2);
        printf("Digite a terceiras nota do %dº aluno: ", i+1);
        scanf("%f", &alunos[i].provas.prova3);
        alunos[i].media = (alunos[i].provas.prova1 + alunos[i].provas.prova2 + alunos[i].provas.prova3) / 3;
    }

    printf("O aluno com maior média foi: %s\n", alunos[MaiorMedia(alunos, 5)].nome);
    printf("O aluno com menor média foi: %s\n", alunos[MenorMedia(alunos, 5)].nome);
    printf("O aluno com maior nota da prova1 foi: %s\n", alunos[MaiorNotaProva1(alunos, 5)].nome);
    SituacaoAluno(alunos, 5);
}

void SituacaoAluno(struct Aluno alunos[], int tamanho) {
    for(int i = 0; i < tamanho; i++) {
        if(alunos[i].media >= 6) {
            printf("O aluno %s foi aprovado!\n", alunos[i].nome);
        }
        else {
            printf("O aluno %s foi reprovado!\n", alunos[i].nome);
        }
    }
}

int MaiorNotaProva1(struct Aluno alunos[], int tamanho) {
    float maiorNota = 0;
    int index;

    for(int i = 0; i < tamanho; i++) {
        if(alunos[i].provas.prova1 > maiorNota) {
            maiorNota = alunos[i].provas.prova1;
            index = i;
        }
    }

    return index;
}

int MaiorMedia(struct Aluno alunos[], int tamanho) {
    float maiorMedia = 0;
    int index;

    for(int i = 0; i < tamanho; i++) {
        if(alunos[i].media > maiorMedia) {
            maiorMedia = alunos[i].media;
            index = i;
        }
    }

    return index;
}

int MenorMedia(struct Aluno alunos[], int tamanho) {
    float menorMedia = alunos[0].media;
    int index;

    for(int i = 0; i < tamanho; i++) {
        if(alunos[i].media < menorMedia) {
            menorMedia = alunos[i].media;
            index = i;
        }
    }

    return index;
}