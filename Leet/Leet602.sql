# Write your MySQL query statement below
with data as (
select requester_id as id
from RequestAccepted

union all

select accepter_id
from RequestAccepted
),

calc_data as (
    select id , count(*) as num , rank() over (order by count(*) desc) as rnk
    from data
    group by id
)

select id,num from calc_data  where rnk=1;