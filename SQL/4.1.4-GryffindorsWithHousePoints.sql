SELECT Person.first_name, Person.last_name, HousePoint.points
FROM Person JOIN HousePoint
WHERE Person.id = HousePoint.receiver AND Person.house = 1
ORDER BY points desc, last_name, first_name