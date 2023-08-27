# Flood Fill
Preenchimento por inundação, também chamado de Flood fill ou seed fill, é um algoritmo de inundação que determina e altera a área conectada a um determinado nó em uma matriz multidimensional com algum atributo correspondente. No trabalho optamos por usar arrays para implementar o Flood fill pode ser mais simples e eficiente em termos de acesso direto aos elementos. Sendo útil quando você está trabalhando com uma estrutura de dados bidimensional(grid), onde os elementos estão organizados em linhas e colunas.

# Como funciona pilha e fila? Quais as diferenças?

Pilha no Flood Fill:
Ao usar uma pilha no algoritmo de Flood Fill, você coloca os elementos a serem preenchidos em uma pilha. Começando de uma posição inicial, você verifica os vizinhos desse ponto e, se forem elegíveis para preenchimento, os adiciona à pilha. Em seguida, repete-se esse processo, retirando elementos da pilha e explorando seus vizinhos, até que a área contígua seja completamente preenchida.

![Wfm_floodfill_animation_stack](https://github.com/felipesphair/FloodFill/assets/107360437/26ba7d3b-0e5a-41c3-b2d5-78017a4d51fc)

Lista no Flood Fill:
Ao usar uma lista no algoritmo de Flood Fill, você pode criar uma lista de elementos a serem preenchidos. Isso pode ser feito semelhante à abordagem da pilha, explorando os vizinhos de cada elemento e adicionando-os à lista para posterior preenchimento. A principal diferença é que a lista não segue a estrutura LIFO da pilha. A ordem em que os elementos são explorados pode ser diferente, mas o objetivo de preencher a área contígua ainda é alcançado.

![Wfm_floodfill_animation_queue](https://github.com/felipesphair/FloodFill/assets/107360437/7756f108-57d5-4f67-bb57-48b375da9e3c)

Diferenças:
A principal diferença entre o uso de pilhas e listas no algoritmo de Flood Fill está na ordem de exploração dos elementos e na abordagem de preenchimento. Com uma pilha, você tende a explorar uma região mais profundamente antes de voltar. Com uma lista, a exploração pode ser mais ampla e menos previsível em termos de ordem.


# Como o código funciona?

Main.java: tem como função de iniciar a execução do programa e coordenar a interação com o usuário, permitindo a escolha de padrões e parâmetros para o algoritmo de Flood Fill.
  

PATH STRUCTURES:
  Coordinate.java: é usada para armazenar as posições de linha e coluna em um formato fácil de acessar e usar.
  
  GenericList.java: é uma interface que define métodos para adicionar, remover e verificar elementos em uma estrutura de dados genérica que armazena coordenadas.
  
  Queue.java (fila):
  
  implementa uma fila que armazena coordenadas (linha e coluna), permitindo a adição (enqueue) e remoção (dequeue) de elementos seguindo o conceito FIFO (primeiro a entrar, primeiro a sair).
  
  ![fila](https://github.com/felipesphair/FloodFill/assets/107360437/feb9cf6d-315f-4a44-a412-2877b8fb3302)

  Stack.java (pilha):

  A classe Stack implementa uma pilha que armazena coordenadas, permitindo a adição (push) e remoção (pop) de elementos seguindo a política LIFO (último a entrar, primeiro a sair).
  
  ![pilha](https://github.com/felipesphair/FloodFill/assets/107360437/4c675561-232c-4d69-b9a5-df9f5c2d2b84)

  
PATH FILL:
  Color.java: Definição das cores que irão aparecer na matrix

  FloodFill.java: altera valores de pixel a partir de uma posição inicial e propagando essas alterações usando uma estrutura de dados (pilha ou fila) para rastrear e processar os elementos.

  Matrix.java: Definição da imagem escolhida, tendo como padrão outra caso a opção digitada for inexistente.


# Exemplos de funcionamento

Resultado 1:

![image](https://github.com/felipesphair/FloodFill/assets/107360437/229d8a09-3af8-4639-9dd6-853a4c721f76)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/0dd22346-2278-49f3-bc17-1c901b9399fc)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/8d5d8fc3-53b2-4b64-a70f-f69349f83317)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/4d30986c-b1ee-49f6-8be3-ab61fe696b26)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/d0a74126-23b9-4541-b613-77df669a17d8)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/a083185a-7025-4eb3-902a-8480af8d0d8c)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/74009e00-8d6f-42d4-a255-1003531425aa)

Resultado 2:

![image](https://github.com/felipesphair/FloodFill/assets/107360437/f04b4ceb-6086-446e-a9f4-758a7c72c0dd)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/04e6ac60-a7f1-4f65-aa1e-3d9cfe504f1f)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/6e139671-1fb1-46f9-9f94-856b84e4a357)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/73f88b00-3e6b-408f-b565-0d205ed11e6b)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/6c91c723-ea87-4faa-81f5-f1a312a5d4df)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/3f5a301d-7b25-4f98-b0ef-ca3ddb8d4c4b)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/cf872f90-8efe-4d7a-8b62-f8e3777416cd)

Resultado 3:

![image](https://github.com/felipesphair/FloodFill/assets/107360437/b228f212-0a6b-4b47-bbba-13487663a589)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/d30ac4c9-2cc5-4923-872f-7cffc69b2201)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/d7f5a872-a85a-433c-a619-aaee2bee9e77)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/f1c11b05-8a2f-423e-a0db-6fc94e2ef5e0)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/fa4e139a-a04d-46bc-9585-ad0bdb71f494)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/498f5613-7451-42f6-83ad-f29f12e8be1e)


Resultado 4:

![image](https://github.com/felipesphair/FloodFill/assets/107360437/342981b4-c10b-472b-97bf-2a9986d2eb92)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/3530b1ab-a3f0-4191-b692-85a06d3284c3)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/d1339d03-52da-4ad0-afc5-5646fe75a267)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/7faf45e0-ce49-4f53-b76f-f34a7bca4007)

![image](https://github.com/felipesphair/FloodFill/assets/107360437/4b3eaef5-ab70-4030-831d-c763e51ecfe9)





