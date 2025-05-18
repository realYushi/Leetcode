# Write your MySQL query statement below
select eu.unique_id, e.name
from employees e 
left join employeeUni eu
on e.id=eu.id

