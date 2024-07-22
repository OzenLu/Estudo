Armazenar algumas estudos, meio solto por enquanto mas pretendo organizar de uma melhor forma mais pra frente.

Coesão: altamente coeso é algo bom, é relacionado ao quão especifico é o proposito que aquela classe está servindo e quanto menos proposito, melhor. de preferência um proposito por classe.

Criando um objeto, o que acontece?
0° - Bloco de inicialização static é executado apenas uma vez, quando a JVM carrega a classe
1° - Alocado espaço em memoria pro objeto
2° - Cada atributo de classe é inicializado com valores default ou passados inicialmente
3° - Bloco de inicialização(não static) é executado sempre que um objeto é criado
4° - Construtor é executado

Metodos static podem ser chamados dentro de um bloco de inicialização static
