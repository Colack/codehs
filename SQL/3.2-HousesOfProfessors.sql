SELECT House.name AS "House", COUNT(*) AS "Professors"
FROM Person JOIN Course JOIN House
WHERE Person.id = Course.professor AND Person.house = House.id
GROUP BY House.id