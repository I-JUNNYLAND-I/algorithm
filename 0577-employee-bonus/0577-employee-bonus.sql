# Write your MySQL query statement below
SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus as b on b.empId = e.empId
WHERE b.bonus is null OR b.bonus < 1000