
https://stackoverflow.com/questions/3740280/how-do-acid-and-database-transactions-work

Why Use SQL?
=================
It helps users to access data in the RDBMS system.
It helps you to describe the data.
It allows you to define the data in a database and manipulate that specific data.
With the help of SQL commands in DBMS, you can create and drop databases and tables.
SQL offers you to use the function in a database, create a view, and stored procedure.
You can set permissions on tables, procedures, and views.

Types of SQL
==================
Data Definition Language (DDL)
Data Manipulation Language (DML)
Data Control Language(DCL)
Transaction Control Language(TCL)
Data Query Language (DQL)

What is DDL?
===================
Data Definition Language helps you to define the database structure or schema.
CREATE
CREATE statements is used to define the database structure schema:

Syntax:
CREATE TABLE TABLE_NAME (COLUMN_NAME DATATYPES[,....]);

For example:
Create database university;
Create table students;
Create view for_students;

mysql> CREATE TABLE employee_table(  
id int NOT NULL AUTO_INCREMENT,  
name varchar(45) NOT NULL,  
occupation varchar(35) NOT NULL,  
age int NOT NULL,  
PRIMARY KEY (id)  
);

DROP
Drops commands remove tables and databases from RDBMS.
Syntax
DROP TABLE ;
For example:
Drop object_type object_name;
Drop database university;
Drop table student;

ALTER
Alters command allows you to alter the structure of the database.
Syntax:
To add a new column in the table
ALTER TABLE table_name ADD column_name COLUMN-definition;
To modify an existing column in the table:

ALTER TABLE MODIFY(COLUMN DEFINITION....);  
For example:
Alter table guru99 add subject varchar;

TRUNCATE:
This command used to delete all the rows from the table and free the space containing the table.
Syntax:
TRUNCATE TABLE table_name;  
Example:
TRUNCATE table students;

What is Data Manipulation Language?
========================================
Data Manipulation Language (DML) allows you to modify the database instance by inserting, modifying, and deleting its data. It is responsible for performing all types of data modification in a database.
There are three basic constructs which allow database program and user to enter data and information are:
INSERT
UPDATE
DELETE

INSERT:
==========
This is a statement is a SQL query. This command is used to insert data into the row of a table.
Syntax:
INSERT INTO TABLE_NAME  (col1, col2, col3,.... col N)  
VALUES (value1, value2, value3, .... valueN);  
Or
INSERT INTO TABLE_NAME    
VALUES (value1, value2, value3, .... valueN);    
For example:
INSERT INTO students (RollNo, FIrstName, LastName) VALUES ('60', 'Tom', Erichsen');

UPDATE:
========
This command is used to update or modify the value of a column in the table.
Syntax:
UPDATE table_name SET [column_name1= value1,...column_nameN = valueN] [WHERE CONDITION]   
For example:
UPDATE students    
SET FirstName = 'Jhon', LastName= 'Wick'
WHERE StudID = 3;

DELETE:
=============
This command is used to remove one or more rows from a table.
Syntax:
DELETE FROM table_name [WHERE condition];  
For example:
DELETE FROM students
WHERE FirstName = 'Jhon';

What is DCL?
=================
DCL (Data Control Language) includes commands like GRANT and REVOKE, which are useful to give
“rights & permissions.” Other permission controls parameters of the database system.
Examples of DCL commands:
Commands that come under DCL:

Grant:
=======
This command is use to give user access privileges to a database.
Syntax:
GRANT SELECT, UPDATE ON MY_TABLE TO SOME_USER, ANOTHER_USER;  
For example:
GRANT SELECT ON Users TO'Tom'@'localhost;

Revoke:
=========
It is useful to back permissions from the user.
Syntax:
REVOKE privilege_nameON object_nameFROM {user_name |PUBLIC |role_name}
For example:
REVOKE SELECT, UPDATE ON student FROM BCA, MCA;  

What is TCL?
===================
Transaction control language or TCL commands deal with the transaction within the database.

Commit
=======
This command is used to save all the transactions to the database.

Syntax:
Commit;
For example:
DELETE FROM Students  
WHERE RollNo =25;  
COMMIT;  

Rollback
=============
Rollback command allows you to undo transactions that have not already been saved to the database.

Syntax:
ROLLBACK;  
Example:
DELETE FROM Students  
WHERE RollNo =25;  

SAVEPOINT
===============
This command helps you to sets a savepoint within a transaction.
Syntax:
SAVEPOINT SAVEPOINT_NAME;
Example:
SAVEPOINT RollNo;

What is DQL?
==============
Data Query Language (DQL) is used to fetch the data from the database. It uses only one command:

SELECT:
============
This command helps you to select the attribute based on the condition described by the WHERE clause.

Syntax:
SELECT expressions    
FROM TABLES    
WHERE conditions;  
For example:

SELECT FirstName  
FROM Student  
WHERE RollNo > 15;  

Summary:
SQL is a database language designed for the retrieval and management of data in a relational database.
It helps users to access data in the RDBMS system
In the year 1974, the term Structured Query Language appeared
Five types of SQL queries are 1) Data Definition Language (DDL) 2) Data Manipulation Language (DML)
3) Data Control Language(DCL) 4) Transaction Control Language(TCL) and, 5) Data Query Language (DQL)
Data Definition Language(DDL) helps you to define the database structure or schema.
Data Manipulation Language (DML) allows you to modify the database instance by inserting, modifying, and deleting its data.
DCL (Data Control Language) includes commands like GRANT and REVOKE, which are useful to give “rights & permissions.”
Transaction control language or TCL commands deal with the transaction within the database.
Data Query Language (DQL) is used to fetch the data from the database.

