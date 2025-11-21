-- SHOW ALL DATABASES
SHOW DATABASES;

-- SWITCH TO THE TASK DATABASE
USE tasks;

-- SHOW ALL TABLES
SHOW TABLES;

-- VIEW ALL EMPLOYEE RECORDS
SELECT * FROM Empl;

----------------------------------------------------
-- 1. Employees with salary >= 2200
----------------------------------------------------
SELECT ename, sal
FROM Empl
WHERE sal >= 2200;

----------------------------------------------------
-- 2. Employees NOT receiving commission
----------------------------------------------------
SELECT *
FROM Empl
WHERE comm IS NULL;

----------------------------------------------------
-- 3. Employees with salary NOT BETWEEN 2500 & 4000
----------------------------------------------------
SELECT ename, sal
FROM Empl
WHERE sal NOT BETWEEN 2500 AND 4000;

----------------------------------------------------
-- 4. Employees who do NOT have a manager
----------------------------------------------------
SELECT ename, job, sal
FROM Empl
WHERE mgr IS NULL;

----------------------------------------------------
-- 5. Employees whose name has 'A' as the THIRD letter
-- FIXED: __A%  →  two underscores
----------------------------------------------------
SELECT ename
FROM Empl
WHERE ename LIKE '__A%';

----------------------------------------------------
-- 6. Employees whose name ends with 'T'
----------------------------------------------------
SELECT ename
FROM Empl
WHERE ename LIKE '%T';
