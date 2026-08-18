# Write your MySQL query statement below
with cte as (
    Select  product_id, min(year) as Min_year
    from Sales
    group by product_id
)

select s.product_id , s.year as First_year , s.quantity , s.price
from Sales s
join cte c
on s.product_id=c.product_id and
s.year=c.Min_year ;