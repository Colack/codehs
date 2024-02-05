SELECT Giver.first_name, Giver.last_name,
Receiver.first_name, Receiver.last_name, points, House.name as "House"
FROM HousePoint JOIN Person as Giver JOIN Person AS Receiver JOIN House
WHERE HousePoint.giver = Giver.id
AND HousePoint.receiver = Receiver.id
AND Giver.house = House.id