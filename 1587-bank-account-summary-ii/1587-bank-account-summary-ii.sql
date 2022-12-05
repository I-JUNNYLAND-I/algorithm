# Write your MySQL query statement below
select name, sum(amount) as balance from transactions left join users using(account) group by account having(balance > 10000)