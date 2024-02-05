SELECT first_name, last_name, sum (points) as "Points"
from housepoint join person
where points < 0 and person.id = giver
group by giver
order by points, last_name
limit 4