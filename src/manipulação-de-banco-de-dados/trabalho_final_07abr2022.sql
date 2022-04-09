DROP DATABASE IF EXISTS trab_fin;
CREATE DATABASE trab_fin;
USE trab_fin;

-- Questão 1
-- Crie a tabela funcionário, com código nome, salário, data de nascimento, data de admissão, e
-- demissão. Cadastre 6 registros sendo o primeiro nome o seu e o nome do seu pai ou mãe
-- como exemplo.
CREATE TABLE funcionario(
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30) NOT NULL,
	salario double NOT NULL,
	dt_nascimento date NOT NULL,
	dt_admissao date NOT NULL,
	dt_demissao date
);

INSERT INTO funcionario
	(nome, salario, dt_nascimento, dt_admissao, dt_demissao)
VALUES
	('Joelson Pereira Lima', 3000.00, '2000-10-09', '2020-01-01', '2020-01-20'),
	('Gabriel Souza Tavares', 4500.00, '1970-05-12', '2021-01-01', NULL), -- Parente
	('Rosa dos Santos Silva', 2500.00, '1990-04-02', '2018-09-08', '2020-01-02'), -- Parente
	('Fernando Nunes da Costa', 4000.00, '2000-12-03', '2020-09-02', NULL),
	('Vanessa Barros Mota', 5000.00, '1999-10-21', '2019-04-20', '2022-04-20'),
	('Rafael Castro Silva', 4800.00, '1981-09-23', '2020-05-18', NULL);

-- Atualizando nome do professor para Questão 3-B
UPDATE funcionario SET nome = 'Odair Cristiano Abreu da Silva' WHERE id = 4;

-- Faça um select e print os dados inseridos.
SELECT * FROM funcionario;

-- Faça uma consulta dos funcionários demitidos, pode ser você ou seu parente o demitido
SELECT * FROM funcionario WHERE dt_demissao IS NOT NULL;

-- Questão 2
-- Crie a tabela produto com código, nome, data de fabricação, data de vencimento, valor, marca
-- (que deve ser outra tabela e uma das marcas deve conter seu nome (dono do trabalho) – insira
-- dados na tabela produto. (print essa ação) 8 inserts pelo menos
CREATE TABLE marca(
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30) NOT NULL
);

INSERT INTO marca(nome) VALUES
('Joelson LTDA'),
('NorthShore LTDA'),
('CompHUB LTDA'),
('Silverlight LTDA');

CREATE TABLE produto(
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30) NOT NULL,
	dt_fabricacao date NOT NULL,
	dt_vencimento date NOT NULL,
	valor double NOT NULL,
	estoque int NOT NULL,
	fk_marca int NOT NULL,
	FOREIGN KEY (fk_marca) REFERENCES marca(id)
);

INSERT INTO produto
	(nome, dt_fabricacao, dt_vencimento, valor, estoque, fk_marca)
VALUES
	('Pão de Alho', '2022-01-01', '2022-02-01', 2.00, 20, 1),
	('Pão de Queijo', '2022-01-03', '2022-02-11', 0.20, 30, 2),
	('Bolo Confeitado', '2022-02-13', '2022-03-22', 25.00, 4, 2),
	('Croissant', '2022-01-14', '2022-04-25', 3.00, 10, 2),
	('Salgado de Carne', '2022-03-25', '2022-04-13', 2.00, 23, 3),
	('Refrigerante 200mL', '2021-12-30', '2022-01-29', 3.00, 40, 3),
	('Empada', '2022-01-25', '2022-03-10', 1.00, 100, 1),
	('Coxinha', '2022-02-06', '2022-04-20', 1.50, 54, 4);

-- Atualize o valor do produto com 70% a menos no valor (desconto) (print essa ação)
UPDATE produto SET valor = (valor * 0.3) WHERE valor > 0;
SELECT nome, valor FROM produto;