What are Keys?
================    
Keys are attribute that helps you to identify a row(tuple) in a relation(table).
They allow you to find the relationship between two tables. 
Keys help you uniquely identify a row in a table by a combination of one or more columns in that table.

PRIMARY KEY vs FOREIGN KEY:-
======================================
A primary key is used to ensure data in the specific column is unique. 
A foreign key is a column or group of columns in a relational database table that provides a link between data in two tables.
It uniquely identifies a record in the relational database table.
Only one primary key is allowed in a table.

KEY DIFFERENCES:
=========================
A primary key constrain is a column that uniquely identifies every row in the table of the relational
database management system, while foreign key is a column that creates a relationship between two tables.
Primary Key never accepts null values whereas foreign key may accept multiple null values.
You can have only a single primary key in a table while you can have multiple foreign keys in a table.
The value of the primary key can’t be removed from the parent table whereas the value of foreign key value
can be removed from the child table.
No two rows can have any identical values for a primary key on the other hand a foreign key can contain duplicate values.
There is no limitation in inserting the values into the table column while inserting any value in the foreign key table,
ensure that the value is present into a column of a primary key.

Why use Primary Key?
====================
The main aim of the primary key is to identify each and every record in the database table.
You can use a primary key when you do not allow someone to enter null values.
If you delete or update records, the action you specified will be undertaken to make sure data integrity.
Perform restrict operation to rejects delete or update operation for the parent table.
Data are organized in a sequence of clustered index whenever you physically organize DBMS table.

Why use Foreign Key?
======================
Foreign keys help you to migrate entities using a primary key from the parent table.
A foreign key enables you to link two or more tables together.
It makes your database data consistent.
A foreign key can be used to match a column or combination of columns with primary key in a parent table.
SQL foreign key constraint is used to make sure the referential integrity of the data parent to match values in the child table.

UNIQUE KEY:-
================
The unique key is a single column or combination of columns in a table to uniquely identify database records.
A unique key prevents from storing duplicate values in the column. A table can contain multiple unique key columns, 
unlike a primary key column. This key is similar to the primary key, except that one NULL value can be stored in the 
unique key column. The unique key is also called unique constraints and can be referenced by another table's foreign key.
For example, let's consider the same table named students with attributes such as Stud_ID, Roll_No, Name, Mobile, and Email.

Primary Key vs Unique key
Here Stud_ID can be assigned as a unique constraint because each student must have a unique identification number.
If a student changes the college, then he or she would not have any student ID.
In that case, the entry may contain a NULL value because a unique key constraint allows storing NULL,
but it should be only one.

