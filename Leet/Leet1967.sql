select p.product_name ,
       sum(case when o.order_date between '2020-02-01' and '2020-02-29' then o.unit else 0 end  ) as unit
from Products p join Orders o
on p.product_id=o.product_id
group by product_name
having unit >= 100 ;