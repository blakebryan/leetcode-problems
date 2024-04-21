select distinct p1.email as Email
from Person p1 join Person p2 on p1.email = p2.email
where not p1.id = p2.id;