Surrogate key:-
====================
A surrogate key is a made up value with the sole purpose of uniquely identifying a row. 
Usually, this is represented by an auto incrementing ID.

TRANSACTION PROPERTIES:-
==========================
A transaction in MySQL is a sequential group of statements, queries, or operations such as select, insert, update or 
delete to perform as a one single work unit that can be committed or rolled back. 
If the transaction makes multiple modifications into the database, two things happen:
Either all modification is successful when the transaction is committed.
Or, all modifications are undone when the transaction is rollback.
In other words, a transaction cannot be successful without completing each operation available in the set. 
It means if any statement fails, the transaction operation cannot produce results.

A transaction in MySQL starts with the first executable SQL statement and ends when it finds a commit or rolled back either explicitly or implicitly. It explicitly uses COMMIT or ROLLBACK statement and implicitly when a DDL statement is used.
In a relational database, every SQL statement must execute in the scope of a transaction.
Inherently a transaction is characterized by four properties (commonly referred as ACID):

Atomicity
Atomicity takes individual operations and turns them into an all-or-nothing unit of work, 
succeeding if and only if all contained operations succeed.

Consistency
Consistency means that constraints are enforced for every committed transaction. 
That implies that all Keys, Data types, Checks and Trigger are successful and no constraint 
violation is triggered.

Isolation
Transactions require concurrency control mechanisms, and they guarantee correctness even
when being interleaved. Isolation brings us the benefit of hiding uncommitted state changes 
from the outside world, as failing transactions shouldn’t ever corrupt the state of the system. 
Isolation is achieved through concurrency control using pessimistic or optimistic locking mechanisms.

Durability
A successful transaction must permanently change the state of a system, and before ending it, 
the state changes are recorded in a persisted transaction log.
If our system is suddenly affected by a system crash or a power outage, then all unfinished 
committed transactions may be replayed.
=====================================================================================================


Indexing : 
============
Indexes are a datastructure used by database to improve query performance when searching 
by specific columns which are indexed.They are usually a B tree or a Hash table.
Range queries for eg where age>18 and age<25 will benefit only from B tree index
Hash index can improve only queries with equality clause like where age=29

Indexes are used to speed-up query process in SQL Server, resulting in high performance. 
They are similar to textbook indexes. In textbooks, if you need to go to a particular chapter, you go to the index, 
find the page number of the chapter and go directly to that page. Without indexes, the process of finding your desired
chapter would have been very slow.
The same applies to indexes in databases. Without indexes, a DBMS has to go through all the records in the table in order 
to retrieve the desired results. This process is called table-scanning and is extremely slow. On the other hand,
if you create indexes, the database goes to that index first and then retrieves the corresponding table records directly.
There are two types of Indexes in SQL Server:

Clustered Index
=========================
Clustered index :
====================
the rows are physically stored on disk sorted by clustered index(primary key)
Non clustered index : Indexes on other columns will need  pointers to disk locations since actual data
is stored ordered by only clustered index on disk

Clustered Index
A clustered index defines the order in which data is physically stored in a table.
Table data can be sorted in only way, therefore, there can be only one clustered index per table. 
In SQL Server, the primary key constraint automatically creates a clustered index on that particular column.

First, create a “student” table inside “schooldb” by executing the following script, or ensure that your database is fully backed up if you are using your live data:

CREATE DATABASE schooldb

CREATE TABLE student
(
id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
gender VARCHAR(50) NOT NULL,
DOB datetime NOT NULL,
total_score INT NOT NULL,
city VARCHAR(50) NOT NULL
)

Notice here in the “student” table we have set primary key constraint on the “id” column.
This automatically creates a clustered index on the “id” column. To see all the indexes on a particular table 
execute “sp_helpindex” stored procedure. This stored procedure accepts the name of the table as a parameter and 
retrieves all the indexes of the table. The following query retrieves the indexes created on student table.
USE schooldb
EXECUTE sp_helpindex student

Creating Custom Clustered Index
=======================================
You can create your own custom index as well the default clustered index. 
To create a new clustered index on a table you first have to delete the previous index.

