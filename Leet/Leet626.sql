# Write your MySQL query statement below
with cte as (
select id ,student ,lAG(student) over (order by id) as prev_Student , LEAD(student) over (order by id) as next_Student
from Seat
)
select s.id,
(
    case
    when s.id%2=0 then c.prev_Student
    when s.id%2=1 and c.next_Student is NOT Null then c.next_Student
    else c.student
    end
) as student
from Seat s
join cte c
on s.id=c.id ;