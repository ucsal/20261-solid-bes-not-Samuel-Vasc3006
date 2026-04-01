# Refatoração SOLID — Sistema das Olimpíadas

Esse projeto foi refatorado com base nos princípios do SOLID, com o objetivo de melhorar a organização do código sem alterar o comportamento original do sistema.

A ideia foi pegar um código "legado" (meio bagunçado hehehehe) e deixar ele mais estruturado, modular e fácil de manter.


## O que foi feito?

Durante a refatoração, o código foi reorganizado para separar melhor as responsabilidades e reduzir o acoplamento entre as classes.

Foram criadas classes de serviço (`Service`) para tirar regras de negócio da classe principal (`App`), além da introdução de interfaces para tornar o sistema mais flexível.


## Aplicação dos princípios SOLID

### S — Single Responsibility Principle (SRP)

Antes, a classe `App` fazia praticamente tudo: entrada de dados, regras de negócio, criação de objetos, etc.

Agora:
- Foram criadas classes como:
  - `ParticipanteService`
  - `ProvaService`
  - `QuestaoService`
  - `TentativaService`

Cada uma ficou responsável por uma parte específica do sistema. Como resultado, temos o código mais organizado e fácil de entender.


### O — Open/Closed Principle (OCP)

Foi criada a interface `Avaliavel`, implementada pela classe `Questao`.

Isso permite que no futuro outros tipos de questão sejam criados sem precisar alterar o código existente.

Exemplo: poderia existir uma `QuestaoDiscursiva`, `QuestaoVF`, etc.


### L — Liskov Substitution Principle (LSP)

Esse princípio não se aplicou diretamente no projeto, pois não há uso de herança entre classes.

Mesmo assim, a estrutura atual permite que futuras extensões respeitem esse princípio.


### I — Interface Segregation Principle (ISP)

Também não foi necessário aplicar diretamente, pois não existem interfaces grandes ou genéricas no sistema.

As interfaces criadas são simples e específicas.


### D — Dependency Inversion Principle (DIP)

Foi criada a interface `TentativaServiceInterface`, e o `App` passou a depender dela ao invés da classe concreta `TentativaService`.

Isso reduz o acoplamento e torna o código mais flexível e fácil de manter.
