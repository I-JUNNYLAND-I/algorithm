# Write your MySQL query statement below
SELECT uni.unique_id, e.name
FROM Employees e
LEFT JOIN EmployeeUNI uni using(id)
