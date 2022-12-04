#------------ Funções ---------------
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

def isMultigrafo(grafo):
    for i in range(len(grafo)):
        for j in range(len(grafo[i])):
            if(i in grafo[grafo[i][j]] and i != grafo[i][j]):
                return True
    return False

def isGrafoSimples(grafo):
    if(not isMultigrafo(grafo) and quantLacos(grafo) == 0):
        return True
    else:
        return False

def verticeIsolado(grafo):
    for i in range(len(grafo)):
        for j in range(len(grafo)):
            if(not i in grafo[j] and len(grafo[i]) == 0):
                return True
    return False

def verticeFolha(grafo):
    for i in range(len(grafo)):
        if(not i in grafo[i] and len(grafo[i]) == 1):
            return True
    return False

def grafoCompleto(grafo):
    for i in range(len(grafo)):
        for j in range(len(grafo)):
            if(not (i in grafo[j] or j in grafo[i]) and i != j):
                return False
    return True

#------------ Main ---------------
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
    print("7 - Verificar se existe vértice folha")
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
        if(isMultigrafo(grafo)):
            print("É um multigrafo!")
        else:
            print("Não é um multigrafo!")
    elif(opcao == 5):
        if(isGrafoSimples(grafo)):
            print("É um grafo simples!")
        else:
            print("Não é um grafo simples!")
    elif(opcao == 6):
        if(verticeIsolado(grafo)):
            print("Possui vértice isolado!")
        else:
            print("Não possui vértice isolado!")
    elif(opcao == 7):
        if(verticeFolha(grafo)):
            print("Possui vértice folha!")
        else:
            print("Não possui vértice folha!")
    elif(opcao == 8):
        if(grafoCompleto(grafo)):
            print("É um grafo completo!")
        else:
            print("Não é um grafo completo!")
    elif(opcao == 0):
        print("Finalizando...")
    else:
        print("Opção invalida, tente novamente!")