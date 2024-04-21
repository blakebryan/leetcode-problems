select name as Employee
from Employee e1 join
(select salary as manager_salary, id
from Employee e2) as e2 on e1.managerId = e2.id
where e1.salary > e2.manager_salary;