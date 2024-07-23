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
