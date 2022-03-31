DROP DATABASE IF EXISTS ecommerce_sem;
CREATE DATABASE ecommerce_sem;
USE ecommerce_sem;

CREATE TABLE nivel(
	nivel_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nivel_nome varchar(20) NOT NULL,
	nivel_descricao varchar(50) NOT NULL
);

INSERT INTO nivel
	(nivel_nome, nivel_descricao)
VALUES
	('Bronze', 'Nivel 3 - Bronze'),
	('Prata', 'Nivel 2 - Prata'),
	('Ouro', 'Nivel 1 - Ouro');

CREATE TABLE cliente_endereco(
	endereco_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	endereco_rua varchar(20) NOT NULL,
	endereco_bairro varchar(20) NOT NULL,
	endereco_cidade varchar(20) NOT NULL,
	endereco_cep varchar(9) NOT NULL
);

INSERT INTO cliente_endereco
	(endereco_rua, endereco_bairro, endereco_cidade, endereco_cep)
VALUES
	('Rua 13', 'Centro', 'São Paulo', '64032-45'),
	('Travessa 5', 'Cidade Nova', 'Manaus', '66099-98'),
	('Avenida 23', 'Flores', 'Rio de Janeiro', '69345-83'),
	('Rua 2', 'Jorge Teixeira', 'Manaus', '65009-21'),
	('Rua 34', 'Japiim', 'Manaus', '67089-22');

CREATE TABLE cliente(
	cliente_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	cliente_nome varchar(50) NOT NULL,
	cliente_cpf varchar(14) NOT NULL,
	cliente_email varchar(30) NOT NULL,
	cliente_senha varchar(30) NOT NULL,
	fk_cliente_endereco int NOT NULL,
	fk_cliente_nivel int NOT NULL,
	FOREIGN KEY (fk_cliente_endereco) REFERENCES cliente_endereco(endereco_id), 
	FOREIGN KEY (fk_cliente_nivel) REFERENCES nivel(nivel_id)
);

INSERT INTO cliente
	(cliente_nome, cliente_cpf, cliente_email, cliente_senha, fk_cliente_endereco, fk_cliente_nivel)
VALUES
	('José', '034.334.123-56', 'josesv@hotmail.com', '@!%5k^mar9s', 1, 1),
	('Maria', '112.902.707-89', 'mariac@gmail.com', 'bA2lfy@HMR1', 3, 1),
	('Marcos', '345.225.890-31', 'marcosf@outlook.com', '1#W!uud7OL@#M', 4, 2),
	('Fabiano', '452.447.230-49', 'fabiano123@gmail.com', 'WSswp(&8^O00', 1, 3);

CREATE TABLE categoria(
	categoria_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	categoria_nome varchar(20) NOT NULL,
	categoria_descricao varchar(50) NOT NULL
);

INSERT INTO categoria
	(categoria_nome, categoria_descricao)
VALUES
	('Vestimentas', 'Roupas no geral'),
	('Bebidas', 'Bebidas alcoolicas e não-alcoolicas'),
	('Acessórios', 'Acessórios pessoais'),
	('Diversos', 'Outros produtos');
	
CREATE TABLE produto(
	produto_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	produto_qt_unidade int(8) NOT NULL,
	produto_preco double NOT NULL,
	produto_validade_lote date,
	produto_descricao varchar(50) NOT NULL,
	fk_produto_categoria int NOT NULL,
	FOREIGN KEY (fk_produto_categoria) REFERENCES categoria(categoria_id)
);

INSERT INTO produto
	(produto_qt_unidade, produto_preco, produto_validade_lote, produto_descricao, fk_produto_categoria)
VALUES
	(10, 11.99, null, 'Camisetas e camisas', 1),
	(12, 19.99, '2022-04-25', 'Bebidas importadas', 2),
	(20, 24.99, null, 'Acessórios para cabelo', 3),
	(2, 29.99, null, 'Fogão', 4),
	(15, 2.99, '2022-05-25', 'Refrigerantes', 2);

