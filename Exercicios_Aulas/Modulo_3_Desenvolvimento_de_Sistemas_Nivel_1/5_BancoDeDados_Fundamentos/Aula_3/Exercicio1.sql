create database Aula3;

use Aula3;

create schema aula3;

create table aula3.Exercicio1(
	IdExercicio int identity(1,1) primary key not null,
	Nomes varchar(50) null,	
	Matricula int unique not null,
	Hora date default getdate()not null
)

insert into aula3.Exercicio1(Nomes, Matricula) Values ('Daniel', 123456);
insert into aula3.Exercicio1(Nomes, Matricula) Values ('Aline', 234567);
insert into aula3.Exercicio1(Nomes, Matricula) Values ('Jonas', 3456789);
insert into aula3.Exercicio1(Nomes, Matricula) Values ('Helio', 4567890);
insert into aula3.Exercicio1(Nomes, Matricula) Values ('Renan', 012345);

select * from aula3.Exercicio1




