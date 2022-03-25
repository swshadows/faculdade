drop database if exists aula5_zl;
create database aula5_zl;
use aula5_zl;

-- ********

create table funcionario(
  funcod int not null primary key,
  funnome varchar(20) not null,
  funsal double,
  funstatus varchar(10),
  funsupervisor int,
  foreign key(funsupervisor) references funcionario(funcod)
);

insert into funcionario
  (funcod, funnome, funsal, funstatus, funsupervisor)
values
  (1, "Marcos", 6000.0, "Ativo", null),
  (2, "Marcia", 4000.0, "Ativo", 1),
  (3, "Luana", 3000.0, "Demitido", 1),
  (4, "Fernanda", 2500.0, "Ativo", 1);

select
  *
from
  funcionario;

-- ********

create table especialidade(
  espcod int not null primary key,
  espnome varchar(20) not null
);

insert into especialidade
  (espcod, espnome)
values
  (1, "Pediatra"),
  (2, "Genecologista"),
  (3, "Ortopedia"),
  (4, "Cirurgião");

select
  *
from
  especialidade;

-- ********

create table bairro(
  baicod int not null primary key,
  bainome varchar(15) not null
);

insert into bairro
  (baicod, bainome)
values
  (1, "Centro"),
  (2, "Cidade Nova"),
  (3, "Ponta Negra"),
  (4, "Cachoeirinha");
-- ********

create table paciente(
  paccod int not null auto_increment primary key,
  pacnome varchar(20) not null,
  pacrenda double,
  pacdtnasc date,
  pacbairro int,
  foreign key(pacbairro) references bairro(baicod)
);

insert into paciente
  (pacnome, pacrenda, pacdtnasc, pacbairro)
values
  ("João", 2000.0, "2010-01-01", 1),
  ("Luiz Felipe", 3000.0, "2006-01-10", 1),
  ("José", 4000.0, "2000-01-01", 2),
  ("Adriel", 3500.0, "1998-01-01", 3),
  ("Mario", 2000.0, "2001-01-01", 4);

select
  *
from
  paciente;

-- ********

create table telefone(
  telcod int not null,
  telnumero varchar(20) not null,
  teloperadora varchar(20) not null,
  telpaciente int,
  primary key(telcod, telpaciente),
  foreign key(telpaciente) references paciente(paccod)
);

insert into telefone
  (telcod, telpaciente, telnumero, teloperadora)
values
  (1, 1, "(92) 99881-0992", "Tim"),
  (2, 1, "(92) 99110-2233", "Vivo"),
  (1, 2, "(93) 99203-1123", "Claro"),
  (1, 3, "(97) 99223-1002", "Tim");

select
  telcod as "ID do telefone",
  telpaciente as "ID do paciente",
  pacnome as "Nome do paciente",
  telnumero as "Número do telefone"
from
  telefone
inner join
  paciente
on
  paccod = telpaciente;

-- ********

create table medico(
  medcod int not NULL auto_increment primary key,
  mednome varchar(20) not null,
  medsal double,
  medcrm varchar(15),
  medesp int,
  foreign key(medesp) references especialidade(espcod)
);

insert into medico
  (mednome, medsal, medcrm, medesp)
values
  ("Francisco", 20000.0, "CRM-9302", 1),
  ("Fabricia", 30000.0, "CRM-2931", 2),
  ("Pedro", 20000.0, "CRM-2212", 3),
  ("Jonatas", 25000.0, "CRM-2921", 4);

-- ********

create table agendamento(
  agecod int not null auto_increment primary key,
  agedata date,
  ageobs varchar(255),
  agefunc int,
  agemedico int,
  agepac int,
  foreign key(agefunc) references funcionario(funcod),
  foreign key(agemedico) references medico(medcod),
  foreign key(agepac) references paciente(paccod)
);

insert into agendamento
  (agefunc, agemedico, agepac, agedata, ageobs)
values
  (1, 1, 1, "2019-01-01", "Paciente estava com cara de palhaço"),
  (1, 2, 2, "2019-03-01", "Paciente se queixa de dores nas costas"),
  (2, 2, 3, "2019-03-10", "Paciente estava bem"),
  (3, 3, 3, "2019-04-01", "Paciente estava em estado terminal");

select
  *
from
  agendamento;

-- *******

create table consulta(
  concod int not NULL auto_increment primary key,
  conagenda int,
  conmedico int,
  conpaciente int,
  condata date,
  convalor double,
  conobs varchar(255),
  conreceita varchar(255),
  foreign key(conagenda) references agendamento(agecod),
  foreign key(conmedico) references medico(medcod),
  foreign key(conpaciente) references paciente(paccod)
);

insert into consulta
  (conagenda, conmedico, conpaciente, condata, convalor, conobs, conreceita)
values
  (1, 1, 1, "2019-01-01", 100, "Paciente estava com cara de palhaço", "Dipirona 3x ao dia"),
  (2, 2, 2, "2019-03-01", 200, "Paciente se queixa de dores nas costas", "Mebendazol"),
  (3, 4, 3, "2019-03-10", 150, "Paciente estava bem", "Doril"),
  (4, 3, 3, "2019-04-01", 300, "Paciente estava em estado terminal", "Sonrisal");

-- selecionar funcionario supervisor
 
SELECT * FROM funcionario
WHERE funsupervisor IS NULL;

-- selecionar funcionarios supervisionados e ativos (não demitidos)

SELECT * FROM funcionario
WHERE funstatus = 'ativo' AND funsupervisor IS NOT NULL;

-- selecionar os moradores do centro e ponta negra
SELECT * FROM bairro
INNER JOIN paciente ON pacbairro = baicod
WHERE bainome = 'Centro' OR bainome = 'Ponta Negra';

-- selecionar os médicos pediatras

SELECT * FROM medico
INNER JOIN especialidade ON medesp = espcod
WHERE espnome = 'pediatra';

-- selecionar os médicos que possuem agendamento

SELECT mednome AS 'Médico' FROM agendamento
INNER JOIN medico ON medcod = agemedico;

-- selecionar as consultas realizadas e os pacientes e os médicos

SELECT condata AS 'Data da consulta',
pacnome AS 'Nome do paciente',
conobs AS 'Observação',
conreceita AS 'Receita',
mednome AS 'Nome do médico'
FROM consulta
INNER JOIN paciente ON conpaciente = paccod
INNER JOIN medico ON conmedico = medcod;