SELECT first_name, last_name FROM Person 
WHERE (house = 1 OR house = 4) 
AND first_name LIKE "R%";