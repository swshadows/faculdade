CREATE DATABASE aula1;

USE aula1;
CREATE TABLE bairro(
    baiid INT NOT NULL PRIMARY KEY,
    bainome VARCHAR(25) NOT NULL
);

CREATE TABLE empresa(
    empid INT NOT NULL PRIMARY KEY,
    empnome varchar(25) NOT NULL,
    empano INT
);
CREATE TABLE pessoa (
    pesid INT NOT NULL auto_increment primary key,
    pesnome VARCHAR(25) NOT NULL,
    pescpf VARCHAR(14) NOT NULL,
    pesdtnasc DATE,
    pesbairro INT NOT NULL,
    pesempresa INT,
    FOREIGN KEY(pesbairro) REFERENCES bairro(baiid),
    FOREIGN KEY(pesempresa) REFERENCES empresa(empid)
);

INSERT INTO bairro(baiid, bainome) VALUES
(1, 'São José'),
(2, 'Centro'),
(3, 'Cachoeirinha');

SELECT * FROM bairro WHERE baiid = 3;

INSERT INTO empresa(empid, empnome, empano) VALUES
(1, 'Fametro', 2006),
(2, 'Fametro ZL', 2016),
(3, 'Fametro ZS', 2019),
(4, 'Fametro ZN', 2019);

-- Empresas criadas antes de 2012
SELECT * FROM empresa WHERE empano <= 2012;

-- Empresas criadas após 2012
SELECT * FROM empresa WHERE empano >= 2012;

-- Empresas criadas após 2019
SELECT * FROM empresa WHERE empano >= 2019;

INSERT INTO pessoa(pesnome, pescpf, pesdtnasc, pesbairro, pesempresa)
VALUES
('Marcia', '2209983-22', '2000/02/01', 1, 2),
('Ana luiza', '5555983-22', '1998/02/01', 2, 2),
('Ana ', '4444983-22', '1998/02/01', 2, 2),
('Fernanda', '333333333-22', '2005/05/01', 3, 3);

-- Pessoas que moram no Centro
SELECT * FROM pessoa WHERE pesbairro = 2;

-- Nome e CPF de pessoas que trabalham na Fametro ZL
SELECT pesnome, pescpf FROM pessoa WHERE pesempresa = 2;

-- Adiciona na tabela bairro uma coluna INT p/ quantidade de pessoas
ALTER TABLE bairro ADD COLUMN baiqtdpessoas INT;
SELECT * FROM pessoa;

-- Adiciona quantidade de pessoas ao bairro 3
UPDATE bairro SET baiqtdpessoas = 5000 WHERE baiid = 3;

-- Atualiza a data de nascimento de ana para 01/01/2015
UPDATE pessoa SET pesdtnasc = '2015/01/01' WHERE pesnome = 'Ana';

INSERT INTO pessoa(pesnome, pescpf, pesdtnasc, pesbairro, pesempresa)
VALUES
('Marcelo', '11111111-22', '2002/02/01', 1, 1);

UPDATE pessoa SET pescpf =  '222.333.444-56' WHERE pesid = 5;

DELETE FROM pessoa WHERE pesid = 9;