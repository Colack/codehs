SELECT Person.first_name, Person.last_name, SUM(HousePoint.points) AS "Points"
FROM Person 
JOIN HousePoint ON HousePoint.receiver = Person.id
GROUP BY Person.id, Person.first_name, Person.last_name
ORDER BY Points DESC
LIMIT 2;