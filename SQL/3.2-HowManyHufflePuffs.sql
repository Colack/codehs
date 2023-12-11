SELECT Course.name AS "Course", COUNT(*) AS "Enrollment"
FROM Course JOIN Enrollment JOIN Person
WHERE Course.id = Enrollment.course AND Person.id = Enrollment.person and Person.house = 2
GROUP BY Course.id
ORDER BY COUNT(*) DESC