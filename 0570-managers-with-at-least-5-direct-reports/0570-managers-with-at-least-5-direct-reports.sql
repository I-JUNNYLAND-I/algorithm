select 
    a.name 
from 
    employee a 
inner join 
    employee b 
on (a.id = b.managerid) 
group by a.id
having count(b.id) >= 5