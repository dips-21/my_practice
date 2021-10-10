create table Customers (
	customer_id INT,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	address VARCHAR(50),
	city VARCHAR(50),
	state VARCHAR(50),
	zip_code VARCHAR(50),
	email VARCHAR(50),
    PRIMARY KEY(customer_id)
);

insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (1, 'Windham', 'McKevitt', '73 Namekagon Park', 'Washington', 'DC', '20525', 'wmckevitt0@example.com');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (2, 'Wallis', 'Breawood', '91869 Dexter Parkway', 'Pomona', 'CA', '91797', 'wbreawood1@nhs.uk');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (3, 'Valerie', 'Merkel', '35 Longview Alley', 'Bonita Springs', 'FL', '34135', 'vmerkel2@123-reg.co.uk');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (4, 'Brigid', 'Southwood', '568 Kropf Parkway', 'Indianapolis', 'IN', '46216', 'bsouthwood3@privacy.gov.au');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (5, 'Tucker', 'Du Pre', '521 Bonner Park', 'Miami', 'FL', '33175', 'tdupre4@thetimes.co.uk');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (6, 'Tabbie', 'Maxwaile', '3824 Sunnyside Pass', 'Pittsburgh', 'PA', '15261', 'tmaxwaile5@joomla.org');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (7, 'Cull', 'Stanborough', '8624 Larry Place', 'Boston', 'MA', '02298', 'cstanborough6@alibaba.com');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (8, 'Homer', 'Park', '8994 Elmside Circle', 'Dallas', 'TX', '75251', 'hpark7@plala.or.jp');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (9, 'Lorelei', 'Bollom', '5737 Manley Circle', 'San Francisco', 'CA', '94121', 'lbollom8@arstechnica.com');
insert into Customers (customer_id, first_name, last_name, address, city, state, zip_code, email) values (10, 'Claudina', 'Thibodeaux', '74 Holy Cross Hill', 'Norfolk', 'VA', '23520', 'cthibodeaux9@mysql.com');

create table Orders (
	order_id INT,
	order_date VARCHAR(50),
	amount VARCHAR(50),
	customer_id INT,
    PRIMARY KEY(order_id)
);

insert into Orders (order_id, order_date, amount, customer_id) values (34, '07-11-2020', '$56.34', 1);
insert into Orders (order_id, order_date, amount, customer_id) values (12, '07-12-2020', '$23.34', 2);
insert into Orders (order_id, order_date, amount, customer_id) values (18, '07-13-2020', '$156.72', 3);
insert into Orders (order_id, order_date, amount, customer_id) values (01, '07-14-2020', '$536.12', 4);
insert into Orders (order_id, order_date, amount, customer_id) values (89, '07-15-2020', '$99.45', 5);
insert into Orders (order_id, order_date, amount, customer_id) values (82, '07-12-2020', '$12.12', 6);
insert into Orders (order_id, order_date, amount, customer_id) values (99, '07-11-2020', '$19.52', 7);
insert into Orders (order_id, order_date, amount, customer_id) values (23, '07-11-2020', '$88.98', 2);
insert into Orders (order_id, order_date, amount, customer_id) values (22, '07-16-2020', '$222.34', 3);
insert into Orders (order_id, order_date, amount, customer_id) values (56, '07-16-2020', '$222.34', NULL);

select first_name, last_name, order_date, amount
from Customers c
inner join Orders o
on c.customer_id = o.customer_id
ORDER BY order_date