To delete an index go to “Object Explorer-> Databases-> Database_Name-> Tables-> Table_Name -> Indexes”.
Right click the index that you want to delete and select DELETE. See the below screenshot.

use schooldb

CREATE CLUSTERED INDEX IX_tblStudent_Gender_Score
ON student(gender ASC, total_score DESC)

The process of creating clustered index is similar to a normal index with one exception.
With clustered index, you have to use the keyword “CLUSTERED” before “INDEX”

An index that is created on more than one column is called “composite index”.

Non-Clustered Index-
=========================
the table data and index will be stored in different places. 
The table records will be sorted by a clustered index if there is one. 
The index will be sorted according to its definition and will be stored separately from the table.

There can be only one clustered index per table. However, you can create multiple non-clustered indexes on a single table.
Clustered indexes only sort tables. Therefore,they do not consume extra storage. 
Non-clustered indexes are stored in a separate place from the actual table claiming more storage space.
Clustered indexes are faster than non-clustered indexes since they don’t involve any extra lookup step.

NORMALIZATION:-
===================
Normalization is basically to design a database schema such that duplicate and redundant data is avoided.
solution to database anamolies https://dba.stackexchange.com/questions/194631/how-does-normalization-fix-the-three-types-of-update-anomalies

1NF avoid multi value columns like storing all phone numbers in a phone number column,have primary key.
To satisfy First normal form, each column of a table must have a single value. Columns which contain sets 
of values or nested records are not allowed.
In the initial table, Subject contains a set of subject values, meaning it does not comply.

2NF all non key columns except should depend on entire key
3NF no transitive dependencies from non key columns to other cols
https://stackoverflow.com/questions/723998/what-are-database-normal-forms-and-can-you-give-examples

De-normalisation is useful in storing huge data set ,it avoids need of joining tables
================

Trigger
================
A trigger is a stored procedure in database which automatically invokes whenever a 
special event in the database occurs. For example, a trigger can be invoked when a row is 
inserted into a specified table or when certain table columns are being updated.

cursor
================
Cursor is a Temporary Memory or Temporary Work Station. 
It is Allocated by Database Server at the Time of Performing DML operations on Table by User.
Cursors are used to store Database Tables. 
There are 2 types of Cursors: Implicit Cursors, and Explicit Cursors
Implicit cursors are automatically created when select statements are executed. 
Explicit cursors needs to be defined explicitly by the user by providing a name. 
They are capable of fetching a single row at a time. Explicit cursors can fetch multiple rows.

A cursor is activated and thus created in response to any SQL statement. 
A trigger is executed in response to a DDL statement, DML statement or any database operation.

Constraints:-
=================
The constraint in MySQL is used to specify the rule that allows or restricts what values/data will be stored in the table. 
They provide a suitable method to ensure data accuracy and integrity inside the table. 
It also helps to limit the type of data that will be inserted inside the table. 
If any interruption occurs between the constraint and data action, the action is failed.

CREATE TABLE Student(Id INTEGER, LastName TEXT NOT NULL, FirstName TEXT NOT NULL, City VARCHAR(35));  
mysql> CREATE TABLE Animals(  
id int NOT NULL AUTO_INCREMENT,   
name CHAR(30) NOT NULL,   
PRIMARY KEY (id));

NOT NULL
CHECK
DEFAULT
PRIMARY KEY
AUTO_INCREMENT
UNIQUE CREATE TABLE ShirtBrands(Id INTEGER, BrandName VARCHAR(40) UNIQUE, Size VARCHAR(30));  
INDEX
ENUM-mysql> CREATE TABLE Shirts (    
id INT PRIMARY KEY AUTO_INCREMENT,     
name VARCHAR(35),     
size ENUM('small', 'medium', 'large', 'x-large')    
);  
FOREIGN KEY- 
=================
table person:-
CREATE TABLE Orders (  
Order_ID int NOT NULL PRIMARY KEY,  
Order_Num int NOT NULL,  
Person_ID int,  
FOREIGN KEY (Person_ID) REFERENCES Persons(Person_ID)  
);
  
