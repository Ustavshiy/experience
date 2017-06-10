-- DataBase: PostgreSQL

-- Creating DEPT table.
DROP TABLE IF EXISTS DEPT;
CREATE TABLE DEPT (DEPTNO NUMERIC(2), DNAME VARCHAR(14), LOC VARCHAR(13), PRIMARY KEY (DEPTNO));

-- Creating EMP table.
DROP TABLE IF EXISTS EMP;
CREATE TABLE EMP (EMPNO NUMERIC(4), ENAME VARCHAR(10), JOB VARCHAR(9), MGR NUMERIC(4) REFERENCES EMP (EMPNO), HIREDATE date, SAL NUMERIC(7,2)
, COMM NUMERIC(7,2), DEPTNO NUMERIC(2) REFERENCES DEPT (DEPTNO),
PRIMARY KEY (EMPNO));

-- Creating SALGRADE table.
DROP TABLE IF EXISTS SALGRADE;
CREATE TABLE SALGRADE (GRADE NUMERIC, LOSAL NUMERIC, HISAL NUMERIC);

-- Add info to DEPT table.
INSERT INTO DEPT (DEPTNO, DNAME, LOC) VALUES
(10,'ACCOUNTING', 'NEW YORK'),
(20,'RESEARCH', 'DALLAS'),
(30,'SALES', 'CHICAGO'),
(40,'OPERATIONS', 'BOSTON');

-- Add info to EMP table.
INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES
(7839,'KING','PRESIDENT',NULL,'1981-11-17 00:00:00',5000,NULL,10),
(7566,'JONES','MANAGER',7839,'1981-04-02 00:00:00',2975,NULL,20),
(7902,'FORD','ANALYST',7566,'1981-12-03 00:00:00',3000,NULL,20),
(7369,'SMITH','CLERK',7902,'1980-12-17 00:00:00',800,NULL,20),
(7499,'ALLEN','SALESMAN',7698,'1981-02-20 00:00:00',1600,300.00,30),
(7521,'WARD','SALESMAN',7698,'1981-02-22 00:00:00',1250,500.00,30),
(7654,'MATRIN','SALESMAN',7698,'1981-09-28 00:00:00',1250,1400.00,30),
(7698,'BLAKE','MANAGER',7839,'1981-05-01 00:00:00',2850,NULL,30),
(7782,'CLARK','MANAGER',7839,'1981-06-09 00:00:00',2450,NULL,10),
(7788,'SCOTT','ANALYST',7566,'1982-12-09 00:00:00',3000,NULL,20),
(7844,'TURNER','SALESMAN',7698,'1981-09-08 00:00:00',1500,0.00,30),
(7876,'ADAMS','CLERK',7788,'1983-01-12 00:00:00',1100,NULL,20),
(7900,'JAMES','CLERK',7698,'1981-12-03 00:00:00',950,NULL,30),
(7934,'MILLER','CLERK',7782,'1982-01-23 00:00:00',1300,NULL,10);

-- Add info to SALGRADE table.
INSERT INTO SALGRADE (GRADE, LOSAL, HISAL) VALUES
(1, 700, 1200),
(2, 1201, 1400),
(3, 1401, 2000),
(4, 2001, 3000),
(5, 3001, 9999);

-- File «SQL_tasks. Task 8. Display the name and job title of employees who do not have a manager.
SELECT ENAME, JOB
FROM EMP
WHERE MGR IS null;

-- File «SQL_tasks. Task 9. Display the name, salary, and commission for all employees who earn commissions.
-- Sort the data in descending order of salary and commissions (commission within salary).
SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM IS NOT NULL
ORDER BY SAL DESC, COMM DESC;

-- File «SQL_tasks. Task 10. Display the names of all employees where the third letter of their name is an A.
SELECT ENAME
FROM EMP
WHERE ENAME LIKE '__A%';

-- File «SQL_join_tasks. Task 7. Display the employee name and employee number along with their manager’s name and manager number.
-- Label the columns Employee, Emp#, Manager, and Mgr#, respectively. Display all employees including King, who has no manager.
SELECT e.ENAME AS Employee_name, e.EMPNO AS Employee_num, m.ENAME AS Manager_name, m.EMPNO AS Manager_num
FROM EMP AS e
LEFT OUTER JOIN EMP AS m ON m.EMPNO = e.MGR

-- File «SQL_join_tasks. Task 8. Create a query that will display the employee name, department number, and all
-- the  employees that work in the same department as a given employee. Give each column an appropriate label.
SELECT e.DEPTNO AS Department_num, e.ENAME AS Employee_name, c.ENAME AS Colleague
FROM EMP AS e
JOIN EMP AS c
ON (e.DEPTNO = c.DEPTNO)
WHERE e.EMPNO != c.EMPNO
order by e.DEPTNO