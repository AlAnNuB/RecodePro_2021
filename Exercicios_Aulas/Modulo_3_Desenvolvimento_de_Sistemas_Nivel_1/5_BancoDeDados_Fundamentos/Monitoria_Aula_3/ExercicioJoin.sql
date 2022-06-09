/*Crie uma tabela veiculos, cliente, e compra; na 
tabela veiculos devera conter as colunas IdVeiculo, placa, marca, 
modelo, ano e cor; na tabela cliente, IdCliente, cpf, nome, e cep, na 
tabela compra as colunas IdCompra, IdCliente, IdCarro, DataCompra. 
Inserir 5 registros na tabela veiculo e cliente, e 2 registros na tabela 
compra. Mostrar em um select todos os veiculos que existem 
junto com seu modelo ,marca, cor e ano, e mostrar todos os campos da tabela 
compra*/

create table tblVeiculo(
	IdVeiculo int primary key identity(1,1),
	Placa varchar(8),
	Marca varchar(20),
	Modelo varchar(20),
	Ano char(4),
	Cor varchar(20)
)

create table tblCliente(
	IdCliente int primary key identity(1,1),
	CPF char(11) UNIQUE,
	Nome varchar(50),
	CEP char(8)
)

create table tblCompra(
	IdCompra int primary key identity(1,1),
	IdCliente int FOREIGN KEY REFERENCES tblCliente(IdCliente),
	IdVeiculo int,
	DataCompra datetime default getdate()

	CONSTRAINT FK_IdVeiculo FOREIGN KEY (IdVeiculo)
	REFERENCES tblVeiculo(IdVeiculo)
)

insert into tblCliente(CPF, Nome, CEP)values('29102929121', 'Cris', '02923012')
insert into tblCliente(CPF, Nome, CEP)values('29102922222', 'Greg', '02923012'),
('79602952222', 'Julius', '02923012'), ('45102927289', 'Rochele', '12967612'),
('69242926525', 'Senhor Omar', '02923012')

select * from tblCliente

insert into tblVeiculo(Placa, marca, modelo, Ano, Cor)
values('ei3o321', 'Fiat', 'Uno de escada', '2002', 'Branco'),
('EEEE355', 'FORD', 'Mustang', '2015', 'Preto'), 
('EJSS291', 'Chevrolet', 'Opala', '1980', 'Cinza guilherme'),
('SAPK201', 'Audi', 'R8 V10', '2020', 'Azul marinho'),
('OLLY210', 'Nissan', 'GTR', '2022', 'Branco')

select * from tblVeiculo
select * from tblCliente

insert into tblCompra(IdCliente, IdVeiculo)
values(1 , 4), (2, 3)

select * from tblCompra

select  Ve.Marca, Ve.Modelo, Ve.Ano, Ve.Cor, 
Com.IdCliente, Com.IdCompra, Com.DataCompra
from tblVeiculo AS Ve
INNER JOIN tblCompra AS Com
ON Ve.IdVeiculo = Com.IdVeiculo

select  Ve.Marca, Ve.Modelo, Ve.Ano, Ve.Cor, 
Com.IdCliente, Com.IdCompra, Com.DataCompra,
Cli.Nome AS 'Nome cliente', Cli.CPF
from tblVeiculo AS Ve
INNER JOIN tblCompra AS Com
ON Ve.IdVeiculo = Com.IdVeiculo
INNER JOIN tblCliente AS Cli
ON Cli.IdCliente = Com.IdCliente
WHERE Com.IdCompra = 5