#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct Contact {
    char nome[40], email[40];
    char telefone[15], celular[15];
    struct Contact *nextContact;
} Contact;

typedef struct {
    Contact *initialContact;
} Agenda;

void stopSystem();
void insertContact(Agenda *agenda, char *nome, char *email, char *telefone, char *celular);
void showContacts(Agenda *agenda);

int main(void)
{
    int option;
    Agenda agenda;
    char nome[40], email[40], telefone[15], celular[15];

    // Iniciando o nó agenda
    agenda.initialContact = NULL;

    do {
        printf("\n-----------------------------------------\n");
        printf("1 - Inserir Contato\n");
        printf("2 - Listar Contatos\n");
        printf("3 - Buscar Contato\n");
        printf("4 - Sair\n");

        printf("Escolha uma opção: ");
        scanf("%d", &option);

        switch (option)
        {
        case 1:
            printf("\n-----------------------------------------\n");
            setbuf(stdin, NULL);
            printf("Digite o Nome do contato: ");
            fgets(nome, 40, stdin);
            setbuf(stdin, NULL);
            printf("Digite o Email do contato: ");
            fgets(email, 40, stdin);
            setbuf(stdin, NULL);
            printf("Digite o Telefone do contato: ");
            fgets(telefone, 15, stdin);
            setbuf(stdin, NULL);
            printf("Digite o Celular do contato: ");
            fgets(celular, 15, stdin);
            insertContact(&agenda, nome, email, telefone, celular);

            printf("\nContato registrado com sucesso!");
            break;
        case 2:
            printf("\n-----------------------------------------\n");
            showContacts(&agenda);
            break;
        case 3:
            printf("\n-----------------------------------------\n");
            printf("Buscar");
            break;
        case 4:
            break;
        default:
            printf("Opção invalida, tente novamente! \n");
        }

    } while (option != 4);
}

// Funções

// Inserir um novo contato na agenda
void insertContact(Agenda *agenda, char *nome, char *email, char *telefone, char *celular) {
    // Alocando a memoria do tipo Contact
    Contact *new, *newContact = (Contact*)malloc(sizeof(Contact));

    // Colocando valores nas propriedades do Contato
    strcpy(newContact->nome, nome);
    strcpy(newContact->email, email);
    strcpy(newContact->telefone, telefone);
    strcpy(newContact->celular, celular);
    newContact->nextContact = NULL;

    // verificando de a lista está vazia
    if(agenda->initialContact == NULL) {
        agenda->initialContact = newContact;
    }
    else {
        new = agenda->initialContact;
        while(new->nextContact != NULL) {
            new = new->nextContact;
        }
        new->nextContact = newContact;
    }
}

// Mostrar todos os Contatos
void showContacts(Agenda *agenda) {
    Contact *initial = agenda->initialContact;
    if(initial != NULL) {
        printf("Lista de Contatos!\n");
        while(initial != NULL) {
            printf("\nNome: %s", initial->nome);
            printf("Email: %s", initial->email);
            printf("Telefone: %s", initial->telefone);
            printf("Celular: %s\n", initial->celular);
            initial = initial->nextContact;
        }
    }
    else {
        printf("Não existe nenhum Contato registrado!\n");
    }
}