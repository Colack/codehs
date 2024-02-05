SELECT Course.name as "Course"
FROM Course JOIN Enrollment
WHERE Course.name LIKE "C%" AND Enrollment.course = Course.id
GROUP BY Course.name
HAVING COUNT(*) > 14