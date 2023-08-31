#include <stdio.h>

struct Dep {
    char nome[255];
    char local[255];
};

struct Funcionario {
    char nome[255];
    char cpf[255];
    struct Dep departamento;
};

int main(void) {
    struct Funcionario funcionarios[5];

    for(int i = 0; i < 5; i++) {
        printf("Digite o nome do %dº funcionario: ", i+1);
        fgets(funcionarios[i].nome, 255, stdin);
        printf("Digite o CPF do %dº funcionario: ", i+1);
        fgets(funcionarios[i].cpf, 255, stdin);
        printf("Digite o nome do Departamento do %dº funcionario: ", i+1);
        fgets(funcionarios[i].departamento.local, 255, stdin);
        printf("Digite o local do departamento do %dº funcionario: ", i+1);
        fgets(funcionarios[i].departamento.local, 255, stdin);
        printf("%d Funcionario cadastrado(s)!\n\n", i+1);
    }

    printf("\nEsses foram os funcionarios cadastrados: \n");
    for(int i = 0; i < 5; i++) {
        printf("\n%dº %s", i+1, funcionarios[i].nome);
    }
}