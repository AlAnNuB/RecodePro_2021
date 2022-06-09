create database recode;

create table aluno
(id_alu int primary key,
nome char(50) not null,
endereco char (60),
bairro char (30),
cidade char (30),
uf char (2)
);

insert into aluno (id_alu, nome, endereco, bairro, cidade, uf) 
values (1, 'Marcelo Antunes', 'Rua Paraibuna, 320', 'Paracambi', 'Rio de janeiro', 'rj');


create table telefone_aluno
(id_tel_alu int primary key,
numero int not null,
id_alu_tel int,
constraint fk_aluno_telefone foreign key(id_alu_tel)
references aluno (id_alu)
);

insert into telefone_aluno (id_tel_alu, numero, id_alu_tel) 
values (1, 111111111, 1);

create table professor
(id_pro int primary key,
nome char(50) not null,
endereco char (60),
bairro char (30),
cidade char (30),
uf char (2)
);

insert into professor (id_pro, nome, endereco, bairro, cidade, uf) 
values (1, 'Clara Meireles', 'Rua Pacui, 91', 'vargem Grande', 'Rio de janeiro', 'rj');

create table telefone_professor
(id_tel_pro int primary key,
numero int not null,
id_pro_tel int,
constraint fk_professor_telefone foreign key(id_pro_tel)
references professor (id_pro)
);

insert into telefone_professor (id_tel_pro, numero, id_pro_tel) 
values (1, 111111111, 1);

create table disciplina
(id_dis int primary key,
nome char(30) not null,
creditos int,
id_pro_dis int,
constraint fk_professor_disciplina foreign key(id_pro_dis)
references professor (id_pro)
);

insert into disciplina (id_dis, nome, creditos, id_pro_dis) 
values (1, 'matemática', 4, 1);

create table matricula
(id_mat_alu int,
id_mat_dis int,
nota float,
CONSTRAINT pk_matricula PRIMARY KEY(id_mat_alu, id_mat_dis),
constraint fk_aluno_matricula foreign key(id_mat_alu)
references aluno (id_alu),
constraint fk_disciplina_matricula foreign key(id_mat_dis)
references disciplina (id_dis)
);

insert into matricula (id_mat_alu, id_mat_dis, nota) 
values (1, 1, 8);