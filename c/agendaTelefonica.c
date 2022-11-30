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

void insertContact(Agenda *agenda, char *nome, char *email, char *telefone, char *celular);
void showContacts(Agenda *agenda);
void searchContact(Agenda *agenda, char *nome);
Contact* removeContact(Agenda *agenda, char *nome);

int main(void)
{
    int option;
    Agenda agenda;
    Contact *contatoRemovido;
    char nome[40], email[40], telefone[15], celular[15];

    // Iniciando o nó agenda
    agenda.initialContact = NULL;

    do {
        printf("\n-----------------------------------------\n");
        printf("1 - Inserir Contato\n");
        printf("2 - Listar Contatos\n");
        printf("3 - Buscar Contato\n");
        printf("4 - Remover Contato\n");
        printf("0 - Sair\n");

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
            setbuf(stdin, NULL);
            printf("Digite o Nome do contato que deseja buscar: ");
            fgets(nome, 40, stdin);
            searchContact(&agenda, nome);
            break;
        case 4:
            printf("\n-----------------------------------------\n");
            setbuf(stdin, NULL);
            printf("Digite o Nome do contato que deseja remover: ");
            fgets(nome, 40, stdin);
            contatoRemovido = removeContact(&agenda, nome);
            if(contatoRemovido != NULL) {
                printf("\nContato removido!");
                printf("\nNome: %s", contatoRemovido->nome);
                printf("Email: %s", contatoRemovido->email);
                printf("Telefone: %s", contatoRemovido->telefone);
                printf("Celular: %s\n", contatoRemovido->celular);
                free(contatoRemovido);
            }
            else {
                printf("\nO contato que você deseja remover NÃO existe!");
            }
            break;
        case 0:
            break;
        default:
            printf("Opção invalida, tente novamente! \n");
        }

    } while (option != 0);
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

// Buscar um contato pelo nome
void searchContact(Agenda *agenda, char *nome) {
    Contact *initial = agenda->initialContact;
    if(initial != NULL) {
        while(initial != NULL) {
            if(strcmp(initial->nome, nome) == 0) {
                printf("Contato encontrado!\n");
                printf("\nNome: %s", initial->nome);
                printf("Email: %s", initial->email);
                printf("Telefone: %s", initial->telefone);
                printf("Celular: %s\n", initial->celular);
                return;
            }
            initial = initial->nextContact;
        }
        printf("Nenhum Contato encontrado com esse nome!\n");
    }
}

// Remover um contato da Agenda
Contact* removeContact(Agenda *agenda, char *nome) {
    // Criando os nós auxiliares
    Contact *auxiliar, *remover = NULL;

    // Verificando se a Agenda não está vazia
    if(agenda->initialContact) {
        // Verificando se o valor para ser removido está no inicio da Agenda
        if(strcmp(agenda->initialContact->nome, nome) == 0) {
            // Alterando a ligação dos nós
            remover = agenda->initialContact;
            agenda->initialContact = remover->nextContact;
        }
        else {
            auxiliar = agenda->initialContact;
            while(auxiliar->nextContact && strcmp(auxiliar->nextContact->nome, nome) != 0) {
                auxiliar = auxiliar->nextContact;
            }
            // Verificando se o nome procurado foi encontrado na Agenda
            if(auxiliar->nextContact) {
                remover = auxiliar->nextContact;
                auxiliar->nextContact = remover->nextContact;
            }
        }
    }
    return remover;
}