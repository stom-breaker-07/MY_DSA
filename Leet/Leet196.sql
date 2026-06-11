DELETE P1
from Person P1
JOIN Person P2
on P1.email=P2.email
where P1.id > P2.id ;