select * from Clientes;

select nome from Clientes;

select * from Pedidos where total > 100;

select * from Produtos where preco < 50;

delete from Produtos where id_produto = 1;

select * from Pedidos where id_cliente = 2;

select avg(preco) from Produtos;



SELECT c.*
FROM Clientes c
WHERE (
    SELECT COUNT(*) 
    FROM Pedidos p 
    WHERE p.id_cliente = c.id_cliente
) > 3;

SELECT c.nome, SUM(p.total)
FROM Clientes c
Join Pedidos p
on c.id_cliente = p.id_cliente
group by c.nome

UPDATE Produtos
SET preco = preco * 1.10; 

select p.nome, count(*) as total
from DetalhesDoPedido as dp
join Produtos as p
on dp.id_produto = p.id_produto
group by p.nome
order by total DESC


SELECT
  (SELECT AVG(preco) FROM Produtos) AS media,
  (SELECT PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY preco) FROM Produtos) AS mediana,
  (SELECT STDDEV_POP(preco) FROM Produtos) AS desvio_padrao;

