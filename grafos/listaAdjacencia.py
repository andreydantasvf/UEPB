def funcaomultigrafo(grafo):
    for i in range(len(grafo)):
        for j in range(len(grafo[i])):
            if(i in grafo[grafo[i][j]] and i != grafo[i][j]):
                return True
    return False

def funcaografosimples(grafo):
    lacos = 0

    for i in range(len(grafo)):
        for j in range(len(grafo[i])):
            if(grafo[i][j] == i):
                lacos += 1

    if(not funcaomultigrafo(grafo) and lacos == 0):
        return True
    else:
        return False

def funcaoverticeisolado(grafo):
    for i in range(len(grafo)):
        for j in range(len(grafo)):
            if(not i in grafo[j] and len(grafo[i]) == 0):
                return True
    return False

def funcaoverticefolha(grafo):
    for i in range(len(grafo)):
        if(not i in grafo[i] and len(grafo[i]) == 1):
            return True
    return False

def funcaografocompleto(grafo):
    for i in range(len(grafo)):
        for j in range(len(grafo)):
            if(not (i in grafo[j] or j in grafo[i]) and i != j):
                return False
    return True

print("Representação por lista\n")

quantVertices = int(input("Digite a quantidade de vértices: "))

grafo = []

for i in range(quantVertices):
    grafoAux = []

    while True:
        vertice = int(input(f"Digite um vertice adjacente a [{i}]: "))
        
        if vertice >= 0:
            grafoAux.append(vertice)
        else:
            break
        
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
        lacos = 0

        for i in range(len(grafo)):
            for j in range(len(grafo[i])):
                if(grafo[i][j] == i):
                    lacos += 1

        print(f"Seu grafo possui {lacos} laços!")
    elif(opcao == 2):
        maior = len(grafo[0])

        for i in range(1, len(grafo)):
            if(len(grafo[i]) > maior):
                maior = len(grafo[i])

        print(f"O maior Grau do seu grafo é {maior}")
    elif(opcao == 3):
        menor = len(grafo[0])

        for i in range(1, len(grafo)):
            if(len(grafo[i]) < menor):
                menor = len(grafo[i])

        print(f"O menor Grau do seu grafo é {menor}")
    elif(opcao == 4):
        if(funcaomultigrafo(grafo) == True):
            print("É um multigrafo!")
        else:
            print("Não é um multigrafo!")
    elif(opcao == 5):
        if(funcaografosimples(grafo) == True):
            print("É um grafo simples!")
        else:
            print("Não é um grafo simples!")
    elif(opcao == 6):
        if(funcaoverticeisolado(grafo) == True):
            print("Possui vértice isolado!")
        else:
            print("Não possui vértice isolado!")
    elif(opcao == 7):
        if(funcaoverticefolha(grafo) == True):
            print("Possui vértice folha!")
        else:
            print("Não possui vértice folha!")
    elif(opcao == 8):
        if(funcaografocompleto(grafo) == True):
            print("É um grafo completo!")
        else:
            print("Não é um grafo completo!")
    elif(opcao == 0):
        print("")
    else:
        print("Opção invalida, tente novamente!")