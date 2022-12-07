# Write your MySQL query statement below
select name, ifnull(travelled_distance, 0) as travelled_distance
from users as u
left join (
    select user_id, sum(distance) as travelled_distance
    from rides
    group by user_id
) as t
on u.id = t.user_id
order by travelled_distance desc, name;