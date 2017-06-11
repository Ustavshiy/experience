/*
AP-121 DDL
Creating tabs.
*/

DROP TABLE  IF EXISTS DEPT;

CREATE TABLE DEPT
(DEPTNO INTEGER PRIMARY KEY, DNAME VARCHAR(14), LOC VARCHAR(13));

INSERT INTO DEPT (DEPTNO, DNAME, LOC)
 VALUES
 (10,'ACCOUNTING','NEW YORK'),
 (20, 'RESEARCH','DALLAS'),
 (30, 'SALES', 'CHICAGO'),
 (40, 'OPERATIONS', 'BOSTON');

DROP TABLE IF EXISTS EMP;

CREATE TABLE EMP
(EMPNO INTEGER PRIMARY KEY, ENAME VARCHAR(10), JOB VARCHAR(9), MGR INTEGER REFERENCES EMP(EMPNO), HIREDATE DATE,
SAL NUMERIC(7,2), COMM NUMERIC(7,2), DEPTNO INTEGER REFERENCES DEPT(DEPTNO));

INSERT INTO EMP
 (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO)
 VALUES
 (7369,'SMITH','CLERK', 7902, '1980-12-17', 800.00, NULL, 20),
 (7499,'ALLEN','SALESMAN', 7698, '1981-02-20', 1600.00, 300.00, 30),
 (7521,'WARD','SALESMAN', 7698, '1981-02-22', 1250.00, 500.00, 30),
 (7566,'JONES','MANAGER', 7839, '1981-04-02', 2975.00, NULL, 20),
 (7654,'MARTIN','SALESMAN', 7698, '1981-09-28', 1250.00, 1400.00, 30),
 (7698,'BLAKE','MANAGER', 7839, '1981-05-01', 2850.00, NULL, 30),
 (7782,'CLARK','MANAGER', 7839, '1981-06-09', 2450.00, NULL, 10),
 (7788,'SCOTT','ANALYST', 7566, '1982-12-09', 3000.00, NULL, 20),
 (7839,'KING','PRESIDENT', NULL, '1981-11-17', 5000.00, NULL, 10),
 (7844,'TURNER','SALESMAN', 7698, '1981-09-08', 1500.00, 0.00, 30),
 (7876,'ADAMS','CLERK', 7788, '1983-01-12', 1100.00, NULL, 20),
 (7900,'JAMES','CLERK', 7698, '1981-12-03', 950.00, NULL, 30),
 (7902,'FORD','ANALYST', 7566, '1981-12-03', 3000.00, NULL, 20),
 (7934,'MILLER','CLERK', 7782, '1982-01-23', 1300.00, NULL, 10);

DROP TABLE IF EXISTS SALGRADE;

CREATE TABLE SALGRADE(GRADE INTEGER, LOSAL INTEGER, HISAL INTEGER);

INSERT INTO SALGRADE
 (GRADE, LOSAL, HISAL)
 VALUES
 (1,700,1200),
 (2,1201,1400),
 (3,1401,2000),
 (4,2001,3000),
 (5,3001,9999);

/*
DML
Tasks:
1.5. Display the employee name and department number of all employees in departments 10 and 30 in alphabetical order by name.
*/

 SELECT ename, deptno
 FROM emp
 WHERE deptno = 10 OR deptno =30
 ORDER BY ename;

/*
1.6. Display list the name and salary of employees who earn more than $1500 and are in department 10 or 30. Label the columns Employee and Monthly Salary, respectively.
*/

 SELECT
 ename AS "Employee",
 sal AS "Monthly Salary"
 FROM emp
 WHERE sal > 1500 AND
 (deptno = 10 OR deptno =30);

/*
1.7. Display the name and hire date of every employee who was hired in 1982.
*/

 SELECT ename, hiredate
 FROM emp
 WHERE hiredate
 BETWEEN '1982-01-01' AND '1982-12-31';

/*
(JOIN) Write a query to display the name, job, department number, and department name for all employees who work in DALLAS.
*/

 SELECT emp.ename, emp.job, emp.deptno, dept.dname
 FROM emp
 JOIN dept
 ON emp.deptno = dept.deptno
 WHERE dept.loc = 'DALLAS';

/*
(SELF JOIN) Display the employee name and employee number along with their manager’s name and manager number. Label the columns Employee, Emp#, Manager, and Mgr#, respectively.
*/

 SELECT
 a.ename AS "Employee",
 a.empno AS "Emp#",
 b.ename AS "Manager",
 a.mgr AS "Mgr#"
 FROM  emp a
 JOIN emp b
 ON b.empno = a.mgr;