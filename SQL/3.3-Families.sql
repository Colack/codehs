SELECT last_name AS "Family", COUNT(*) as "Count"
FROM Person
GROUP BY last_name
HAVING COUNT(*) > 1
ORDER BY COUNT(*) desc, last_name