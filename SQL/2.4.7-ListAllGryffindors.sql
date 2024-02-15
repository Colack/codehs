SELECT Person.first_name, Person.last_name, House.name AS "house" FROM Person JOIN House
WHERE House.id = Person.house
AND House.id = 1
ORDER BY Person.first_name