select *
from Users
where  mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'and  mail LIKE BINARY '%@leetcode.com';