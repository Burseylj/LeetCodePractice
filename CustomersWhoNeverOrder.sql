# Leetcode 183. Customers Who Never Order
# leetcode.com/problems/customers-who-never-order
select name as "Customers"
from Customers
where Id not in (select customerId from Orders)
;