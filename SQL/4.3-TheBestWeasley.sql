SELECT Person.first_name AS "Name" , SUM(HousePoint.points) as "Points"
FROM Person JOIN HousePoint
WHERE HousePoint.receiver = Person.id AND Person.last_name = "Weasley"
GROUP BY Person.id, Person.first_name, Person.last_name
ORDER BY Points DESC