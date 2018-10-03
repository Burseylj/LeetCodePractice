# Leetcode 176
# leetcode.com/problems/second-highest-salary

select Max(Salary) as "SecondHighestSalary"
from Employee
where Salary < (select Max(Salary) from Employee)