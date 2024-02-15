SELECT Person.first_name, Person.last_name 
FROM Course JOIN Person 
WHERE Course.professor = Person.id AND Course.professor = 67