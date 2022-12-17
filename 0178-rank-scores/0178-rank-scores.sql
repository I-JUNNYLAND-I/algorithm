# Write your MySQL query statement below
SELECT SCORE,
DENSE_RANK() OVER(ORDER BY SCORE DESC) AS 'rank'
FROM SCORES;