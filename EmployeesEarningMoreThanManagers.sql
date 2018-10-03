# Leetcode 181 Employees Earning More Than Their Managers
# leetcode.com/problems/employees-earning-more-than-their-managers/

select Name as "Employee"
from Employee e
where Salary > (select Salary
                from Employee m
                where e.ManagerId = m.Id)