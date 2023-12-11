SELECT Course.name FROM Enrollment JOIN Course JOIN Person
WHERE Person.id = 15 AND Enrollment.person = Person.id AND Enrollment.course = Course.id
ORDER BY Course.name