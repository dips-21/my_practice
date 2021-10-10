DDL is Data Definition Language : it is used to define data structures.

It deals with database schemas and descriptions, of how the data should reside in the database.
=================================================================================================
    CREATE – to create database and its objects like (table, index, views, store procedure, function and triggers).
    ALTER – alters the structure of the existing database.
    DROP – delete objects from the database.
    TRUNCATE – remove all records from a table; also, all spaces allocated for the records are removed.
    COMMENT – add comments to the data dictionary.
    RENAME – rename an object.

DML is Data Manipulation Language : it is used to manipulate data itself.
===============================================================================
It deals with data manipulation, and includes most common SQL statements such SELECT,
INSERT, UPDATE, DELETE etc, and it is used to store, modify, retrieve, 
delete and update data in database.

    SELECT – retrieve data from one or more tables.
    INSERT – insert data into a table.
    UPDATE – updates existing data within a table.
    DELETE – delete all records from a table.
    MERGE – UPSERT operation (insert or update)
    CALL – call a PL/SQL or Java subprogram.
    EXPLAIN PLAN – interpretation of the data access path.
    LOCK TABLE – concurrency control.


Joins :
Join allows us to work on data present across different tables (which is the case in a normalised schema)
https://learnsql.com/blog/sql-joins-types-explained/
https://www.educative.io/blog/what-are-sql-joins
Inner Join : common rows of two table which match join condition
Left outer : All rows of first table with null in columns of second ,where second doesn't match join condition
Right outer All rows of second  with null in columns of first ,where second doesn't match join condition
Full outer : all rows of both
Cross join :joins each row of first table with each row of second table
if first table has m rows and second n rows ,result will have m*n rows


InnoDB vs MyISAM Database engines
=======================================
Innodb is default engine in mysql
    InnoDB has row-level locking. MyISAM only has full table-level locking.
    InnoDB has what is called referential integrity which involves supporting foreign keys (RDBMS) and
    relationship constraints, MyISAM does not.
    InnoDB supports transactions, which means you can commit and roll back. MyISAM does not.
    InnoDB is more reliable as it uses transactional logs for auto recovery. MyISAM does not.

Tablespace : A data file that can hold data for one or more InnoDB tables and associated indexes.
====================
Db connections --> query-->query parser -->query optimiser --> 
Innodb Buffer pool (if data set is small ,it will fit in memory ,OS cache and queries will be faster. 
How ever writes still need flush to disk for durability.

Demand paging and dirty page handling ensures data in buffer memory pages is same as that written on disk
https://www.cs.columbia.edu/~junfeng/10sp-w4118/lectures/l22-vm.pdf

Transactions :
========================
A database transaction (DB transaction) is a unit of work that is either completed as a unit or undone as a unit.
i.e a sequence of queries bunched together so that all will take place or none will take place
A classical example is transferring money from one bank account to another. To do that you have first to withdraw the amount from the source account, and then deposit it to the destination account. The operation has to succeed in full. 
If you stop halfway, the money will be lost, and that is Very Bad.
To avoid such issues Transaction provides ACID properties 

ACID properties
========================
Atomicity
All changes to data are performed as if they are a single operation. That is, all the changes are performed, or none of them are.
For example, in an application that transfers funds from one account to another, the atomicity property ensures that,
if a debit is made successfully from one account, the corresponding credit is made to the other account.
Consistency
Data is in a consistent state when a transaction starts and when it ends.
For example, in an application that transfers funds from one account to another, the consistency property ensures that the total value of funds in both the accounts is the same at the start and end of each transaction.
Isolation
The intermediate state of a transaction is invisible to other transactions. As a result, transactions that run concurrently appear to be serialized.
For example, in an application that transfers funds from one account to another, the isolation property ensures that another transaction sees the transferred funds in one account or the other, but not in both, nor in neither.
Durability
After a transaction successfully completes, changes to data persist and are not undone, even in the event of a system failure.
For example, in an application that transfers funds from one account to another, the durability property ensures that the changes made to each account will not be reversed. 
Isolation levels :
https://www.sqlshack.com/dirty-reads-and-the-read-uncommitted-isolation-level/

Normalisation
====================
1NF non key columns depend on key
2NF non key columns depend on complete key
3NF non key columns depend on nothing but the key and depend directly on key (no indirect i.e transitive
dependencies)