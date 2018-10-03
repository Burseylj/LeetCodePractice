
# Leetcode 175: combine two tables
# leetcode.com/problems/combine-two-tables/
# MySQL
select FirstName, LastName, City, State
from Person left join Address
on Person.PersonId = Address.PersonId
;