def quantLacos(grafo):
    lacos = 0

    for i in range(len(grafo)):
        for j in range(len(grafo[i])):
            if(grafo[i][j] == i):
                lacos += 1
    return lacos

def maiorGrau(grafo):
    maior = len(grafo[0])

    for i in range(1, len(grafo)):
        if(len(grafo[i]) > maior):
            maior = len(grafo[i])

    return maior

def menorGrau(grafo):
    menor = len(grafo[0])

    for i in range(1, len(grafo)):
        if(len(grafo[i]) < menor):
            menor = len(grafo[i])

    return menor

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
        lacos = quantLacos(grafo)
        print(f"Seu grafo possui {lacos} laços!")
    elif(opcao == 2):
        maior = maiorGrau(grafo)
        print(f"O maior Grau do seu grafo é {maior}")
    elif(opcao == 3):
        menor = menorGrau(grafo)
        print(f"O menor Grau do seu grafo é {menor}")
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
