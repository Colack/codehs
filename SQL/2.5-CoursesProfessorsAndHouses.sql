SELECT Course.name, Person.first_name, Person.last_name, House.name AS "house" FROM House JOIN Person JOIN Course
WHERE Course.professor = Person.id AND Person.house = House.id ORDER BY Course.name