print("Representação por matriz\n")

print("1 - Grafo Direcionado")
print("2 - Grafo Não Direcionado")
tipoGrafo = int(input("Escolha o tipo do Grafo: "))

vertices = int(input("Digite a quantidade de vértices: "))

grafo = [[0 for i in range(vertices)] for i in range(vertices)]

condicao = True

while condicao:
    verticeA = int(input("Digite o vértice de partida: "))
    verticeB = int(input("Digite o vértice de chegada: "))
    arestas = int(input("Digite a quantidade de arestas: "))

    condicao = verticeA >= 0 and verticeB >= 0 and arestas >= 0

    if condicao:
        grafo[verticeA][verticeB] = arestas
        if tipoGrafo == 2:
            grafo[verticeB][verticeA] = arestas

print("\nSeu grafo ficou assim: \n")
for i in range(vertices):
    for j in range(vertices):
        print(f" {grafo[i][j]} ", end="")
    print("")