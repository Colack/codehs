SELECT Person.first_name, Person.last_name, HousePoint.points
FROM Person JOIN HousePoint
WHERE Person.id = HousePoint.receiver AND HousePoint.points < 0
ORDER BY points, last_name, first_name