CREATE TABLE comercio(
	comercio_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	comercio_cnpj varchar(20) NOT NULL,
	comercio_nome varchar(20) NOT NULL,
	comercio_email varchar(30) NOT NULL
);

INSERT INTO comercio
	(comercio_cnpj, comercio_nome, comercio_email)
VALUES
	('86.426.184/0001-71', 'Distribuidora Carmo', 'carmo@distribuidora.com'),
	('44.313.671/0001-88', 'Variedades Salmo 91', 'salmo91@hotmail.com'),
	('02.180.881/0001-03', 'Comércio 34', 'c34@comercio.com');

CREATE TABLE funcionario(
	funcionario_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	funcionario_nome varchar(30) NOT NULL,
	funcionario_salario double NOT NULL,
	funcionario_dt_admissao date NOT NULL,
	funcionario_dt_demissao date,
	funcionario_supervisor int,
	fk_funcionario_comercio int NOT NULL,
	FOREIGN KEY (funcionario_supervisor) REFERENCES funcionario(funcionario_id),
	FOREIGN KEY (fk_funcionario_comercio) REFERENCES comercio(comercio_id)
);

INSERT INTO funcionario
	(funcionario_nome, funcionario_salario, funcionario_dt_admissao, funcionario_dt_demissao, funcionario_supervisor, fk_funcionario_comercio)
VALUES
	('Carlos', 3400.00, '2020-02-10', NULL, NULL, 1),
	('Samara', 1500.00, '2021-04-14', NULL, 1, 1),
	('Vanessa', 1600.00, '2021-04-15', '2021-04-28', 1, 2),
	('Gabriel', 3000.00, '2020-03-04', NULL, NULL, 3),
	('Guilherme', 1400.00, '2022-03-25', NULL, 4, 3);
	
CREATE TABLE fornece(
	fornece_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	fk_fornece_produto int NOT NULL,
	fk_fornece_comercio int NOT NULL,
	FOREIGN KEY (fk_fornece_produto) REFERENCES produto(produto_id),
	FOREIGN KEY (fk_fornece_comercio) REFERENCES comercio(comercio_id)
);

INSERT INTO fornece
	(fk_fornece_produto, fk_fornece_comercio)
VALUES
	(1, 1),
	(2, 3),
	(4, 2),
	(3, 2),
	(5, 3),
	(1, 1);

CREATE TABLE compra(
	compra_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	compra_dt date NOT NULL,
	compra_forma_pagamento varchar(20) NOT NULL,
	compra_valor_total double NOT NULL,
	fk_compra_cliente int NOT NULL,
	fk_compra_produto int NOT NULL,
	FOREIGN KEY (fk_compra_cliente) REFERENCES cliente(cliente_id),
	FOREIGN KEY (fk_compra_produto) REFERENCES produto(produto_id)
);

INSERT INTO compra
	(compra_dt, compra_forma_pagamento, compra_valor_total, fk_compra_cliente, fk_compra_produto)
VALUES
	('2020-09-12', 'Cartão', 180.00, 1, 3),
	('2022-08-27', 'Dinheiro', 100.45, 2, 1),
	('2021-07-04', 'Cartão', 312.00, 2, 4),
	('2021-01-03', 'Dinheiro', 45.00, 4, 2),
	('2021-07-20', 'Dinheiro', 56.78, 1, 2);
	
CREATE TABLE comercio_telefone(
	telefone_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
	telefone_num varchar(15) NOT NULL,
	telefone_operadora varchar(20) NOT NULL,
	fk_telefone_comercio int NOT NULL,
	FOREIGN KEY (fk_telefone_comercio) REFERENCES comercio(comercio_id)
);

INSERT INTO comercio_telefone
	(telefone_num, telefone_operadora, fk_telefone_comercio)
VALUES
	('(92) 99345-6776', 'Vivo', 1),
	('(92) 98722-2344', 'Claro', 1),
	('(92) 8002-0233', 'Oi', 2),
	('(92) 99234-2233', 'Vivo', 2),
	('(92) 3662-6756', 'Oi', 3),
	('(92) 3409-0071', 'Oi', 3);