Table order:-
CREATE TABLE Orders (  
Order_ID int NOT NULL PRIMARY KEY,  
Order_Num int NOT NULL,  
Person_ID int,  
FOREIGN KEY (Person_ID) REFERENCES Persons(Person_ID)  
);


Joins:-
=============
The goal of creating a join condition is that it helps you to combine the data from two or more DBMS tables. 
The tables in DBMS are associated using the primary key and foreign keys.

INNER JOIN is used to return rows from both tables which satisfy the given condition.
It is the most widely used join operation and can be considered as a default join-type


Outer Join
An OUTER JOIN doesn’t require each record in the two join tables to have a matching record.
In this type of join, the table retains each record even if no other matching record exists.

Three types of Outer Joins are:

Left Outer Join-
Left Outer Join (A  B)
LEFT JOIN returns all the rows from the table on the left even if no matching rows have been found in the table on 
the right. When no matching record found in the table on the right, NULL is returned.

Right Outer Join-RIGHT JOIN returns all the columns from the table on the right even if no matching rows have been
found in the table on the left.

Full Outer Join-n a FULL OUTER JOIN , all tuples from both relations are included in the result, 
irrespective of the matching condition.

MySQL GROUP BY Clause
=====================
The MYSQL GROUP BY Clause is used to collect data from multiple records and group the result by one or more column.
It is generally used in a SELECT statement.
You can also use some aggregate functions like COUNT, SUM, MIN, MAX, AVG etc. on the grouped column.
Syntax:

SELECT expression1, expression2, ... expression_n,   
aggregate_function (expression)  
FROM tables  
[WHERE conditions]  
GROUP BY expression1, expression2, ... expression_n; 

Aggregate_function: 
====================
It specifies a function such as SUM, COUNT, MIN, MAX, or AVG etc. tables: It specifies the tables,
from where you want to retrieve the records. There must be at least one table listed in the FROM clause.

WHERE conditions: It is optional. It specifies the conditions that must be fulfilled for the records to be selected.
SELECT address, COUNT(*)  
FROM   officers   
GROUP BY address;  

SELECT emp_name, SUM(working_hours) AS "Total working hours"  
FROM employees  
GROUP BY emp_name;  

Stored Procedure in SQL Server
==============================================
A stored procedure is a group of one or more pre-compiled SQL statements into a logical unit. 
It is stored as an object inside the database server.
It is a subroutine or a subprogram in the common computing language that has been created and stored in the database.
Each procedure in SQL Server always contains a name, parameter lists, and Transact-SQL statements.
The SQL Database Server stores the stored procedures as named objects. We can invoke the procedures by using triggers,
other procedures, and applications such as Java, Python, PHP, etc. It can support almost all relational database systems.

SQL Server builds an execution plan when the stored procedure is called the first time and stores them in the cache memory.
The plan is reused by SQL Server in subsequent executions of the stored procedure, allowing it to run quickly and
efficiently.

Types of Stored Procedures
=======================================
User-defined Stored Procedures
System Stored Procedures

User-defined Stored Procedures
Database developers or database administrators build user-defined stored procedures. 
These procedures provide one or more SQL statements for selecting, updating, or removing data from database tables. 
A stored procedure specified by the user accepts input parameters and returns output parameters .
DDL and DML commands are used together in a user-defined procedure.

We can further divide this procedure into two types:
======================================================================
T-SQL Stored Procedures: Transact-SQL procedures are one of the most popular types of SQL Server procedures.
It takes parameters and returns them. These procedures handle INSERT, UPDATE, and DELETE statements with or without 
parameters and output row data.

CLR Stored Procedures: The SQL Server procedures are a group of SQL commands, and the CLR indicates the common
language runtime. CLR stored procedures are made up of the CLR and a stored procedure, which is written in a CLR-based
language like VB.NET or C#. CLR procedures are .Net objects that run in the SQL Server database's memory.

System Stored Procedures
The server's administrative tasks depend primarily on system stored procedures. When SQL Server is installed, 
it creates system procedures. The system stored procedures prevent the administrator from querying or modifying
the system and database catalog tables directly. Developers often ignore system stored procedures.

