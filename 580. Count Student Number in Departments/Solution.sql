/* 
-Write a query to print the respective department name and number of students majoring in each department for all departments in the department table (even ones with no current students).
-Sort your results by descending number of students;
-if two or more departments have the same number of students, then sort those departments alphabetically by department name.
*/

select d.dept_name as dept_name   , count(student_id) as student_number  
from department d LEFT OUTER JOIN student s on d.dept_id =s.dept_id   
group by   d.dept_name 
ORDER BY student_number DESC , d.dept_name
