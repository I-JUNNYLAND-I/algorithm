# Write your MySQL query statement below
with not_allowed as (
    select p.product_id
    from product as p, sales as s
    where p.product_id = s.product_id 
    and s.sale_date not between '2019-01-01' and '2019-03-31'
)

select distinct
    p.product_id, p.product_name
from 
    product as p,
    sales as s
where 
    p.product_id = s.product_id
and
    s.sale_date between '2019-01-01' and '2019-03-31'
and p.product_id not in (
    select product_id from not_allowed
);