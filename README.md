# ☕ Estudos de PPOO — Java

Exercícios e práticas da disciplina de Programação Orientada a Objetos, feitos em Java no VS Code. Cada pasta é um projeto independente (`src/` com o código, `lib/` para dependências); o `README.md` de cada uma é o modelo padrão gerado pelo VS Code.

| Pasta | Tema | Classes principais |
|---|---|---|
| `Exercicio1` | Classes, atributos e métodos | `Produto` |
| `Exercicio2` | Métodos numéricos em classe | `NewtonRapshon` (método de Newton-Raphson) |
| `Exercicio3` | Manipulação de strings | `Frase` |
| `TagPedagio` | Construtores sobrecarregados e encapsulamento | `TagPedagio`, `Pedagios` |
| `EstudoProva1` | Composição com `ArrayList` | `Carro`, `Estacionamento` |
| `ProvaMultiplicacao` | Prova de tabuada com questões aleatórias (`Random`) e correção | `Prova`, `Questao`, `Correcao` |
| `PraticaColecoesDeLista` | Listas, ordenação e diário de classe (aprovação por nota e faltas) | `Aluno`, `Disciplina`, `Sig` |
| `Heranca` | Herança e classe abstrata | `Veiculo`, `Carro`, `Caminhao`, `Frota` |
| `ClasseEInterface` | Interfaces e polimorfismo | `Segurado`, `Imovel`, `Casa`, `Apatamento`, `Pessoa` |
| `GerenciamentoDeContatos` | Herança + menu interativo | `Agenda`, `Contato`, `PessoaFisica`, `PessoaJuridica`, `Menu` |
| `MetodoEClasseGenerico` | Generics (`<T>`) | `MetodoGenerico`, `Trio<T>` |
| `ArquivosESerializacao` | Leitura/escrita de arquivos texto e binário (`Serializable`) | `ManipuladorDeArquivos`, `HistoricoCompras`, `Cliente`, `Compra`, `Produto`, `Menu` |

### Como executar
Abra a pasta do exercício no VS Code (extensão *Extension Pack for Java*) e rode o `main` da classe principal, ou pelo terminal:
```bash
cd Heranca
javac -d bin src/*.java
java -cp bin App
```
