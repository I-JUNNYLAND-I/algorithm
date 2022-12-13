# Write your MySQL query statement below
SELECT users.name, SUM(transactions.amount) AS balance FROM transactions
INNER JOIN users ON users.account=transactions.account
GROUP BY transactions.account HAVING balance > 10000