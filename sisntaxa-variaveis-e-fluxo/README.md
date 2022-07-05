# sintaxe-basica-java  


1. abrir gitbash
2. ir/entrar para pasta do usuário
	$ cd ~
3. listar os itens da pasta atual(opcional)
	$ ls ($ dir, se for no cmd)
	ver se encontra a pasta git/
4. acessar a pasta git
	$ cd git
	repetir o step(passo) 3
5. acessar/entrar na pasta do projeto desejado
	$ cd <nome-pasta-do-projeto>
	$ cd sintaxe-basica-java/
	repetir o step(passo) 3
6. verificar o status do projeto se teve alguma mudança
	$ git status
7. marcar os arquivos que deseja salvar(salvar no commit local)
	$ git add . (adiciona tudo de tudo/ todos os arquivos disponivies e ocultos também)
	OU
	$ git add <nome com o caminho de diretorios(pasta) do arquivo completo> (Adicionar somente um arquivo) ** é pouco utilizado
8. commitar/salvar local tudo o que foi add . ou add <nome do arquivo>
	repetir o step 6 para ver se todos os arquivos e pastas que você quer commitar foram adicionados e ficaram "verdes"(opcional)
	$ git commit -m "mensagem com informacoes sobre as alteraçoes feitas"
9. Uffa, finalmente enviar para a nuvem o que você quer e deu add (./nome do arquivo) e commitou.
	$ git push (para empurrar as alterações para a nuvem)

Fim.

comandos úteis
para fechar o gitbash 
$ exit

para recuperar comandos já executados no gitbash
setas para cima ou para baixo

para completar um nome de um arquivo ou pasta(diretorio) existente
precionar tab


para limpar a tela
$ clear 












executar esses comandos na raiz do projeto (~/git/sintaxe-basica-java ) usando o cmd ou gitbash

acessar o gitbash
acessar a pasta do projeto (cd vai para o caminho(path/diretorio) indicado)
$ cd ~/git/sintaxe-basica-java

acessar o cmd(prompt de comando)windows + r
cd C:\Users\rafae\git\sintaxe-basica-java

listar o conteudo da pasta
$ ls

Ver status
$ git status

adicionar a mudança de um arquivo especifico 
$ git add <nome completo do arquivo >

adicionar todas as mudanças 
$ git add .

salvar local as alterações
$ git commit -m "adiciona o motivo da mudança"

salvar na nuvem
$ git push