# desafio-logica
Repositório do desafio proposto pela DIO, referente a lógica de programação.

Sobre:
Através de diversas aulas, aprendi conceitos da lógica de programação utilizando a linguagem JavaScript. Colocamos em prática os conceitos de estrutura de repetição, condicional, Arrays e Matrizes.

Ao final do curso, teríamos que entregar o respectivo desafio:

Crie uma variável para armazenar o nome e a quantidade de experiência (XP) de um herói, depois utilize uma estrutura de decisão para apresentar alguma das mensagens abaixo:
Se XP for menor do que 1.000 = Ferro
Se XP for entre 1.001 e 2.000 = Bronze
Se XP for entre 2.001 e 5.000 = Prata
Se XP for entre 6.001 e 7.000 = Ouro
Se XP for entre 7.001 e 8.000 = Platina
Se XP for entre 8.001 e 9.000 = Ascendente
Se XP for entre 9.001 e 10.000= Imortal
Se XP for maior ou igual a 10.001 = Radiante
## Saída
Ao final deve se exibir uma mensagem:
"O Herói de nome **{nome}** está no nível de **{nivel}**"

Deixaram explícito que poderíamos utilizar a linguagem de nossa preferência. Então, optei por seguir com a linguagem Kotlin e alterei um pouco a proposta do desafio. O vídeo abaixo apresenta o código e a execução da aplicação.

O que o código faz:
1 - O código cria uma lista chamada "herois", contém os nomes de heróis.
2 - Utilizei a função Random.nextInt() para gerar valores aleatórios de XP para os heróis.
3 - Ao executar o código, é apresentado ao usuário os nomes dos heróis disponíveis e pede ao usuário para selecionar algum herói.
4 - Com base na seleção do usuário e nos valores de XP aleatórios, o código determina o nível do herói.
5 - De saída para o usuário, é exibido o nome, o nível e a quantidade de XP do herói escolhido.

O que eu fiz para chegar nesse resultado:

1 - O código cria uma lista de heróis, atribuídos por mim. Também, é gerado o XP aleatoriamente para os heróis.
2 - Criei uma função para determinar o nível do herói, com base na quantidade de XP.
3 - O código mostra a lista de heróis para usuário e verifica se a seleção do usuário é válida.
4 - Após a seleção do herói, é retornado ao usuário as informações necessárias.


Sintetizando, esse código permite que o usuário escolha o herói, atribuindo a cada um deles valores aleatórios de XP e determinando o nível com base nas faixas de XP especificadas(Estrutura condicional). Em seguida, exibe as informações do herói selecionado, incluindo nome, nível e XP.
