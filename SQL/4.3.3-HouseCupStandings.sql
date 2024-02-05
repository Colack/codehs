SELECT House.name as "House", SUM(HousePoint.points) as "Points"
FROM HousePoint JOIN Person JOIN House
WHERE HousePoint.receiver = Person.id AND Person.house = House.id
GROUP BY House.name
ORDER BY Points DESC