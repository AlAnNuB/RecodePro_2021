CREATE DATABASE Recode

use Recode

CREATE SCHEMA Cursos

CREATE TABLE Cursos.Materia(
	IdMateria int PRIMARY KEY,
	Nome VARCHAR(20) NOT NULL,
	CargaHoraria int,
	NumAulas int
)

ALTER TABLE Cursos.Materia
	ADD NomeProfessor VARCHAR(50)

INSERT INTO Cursos.Materia(IdMateria, Nome, CargaHoraria, NumAulas)
VALUES(001, 'Java', 12, 20)

SELECT * FROM Cursos.Materia

UPDATE Cursos.Materia SET NomeProfessor = 'Jailton' WHERE IdMateria = 001

INSERT INTO Cursos.Materia(NomeProfessor,Nome, CargaHoraria, NumAulas,IdMateria )
VALUES('Eduardo Careca','C#', 90, 50, 12)

SELECT * FROM Cursos.Materia

INSERT INTO Cursos.Materia(NomeProfessor,Nome, CargaHoraria, NumAulas,IdMateria )
VALUES('Eduardo Careca','JS', 90, 50, 13)

UPDATE Cursos.Materia SET IdMateria = 32 WHERE IdMateria = 12

SELECT * FROM Cursos.Materia

UPDATE Cursos.Materia SET NomeProfessor = 'Cris e Greg' WHERE IdMateria = 32

SELECT * FROM Cursos.Materia WHERE Nome = 'Java'

exec sp_rename 'Cursos.Materia.Nome', 'Teste'

exec sp_rename 'Cursos.Materia.Teste', 'Nome'

SELECT * FROM Cursos.Materia

ALTER TABLE Cursos.Materia
ALTER COLUMN NumAulas FLOAT;

INSERT INTO Cursos.Materia(NomeProfessor,Nome, CargaHoraria, NumAulas,IdMateria )
VALUES('Marcio Careca','C#', 90, 50.5, 15)

ALTER TABLE Cursos.Materia
ALTER COLUMN NumAulas INT;

SELECT NomeProfessor, Nome, NumAulas, CargaHoraria FROM Cursos.Materia

