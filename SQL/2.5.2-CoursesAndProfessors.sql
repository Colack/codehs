SELECT Course.name, Person.first_name, Person.last_name FROM Person JOIN Course
WHERE Course.professor = Person.id ORDER BY Course.name