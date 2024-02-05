SELECT Course.name AS "Course", COUNT(*) AS "Enrollment"
FROM Course JOIN Enrollment
WHERE Course.id = Enrollment.course
GROUP BY Course.id
ORDER BY COUNT(*) DESC, Course.name