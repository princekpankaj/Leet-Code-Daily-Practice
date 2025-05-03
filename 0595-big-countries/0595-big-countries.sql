# Write your MySQL query statement below

-- with the help of GROPU BY and HAVING Clause

-- SELECT name, population, area 
-- FROM World
-- GROUP BY name, population , area
-- HAVING population >= 25000000 OR area >= 3000000;

-- we can also do with he help of where clause

SELECT name, population, area 
FROM World
WHERE population >= 25000000 OR area >= 3000000;


