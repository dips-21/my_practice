
https://stackoverflow.com/questions/3740280/how-do-acid-and-database-transactions-work

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
Indexing : Indexes are a datastructure used by database to improve query performance when searching 
by specific columns which are indexed.They are usually a B tree or a Hash table.
Range queries for eg where age>18 and age<25 will benefit only from B tree index
Hash index can improve only queries with equality clause like where age=29

Clustered index : the rows are physically stored on disk sorted by clustered index(primary key)
Non clustered index : Indexes on other columns will need  pointers to disk locations since actual data
is stored ordered by only clustered index on disk

Normalization is basically to design a database schema such that duplicate and redundant data is avoided.
solution to database anamolies https://dba.stackexchange.com/questions/194631/how-does-normalization-fix-the-three-types-of-update-anomalies
1NF avoid multi value columns like storing all phone numbers in a phone number column,have primary key
2NF all non key columns except should depend on entire key
3NF no transitive dependencies from non key columns to other cols
https://stackoverflow.com/questions/723998/what-are-database-normal-forms-and-can-you-give-examples

De-normalisation is useful in storing huge data set ,it avoids need of joining tables


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