# Write your MySQL query statement below
SELECT name, bonus
FROM Employee e
LEFT OUTER JOIN Bonus b ON e.empId = b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;