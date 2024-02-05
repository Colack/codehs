SELECT Person.last_name, Person.first_name FROM Enrollment JOIN Person
WHERE Enrollment.person = Person.id AND Enrollment.course = 1 
ORDER BY last_name