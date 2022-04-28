-- CRIAÇÃO DO BANCO DE DADOS
create database aula2_n2;
use aula2_n2;

-- CRIAÇÃO DE TABELAS

create table bairro(
  id int not null auto_increment primary key,
  nome varchar(20) not null
);

create table tipo(
  id int not null auto_increment primary key,
  nome varchar(20) not null
);

create table projeto(
  id int not null auto_increment primary key,
  nome varchar(20) not null,
  valor double,
  tipo int,
  foreign key(tipo) references tipo(id)
);

create table pessoa(
  id int not null auto_increment primary key,
  nome varchar(20) not null,
  idade int not null,
  renda double,
  bairro int,
  projeto int,
  foreign key(bairro) references bairro(id),
  foreign key(projeto) references projeto(id)
);

-- INSERÇÕES

insert into bairro(nome) values ("Centro"), ("Cidade Nova"), ("São José");
insert into tipo(nome) values ("Engenharia"), ("TI"), ("Rural");
insert into projeto
  (nome, valor, tipo)
values
  ("Calçamento Centro", 30000, 1),
  ("Cidade da Criança", 100000, 1),
  ("Faculdade para Todos", 2000000, 2),
  ("Internet Fácil", 150000, 2),
  ("Horta Inteligente", 15000, 3);
insert into pessoa
  (nome, renda, idade, bairro, projeto)
values
  ("Marcelo", 6000, 34, 1, 1),
  ("Marcos", 4000, 25, 1, 1),
  ("Thiago", 3000, 30, 2, 2),
  ("Fernanda", 7000, 32, 2, 3),
  ("Ana", 3500, 26, 2, 3),
  ("Flávio", 2500, 22, 3, 4),
  ("Tereza", 8000, 34, 3, 4),
  ("Juliano", 6000, 29, 1, 5);

-- SELEÇÕES

select * from bairro;
select * from pessoa;
select * from tipo;
select * from projeto;

-- QUESTÕES DA AULA
-- 1) Selecionar as 3 pessoas mais velhas
select nome, idade from pessoa order by idade desc limit 3;

-- 2) Selecionar as pessoas em ordem alfabética
select nome from pessoa order by nome;

-- 3) Selecionar o valor do projeto mais caro
select max(valor) from projeto;

-- 4) Selecionar a idade da pessoa mais nova
select min(idade) from pessoa;

-- 5) Mostrar o total de pessoas cadastradas
select count(*) from pessoa;

-- EXERCICIO
-- E) Monte um relatório com a quantidade de pessoas por bairro
select b.nome, count(*) from pessoa p
inner join bairro b on b.id = p.bairro
group by b.nome;

-- E) Monte um relatório de média de idade por bairro
select b.nome, avg(p.idade) from pessoa p
inner join bairro b on b.id = p.bairro
group by b.nome;

-- E) Monte o relatório de total em valores do projeto por tipo
select p.nome, sum(p.valor) from projeto p
inner join tipo t on t.id = p.tipo
group by t.nome;

-- E) Selecione todas as pessoas com "Marc" no inicio do nome
select * from pessoa where nome like "Marc%";

-- E) Selecione todas as pessoas sem a letra O no nome
select * from pessoa where nome not like "%o%";

-- E) Selecione os projetos onde a média de valores pelo tipo é menor que 500k reais (sem usar limit)
select t.nome, avg(p.valor) from projeto p
inner join tipo t on p.tipo = t.id
group by t.nome
having avg(p.valor) < 500000;

-- QUESTÕES PROPOSTAS
-- X) Selecionar o funcionário com maior salário
select nome, max(renda) from pessoa group by renda order by renda desc limit 1;

-- X) Quantas pessoas tem a renda entre 2000 e 6000 reais
select count(*) from pessoa where renda >= 2000 and renda <= 6000;