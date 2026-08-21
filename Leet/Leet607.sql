# Write your MySQL query statement below
Select name
From SalesPerson
where name Not in
(Select s.name
from SalesPerson s
join Orders o
on s.sales_id=o.sales_id
join Company c
on o.com_id=c.com_id
Where c.name="RED"
);