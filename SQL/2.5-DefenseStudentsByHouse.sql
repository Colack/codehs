SELECT Person.last_name, Person.first_name, House.name AS "house" FROM House JOIN Person JOIN Enrollment
WHERE Person.id = Enrollment.person AND Person.house = House.id AND Enrollment.course = 5
ORDER BY House.name, Person.last_name