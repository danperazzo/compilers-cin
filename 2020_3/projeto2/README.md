# TODO LIST:
(VERIFICAR COM MONITOR POSIÇÃO DOS WARNINGS/ERROS)

* **(done)** int ​ = ​ FloatExpression​ 
	* Esta operação irá gerar um ​ warning ​ ​ notificando
possível perda de informação na atribuição da
variável int e indicando a linha e coluna da
ocorrência.

* **(done)** Atribuições do tipo ​ int ​ = ​ string​ ou ​ float ​ = ​ string
	* Devem gerar um ​ erro, indicando a linha e coluna do
ocorrido.

* **(done)** Expressões do tipo ​void​ não podem ser atribuídas a
nenhuma variável nem colocadas como operadores
em expressões aritméticas, gerando um ​ erro​ caso isto
aconteça, indicando a linha e coluna da ocorrência.

* **(done)** Funções com tipo ​ void​ não podem
retornar expressões de nenhum tipo.
	* Um erro indicando o retorno de um valor
non-void ​ em uma função ​ void ​ deve ser emitido
caso isto ocorra, indicando a linha e coluna da
ocorrência.

* **(done)** Caso uma variável ou função não definida seja usada no
programa, deve ser gerado um ​ erro​ indicando que a
variável/função não foi declarada.
	* Porém, não precisa checar se uma variável ou função
	já foi declarada: todos os testes utilizam nomes únicos
	para cada variável ou função declarada.
	* Também deve ser checado se o número de parâmetros
	passados para determinada chamada de função é correto.
	* Lembre-se que toda função definida possui um tipo, e sua
	chamada (​ function_call ​ ) retorna um valor daquele tipo.

* **(done)** Operações aritméticas entre expressões do tipo ​ int​ e ​ float
devem retornar uma expressão do tipo ​float​.

* **(done)** Arrays  devem seguir as mesmas regras indicadas
acima, porém seu ​ erro ​ ou ​ warning ​ emitido deve
indicar também o índice no qual houve a ocorrência do
mesmo, considerando que só teremos ​ arrays​ estáticos
na linguagem. (Se houver mais de um problema na
definição do mesmo array, cada problema deve gerar
a saída (​erro​ ou ​warning​) equivalente).

* Expressões que sejam o índice de um array devem ser do
tipo ​ int​, gerando um ​ erro​ , indicando linha e coluna, caso
contrário.