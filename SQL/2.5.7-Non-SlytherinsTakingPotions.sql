SELECT last_name, first_name FROM Person p JOIN Enrollment e 
ON p.id = e.person WHERE e.course = 1 AND p.house <> 4 ORDER BY last_name;