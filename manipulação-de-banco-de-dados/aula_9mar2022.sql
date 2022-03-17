create database aula3_zl;

use aula3_zl;

create table bairro(
  bai_cod int not null primary key,
  bai_nome varchar(25) not null
);

create table atendente(
  ate_cod int not null auto_increment primary key,
  ate_nome varchar(25) not null,
  ate_salario double
);

create table veiculo(
  vei_cod int not null auto_increment primary key,
  vei_modelo varchar(25) not null,
  vei_valor double not null,
  vei_cor varchar(20) not null,
  vei_marca varchar(20) not null
);

create table cliente(
  cli_cod int not null auto_increment primary key,
  cli_nome varchar(25) not null,
  cli_renda double not null,
  cli_status varchar(10),
  cli_bairro int,
  foreign key(cli_bairro) references bairro(bai_cod)
);

create table aluguel(
  alu_cod int not null auto_increment primary key,
  alu_cliente int not null,
  alu_veiculo int not null,
  alu_atendente int not null,
  alu_dtemprestimo date,
  alu_dtprevdevolucao date,
  alu_dtrealdevolucao date,
  foreign key(alu_cliente) references cliente(cli_cod),
  foreign key(alu_veiculo) references veiculo(vei_cod),
  foreign key(alu_atendente) references atendente(ate_cod)
);

insert into bairro(bai_cod, bai_nome) values
(1, "Santo Antonio"),
(2, "São José"),
(3, "Cidade Nova"),
(4, "Armando Mendes");

insert into veiculo(vei_modelo, vei_valor, vei_cor, vei_marca) values
("Gol", 100, "Azul", "Volks"),
("Uno", 110, "Azul", "Fiat"),
("Argo", 150, "Preto", "Fiat"),
("Fusca", 200, "Laranja", "Volks"),
("Prius", 300, "Branco", "Toyota");

insert into atendente(ate_nome, ate_salario) values
("Marcelo", 3000.0),
("Marcos", 4000.0),
("Fernanda", 5000.0),
("Marcela", 2200.0);

insert into cliente(cli_nome, cli_renda, cli_status, cli_bairro) values
("Maria Aparecida", 4000.0, "Ativo", 1),
("Marcos", 3000.0, "Ativo", 1),
("Maria Lucia", 5000.0, "Pendente", 2),
("Vera Lucia", 4000.0, "Ativo", 3),
("Tereza", 6000.0, "Pendente", 3),
("Thiago", 3000.0, "Ativo", 4);

insert into aluguel
  (alu_cliente, alu_veiculo, alu_atendente, alu_dtemprestimo, alu_dtprevdevolucao, alu_dtrealdevolucao)
values
  (1, 2, 1, "2017-01-01", "2017-01-05", "2017-01-05"),
  (2, 1, 1, "2017-02-01", "2017-02-05", "2017-02-10"),
  (1, 3, 2, "2017-02-01", "2017-02-05", "2017-02-05"),
  (3, 3, 4, "2017-04-01", "2017-04-01", "2017-04-05"),
  (3, 3, 4, "2017-04-20", "2017-04-23", "2017-04-23"),
  (4, 4, 1, "2017-05-01", "2017-05-10", "2017-05-10");

-- Questões
-- Selecione todos os funcionários com salário menores que 3000
select * from atendente where ate_salario < 3000;

-- Selecione todos os carros com valores entre 110 e 150 reais
select * from veiculo where vei_valor >= 110 and vei_valor <= 150;
select * from veiculo where vei_valor between 110 and 150;

-- Selecione todos os moradores do bairro São José
select * from cliente where cli_bairro = 2;
select cli_nome, bai_nome from cliente inner join bairro on bai_cod = cli_bairro where bai_nome = "São José";

-- Selecione os clientes moradores da Cidade Nova com status ativo
select cli_nome, bai_nome, cli_status from cliente
inner join bairro on bai_cod = cli_bairro
where bai_nome = "Cidade Nova" and cli_status = "Ativo";

-- Selecione os veiculos que foram alugados
select vei_modelo, alu_dtemprestimo, alu_dtrealdevolucao from veiculo
inner join aluguel on vei_cod = alu_veiculo;
-- Selecione os veiculos que foram alugados e a quantidade de dias previsto
select vei_modelo, (alu_dtprevdevolucao - alu_dtemprestimo) from veiculo
inner join aluguel on vei_cod = alu_veiculo;

-- Selecione todos os emprestimos que tiveram atraso
select vei_modelo, (alu_dtrealdevolucao - alu_dtprevdevolucao) from veiculo
inner join aluguel on vei_cod = alu_veiculo
where (alu_dtrealdevolucao - alu_dtprevdevolucao) > 0;

select vei_modelo,
(alu_dtprevdevolucao - alu_dtemprestimo),
(alu_dtrealdevolucao - alu_dtemprestimo),
((alu_dtrealdevolucao - alu_dtemprestimo)-(alu_dtprevdevolucao - alu_dtemprestimo))
from veiculo inner join aluguel on vei_cod = alu_veiculo;

-- Selecione os veiculos e os valores dos emprestimos
select vei_modelo as 'Modelo do veiculo',
vei_valor as 'Valor do veiculo',
(alu_dtrealdevolucao - alu_dtemprestimo) as 'Qtd de dias',
((alu_dtrealdevolucao - alu_dtemprestimo) * vei_valor) as 'Valor do aluguel'
from veiculo inner join aluguel on vei_cod = alu_veiculo;
