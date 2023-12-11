SELECT Person.first_name, Person.last_name, COUNT(*) AS "courses" 
FROM Person JOIN Enrollment
WHERE Enrollment.person = Person.id 
GROUP BY Person.first_name
ORDER BY COUNT(*) DESC, last_name
LIMIT 5