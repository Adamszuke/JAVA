Você foi contratado por uma empresa de controle de entregas para desenvolver parte de um sistema de gerenciamento de veículos utilizados pela frota de entregadores. O objetivo é criar uma estrutura de classes que represente diferentes tipos de veículos com suas características e comportamentos.

🧩 Requisitos:
Crie uma classe base chamada Veiculo com os seguintes atributos:
marca (String)
modelo (String)
ano (int)

Implemente os seguintes métodos na classe Veiculo:
Um construtor que receba todos os atributos.
Um método exibirInformacoes(), que retorne uma String com todos os dados do veículo.

Utilize sobrecarga criando outro construtor que receba apenas marca e modelo, assumindo o ano como 2020 por padrão.
Crie uma classe Moto que herda de Veiculo e adicione o atributo:
cilindrada (int)
Também implemente:
Construtor completo (chamando o super)
Sobrescreva o método exibirInformacoes() para incluir a cilindrada.

Crie uma classe Caminhao que herda de Veiculo e adicione os atributos:
capacidadeCarga (em toneladas - double)
quantidadeEixos (int)
Implemente:
Construtor completo
Sobrescrita do método exibirInformacoes() para incluir esses novos atributos.

Na classe principal (AppFrota), crie ao menos:
Um objeto Veiculo usando o construtor com 3 parâmetros
Um objeto Veiculo usando o construtor com 2 parâmetros
Um objeto Moto
Um objeto Caminhao

Para cada um, chame o método exibirInformacoes() e imprima o retorno.