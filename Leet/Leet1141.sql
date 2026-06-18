SELECT activity_date as `day` ,
       Count(distinct user_id ) as active_users
from Activity
group by activity_date
having activity_date between '2019-06-28' AND '2019-07-27' ;