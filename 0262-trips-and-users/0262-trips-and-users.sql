# Write your MySQL query statement below
select t.request_at as Day, 
round((sum(case when t.status like 'cancelled%' then 1 else 0 end)/sum(case when u1.banned = 'yes' then 0 else 1 end)), 2) 'Cancellation Rate'
from trips t 
left join users u1 on t.client_id = u1.users_id
left join users u2 on t.driver_id = u2.users_id
where t.request_at >= '2013-10-01' and t.request_at <= '2013-10-03'
and u1.banned = 'no'
and u2.banned = 'no'
group by 1
order by 1