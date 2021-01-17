
1. `select first_name,last_name,position from ((select * from Employee
ORDER BY `salary` ASC limit 1 ))`

2. `select MAX(Salary) from Employee`


3. `select * from(  
select first_name, last_name salary, dense_rank()   
over(order by salary desc)rank from Employee)   
where rank = 2;`


4. `SELECT * FROM `Employee` WHERE emp_id  BETWEEN 10001 and 10008`


5. `select MAX(e.Salary) d.department_name from Employee e and  department d where e.department_id=d.department_id;`



6. `select MAX(e.Salary) d.department_name from Employee e and  department d where e.department_id=d.department_id
group by d.department_id;`
