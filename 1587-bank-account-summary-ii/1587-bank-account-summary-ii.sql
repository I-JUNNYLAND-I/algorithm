# Write your MySQL query statement below
SELECT U.name as NAME,
   SUM(amount) as BALANCE
  FROM Users U 
  JOIN Transactions T ON U.account = T.account
 GROUP BY U.account
HAVING BALANCE > 10000; 