/*deleta o banco de dados recode*/
DROP DATABASE recode;

/*cria o banco de dados recode*/
CREATE DATABASE recode;

/*usa o banco de dados recode*/
use recode;

/*cria a tabela produto*/
CREATE TABLE produto (
    ID int PRIMARY KEY,
	NOME varchar(45)
);

CREATE TABLE item (
	ID int auto_increment PRIMARY KEY,
	PRODUTO_ID int,
	PRECO DECIMAL(5,2)
);




