SELECT Course.name AS "Course", Person.last_name AS "Professor Last Name", COUNT(*) AS Enrollment
FROM Person JOIN Course JOIN Enrollment
WHERE Course.professor = Person.id AND Course.id = Enrollment.course
GROUP BY Course.name
HAVING COUNT(*) > 17