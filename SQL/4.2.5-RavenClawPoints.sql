SELECT SUM(HousePoint.points) as "Points"
FROM HousePoint JOIN Person
WHERE HousePoint.receiver = Person.id AND Person.house = 3