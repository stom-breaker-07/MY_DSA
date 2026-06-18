Select date_format(trans_date,'%Y-%m') as `month` ,
       country ,
       Count(*) as trans_count ,
       Count( case when state='approved' then 1 end)  as approved_count ,
       Sum(amount) as trans_total_amount ,
       Sum(case when state='approved' then amount  else 0 end ) as approved_total_amount
from Transactions
group by `month`,country ;