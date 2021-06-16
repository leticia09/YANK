# Programação Orientada a Objetos

### Private (Encapsulamento)
- A partir do momento que a atributo de uma classe é privado, isso quer dizer que este atributo não pode ser lido, editado por ninguém a não ser a própria classe. É privado da classe;
- Para pegar ou inserir dados em um atributo privado, é necessário usar métodos, ex: get e set.  

### Construtor
- Quando vamos insatnaciar uma classe, e usamos o trecho de código `Conta conta = new Conta()`, esse `Conta()` está chamando um construtor padão do java que já vem na classe;
- É uma rotina de inicialização, diferentemente de um método;
- No construtor, pode iniciar as variáveis/atributos da classe, com valores específicos;
- O mais interessante do construtor, é que ele pode receber parâmetros, ou seja, aquela classe apenas será inicializada se os parametros que definem restrições forem inicializados;
- Um tipo de "controle fino" da construção do objeto.

### Static
- static quer dizer que aquele atributo pertence a classe, é parecido com uma variável global.


## Relacionamento entre classes
### Protected
- Público para os filhos, ou seja, em uma herança, aquele atributo que estaria privado na classe, estará também visível para os filhos `extends`.

### Utilização do super
- `super` quer dizer o atributo não é natural daquela classe, e sim da classe mãe. 

### Reescrita de métodos
- Quando um mesmo método está escrito em mais de uma classe (filha) diferente.
- É possível aproveitar os métodos da classe mãe utilizando o `super`.

### Classe abstract
- É uma classe modelo, conceitual. ex: classe funcionarios, é uma classe modelo que da origem aos cargos que um funcionario pode ter. A notação é `abstract`

### Método abstract 
- Método sem corpo, não há implementação. Quem implementa o método são os filhos.

### Interfaces
- No java não existe heranças múltiplas, ou seja, não é possível extender uma classe para mais de uma classe. Para resolver esse problema utilizamos as interfaces;
- Uma interface não pode ter nenhuma atributo, ou método concreto, ou seja é uma classe totalmente abstrata;
- É uma solução para o polimorfismo.