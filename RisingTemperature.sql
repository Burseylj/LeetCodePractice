# Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.
SELECT w1.Id 
FROM Weather w1, Weather w2
WHERE w1.Temperature > w2.Temperature AND w1.RecordDate = DATE_ADD(w2.RecordDate, INTERVAL 1 DAY)