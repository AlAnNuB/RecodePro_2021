/*deleta o banco de dados recode*/
DROP DATABASE recode;

/*cria o banco de dados recode*/
CREATE DATABASE recode;

/*usa o banco de dados recode*/
use recode;

/*cria a tabela produto*/
CREATE TABLE produto (
    ID int auto_increment PRIMARY KEY,
	NOME varchar(25)
);

insert into produto(
	NOME
)values(
	'Arroz'
);

/*mostra todos os dados da tabela*/
select * from produto;


