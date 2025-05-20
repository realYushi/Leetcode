# Write your MySQL query statement below
select a.id as Id
from weather a, weather b
where datediff(a.recordDate,b.recordDate)= 1 && a.temperature > b.temperature
