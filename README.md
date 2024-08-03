Armazenar algumas estudos, meio solto por enquanto mas pretendo organizar de uma melhor forma mais pra frente.

Coesão: altamente coeso é algo bom, é relacionado ao quão especifico é o proposito que aquela classe está servindo e quanto menos proposito, melhor. de preferência um proposito por classe.

Criando um objeto, o que acontece?
0° - Bloco de inicialização static é executado apenas uma vez, quando a JVM carrega a classe
1° - Alocado espaço em memoria pro objeto
2° - Cada atributo de classe é inicializado com valores default ou passados inicialmente
3° - Bloco de inicialização(não static) é executado sempre que um objeto é criado
4° - Construtor é executado

Metodos static podem ser chamados dentro de um bloco de inicialização static


Modificador *protected*: atributos ou metodos que tiverem esse modificador, poderão ser acessados dentro do mesmo pacote ou por uma subclasse

Modificador *final*: É uma constante, os atributos com o modificador *final* não poderão ser alterados, já que o seu objetivo é ser constante.
normalmente é escrito em letra maiuscula, como por exemplo: ![image](https://github.com/user-attachments/assets/6a71ef63-b993-4987-bd8d-3b658bcec5a3)

Classes e metodos também podem ter o modificador *final*.
se uma classe tem o modificador *final* esta classe não poderá ter subclasses.
se um método tem o modificador *final* este metodo não poderá ser sobrescrito.

É redundante ter uma classe *final* com métodos *final*, afinal se você não consegue herdar uma classe, também não consegue sobrescrever os seus metodos.

*Enum* é extremamente interessante. Criamos meio que 'opções' para serem seguidas, nelas podemos ter valores também. 
caso adicionarmos um valor as opções do enum, é preciso explicitar o construtor também, com esses novos valores que eles precisarão ter.
Na hora da criação do objeto, utilizando o enum como uma das opções contidas nele, não passamos como parametro nenhum valor para o construtor do enum, pois ele é privado.
Enum parece trabalhar bem com funções abstratas.
Criando o Enum;
![image](https://github.com/user-attachments/assets/e257d71b-3675-4eeb-8931-90003366ee83)
Utilizando o Enum como parametro na criação do objeto:
![image](https://github.com/user-attachments/assets/9ff91c84-280c-443a-8e62-cc33a227429d)
![image](https://github.com/user-attachments/assets/514b7061-4cb8-434d-83fe-bf331f6682b6)
![image](https://github.com/user-attachments/assets/383e9882-7c70-4cd4-9e0f-c2f4a4fac5ca)

*Interface* É tipo uma classe 'contrato', caso uma classe implemente uma interface, é necessario que essa classe sobrescreva todos os metodos da interface que esta implementando.
Por padrão, todos as funções de uma Interface são public e abstract(não possuem escopo primariamente, mas quando é implementada, o escopo precisa ser construido).
Por padrão, os atributos são final, ou seja, constantes.
Quando uma interface cria novas funções, por padrão as classes que implementam essa interface são obrigadas a
criar essas funções também, dessa forma podendo quebrar a aplicação.

o modificador default serve para contornar esse possivel problema, ele cria uma função concreta, ao invés de uma abstrata
dessa forma é possivel criar o escopo da função direto na interface, ao inves de deixar a cargo das classes que a implementam.
Dessa forma as proximas classes podem apenas sobrescrever essa função default.
![image](https://github.com/user-attachments/assets/483cc08c-1c2c-433e-a954-66f07657b18a)


