with cte as
(select mr.*,u.name,m.title
from MovieRating mr
left join Users u
on mr.user_id=u.user_id
left join Movies m
on mr.movie_id=m.movie_id)

( select name as results
from cte
group by name
order by count(*) desc , name
limit 1 )
union ALL
( select title
 from cte
 where created_at between "2020-02-01" and '2020-02-29'
 group by title
 order by avg(rating) desc , title
 limit 1)
