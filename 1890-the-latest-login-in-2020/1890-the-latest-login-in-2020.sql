# Write your MySQL query statement below
SELECT 
user_id,
MAX(time_stamp) as last_stamp
FROM Logins
WHERE time_stamp between '2020-01-01 00:00:00' AND '2020-12-31 23:59:59'
GROUP BY user_id