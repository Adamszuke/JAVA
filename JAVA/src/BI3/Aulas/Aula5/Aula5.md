# Aula 5 - Encapsulamento

## API 

Tipo um garçom, você faz um pedido para ele e ele te entrega. 

## Encapsulamento

É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente. 

### Regra geral Básica 

Um objeto **não** deve expor nenhum atributo (modificador de acesso private)

- Todo atributo é definido como private (privativo da classe)

(O atributo deixa de ser acessado por qualquer um )

Os atributos devem ser acessados por meio de métodos GET e SET
- Implementa-se métodos GET (obter) e SET (definir) para cada atributo, conforme regras de negócio.