SQL Server Stored Procedures Syntax
The following are the basic syntax to create stored procedures in SQL Server:

CREATE PROCEDURE [schema_name].procedure_name  
@parameter_name data_type,   
....   
parameter_name data_type  

AS  
BEGIN  
-- SQL statements  
-- SELECT, INSERT, UPDATE, or DELETE statement  
END  

Parameter Explanations
The stored procedure syntax has the following parameters:
Schema_name: It is the name of your database or schema. By default, a procedure is associated with the current database,
but we can also create it into another database by specifying the DB name.

Procedure_Name: It represents the name of your stored procedure that should be meaningful names so that you can
identify them quickly. It cannot be the system reserved keywords.

Parameter_Name: It represents the number of parameters. It may be zero or more based upon the user requirements.
We must ensure that we used the appropriate data type. For example, @Name VARCHAR(50).

SET NOCOUNT ON in Stored Procedure
================================================
In some cases, we use the SET NOCOUNT ON statement in the stored procedure. 
This statement prevents the message that displays the number of rows affected by SQL queries from being shown.
NOCOUNT denotes that the count is turned off. It means that if SET NOCOUNT ON is set, no message would appear
indicating the number of rows affected.

How to execute/call a stored procedure
====================================================?
We can use the EXEC command to call/execute stored procedures in SQL Server.
The following syntax illustrates the execution of a stored procedure:

EXEC procedure_name;  
Or,  
EXECUTE procedure_name;  

If we are using the SSMS, we need to use the below steps to execute stored procedures:
====================================================================================================
Navigate to the Programmability -> Stored Procedures.
Next, select the Stored Procedure menu and expand it. You will see the available stored procedures.
Right-click on the stored procedure you want to execute and choose the Execute Stored Procedure
The Execute Procedure window will appear. If the procedure has any parameters, we must assign/pass them before clicking OK to execute it. If no parameters are defined, click OK to run the procedure.
Stored Procedure Simple Example
We can create a stored procedure in SQL Server in two ways:
================================================================================
Using T-SQL Query
Using SQL Server Management Studio

We will take a student table to demonstrate the stored procedure examples. This table has the following data:

Stored Procedure in SQL Server
The below example uses the CREATE PROCEDURE SQL statement for creating a stored procedure that displays
the student's list in the increasing order of a salary from the STUDENT table in the selected database:

CREATE PROCEDURE studentList  
AS  
BEGIN  
SELECT name, age, salary  
FROM STUDENT  
ORDER BY salary;  
END;   
In this syntax, the studentList is the name of the stored procedure, and the AS keyword distinguishes the
stored procedure's heading and body. The BEGIN and END keywords that accompany a single statement in a stored 
procedure are optional. However, it's a good idea to include them to make the code more understandable.










Atomicity Either all changes(queries) in transaction will take place
or none will (for eg all transfer money from person A to B
update row of A to (bal-x) and update row of A to (bal+x) both will
happen or none will

consistency
In a money transaction ,total sum should remain same ,money
can't be created or lost
https://www.ibm.com/docs/en/cics-ts/5.4?topic=processing-acid-properties-transactions


Isolation
In a transaction to transfer money from A to B ,any other transaction sees money in A's account or B's account.It does not see a state where money is deducted from A's but not deposited to B
states of row
for transfer Rs 500
A=A-500 (money deducted from A)
intermediate state ,money deducted but not yet deposited
B=B+500
If A had Rs 2000 and B had Rs 3000 ,any other transaction selecting
A's or B'sum can't see A as 1500 and B as 3000

Durability
Changes done will not be lost.in case of database restart .
The changes committed by transaction will be there even in case of system failure .For eg A should have 1500 and B 3500 even if database is restarted after failure

======================================================================================================
Spring Transaction ( @Transactional on spring bean method ).Spring AOP starts transaction before call and
commits after it
https://stackoverflow.com/questions/8490852/spring-transactional-isolation-propagation
https://www.byteslounge.com/tutorials/spring-transaction-isolation-tutorial
======================================================================================================