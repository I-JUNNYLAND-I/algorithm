# Write your MySQL query statement below

SELECT Sales.product_id, Product.product_name
FROM Sales
LEFT JOIN Product
USING(product_id)
GROUP BY product_id
HAVING MIN(Sales.sale_date) >= '2019-01-01'
AND MAX(Sales.sale_date) <= '2019-03-31'