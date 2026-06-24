select query_name ,
  Round(avg(rating/position),2) as quality ,
  Round(count(case when rating<3  then 1 end) / count(*)*100,2) as poor_query_percentage
from Queries
group by query_name ;