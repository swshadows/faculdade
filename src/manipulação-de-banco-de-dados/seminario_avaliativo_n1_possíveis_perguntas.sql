USE ecommerce_sem;
-- Selecionar onde o funcionário trabalha;
SELECT comercio_nome, funcionario_nome FROM funcionario
INNER JOIN comercio ON comercio_id = fk_funcionario_comercio;

-- Selecionar quais funcionários são supervisores;
SELECT funcionario_nome FROM funcionario WHERE funcionario_supervisor IS NULL;

-- Calcular a quantidade de tempo que os funcionários demitidos trabalharam
SELECT
	funcionario_nome,
	(funcionario_dt_demissao - funcionario_dt_admissao) AS 'Duração do contrato',
	funcionario_dt_admissao,
	funcionario_dt_demissao
FROM funcionario WHERE funcionario_dt_demissao IS NOT NULL;

-- Pegar todos os telefones de comércio X
SELECT comercio_nome, telefone_num, telefone_operadora FROM comercio_telefone
INNER JOIN comercio ON comercio_id = fk_telefone_comercio
WHERE comercio_id = 1;

-- Ver quais produtos o comercio X fornece
SELECT produto_descricao, comercio_nome FROM fornece
INNER JOIN comercio ON comercio_id = fk_fornece_comercio
INNER JOIN produto ON produto_id = fk_fornece_produto
WHERE comercio_nome = 'Variedades Salmo 91';

-- Ver a categoria dos produtos
SELECT produto_descricao, categoria_nome FROM produto
INNER JOIN categoria ON fk_produto_categoria = categoria_id
WHERE produto_descricao = 'Bebidas importadas';

-- Ver qual cliente comprou o produto X
SELECT cliente_nome, produto_descricao FROM compra
INNER JOIN cliente ON fk_compra_cliente = cliente_id
INNER JOIN produto ON fk_compra_produto = produto_id;

-- Ver a forma de pagamento das compras do cliente X
SELECT cliente_nome, compra_forma_pagamento, produto_descricao FROM compra
INNER JOIN cliente ON fk_compra_cliente = cliente_id
INNER JOIN produto ON fk_compra_produto = produto_id
WHERE cliente_nome = 'Fabiano'; 

-- Atualizar senhas / emails dos clientes
SELECT * FROM cliente;
UPDATE cliente SET cliente_email = '123fabi@hotmail.com' WHERE cliente_nome = 'Fabiano';
UPDATE cliente SET cliente_senha = '*2$9#sD!2#' WHERE cliente_nome = 'Fabiano';

-- Ver o nível do cliente X
SELECT cliente_nome, nivel_nome, nivel_descricao FROM cliente
INNER JOIN nivel ON nivel_id = fk_cliente_nivel;

-- Ver o nível do cliente X e quais os valores das compras realizadas por eles ?
SELECT cliente_nome, nivel_nome, compra_valor_total FROM cliente
INNER JOIN compra ON cliente_id = fk_compra_cliente
INNER JOIN nivel ON nivel_id = fk_cliente_nivel;

-- Quantos funcionarios trabalham no comercio X? 
SELECT comercio_nome,
count(funcionario_id) as 'Qntd Funcionario'
FROM funcionario
INNER JOIN comercio on comercio_id = fk_funcionario_comercio
WHERE funcionario_dt_demissao is NULL AND comercio_id = '3';

-- Soma dos valores de todas as compras
SELECT sum(compra_valor_total) FROM compra;
