use progbd;

-- selecione o produto mais lucrativo
select
  pronome as 'Descrição do produto',
  (propreco-procusto) as 'Lucro'
from grupoproduto
inner join produto on grpcodigo = progrpcodigo
inner join fornecedor on proforcnpj = forcnpj
order by 2 desc
limit 1;

-- selecione o produto mais lucrativo
select pronome, propreco-procusto
from produto order by 2 limit 1;

-- selecione as cidades seus bairros e as zonas dos bairros
select baicodigo, cidnome, bainome, zonnome, baiqtdepessoas from cidade
inner join bairro on cidcodigo = baicidcodigo
inner join zona on zoncodigo = baizoncodigo;

update bairro set bainome = "SANTA ETELVINA" where bainome like '%kllk%';
update bairro set bainome = "NOVA CIDADE" where bainome like '%exemplo%';

-- selecione todos os clientes
select * from cliente;

-- selecione media de renda dos clientes, a soma e o total de pessoas por bairro
select
  bainome as 'Nome do bairro',
  avg(clirendamensal) as 'Média das rendas',
  sum(clirendamensal) as 'Soma das rendas',
  count(*) AS 'Total de pessoas'
from cliente
inner join bairro on baicodigo = clibaicodigo
group by bainome;

-- selecione os 5 produtos mais vendidos e os itens dessa venda
select pronome, itvvencodigo, sum(itvqtde), vendata from itemvenda
inner join produto on procodigo = itvprocodigo
inner join venda on vencodigo = itvvencodigo
group by pronome
order by sum(itvqtde) desc limit 5;

-- qual o estado civil do gerente
select funnome, estdescricao, funcodgerente from funcionario
inner join estadocivil on estcodigo = funestcodigo
where funcodgerente is null;

-- selecione o gerente e o funcionario gerenciado por ele
select
  g.funnome as 'Gerente',
  f.funnome as 'Funcionario'
from funcionario f
inner join funcionario g on f.funcodgerente = g.funcodigo
order by g.funnome asc;

select g.funnome, f.funnome from funcionario f
inner join funcionario g on f.funcodgerente = g.funcodigo
order by g.funnome asc;