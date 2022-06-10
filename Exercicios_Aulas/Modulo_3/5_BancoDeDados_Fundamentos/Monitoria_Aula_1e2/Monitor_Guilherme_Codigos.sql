/*Criar uma tabela Pessoa contendo id_pessoa, nome, 
endereço, idade e data de cadastro. deletar a coluna nome e 
adiciona-la novamente dessa vez chamada 
de nome_completo. Fazer também 2 updates e 2 deletes*/

CREATE DATABASE ExercicioMonitoria;
use ExercicioMonitoria;

CREATE TABLE PESSOA(
ID_PESSOA INT IDENTITY(1,1) PRIMARY KEY,
NOME VARCHAR(50),
ENDERECO VARCHAR(100),
IDADE INT,
DATADECADASTRO DATETIME
)

SELECT * FROM PESSOA

ALTER TABLE PESSOA DROP COLUMN NOME;
ALTER TABLE PESSOA ADD NOMECOMPLETO VARCHAR(50)

INSERT INTO PESSOA VALUES ('Minha casa', 18, getdate(), 'Guilherme')

INSERT INTO PESSOA VALUES 
('Meu vizinho', 18, getdate(), 'Caio'),
('Meu outro vizinho', 20, getdate(), 'Cris e Greg')

DELETE FROM PESSOA WHERE ID_PESSOA = 4;


UPDATE PESSOA SET NOMECOMPLETO = 'PICANHA' 
WHERE ENDERECO LIKE '%i%'

UPDATE PESSOA SET IDADE = 25 WHERE ID_PESSOA = 3

SELECT * FROM PESSOA WHERE ENDERECO LIKE '%C%';