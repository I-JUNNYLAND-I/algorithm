# Write your MySQL query statement below
select t.day, t.emp_id, t.total_time
from (
    select event_day as day, emp_id, sum(out_time - in_time) as total_time
    from employees
    group by emp_id, event_day
) as t;