-- Questão 3
-- Crie a tabela venda com os atributos que você achar necessário
CREATE TABLE cliente(
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome varchar(30) NOT NULL
);

INSERT INTO cliente(nome) VALUES
('Joelson Pereira Lima'),
('Victoria Souza Barreto'),
('Bruno Barroso Fernandes'),
('Caio de Souza Figueiredo');

CREATE TABLE venda(
	id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	valor double NOT NULL,
	qtd int NOT NULL,
	dt date NOT NULL,
	fk_cliente int NOT NULL,
	fk_funcionario int NOT NULL,
	fk_produto int NOT NULL,
	FOREIGN KEY (fk_cliente) REFERENCES cliente(id),
	FOREIGN KEY (fk_funcionario) REFERENCES funcionario(id),
	FOREIGN KEY (fk_produto) REFERENCES produto(id)
);

INSERT INTO venda
	(valor, qtd, dt, fk_cliente, fk_funcionario, fk_produto)
VALUES
	(4.00, 2, '2022-04-04', 1, 4, 1),
	(2.00, 10, '2022-04-03', 2, 3, 2),
	(25.00, 1, '2022-04-20', 3, 2, 3),
	(6.00, 4, '2022-04-20', 4, 1, 4),
	(4.50, 3, '2022-04-25', 2, 1, 8);

SELECT * FROM cliente;
SELECT * FROM venda;

-- Mostre o valor da venda, a quantidade vendida, data, quem comprou e quem vendeu, atualização no estoque.
SELECT
	v.valor AS 'Valor da venda',
	c.nome AS 'Cliente',
	f.nome AS 'Vendedor',
	p.nome AS 'Produto',
	v.qtd AS 'Quantidade comprada',
	p.estoque AS 'Estoque inicial',
	(p.estoque - v.qtd) AS 'Estoque atualizado',
	v.dt AS 'Data da venda'
FROM venda v
INNER JOIN cliente c ON c.id = fk_cliente
INNER JOIN funcionario f ON f.id = fk_funcionario
INNER JOIN produto p ON p.id = fk_produto;

-- Faça uma consulta que mostre o cliente que comprou (obrigatoriamente seu nome) o
-- vendedor algum professor da Fametro, os produtos podem ser a gosto do dev.
SELECT
	c.nome AS 'Cliente',
	f.nome AS 'Vendedor',
	p.nome AS 'Produto'
FROM venda v
INNER JOIN cliente c ON c.id = fk_cliente
INNER JOIN funcionario f ON f.id = fk_funcionario
INNER JOIN produto p ON p.id = fk_produto
WHERE c.nome = 'Joelson Pereira Lima';

-- Crie uma questão e printe o código e o resultado.
-- Consultar vendas de funcionários não demitidos e que recebem mais que 3000 reais de salário
SELECT
	p.nome AS 'Produto',
	c.nome AS 'Cliente',
	f.nome AS 'Funcionario',
	f.salario AS 'Salario',
	f.dt_demissao AS 'Demissao'
FROM venda v
INNER JOIN funcionario f ON f.id = fk_funcionario
INNER JOIN cliente c ON c.id = fk_cliente
INNER JOIN produto p ON p.id - fk_produto
WHERE dt_demissao IS NULL AND salario > 3000;


-- PERGUNTAS NÃO INCLUSAS NO TRABALHO FINAL, FEITAS POR DESAFIO OU DIVERSÃO
-- Selecionar quanto os funcionarios ganharam desde a data de contratação
SELECT * FROM funcionario;
SELECT 
	nome,
	salario,
	dt_admissao,
	(datediff(curdate(), dt_admissao)) AS 'Dias desde admissão',
	(truncate ((salario / 30), 2)) AS 'Diária média',
	(truncate (datediff(curdate(), dt_admissao) * (salario / 30), 2)) AS 'Dinheiro ganho desde admissão'
FROM funcionario
WHERE dt_demissao IS NULL;