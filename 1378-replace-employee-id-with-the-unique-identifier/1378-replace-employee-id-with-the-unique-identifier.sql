# Write your MySQL query statement below
SELECT name , unique_id
FROM Employees AS Es
LEFT JOIN EmployeeUNI AS Esu
ON Es.id = Esu.id;
