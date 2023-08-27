# Flood Fill
Preenchimento por inundação, também chamado de Flood fill ou seed fill, é um algoritmo de inundação que determina e altera a área conectada a um determinado nó em uma matriz multidimensional com algum atributo correspondente.

# Como funciona pilha e fila? Quais as diferenças?

Pilha no Flood Fill:
Ao usar uma pilha no algoritmo de Flood Fill, você coloca os elementos a serem preenchidos em uma pilha. Começando de uma posição inicial, você verifica os vizinhos desse ponto e, se forem elegíveis para preenchimento, os adiciona à pilha. Em seguida, repete-se esse processo, retirando elementos da pilha e explorando seus vizinhos, até que a área contígua seja completamente preenchida.

Lista no Flood Fill:
Ao usar uma lista no algoritmo de Flood Fill, você pode criar uma lista de elementos a serem preenchidos. Isso pode ser feito semelhante à abordagem da pilha, explorando os vizinhos de cada elemento e adicionando-os à lista para posterior preenchimento. A principal diferença é que a lista não segue a estrutura LIFO da pilha. A ordem em que os elementos são explorados pode ser diferente, mas o objetivo de preencher a área contígua ainda é alcançado.

Diferenças:
A principal diferença entre o uso de pilhas e listas no algoritmo de Flood Fill está na ordem de exploração dos elementos e na abordagem de preenchimento. Com uma pilha, você tende a explorar uma região mais profundamente antes de voltar. Com uma lista, a exploração pode ser mais ampla e menos previsível em termos de ordem.

# Como funciona pilha e filas encadeadas?

![Wfm_floodfill_animation_stack](https://github.com/felipesphair/FloodFill/assets/107360437/26ba7d3b-0e5a-41c3-b2d5-78017a4d51fc)

![Wfm_floodfill_animation_queue](https://github.com/felipesphair/FloodFill/assets/107360437/7756f108-57d5-4f67-bb57-48b375da9e3c)

# Como o código funciona?

Para rodar:

Main.java:

Matrix.java: 

Color.java:

FloodFill.java:

LinkedQueue.java:

LinkedStack.java:

GenericList.java:

Node.java:

