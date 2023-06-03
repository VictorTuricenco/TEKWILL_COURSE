create table customer_information (
customer_id serial primary key,
name varchar(20) not null,
surname varchar(20) not null,
phone_number varchar(9),
is_active bool
)

select *
from customer_information

insert into customer_information (name, surname, phone_number, is_active)
values
('Seonghoon', 'Hong', '079102433', true),
('Mark', 'Pulsifer', '069437560', true),
('Petya', 'Kupenska', '078132105', false),
('Bree', 'Watson', '069543280', true),
('Joe', 'Carbone', '069415793', true),
('Violeta', 'Popova', '078131234', false),
('Keily', 'Kwang', '068432564', true),
('Summer', 'Grieson', '069439751', true),
('Jonathan', 'Reed', '079313688', false),
('Clariza', 'Martinez', '078148149', true)

delete from customer_information
where customer_id = 1;

select *
from customer_information
limit 5

select *
from customer_information
where name like 'A%'


select *
from customer_information
where name like 'V%a%r'

select count(*)
from customer_information
where is_active = true

select name, phone_number
from customer_information













