CREATE DATABASE aula4_zl;
USE aula4_zl;

CREATE TABLE bairro(
	bairro_id int NOT NULL PRIMARY KEY,
	bairro_nome varchar(20) NOT NULL
);

INSERT INTO bairro(bairro_id, bairro_nome) VALUES
	(1, 'Centro'),
	(2, 'São José'),
	(3, 'Compensa');

CREATE TABLE funcionario(
	func_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	func_nome varchar(20) NOT NULL,
	func_rg int NOT NULL,
	func_salario double,
	func_dt_admissao date,
	func_dt_demissao date,
	fk_func_bairro int,
	fk_func_supervisor int,
	FOREIGN KEY(fk_func_bairro) REFERENCES bairro(bairro_id),
	FOREIGN KEY(fk_func_supervisor) REFERENCES funcionario(func_id)
);

INSERT INTO funcionario
	(func_nome, func_rg, func_salario, func_dt_admissao, func_dt_demissao, fk_func_bairro, fk_func_supervisor)
VALUES
	('Pedro', 223344, 4000.0, '2015-01-01', NULL, 1, NULL),
	('Natalia', 111144, 2000.0, '2017-01-01', NULL, 2, 1),
	('Marcos', 22111555, 2500.0, '2018-01-01', '2019-01-01', 3, 1);

CREATE TABLE veiculo(
	vei_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	vei_modelo varchar(15) NOT NULL,
	vei_marca varchar(15) NOT NULL,
	vei_valor double,
	vei_ano int
);

INSERT INTO
	veiculo(vei_modelo, vei_marca, vei_valor, vei_ano)
VALUES
	('Gol', 'Volks', 90.0,  2014),
	('Uno', 'Fiat', 100.0,  2016),
	('Onix', 'Chevrolet', 110.0,  2017),
	('Siena', 'Fiat', 130.0,  2018);

CREATE TABLE cliente(
	cli_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	cli_nome varchar(15) NOT NULL,
	cli_rg int,
	cli_renda double,
	cli_dt_nasc date
);

INSERT INTO
	cliente(cli_nome, cli_rg, cli_renda, cli_dt_nasc)
VALUES
	('Marcelo', 33445566, 6000.0, '2004-01-01'),
	('Marcela', 11445566, 5000.0, '2003-01-01'),
	('Fernanda', 55555566, 7000.0, '2002-01-01'),
	('Marcia', 1234566, 4000.0, '2005-01-01');

CREATE TABLE aluguel(
	alug_id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	alug_dt_locacao date NOT NULL,
	alug_dt_prev_devolucao date,
	alug_dt_real_devolucao date,
	fk_alug_funcionario int,
	fk_alug_cliente int,
	fk_alug_veiculo int,
	FOREIGN KEY(fk_alug_funcionario) REFERENCES funcionario(func_id),
	FOREIGN KEY(fk_alug_cliente) REFERENCES cliente(cli_id),
	FOREIGN KEY(fk_alug_veiculo) REFERENCES veiculo(vei_id)
);

INSERT INTO
	aluguel(alug_dt_locacao , alug_dt_prev_devolucao , alug_dt_real_devolucao , fk_alug_funcionario , fk_alug_cliente , fk_alug_veiculo)
VALUES
	('2015-02-01', '2015-02-05','2015-02-05',1,1,1),
	('2015-02-10', '2015-02-13','2015-02-13',1,2,2),
	('2015-02-20', '2015-02-22','2015-02-25',2,3,1),
	('2015-03-01', '2015-03-05','2015-03-05',3,3,3),
	('2015-03-20', '2015-03-28','2015-03-28',2,2,3),
	('2015-04-01', '2015-04-05','2015-04-07',1,1,1);
	
-- Selecione os modelo de carro
SELECT vei_modelo FROM veiculo;

-- Liste a quantidade de carros
SELECT count(*) FROM veiculo;

-- Selecione os carro com entrega em atraso
SELECT vei_modelo,
alug_dt_locacao AS 'Dia da Locação',
alug_dt_prev_devolucao AS 'Dia previsto da entrega',
alug_dt_real_devolucao AS 'Dia da entrega',
(alug_dt_real_devolucao-alug_dt_locacao) AS 'Dias corridos',
(alug_dt_real_devolucao - alug_dt_prev_devolucao) AS 'Dias em atraso'
FROM veiculo
INNER JOIN aluguel on vei_id = fk_alug_veiculo
WHERE (alug_dt_real_devolucao - alug_dt_prev_devolucao) > 0;
-- Selecione os funcionarios que estão ativos
SELECT func_nome, func_salario FROM funcionario WHERE func_dt_demissao IS NULL;

--  Liste o valor dos alugueis sem atraso
SELECT vei_modelo, vei_valor AS 'Valor do veiculo',
(alug_dt_real_devolucao - alug_dt_locacao) AS 'Qtd de dias',
(vei_valor * (alug_dt_real_devolucao - alu_dt_locacao))
FROM veiculo
INNER JOIN aluguel on vei_id = fk_alug_veiculo
WHERE (alug_dt_real_devolucao - alug_dt_prev_devolucao) = 0;

-- Selecione o supervisor
SELECT * FROM funcionario WHERE funsupervisor IS NULL;

-- Selecione nome do funcionario , do veiculo  e nome do cliente
-- que alugou um carro gol e entregou em atraso
SELECT veimodelo, funnome, clinome,  
(veivalor * (aludtrealdevolucao-aludtlocacao)) AS 'Valor Aluguel',
(aludtrealdevolucao - aludtprevdevolucao) AS 'dias em atraso',
clirenda AS 'renda do cliente',
(clirenda*1.5) AS 'renda do cliente com 50% de aumento'
FROM veiculo
INNER JOIN aluguel on veicod = aluveiculo
INNER JOIN cliente on clicod = alucliente
INNER JOIN funcionario on funcod = alufun
INNER JOIN bairro on baicod = funbairro
WHERE veimodelo = 'Gol'
and
(aludtrealdevolucao - aludtprevdevolucao) > 0;