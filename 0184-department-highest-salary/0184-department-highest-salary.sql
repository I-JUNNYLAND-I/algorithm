select d.Name Department, e.Name Employee, Salary
from Department d join Employee e on d.Id=e.DepartmentId
where (Salary,d.id) in (select max(Salary),DepartmentId from Employee group by DepartmentId);