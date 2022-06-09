create database MonitoriaAula3;

use MonitoriaAula3;

create schema Monitoria;

create table tblVeiculo(
	IdVeiculo int identity(1,1) primary key,
	Placa varchar(8),	
	Marca varchar(20),
	Modelo varchar(20),
	Ano char(4),
	Cor varchar(20)
)

create table tblCliente(
	IdCliente int primary key  identity(1,1),
	CPF char(11) unique,
	Nome varchar(50),
	CEP char(8)
)

create table tblCompra(
	IdCompra int primary key  identity(1,1),
	IdCliente int foreign key references tblCliente(IdCliente),
	IdVeiculo int,
	DataCompra datetime default getdate()
	
	constraint FK_IdVeiculo foreign key (IdVeiculo) references tblVeiculo(IdVeiculo)
)

insert into tblCliente(CPF, Nome, CEP) values('10987654326', 'Cris', '90357824')

insert into tblCliente(CPF, Nome, CEP) values('10987245326', 'Greg', '11234788'), 
('12347245326', 'Julius', '10134788'),
('10929468326', 'Rochele', '67343674'), 
('93498724626', 'Senhor Omar', '84634788')

select * from tblCliente

insert into tblVeiculos(Placa, Marca, Modelo, Ano, Cor) values ('ios0335', 'Fiat', 'Uno de escada', '2002', 'Branco'),
('etyh033', 'Ford', 'Mustang', '2015', 'Preto'),
('iwretgv', 'Chevrolet', 'Opala', '1990', 'Cinza'), 
('os30353', 'Audi', 'R8 v10', '2020', 'Azul Marinho'),
('os31948', 'Nissan', 'GTR', '2022', 'Branco')


select * from tblVeiculo

insert into tblCompra(IdCliente, IdVeiculo) values (2, 3), (4, 4)

select * from tblCompra

/*
select tblVeiculo.Marca, tblVeiculo.Modelo, tblVeiculo.Cor, tblVeiculo.Ano from tblVeiculo
left join tblCompra on tblVeiculo.IdVeiculo = tblCompra.IdVeiculo
 */

select Ve.Marca, Ve.Modelo, Ve.Cor, Ve.Ano from tblVeiculo as Ve
left join tblCompra as Com on Ve.IdVeiculo = Com.IdVeiculo







