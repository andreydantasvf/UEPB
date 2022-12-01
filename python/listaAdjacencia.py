print("Representação por lista\n")

quantVertices = int(input("Digite a quantidade de vértices: "))

grafo = []

for i in range(quantVertices):
    grafoAux = []
    condicao = True

    while condicao:
        vertice = int(input(f"Digite um vertice adjacente a [{i}]: "))

        condicao = vertice >= 0
        
        if condicao:
            grafoAux.append(vertice)
        
    grafo.append(grafoAux)

print("\nSeu grafo ficou assim:\n")
for i in range(quantVertices):
    print(f"Vertice {i}: {grafo[i]}")

opcao = 1

while opcao != 0:
    print("\n-----Menu-----\n")
    print("1 - Mostrar quantos laços tem o grafo")
    print("2 - Mostrar maior grau do grafo")
    print("3 - Mostrar menor grau do grafo")
    print("4 - Saber se é um multigrafo")
    print("5 - Saber se é um grafo Simples")
    print("6 - Verificar se existe vértice isolado")
    print("8 - Verfiicar se é um grafo completo")
    print("0 - Sair")
    opcao = int(input("Escolha uma das opções acima: "))

    if(opcao == 1):
        print("caso 1")
    elif(opcao == 2):
        print("caso 2")
    elif(opcao == 3):
        print("caso 3")
    elif(opcao == 4):
        print("caso 4")
    elif(opcao == 5):
        print("caso 5")
    elif(opcao == 6):
        print("caso 6")
    elif(opcao == 7):
        print("caso 7")
    elif(opcao == 8):
        print("caso 8")
    elif(opcao == 0):
        print("Finalizando...")
    else:
        print("Opção invalida, tente novamente!")
