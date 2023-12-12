select professor.first_name, professor.last_name, sum(points) as "points"
from person as professor join person as student join housepoint
where professor.id = housepoint.giver
and student.house <> professor.house
and housepoint.receiver = student.id
group by professor.first_name
order by points desc