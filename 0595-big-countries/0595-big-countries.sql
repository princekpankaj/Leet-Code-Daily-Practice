# Write your MySQL query statement below
SELECT name, population, area 
FROM World
GROUP BY name, population , area
HAVING population >= 25000000 OR area >= 3000000;
