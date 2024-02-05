SELECT Course.name, Person.first_name, Person.last_name FROM Course JOIN Person 
WHERE Course.professor = Person.id AND Person.house = 1 
ORDER BY name