SELECT 
    House.name as "House"
FROM 
    HousePoint 
JOIN 
    Person ON HousePoint.receiver = Person.id 
JOIN 
    House ON Person.house = House.id
GROUP BY 
    House.name
ORDER BY 
    SUM(HousePoint.points) DESC
LIMIT 1;