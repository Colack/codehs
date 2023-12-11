SELECT Home.name AS "Home", Away.name AS "Away"
FROM House AS Home JOIN House AS Away
WHERE Home.id <> Away.id AND Away.id = 3