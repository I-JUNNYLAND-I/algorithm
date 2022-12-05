# Write your MySQL query statement below
select u.name, t.balance
from users as u, (
    select account, sum(amount) as balance
    from transactions
    group by account
    having sum(amount) > 10000
) as t
where u.account = t.account;