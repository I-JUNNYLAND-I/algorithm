# Write your MySQL query statement below
select i.name, sum(case when i.id = r.user_id then distance else 0 end) as travelled_distance 
from users i left join rides r on i.id = r.user_id 
group by i.id 
order by travelled_distance desc, name