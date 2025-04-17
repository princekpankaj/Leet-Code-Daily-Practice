# Write your MySQL query statement below
SELECT product_id FROM Products where low_fats = 'Y' AND recyclable = 'Y' GROUP BY product_id;