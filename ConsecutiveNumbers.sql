# Leetcode 180. Consecutive Numbers
# leetcode.com/problems/consecutive-numbers
select distinct Num as ConsecutiveNums
from Logs a
where Num = (select num from Logs b where Id = a.Id +1) and Num = (select num from Logs b where Id = a.Id +2)